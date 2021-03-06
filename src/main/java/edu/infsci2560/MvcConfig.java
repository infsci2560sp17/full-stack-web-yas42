package edu.infsci2560;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/homt").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/welcome").setViewName("welcome");
        registry.addViewController("/movie").setViewName("movie");
        registry.addViewController("/player").setViewName("player");
        registry.addViewController("/game").setViewName("game");
        registry.addViewController("/comment").setViewName("comment");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/test").setViewName("test");
        registry.addViewController("/test1").setViewName("test1");
    }

}