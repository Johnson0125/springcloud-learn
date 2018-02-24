package manage.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/send")
public class CreateController {
    @Autowired
    private KafkaSender kafkaSender;

    @GetMapping(value="/s")
    public String send(){
        kafkaSender.sendMessage("测试汉字问题");
        return "ok";
    }
}
