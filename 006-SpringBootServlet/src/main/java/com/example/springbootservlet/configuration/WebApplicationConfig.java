package com.example.springbootservlet.configuration;


import com.example.springbootservlet.controller.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebApplicationConfig {
    //定义方法，注册servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return bean;

        //上述方法有两个参数。当然，也可以选择无参构造
//        ServletRegistrationBean bean = new ServletRegistrationBean();
//        bean.setServlet(new MyServlet());
//        bean.addUrlMappings("/myservlet");    //<url-pattern>
//        return bean;
    }
}
