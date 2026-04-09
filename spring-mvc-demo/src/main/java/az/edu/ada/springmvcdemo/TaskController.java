package az.edu.ada.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
@RequestMapping
public class TaskController {

    @GetExchange("/index")
    public String getIndex() {
        System.out.println(">>>Get Index Called!<<<");
        return "index";
    }

    @GetExchange("/tasks")
    public String getTask() {
        System.out.println(">>>Get Task Called!<<<");
        return "task";
    }

}
