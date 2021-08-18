package vklonin.configs;

import org.aeonbits.owner.Config;

public interface WebTestsConfig {

    @Config.Sources({
            "classpath:${type}.properties"
    })
     interface DeviceConfig extends Config {

        @Key("browserName")
        String browserName();

        @Key("browserVersion")
        String browserVersion();

        @Key("webDriverUrl")
        String webDriverUrl();

    }
}
