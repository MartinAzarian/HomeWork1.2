package com.company;

import com.company.user.Admin;
import com.company.user.Customer;
import com.company.user.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        User user1 = new Customer("ueser1", "1#Pa42ssworld", ROLE.CUSTOMER);
        User user2 = new Customer("ueser2", "Passw312orld", ROLE.CUSTOMER);
        User user3 = new Customer("ueser3", "Pass63!4world", ROLE.CUSTOMER);
        User user4 = new Customer("ueser4", "Pas342sworld", ROLE.CUSTOMER);
        User user5 = new Customer("ueser5", "Pass435world", ROLE.CUSTOMER);
        User user6 = new Customer("ueser6", "Pass222world", ROLE.CUSTOMER);
        User user7 = new Customer("ueser7", "Passworld", ROLE.CUSTOMER);
        User user8 = new Customer("ueser8", "Passwor324#ld", ROLE.CUSTOMER);
        User user9 = new Admin("user9", "Passworld!231", ROLE.ADMIN);
        User user10 = new Admin("user10", "Passworld!231", ROLE.ADMIN);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

    }
}
