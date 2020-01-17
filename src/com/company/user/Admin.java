package com.company.user;

import com.company.ROLE;
import com.company.user.User;

public class Admin extends User {
    public Admin(String userName, String password, ROLE role) {
        super(userName, password, role);
    }
}
