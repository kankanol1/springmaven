package demo.controller;

import demo.demodao.Demo;
import demo.demoservice.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @ResponseBody  // 返回 Json 数据
    @GetMapping("add")
    private Demo add(@RequestParam(name = "id") Integer id,@RequestParam(name = "name") String  name){
        Demo demo = new Demo();
        demo.setName(name);
        demo.setId(id);
        return demoService.addOne(demo); // 成功返回 保存后的 demo
    }

}