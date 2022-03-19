package com.habibian.ecommerce.service;

import com.habibian.ecommerce.dto.Purchase;
import com.habibian.ecommerce.dto.PurchaseResponse;

/**
 * @author Ali
 */

public interface CheckoutService {

    /**
     * get purchase details and add them in database
     *
     * @param purchase (Purchase dto type)
     * @return (PurchaseResponse dto type)
     */
    PurchaseResponse placeOrder(Purchase purchase);
}
