package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Delivery {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery",
            fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
