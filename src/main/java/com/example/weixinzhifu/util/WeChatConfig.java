package com.example.weixinzhifu.util;



/**
 * 微信支付配置文件
 * @author chenp
 *
 */
public class WeChatConfig {

    /**
     * 微信服务号APPID
     */
    public static String APPID="wx6dced5d661288ba4";
    /**
     * 微信支付的商户号
     */
    public static String MCHID="1520771301";
    /**
     * 微信支付的API密钥
     */
    public static String APIKEY="yinongkonggu1234yinongkonggu1234";
    /**
     * 微信支付成功之后的回调地址【注意：当前回调地址必须是公网能够访问的地址】
     */
    public static String WECHAT_NOTIFY_URL_PC="http://www.gd12316.com.cn";
    /**
     * 微信统一下单API地址
     */
    public static String UFDODER_URL="https://api.mch.weixin.qq.com/pay/unifiedorder";

    /**
     * true为使用真实金额支付，false为使用测试金额支付（1分）
     */
    public static String WXPAY="true";

}
