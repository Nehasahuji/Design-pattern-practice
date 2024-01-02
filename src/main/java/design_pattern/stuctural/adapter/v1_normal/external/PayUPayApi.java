package design_pattern.stuctural.adapter.v1_normal.external;


//Step 0: Incompatible interface
//SDK
public class PayUPayApi {
    public void makePayment(Long id,Double amount){
        System.out.println("payu pay payment");
    }



    public PayStatus getStatus(Long id){
        return PayStatus.SUCCESS;
    }
}
