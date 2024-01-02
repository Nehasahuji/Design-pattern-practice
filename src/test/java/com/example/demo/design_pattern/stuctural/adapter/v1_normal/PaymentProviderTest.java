package com.example.demo.design_pattern.stuctural.adapter.v1_normal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import design_pattern.stuctural.adapter.v1_normal.internal.PaymentProvider;
import design_pattern.stuctural.adapter.v1_normal.internal.PaymentStatus;
import design_pattern.stuctural.adapter.v1_normal.internal.RajorPayAdapter;

public class PaymentProviderTest {
	
	PaymentProvider adapter = new RajorPayAdapter();

    @Test
    void testPayMethod(){
        
        adapter.createPayment(1L,"Abd","abc@gmail.com",1000.0);
    }
    
    @Test
    void testStatus() {
    	PaymentStatus status = adapter.verifyStatus(1L);
    	System.out.println(status);
    	assertEquals(PaymentStatus.DONE,status,"If status is fetched it should be done");
    }
}
