package com.habibian.ecommerce.dto;


import com.habibian.ecommerce.entity.Address;
import com.habibian.ecommerce.entity.Customer;
import com.habibian.ecommerce.entity.Order;
import com.habibian.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

/**
 * @author Ali
 */

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
