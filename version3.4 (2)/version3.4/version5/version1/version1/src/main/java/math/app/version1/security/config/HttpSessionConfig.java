package math.app.version1.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.session.data.mongo.JdkMongoSessionConverter;
import org.springframework.session.data.mongo.config.annotation.web.http.EnableMongoHttpSession;
import org.springframework.session.web.http.DefaultCookieSerializer;

import java.time.Duration;

@EnableMongoHttpSession
public class HttpSessionConfig {

    @Bean
    public JdkMongoSessionConverter jdkMongoSessionConverter() {
        return new JdkMongoSessionConverter(Duration.ofMinutes(30));
    }

    @Bean
    public DefaultCookieSerializer customCookieSerializer() {
        DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();
        cookieSerializer.setUseHttpOnlyCookie(false);
        return cookieSerializer;
    }
}

