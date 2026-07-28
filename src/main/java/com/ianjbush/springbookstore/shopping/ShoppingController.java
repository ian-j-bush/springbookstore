package com.ianjbush.springbookstore.shopping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

    private final ShoppingService shoppingService;

    public ShoppingController( ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }
}
