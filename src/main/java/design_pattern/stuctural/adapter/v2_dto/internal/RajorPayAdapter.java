package design_pattern.stuctural.adapter.v2_dto.internal;

import design_pattern.stuctural.adapter.v2_dto.external.RazorPayApi;
import design_pattern.stuctural.adapter.v2_dto.external.RazorPayStatus;

public class RajorPayAdapter implements PaymentProvider{

    private RazorPayApi razorPayApi = new RazorPayApi();
  

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

	@Override
	public void createPayment(PaymentRequest paymentRequest) {
		 razorPayApi.pay(paymentRequest.getId(),paymentRequest.getName(),paymentRequest.getEmail(),paymentRequest.getAmount());
		
	}
}
