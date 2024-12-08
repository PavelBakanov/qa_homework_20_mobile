package config;

import org.aeonbits.owner.Config;

    @Config.Sources({
            "classpath:properties/${deviceHost}.properties",
    })
    public interface BrowserstackDriverConfig extends Config {

        @Key("browserstack.user")
        String getBrowserstackUser();

        @Key("browserstack.key")
        String getBrowserstackKey();

        @Key("app")
        @DefaultValue("bs://sample.app")
        String getApp();

        @Key("remoteUrl")
        String getRemoteUrl();

        @Key("device")
        String getDevice();

        @Key("os_version")
        String getOsVersion();
    }
