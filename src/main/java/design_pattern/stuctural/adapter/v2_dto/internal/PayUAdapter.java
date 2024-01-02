package design_pattern.stuctural.adapter.v2_dto.internal;

import design_pattern.stuctural.adapter.v2_dto.external.PayStatus;
import design_pattern.stuctural.adapter.v2_dto.external.PayUPayApi;

public class PayUAdapter implements PaymentProvider{

    private PayUPayApi PayUPayApi = new PayUPayApi();
    @Override
    public void createPayment(PaymentRequest paymentRequest) {
        PayUPayApi.makePayment(paymentRequest.getId(),paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        PayStatus status = PayUPayApi.getStatus(id);
        return to(status);
    }

    private PaymentStatus to(PayStatus status) {
        switch (status){
            case SUCCESS: return  PaymentStatus.DONE;
            case FAILURE: return PaymentStatus.FAILED;
        }

        throw new IllegalArgumentException("Invalid status: " + status);
    }
}
