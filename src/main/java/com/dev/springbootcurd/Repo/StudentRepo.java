package com.dev.springbootcurd.Repo;

import com.dev.springbootcurd.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,String> {
}
