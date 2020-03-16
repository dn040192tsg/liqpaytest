package com.liqpaydemo.liqpaytest;

import com.liqpay.LiqPay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@SpringBootApplication
@RestController
public class LiqpaytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiqpaytestApplication.class, args);


}

    @GetMapping("/")
    public String liqpaytest(@RequestParam(required = false, defaultValue = "1") String amount,
                             @RequestParam(required = false, defaultValue = "USD") String currency,
                             @RequestParam(required = false, defaultValue = "i66823577067") String publicKey,
                             @RequestParam(required = false, defaultValue = "RUtwa6WZfpnbcgEZKANifBXc8Rz0z2usEp9a8kP9") String privateKey) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("action", "pay");
        params.put("amount", amount);
        params.put("currency", currency);
        params.put("description", "description text");
        params.put("order_id", "order_id_1");
        params.put("version", "3");


        LiqPay liqpay = new LiqPay(publicKey
                , privateKey);
        String html = liqpay.cnb_form(params);
        return html;
    }
}