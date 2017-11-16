package com.forms;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class RegisterForm {
    @NotEmpty
    private String username;

    @NotEmpty
    private String password;
}
