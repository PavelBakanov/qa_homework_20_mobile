package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserstackDriverConfig;
import helpers.Browserstack;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    private final BrowserstackDriverConfig config;

    public BrowserstackDriver() {
        this.config = ConfigFactory.create(BrowserstackDriverConfig.class, System.getProperties());
    }

    Browserstack browserstack = new Browserstack();

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();

        caps.setCapability("browserstack.user", config.getBrowserstackUser());
        caps.setCapability("browserstack.key", config.getBrowserstackKey());
        caps.setCapability("app", browserstack.checkUploadedAppsList());
        caps.setCapability("device", config.getDevice());
        caps.setCapability("os_version", config.getOsVersion());

        try {
            return new RemoteWebDriver(
                    new URL(config.getRemoteUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
