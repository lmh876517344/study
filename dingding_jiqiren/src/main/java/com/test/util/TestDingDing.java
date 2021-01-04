package com.test.util;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import java.net.URLEncoder;

public class TestDingDing {
    public static void main(String[] args) throws Exception {
        Long timestamp = System.currentTimeMillis();
        String secret = "SEC175ff0376a2551f1e785fab47fe2bb4264247724657f85f622bded53565e95ff";
        System.out.println(timestamp);

        String stringToSign = timestamp + "\n" + secret;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
        String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8");
        System.out.println(sign);
    }
}
