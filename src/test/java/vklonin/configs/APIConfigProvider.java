package vklonin.configs;

import org.aeonbits.owner.ConfigFactory;

public class APIConfigProvider {
    private static String token;
    private static String baseUrl;
    private static APITestsConfig config = ConfigFactory
            .create(APITestsConfig.class, System.getProperties());

    public static String getToken() {
        if (System.getProperty("token")==null){
            token = config.getToken();
            return token;
        }
        token = System.getProperty("token");
        return token;
    }
    public static String getBaseUrl() {
        baseUrl = config.getBaseUrl();
        return baseUrl;
    }



}
