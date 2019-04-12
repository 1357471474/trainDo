package com.traindo.activeMQ;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * activemq队列
 * @author zfg
 * @date 2019年3月18日
 */
@RestController
public class ProducerController {
	//注入jsmtemplate
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/sendMsg")
    public void sendMsg(String msg) {
    	for(int i=0;i<10;i++) {
    		jmsMessagingTemplate.convertAndSend("my_msg", msg+i);
    		System.out.println("msg发送成功:"+ msg+i);
    	}
        
    }

    @RequestMapping("/sendMap")
    public void sendMap() {
        Map<String,String> map = new HashMap<String,String>();
        map.put("mobile", "13888888888");
        map.put("content", "王总喜提兰博基尼");
        jmsMessagingTemplate.convertAndSend("my_map", map);
        System.out.println("map发送成功");
    }
}
