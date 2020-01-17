package com.company.user;

import com.company.ROLE;
import com.company.user.User;

public class Customer extends User {
    public Customer(String userName, String password, ROLE role) {
        super(userName, password, role);
    }
}
