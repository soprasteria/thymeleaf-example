package com.soprasteria.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.soprasteria.controller", "com.soprasteria.service" })
public class AppConfig {

}
