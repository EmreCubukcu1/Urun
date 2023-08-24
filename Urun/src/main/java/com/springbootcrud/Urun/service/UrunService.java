package com.springbootcrud.Urun.service;

import java.util.ArrayList;  


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.springbootcrud.Urun.model.*;
import com.springbootcrud.Urun.repository.*;

 
@Service 
public class UrunService 
{  
@Autowired  
UrunRepository urunRepository;  
 
public List<Urun> getAllUruns()   
{  
List<Urun> uruns = new ArrayList<Urun>();  
urunRepository.findAll().forEach(urun1 -> uruns.add(urun1));  
return uruns;  
}  
 
public Urun getUrunById(UUID id)   
{  
return urunRepository.findById(id).get();  
}  

public void save(Urun uruns)   
{  
urunRepository.save(uruns);  
}  

public void delete(UUID id)   
{  
urunRepository.deleteById(id);  
}  
 

public Urun updateUrun(Urun urun) {
    Urun existingUrun = urunRepository.findById(urun.getId()).get();
    existingUrun.setUrunadi(urun.getUrunadi());
    existingUrun.setFiyat(urun.getFiyat());
    existingUrun.setMiktar(urun.getMiktar());
    Urun updatedUrun = urunRepository.save(existingUrun);
    return updatedUrun;
}

}  
