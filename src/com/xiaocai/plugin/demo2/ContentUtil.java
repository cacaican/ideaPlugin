package com.xiaocai.plugin.demo2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

/**
 * @ClassName ContentUtil
 * @Description TODO
 * @Author xiaocai
 * @Date 2021/12/12
 */
public class ContentUtil {
    public static String getContent() {
        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<Map> forEntity = new RestTemplate().getForEntity("https://api.nextrt.com/V1/Dutang", Map.class);
            HttpStatus statusCode = forEntity.getStatusCode();
            String content = "";
            if (statusCode.is2xxSuccessful()) {
                ArrayList data = (ArrayList) forEntity.getBody().get("data");
                Map<String, String> contontMap = (Map<String, String>) data.get(0);
                return contontMap.get("content");
            }
        } catch (Exception e) {
            return  "汤碗都碎了";
        }
        return "今天没有鸡汤";
    }
}