package com.example.assignmentspringboot.repository;

import com.example.assignmentspringboot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
