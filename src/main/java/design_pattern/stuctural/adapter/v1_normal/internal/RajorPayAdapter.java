package design_pattern.stuctural.adapter.v1_normal.internal;

import design_pattern.stuctural.adapter.v1_normal.external.RazorPayApi;
import design_pattern.stuctural.adapter.v1_normal.external.RazorPayStatus;

public class RajorPayAdapter implements PaymentProvider{

    private RazorPayApi razorPayApi = new RazorPayApi();
    @Override
    public void createPayment(Long id, String name, String email, Double amount) {
        razorPayApi.pay(id,name,email,amount);
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        RazorPayStatus status = razorPayApi.checkStatus(id);
        return to(status);
    }

    private PaymentStatus to(RazorPayStatus status) {
        switch (status){
            case OK: return  PaymentStatus.DONE;
            case ERROR: return PaymentStatus.FAILED;
        }

        throw new IllegalArgumentException("Invalid status: " + status);
    }
}
