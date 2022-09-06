package com.eyal.exam.DogAndCat.service;

import com.eyal.exam.DogAndCat.config.ConfigInternalApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class ServiceInternalApi {
//    @Autowired
//    RestTemplate restTemplate;

    private String clientID = "";
    private String clientSecret = "";
    private String myToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiJzMDJ0YXBMRG1JeTVtVXNLTDdDdDdtTHpPYWJJOFRHbngyUTJ0WnRobEZzODg2ekN1VyIsImp0aSI6ImQ5MWM5YmFjMzc3MWY4OTE1NzIxNmNkMTI2OTc4MzE1ODk4NWI4NTA3NmM5OGQ3M2Q2OTJjYzUzNDJmOWU3NTY0YjllOTVmMDZjNjZlMTUzIiwiaWF0IjoxNjYyNDczMzkyLCJuYmYiOjE2NjI0NzMzOTIsImV4cCI6MTY2MjQ3Njk5Miwic3ViIjoiIiwic2NvcGVzIjpbXX0.kYfsTwK01W0zqAQohzRXe4j-rFyulPzziYhG4y1w0Jc94OgrhGMJeUxwZQSmjN1u-TNJoCpnOjrzpSDwZN_PvW6jdNocNDdlhTNTM9vf5_ojDQCWIXKyHO9gwSEzcm5tyjTwHwLvEv3D0IaWXrqky5_EPYlkImK-vqSwEl2H--zKZSi5aXkQT6TT9awjkPuKLSJ2EUiG8qNCK-KXm3okEkFM5J8OrVpSHvNk9mwYzXKEenJEEepmmVLIFs8hFnIKYgWSKHHbGL8K3iBmizuZedSjWagTNbH3SbgNtrwJYqWpB22A9xTzM6bytcagEuqeUOgdScehBW9C5WmfV3aSHQ";
    public String runService(String animal){
        return runService(animal,"");
    }
    public String runService(String animal, String age){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        // call to method  valid token and if not valid call to method create token
        headers.setBearerAuth(myToken);
        String body = "type=dog&age=baby";
        HttpEntity<String> entity = new HttpEntity<String>(body,headers);
        if(restTemplate == null){
            System.out.println("restTemplate == null");
        }else{
            System.out.println("restTemplate != null");
        }
        String urlApi = "https://api.petfinder.com/v2/animals?type="+animal;
        if(null != age && age!=""){
            urlApi+="&age="+age;
        }
        System.out.println("my urlApi=" + urlApi);
        return restTemplate.exchange(urlApi, HttpMethod.GET, entity, String.class).getBody();

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
    /* ToDo */
    public Boolean isValidToken(String token){
        return true;
    }
    /* ToDo */
    public String getToken(){
        // Call Curl
        return "Token";
    }
}
