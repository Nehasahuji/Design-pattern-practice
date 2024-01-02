package com.example.demo.design_pattern.stuctural.adapter.v2_dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import design_pattern.stuctural.adapter.v2_dto.internal.PaymentProvider;
import design_pattern.stuctural.adapter.v2_dto.internal.PaymentRequest;
import design_pattern.stuctural.adapter.v2_dto.internal.PaymentStatus;
import design_pattern.stuctural.adapter.v2_dto.internal.RajorPayAdapter;





public class PaymentProviderTest {
	
	PaymentProvider adapter = new RajorPayAdapter();
	
	
   
    @Test
    void testPayMethod(){
    	
        adapter.createPayment(
        		PaymentRequest.builder()
        					  .id(1L)
			        		  .email("abc@gmail.com")
			        		  .amount(2.0)
			        		  .name("neha")
			        		  .build()
        		);
    }
    
    @Test
    void testStatus() {
    	PaymentStatus status = adapter.verifyStatus(1L);
    	System.out.println(status);
    	assertEquals(PaymentStatus.DONE,status,"If status is fetched it should be done");
    }
}
