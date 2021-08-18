package vklonin.configs;
import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.*;


@Sources({
        "file:/Users/vladimirklonin/Documents/properties/local.properties",
})

public interface APITestsConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("http://httpbin.org/")
    String getBaseUrl();

    @Key("token")
    String getToken();

}
