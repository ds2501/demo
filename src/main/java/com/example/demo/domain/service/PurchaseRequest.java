package com.example.demo.domain.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PurchaseRequest {

    @JsonProperty("co_transaction_id")
    private String coTransactionId;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("item_name")
    private String itemName;

    @JsonProperty("amount")
    private String amount;
}
