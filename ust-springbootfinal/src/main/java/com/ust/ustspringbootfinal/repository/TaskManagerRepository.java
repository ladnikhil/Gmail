package com.ust.ustspringbootfinal.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ust.ustspringbootfinal.dto.TaskManager;

public interface TaskManagerRepository  extends JpaRepository<TaskManager, Integer>{
	
	@Transactional       
	@Modifying
	@Query("update TaskManager set task = :name,taskenddate = :taskenddate where taskid = :id")
	public void update(@Param("name")String name,@Param("taskenddate")Date taskenddate,@Param("id")int taskid); 


}
