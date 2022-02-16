/**
 * FileName:     WebMvcConfig.java
 * @Description: TODO
 * @author:      wzhang
 * @version      V1.0
 * Createdate:   2019年6月13日 上午11:00:25
 * Copyright:    Copyright(C) 2018
 * Company       TONGSHEN.
 * All rights Reserved, Designed By tongshen

 * Modification  History:
 * Date             Author        Version        Discription
 * ---------------------------------------------------------------------------
 * 2019年6月13日          wzhang          1.0             1.0

 * Why & What is modified:

 */
package com.yang.frist.confirg;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.io.File;

/**
 * web资源管理
 * @author:      wzhang
 * @date:        2019年6月13日 上午11:00:25
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	registry.addResourceHandler("/**")
    		.addResourceLocations("classpath:/public/")
    		.addResourceLocations("classpath:/static/")
    		.addResourceLocations("classpath:/META-INF/resources/");
    	registry.addResourceHandler("/public/**").addResourceLocations("classpath:/public/");
    	registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/", "file:static/");
		registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
//		registry.addResourceHandler("/external/**").addResourceLocations("file:" + ContextUtil.getPath() + File.separator + "external" + File.separator);
        super.addResourceHandlers(registry);
    }
}
