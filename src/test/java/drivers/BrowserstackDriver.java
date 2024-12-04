package drivers;

import Config.WebDriverConfig;
import com.codeborne.selenide.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    private final WebDriverConfig config;

    public BrowserstackDriver() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", config.getBrowserstackUser());
        caps.setCapability("browserstack.key", config.getBrowserstackKey());

        // Set URL of the application under test
        caps.setCapability("app", config.getApp());

        // Specify device and os_version for testing!
        caps.setCapability("device", config.getDevice());
        caps.setCapability("os_version", config.getOsVersion());

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        try {
            return new RemoteWebDriver(
                    new URL(config.getRemoteUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
