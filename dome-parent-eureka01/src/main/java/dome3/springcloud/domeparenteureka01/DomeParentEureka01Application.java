package dome3.springcloud.domeparenteureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DomeParentEureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(DomeParentEureka01Application.class, args);
    }

}
