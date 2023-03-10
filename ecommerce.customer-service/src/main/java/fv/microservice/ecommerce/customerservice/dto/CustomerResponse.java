package fv.microservice.ecommerce.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CustomerResponse {
    private String id;
    private String name;
    private String email;
    private int age;
}
