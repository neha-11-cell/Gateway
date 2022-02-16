package com.example.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Routeconfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("greet-client1", rt -> rt.path("/hello/**")
                        .uri("http://localhost:8070/"))
                .route("greet-server1", rt -> rt.path("/greeting/**")
                        .uri("http://localhost:8090/"))
                .build();


    }
}
