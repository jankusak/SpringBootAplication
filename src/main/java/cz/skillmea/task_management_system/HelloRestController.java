package cz.skillmea.task_management_system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prefix")
public class HelloRestController {

    final private MessageService messageService;

    public HelloRestController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("hello")
    public String hello(){
        return messageService.getMsg();
    }
}
