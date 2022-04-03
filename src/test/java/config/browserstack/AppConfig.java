package config.browserstack;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstaсk/app.properties")
public interface AppConfig extends Config {

    String browserstackUser();
    String browserstackKey();
    String browserstackSessionId();
}
