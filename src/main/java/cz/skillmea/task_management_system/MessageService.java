package cz.skillmea.task_management_system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Value("${message}")
    private String msg;

    public String getMsg() {
        return msg;
    }
}
