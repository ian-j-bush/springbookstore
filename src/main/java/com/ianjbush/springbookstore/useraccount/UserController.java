package com.ianjbush.springbookstore.useraccount;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserService userService;

    public UserController( UserService userService ) {
        this.userService = userService;
    }
}
