package com.example.demo.domain.service;

import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PurchaseService {

    public String purchase(PurchaseRequest purchaseRequest) {

        RequestEntity<PurchaseRequest> request = RequestEntity
                .post("http://localhost:8081/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .body(purchaseRequest);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.exchange(request, String.class);
        return entity.getBody();
    }
}
