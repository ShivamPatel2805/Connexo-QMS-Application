package com.example.CapaController;


import com.example.CapaDtos.CapaRequest;
import com.example.CapaEntity.EntityMain;

import com.example.CapaRepository.EntityMainRepo;
import com.example.CapaService.CapaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http:localhost:5173")
@RestController
@RequestMapping("/capa/api")
public class CapaController {

    @Autowired
    private EntityMainRepo entityMainrepo;
    @Autowired
    private CapaService capaservice;

/*    @PostMapping("/create")
    public Capa createExtention(@RequestBody CapaRequest capaRequest){
        return caparepo.save(capaRequest.getCapa());
    }*/

    @PostMapping("/create")
    public EntityMain createEntityMain(@RequestBody CapaRequest entitymainRequest){
        return entityMainrepo.save(entitymainRequest.getEntityMain());
    }


    @GetMapping("/findAllDivision")
    public List<EntityMain> findAllDivision(){

        return entityMainrepo.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public EntityMain getEntityMainById(@PathVariable Long id) {

        return capaservice.getEntityMainById(id);
    }

    @PutMapping("/update/{id}")
    public EntityMain updateEntityMain(@PathVariable long id,@RequestBody EntityMain entityMain){
        return capaservice.updateEntityMain(id,entityMain);
    }

}
