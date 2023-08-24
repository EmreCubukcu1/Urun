package com.springbootcrud.Urun.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.springbootcrud.Urun.model.Urun;
import com.springbootcrud.Urun.service.*;


@RestController  
public class UrunController   
{  

@Autowired  
UrunService urunsService;  
@GetMapping("/urun")  
private List<Urun> getAllUruns()   
{  
return urunsService.getAllUruns();  
}  
 
@GetMapping("/urun/{id}")  
private Urun getUruns(@PathVariable("id") UUID id)   
{  
return urunsService.getUrunById(id);  
}  

@DeleteMapping("/urun/{id}")  
private void deleteUrun(@PathVariable("id") UUID id)   
{  
urunsService.delete(id);  
}  

@PostMapping("/urun")  
private UUID saveUrun(@RequestBody Urun uruns)   
{  
urunsService.save(uruns);  
return uruns.getId();
}  

@PutMapping("{id}")
public ResponseEntity<Urun> updateUrun(@PathVariable("id") UUID id,
                                       @RequestBody Urun urun){
    urun.setId(id);
    Urun updatedUrun = urunsService.updateUrun(urun);
    return new ResponseEntity<>(updatedUrun, HttpStatus.OK);
}


}  
