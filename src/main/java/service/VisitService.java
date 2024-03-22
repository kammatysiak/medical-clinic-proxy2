package service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import model.PostVisitWithPatientDTO;
import model.VisitAssignPatientDTO;
import model.VisitDTO;
import org.springframework.stereotype.Service;
import remote.MedicalClinicClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitService {

    public final MedicalClinicClient medicalClinicClient;

    public List<VisitDTO> getVisitsForPatient(long id) {
        return medicalClinicClient.getVisitForPatient(id);
    }

    public VisitDTO createVisitWithPatient(PostVisitWithPatientDTO postVisitWithPatientDTO) {
        medicalClinicClient.postVisit(postVisitWithPatientDTO.getVisitDTO());
        return medicalClinicClient.assignPatientToVisit(postVisitWithPatientDTO.getVisitAssignPatientDTO().getEmail(),
                postVisitWithPatientDTO.getVisitAssignPatientDTO());
    }

}
