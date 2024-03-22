package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostVisitWithPatientDTO {

    private VisitAssignPatientDTO visitAssignPatientDTO;
    private VisitDTO visitDTO;
}
