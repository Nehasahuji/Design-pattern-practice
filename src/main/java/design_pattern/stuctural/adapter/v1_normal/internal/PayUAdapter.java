package design_pattern.stuctural.adapter.v1_normal.internal;

import design_pattern.stuctural.adapter.v1_normal.external.PayStatus;
import design_pattern.stuctural.adapter.v1_normal.external.PayUPayApi;

public class PayUAdapter implements PaymentProvider{

    private PayUPayApi PayUPayApi = new PayUPayApi();
    @Override
    public void createPayment(Long id, String name, String email, Double amount) {
        PayUPayApi.makePayment(id,amount);
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
