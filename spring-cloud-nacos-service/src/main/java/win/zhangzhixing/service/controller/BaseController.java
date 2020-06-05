package win.zhangzhixing.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/base")
@RefreshScope
public class BaseController {

    @Value("${zhang.zhi.xing: 1}")
    private Integer zhangzhixing;

    @GetMapping
    public String base() {
        return "service";
    }

    @GetMapping(value = "/age")
    public Integer age(){
        return zhangzhixing;
    }
}
