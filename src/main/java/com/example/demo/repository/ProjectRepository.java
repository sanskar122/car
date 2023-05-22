package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProjectModel;

public interface ProjectRepository extends JpaRepository<ProjectModel,Integer>{
	

}
