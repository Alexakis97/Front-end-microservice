package com.service.minimicroservice.stripe;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.stripe.Stripe;
import com.stripe.model.Charge;

import lombok.Value;

@Service
public class StripeService {
 /*
    @Value("${STRIPE_SECRET_KEY}")
    private String secretKey;
     
    @PostConstruct
    public void init() {
        Stripe.apiKey = secretKey;
    }
    public Charge charge(ChargeRequest chargeRequest) 
      throws AuthenticationException, InvalidRequestException,
        APIConnectionException, CardException, APIException {
        Map<String, Object> chargeParams = new HashMap<>();
        chargeParams.put("amount", chargeRequest.getAmount());
        chargeParams.put("currency", chargeRequest.getCurrency());
        chargeParams.put("description", chargeRequest.getDescription());
        chargeParams.put("source", chargeRequest.getStripeToken());
        return Charge.create(chargeParams);
    }*/
}