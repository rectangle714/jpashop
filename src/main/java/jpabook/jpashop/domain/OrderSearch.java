package jpabook.jpashop.domain;

import lombok.Data;
import lombok.Getter;

@Data
public class OrderSearch {

    private String memberName;  //회원 이름
    private OrderStatus orderStatus;    //주문 이름

}
