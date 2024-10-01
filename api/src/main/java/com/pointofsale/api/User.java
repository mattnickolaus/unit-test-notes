package com.pointofsale.api;

import java.time.LocalDate;
import java.util.List;

public class User {
    private Address address;
    private String emailAddress;
    private LocalDate endDate;
    private String firstName;
    private long id;
    private boolean isActive;
    private String lastName;
    private String loginCode;
    private List<PhoneNumber> notes;
    private String role;
    private LocalDate startDate;


}
