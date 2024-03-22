package remote;

import model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

@FeignClient(name = "MedicalClinicClient")
public interface MedicalClinicClient {

    @GetMapping("/patients/{id}")
     PatientDTO getPatient(@PathVariable long id);

    @GetMapping("/patients")
    List<PatientDTO> getPatients();

    @PostMapping("/patients")
    PatientDTO postPatient(@RequestBody PatientCreateDTO patientCreateDTO);

    @GetMapping("/patients")
    List<PatientDTO> getPatientsWithVisitAtDate(@RequestParam LocalDateTime date);

    @GetMapping("/patients")
    List<VisitDTO> getVisitForPatient(long id);

    @PostMapping("/visits")
    VisitDTO postVisit(@RequestBody VisitDTO visitDTO);

    @PatchMapping("/{email}")
    VisitDTO assignPatientToVisit(@PathVariable String email, @RequestBody VisitAssignPatientDTO assignDTO);

}
