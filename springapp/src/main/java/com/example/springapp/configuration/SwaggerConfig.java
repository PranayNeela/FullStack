package com.example.springapp.configuration;

// package com.example.UserCred.Configuration;

// import io.swagger.v3.oas.models.OpenAPI;
// import io.swagger.v3.oas.models.info.Info;
// import io.swagger.v3.oas.models.security.SecurityRequirement;
// import io.swagger.v3.oas.models.security.SecurityScheme;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;



// @Configuration
// public class SwaggerConfig {
//     @Bean
//     public OpenAPI customOPENAPI(){
//         return new OpenAPI()
//                 .info(new Info()
//                         .title("Spring Boot JWT Authentication API")
//                         .version("1.0")
//                         .description("API documentation for JWT authentication"))
//                 .addSecurityItem(new SecurityRequirement().addList("BearerAuth"))
//                 .components(new io.swagger.v3.oas.models.Components()
//                         .addSecuritySchemes("BearerAuth", new SecurityScheme()
//                                 .name("BearerAuth")
//                                 .type(SecurityScheme.Type.HTTP)
//                                 .scheme("bearer")
//                                 .bearerFormat("JWT")));
//     }
// }
