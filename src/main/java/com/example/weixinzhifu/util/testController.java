package com.example.weixinzhifu.util;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class testController {
    //微信支付接口
    @RequestMapping("/wxPay")
    public String wxPay(WeChatParams ps,HttpServletResponse response) throws Exception {
        System.out.println("ps");
        ps.setBody("测试商品3");
        ps.setTotal_fee("100");
        ps.setOut_trade_no("hw5409550792199899");
        ps.setAttach("xiner");
        String urlCode = WeixinPay.getCodeUrl(ps);
        WeixinPay.encodeQrcode(urlCode,response);
        return null;
    }
}
