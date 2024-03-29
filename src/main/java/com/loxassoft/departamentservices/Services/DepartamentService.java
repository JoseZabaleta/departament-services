package com.loxassoft.departamentservices.Services;

import com.loxassoft.departamentservices.Entity.Departament;
import com.loxassoft.departamentservices.Repository.DepartamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentService {
    private final DepartamentRepository departamentRepository;

    public DepartamentService(DepartamentRepository departamentRepository) {
        this.departamentRepository = departamentRepository;
    }

    public Departament createDepartament(Departament departament){
        return departamentRepository.save(departament);
    }
    public Departament getDepartamentById(Integer id){
    return departamentRepository.findById(id).get();
    }
    public List<Departament> findAll(){
        return  departamentRepository.findAll();
    }

}
