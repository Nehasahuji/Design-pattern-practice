package design_pattern.stuctural.adapter.v1_normal.internal;

public interface PaymentProvider {
     void createPayment(Long id,String name,String email,Double amount );


     PaymentStatus verifyStatus(Long id);
}
