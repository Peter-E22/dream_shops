package com.dream.dreamshops.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CartItem {
    private Long id;

    private int quantity;
    private double price;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cart_id")
    public Cart cat;

    public void setTotalPrice(){
        this.totalPrice = product.getPrice().multiply(new BigDecimal(quantity));
    }

    public void setCart(Cart cart) {
        
    }
}
