package com.eyal.exam.DogAndCat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class ServiceInternalApi {
    @Autowired
    RestTemplate restTemplate;

    public String runService(){
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth("eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiJzMDJ0YXBMRG1JeTVtVXNLTDdDdDdtTHpPYWJJOFRHbngyUTJ0WnRobEZzODg2ekN1VyIsImp0aSI6IjA4YWQ0Mzc5Yzc2ZjIyNmMxZGVjZGNjN2FiMDQxMzIxZGZhNzFmMDhiZDZlZTE1M2IzZDNlNzVmNWZmMjU5OTVkZDMwYzM2MmE2MDI2ZDQwIiwiaWF0IjoxNjYyMzk0Nzg2LCJuYmYiOjE2NjIzOTQ3ODYsImV4cCI6MTY2MjM5ODM4Niwic3ViIjoiIiwic2NvcGVzIjpbXX0.zD311u2_t8SINOMLmqUYMbP4MEf4bXZuXcIRCcHwYQ2B6S6JYWNMq89z5rH2vS7au31vAtTlusxHQfmzXFOGmFPJvaPiTfkbk2BeIhD_Yx24W_RzB-_LR9sWlQNYMZHb4XyHPKm-KtQc8XHDfZaBK4J0tEdqWq0ZuWOndrl7l6Dj3KhzTcvP6-KgQBxVuYiKk-ANLFVchYoRITiCNBJtv_8IRX-WX0e-B1dGAVY_ksFu5ludI_kR2zojd_U8tKXSCUWEgIelSLnA_5D8atQnMcZ3Z6eIcMtKyEpTB3JqVuzwJ7fgKaFqzAfKLNeDj9qpqPc-VRoy9DZp_gRlV8H6Eg");
//        String requestJson = "{\"type\":\"dog\"}";
        String body = "type=dog&age=baby";
        HttpEntity<String> entity = new HttpEntity<String>(body,headers);
        if(restTemplate == null){
            System.out.println("restTemplate == null");
        }else{
            System.out.println("restTemplate != null");
        }
        return rt.exchange("https://api.petfinder.com/v2/animals?type=dog", HttpMethod.GET, entity, String.class).getBody();


        /**
         *
         *
         * Unirest.setTimeouts(0, 0);
         * HttpResponse<String> response = Unirest.get("https://api.petfinder.com/v2/animals?type=dog&page=2")
         *   .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiJzMDJ0YXBMRG1JeTVtVXNLTDdDdDdtTHpPYWJJOFRHbngyUTJ0WnRobEZzODg2ekN1VyIsImp0aSI6IjBiMjE3OTVkMDE2ZGRiNTdjOTEzMGRiZDQ4NjcxOTRiOTc0Nzg5ZGI3MjdjMjQ3MDU1YzQ5YWMxNmJmZGM3YmE4N2U5NjZkYWJjMDVmMGEyIiwiaWF0IjoxNjYyMDUzMTAyLCJuYmYiOjE2NjIwNTMxMDIsImV4cCI6MTY2MjA1NjcwMiwic3ViIjoiIiwic2NvcGVzIjpbXX0.zQ14iLpI4W6AAPXvmzEZag7pfvxMoo54tXF_xN2NtAuNOuJv3l7MqstjMG8fPCZV96_fLV2-6QaW4khrCubs2iEbT0L0L57VVmJapYmmUvE2_hm4CrSGtIk-JKqFu4vYRWzhuC9ku5Hg9XvG86C4FVWdhlpbwmjYG8YM9wVxcIX0nrRYXK_x2xlPq4bHpP5yAGyZQjfSMJpnetX4ErpZPRkzb3iWPKCOV-PqI0H2v7eEVuVdPENDSHVd-Tb_0dP44qDRBJkiXMKypFdfxhCK3I8bXoFO1O08EqqaWp-98_YPuOljHWrcE7MugnIlZuKPht_82veSuVpPYjCPNsDYPg")
         *   .asString();
         *
         */

    }
}
