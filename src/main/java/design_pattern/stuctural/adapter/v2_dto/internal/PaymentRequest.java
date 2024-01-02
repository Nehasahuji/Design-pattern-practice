package design_pattern.stuctural.adapter.v2_dto.internal;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PaymentRequest {
	private Long id;
	private String name;
	private String email;
	private Double amount;

}
