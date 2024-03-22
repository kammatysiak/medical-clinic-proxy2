package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VisitAssignPatientDTO {
    private String email;
    private Long visitID;
}
