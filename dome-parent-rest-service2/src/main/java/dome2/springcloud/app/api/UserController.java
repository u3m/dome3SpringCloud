package dome2.springcloud.app.api;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name:}")
    String name;

    @Autowired
    RestTemplate restTemplate;

    // @ApiOperation("测试接口 / /home")
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home() {
        return restTemplate.getForObject("http://rest-service1/home", String.class);
    }

    @ApiOperation(value = "提交订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId1", value = "订单Id", required = true), // orderId1
            @ApiImplicitParam(name = "orderId2", value = "订单Id2", required = true, dataType = "String", paramType = "path"), // orderId2
            @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User") // user
    })
    @RequestMapping(value = "add/order/{orderId2}", method = RequestMethod.POST)
    public String addOrder(
            @RequestParam String orderId1,
            @PathVariable String orderId2,
            @RequestBody User user) {
        return "add/order";
    }

    protected static class User {
        public String uid;
        public String username;
    }

}
