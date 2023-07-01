package joy.world.thecheat.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class OpenApiConfig {
    @Bean
    fun openAPI(): OpenAPI {
        val info: Info = Info()
            .version("v0.0.1")
            .title("사기조회 더치트 클론")
            .description("swagger입니다.")
        return OpenAPI()
            .info(info)
    }
}