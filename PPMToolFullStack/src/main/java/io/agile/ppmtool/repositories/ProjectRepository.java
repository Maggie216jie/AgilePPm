package io.agile.ppmtool.repositories;

import io.agile.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long > {

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
}
