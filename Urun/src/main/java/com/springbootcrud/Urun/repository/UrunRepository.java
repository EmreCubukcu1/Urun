package com.springbootcrud.Urun.repository;


import java.util.UUID;

import org.springframework.data.repository.CrudRepository;



import com.springbootcrud.Urun.model.*;
 
//repository that extends CrudRepository  
public interface UrunRepository extends CrudRepository<Urun, UUID>  
{  
	
	
}  