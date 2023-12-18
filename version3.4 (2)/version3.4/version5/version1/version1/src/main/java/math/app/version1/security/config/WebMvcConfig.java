package math.app.version1.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String path = "file:///E:/version3.4 (2)/version3.4 (2)/version3.4/version5/version1/version1/src/main/resources/static/public/images/";
        registry.addResourceHandler("/public/images/**")
                .addResourceLocations(path);
    }
}