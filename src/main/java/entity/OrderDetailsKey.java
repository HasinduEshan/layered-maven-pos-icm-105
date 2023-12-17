package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class OrderDetailsKey implements Serializable {

    @Column(name = "order_id")
    private String orderId;
    @Column(name = "item_code")
    private String itemCode;
}
