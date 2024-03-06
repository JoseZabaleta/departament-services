package com.loxassoft.departamentservices.Controller;

import com.loxassoft.departamentservices.Entity.Departament;
import com.loxassoft.departamentservices.Services.DepartamentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // reconocida como endpoint, clase que expide recursos
@RequestMapping("/api/departaments")
public class DepartamentController {
    private final DepartamentService departamentService;

    public DepartamentController(DepartamentService departamentService) {
        this.departamentService = departamentService;
    }
    @PostMapping //Define endpoint que permite enviar un objeto para guardarlo
    //requestbody, trae un objeto json y lo pasa a una clase java
    public Departament creaDepartament(@RequestBody Departament departament){
    return departamentService.createDepartament(departament);
    }

    @GetMapping("/{id}")
    public Departament getById(@PathVariable Integer id){// se le indica que en la url viene un id y debe ser mapeadoa  e la variable id
        return departamentService.getDepartamentById(id);
    }
    @GetMapping
    public List<Departament> findAll(){
        return departamentService.findAll();
    }
}
