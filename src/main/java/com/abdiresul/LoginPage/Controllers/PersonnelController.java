package com.abdiresul.LoginPage.Controllers;

import com.abdiresul.LoginPage.EntityClasses.Personnel;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/personnel")
public class PersonnelController {

    private static final List<Personnel> PERSONS = Arrays.asList(
            new Personnel(1,"Abdyrasul", "123"),
            new Personnel(2,"Amr", "123"),
            new Personnel(3,"Resul", "123")
    );

    @GetMapping(path="{personnelID}")
    public Personnel getPerson(@PathVariable("personnelID") Integer personnelID){
        return PERSONS.stream().filter(x->x.getID().equals(personnelID))
                .findFirst()
                .orElseThrow(() ->new IllegalStateException(
                        "Person "+ personnelID + " does not exist"
                ));
    }

    @GetMapping(path="/all")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public List<Personnel> getAllPersonnels(){
        return PERSONS;
    }
}
