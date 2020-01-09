package io.agile.ppmtool.services;

import io.agile.ppmtool.domain.Project;
import io.agile.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private  ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        return projectRepository.save(project);
    }


}
