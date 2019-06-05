package com.yaoxu.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yaoxu
 * @Date 2019.06.05
 */
@Controller
@RequestMapping("order")
public class OrderController {

    @Value("${server.port}")
    private String port;
    @RequestMapping("/create")
    @ResponseBody
    public String create(String name){
        return "order create successful username is " + name + ", port is " + port;
    }
}
