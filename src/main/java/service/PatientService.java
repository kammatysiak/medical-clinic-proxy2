package service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import model.PatientCreateDTO;
import model.PatientDTO;
import model.VisitAssignPatientDTO;
import model.VisitDTO;
import org.springframework.stereotype.Service;
import remote.MedicalClinicClient;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

public final MedicalClinicClient medicalClinicClient;

    public PatientDTO getPatient(long id) {
        return medicalClinicClient.getPatient(id);
    }

    public List<PatientDTO> GetPatientsWithVisitsAtDate(LocalDateTime date) {
        return medicalClinicClient.getPatientsWithVisitAtDate(date);
    }

    public PatientDTO postPatient(PatientCreateDTO patientCreateDTO) {
        return medicalClinicClient.postPatient(patientCreateDTO);
    }

    public List<PatientDTO> getPatients() {
        return medicalClinicClient.getPatients();
    }

    public List<VisitDTO> getVisitsForPatient(Long patientId) {
        return medicalClinicClient.getVisitForPatient(patientId);
    }
}
