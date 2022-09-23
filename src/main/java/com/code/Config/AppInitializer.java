package com.code.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                Persistence.class,
                Tiles.class
        };
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {
                WebMVCConfig.class 
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
