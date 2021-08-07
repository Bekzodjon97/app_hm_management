package uz.pdp.app_hp_management.payload;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Data
public class TaskDto {

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private UUID userId;


    private Date endTime;
}
