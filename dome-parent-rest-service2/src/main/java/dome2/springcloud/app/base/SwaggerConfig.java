package dome2.springcloud.app.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2
 * http://localhost:8100/swagger-ui.html
 */
// 被SpringBoot扫描到，通知 spring 这是一个配置类
@Configuration
// 引入 Swagger2
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                // 方法需要有ApiOperation注解才能生存接口文档
                // .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // api所在的包
                .apis(RequestHandlerSelectors.basePackage("dome2.springcloud.app.api"))
                // 页面风格
                .paths(PathSelectors.any())
                // 运行并初始化相关内容
                .build().apiInfo(
                        new ApiInfoBuilder()
                                .title("Swagger2 接口测试")
                                .version("2.0")
                                .build()
                );
    }
}
