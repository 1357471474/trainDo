package com.traindo.activeMQ;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ConsumerController {

//	@JmsListener(destination = "my_msg")
//	@SendTo("out.queue")
    public String readMsg(String text) {
        System.out.println("接收到消息：" + text);
        return text;
    }

//    @JmsListener(destination = "my_map")
    public void readMap(Map<String,String> map) {
        System.out.println(map);
    }
}
