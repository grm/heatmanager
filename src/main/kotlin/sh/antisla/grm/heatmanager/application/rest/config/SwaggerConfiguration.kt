package sh.antisla.grm.heatmanager.application.rest.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfiguration {

    @Bean
    fun springShopOpenAPI(): OpenAPI? {
        return OpenAPI()
                .info(Info().title("HeatManager API")
                        .description("HeatManager to manage multiprupose thermostat")
                        .version("v0.0.1")
                        .license(License().name("Apache 2.0").url("http://springdoc.org")))
//                .externalDocs(ExternalDocumentation()
//                        .description("SpringShop Wiki Documentation")
//                        .url("https://springshop.wiki.github.org/docs"))
    }
}