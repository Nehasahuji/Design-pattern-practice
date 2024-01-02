package design_pattern.stuctural.adapter.v2_dto.external;


//Step 0: Incompatible interface
//SDK -> just wrappers
public class RazorPayApi {
    public void pay(Long id,String name,String email,Double amount ){
        System.out.println("Razor pay payment");
    }

    public RazorPayStatus checkStatus(Long id){
        return RazorPayStatus.OK;
    }
}
