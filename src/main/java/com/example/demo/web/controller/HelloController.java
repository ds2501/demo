package com.example.demo.web.controller;

import com.example.demo.domain.service.PurchaseRequest;
import com.example.demo.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * コントローラークラス
 */
@RestController
public class HelloController {

    @Autowired
    private PurchaseService purchaseService;

    /**
     * 名前とメッセージを返すAPI
     * @return HelloObject
     */
    @GetMapping(path = "hello")
    public HelloObject hello() {
        HelloObject helloObject = new HelloObject();
        helloObject.setName("saito");
        helloObject.setMessage("Hello");
        return helloObject;
    }

    @PostMapping(path = "hello2")
    public HelloObject hello2(@RequestBody Map<String,String> body) {
        HelloObject helloObject = new HelloObject();
        helloObject.setName(body.get("name"));
        helloObject.setMessage(body.get("message")+"!!!");
        return helloObject;
    }

    @GetMapping("purchase")
    public String purchase() {
        PurchaseRequest request = new PurchaseRequest();
        request.setCoTransactionId("CAT1223");
        request.setItemName("pen");
        request.setAmount("100");
        request.setUserId("saito");
        return purchaseService.purchase(request);
    }
}

class HelloObject {
    private String name;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
