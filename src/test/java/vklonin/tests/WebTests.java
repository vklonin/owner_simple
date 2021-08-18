package vklonin.tests;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import vklonin.configs.WebTestsConfig;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.*;

public class WebTests {

    @BeforeAll
    static void setupWebdriver() {
        WebTestsConfig.DeviceConfig config = ConfigFactory
                .create(WebTestsConfig.DeviceConfig.class, System.getProperties());
        Configuration.browser = config.browserName();
        Configuration.browserVersion = config.browserVersion();

        if(System.getenv("type").equals("remote")) {
            Configuration.remote = config.webDriverUrl();
        }
    }

    @Test
    void checkGooglePage() {
        open("http://google.com");
        String check = $("input").getAttribute("name");
        assertThat(check).isEqualTo("q");
    }

}
