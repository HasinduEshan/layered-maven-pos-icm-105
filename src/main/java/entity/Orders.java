package entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Orders {
    @Id
    private String orderId;
    private String date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public Orders(String orderId, String date) {
        this.orderId = orderId;
        this.date = date;
    }
}
