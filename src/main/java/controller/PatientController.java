package controller;

import lombok.RequiredArgsConstructor;
import model.PatientCreateDTO;
import model.PatientDTO;
import model.VisitAssignPatientDTO;
import model.VisitDTO;
import org.springframework.web.bind.annotation.*;
import service.PatientService;
import service.VisitService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public final class PatientController {

    public PatientService patientService;
    public VisitService visitService;

    @GetMapping("/{id}")
    PatientDTO getPatient(@PathVariable("id") Long id) {
        return patientService.getPatient(id);
    }

    @GetMapping
    List<PatientDTO> getPatientsWithVisitsAtDate(@RequestParam LocalDateTime date){
        return patientService.GetPatientsWithVisitsAtDate(date);
    }

    @GetMapping
    List<PatientDTO> getPatients(){
        return patientService.getPatients();
    }

    @PostMapping
    PatientDTO postPatient(PatientCreateDTO patientCreateDTO){
        return patientService.postPatient(patientCreateDTO);
    }

    @GetMapping("/{patientId}/visits")
    List<VisitDTO> getVisitsForPatient(@PathVariable Long patientId){
        return patientService.getVisitsForPatient(patientId);
    }

}
