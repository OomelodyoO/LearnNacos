package win.zhangzhixing.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.zhangzhixing.user.micro.ServiceClient;

@RestController
@RequestMapping(path = "/base")
public class BaseController {
    private final ServiceClient serviceClient;

    public BaseController(ServiceClient serviceClient) {
        this.serviceClient = serviceClient;
    }

    @GetMapping
    public String base() {
        String base = serviceClient.base();
        return "user" + base;
    }
}
