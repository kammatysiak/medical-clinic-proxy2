package model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class PatientCreateDTO {

    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String idCardNo;
    private String phoneNumber;
    private LocalDate birthday;
}
