package uz.pdp.app_hp_management.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class ParolDto {
    @NotNull
    private String password;
}

