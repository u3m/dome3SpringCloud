package dome2.springcloud.app.base;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

// 被SpringBoot扫描到，通知 spring 这是一个配置类
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        // build http headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-auth-token","123");
        return new RestTemplate();
    }
}
