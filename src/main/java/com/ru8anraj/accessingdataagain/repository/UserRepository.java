package com.ru8anraj.accessingdataagain.repository;

import com.ru8anraj.accessingdataagain.entity.UserEntitry;
import org.springframework.data.repository.CrudRepository;


// Auto implemented by spring into Bean called userRepository
public interface UserRepository extends CrudRepository<UserEntitry, Integer> {

}
