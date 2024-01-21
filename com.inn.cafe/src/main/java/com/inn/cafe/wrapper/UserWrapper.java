package com.inn.cafe.wrapper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserWrapper {

    private Integer id;
    private String contact_number;
    private String email;
    private String name;
    private String status;

    public UserWrapper(Integer id, String contact_number, String email, String name, String status) {
        this.id = id;
        this.contact_number = contact_number;
        this.email = email;
        this.name = name;
        this.status = status;
    }
}
