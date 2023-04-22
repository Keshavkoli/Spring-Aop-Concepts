package com.aop.with.dailycodewithbuffer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.aop.with.dailycodewithbuffer")
@EnableAspectJAutoProxy
public class BeanConfig {

}
