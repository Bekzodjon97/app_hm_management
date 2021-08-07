package uz.pdp.app_hp_management.payload;

import lombok.Data;
import uz.pdp.app_hp_management.entity.User;

import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
public class AboutWorkerDto {

    @NotNull
    private Date fromDate;

    @NotNull
    private Date toDate;
}
