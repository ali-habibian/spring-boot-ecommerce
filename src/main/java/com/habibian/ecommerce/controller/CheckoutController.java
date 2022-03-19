package com.habibian.ecommerce.controller;

import com.habibian.ecommerce.dto.Purchase;
import com.habibian.ecommerce.dto.PurchaseResponse;
import com.habibian.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ali
 */

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        return checkoutService.placeOrder(purchase);
    }

}









