package design_pattern.stuctural.adapter.v2_dto.internal;

public interface PaymentProvider {
     void createPayment(PaymentRequest paymentRequest);


     PaymentStatus verifyStatus(Long id);
}
