package com.fullstack.payment_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;
    private Long orderId;
    private Double monto;
    private String estado;

}
