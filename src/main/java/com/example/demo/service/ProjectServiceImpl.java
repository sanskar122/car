package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.ProjectModel;
import com.example.demo.repository.ProjectRepository;


@Service

public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository repo;

	@Override
	public ProjectModel CreateUser(ProjectModel proj) {
		
		
		return repo.save(proj);
	}
	
}	
	


