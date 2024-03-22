package model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class PatientDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate birthday;
}
