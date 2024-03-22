package controller;

import lombok.RequiredArgsConstructor;
import model.PostVisitWithPatientDTO;
import model.VisitAssignPatientDTO;
import model.VisitDTO;
import org.springframework.web.bind.annotation.*;
import service.VisitService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/visits")
public class VisitController {
    public final VisitService visitService;

    @GetMapping("/{id}")
    List<VisitDTO> getVisitsForPatient(@PathVariable("id") long id) {
        return visitService.getVisitsForPatient(id);
    }

    @PostMapping
    VisitDTO postVisitWithPatient(@RequestBody PostVisitWithPatientDTO postVisitWithPatientDTO) {
        return visitService.createVisitWithPatient(postVisitWithPatientDTO);
    }

}
