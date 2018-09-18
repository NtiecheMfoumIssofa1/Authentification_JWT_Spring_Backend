package org.sid.dao;

import org.sid.enties.Task;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//@RepositoryRestResource cette annotation joue le meme role que la création d'un restController
public interface TaskRepository  extends JpaRepository<Task, Long>{

}
