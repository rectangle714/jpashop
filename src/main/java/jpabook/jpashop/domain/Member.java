package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    //연관 관계의 주인이 아닌 곳에 mappedBy 입력
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
