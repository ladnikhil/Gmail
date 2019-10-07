package com.ust.ustspringbootfinal.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ustspringbootfinal.dto.TaskManager;
import com.ust.ustspringbootfinal.repository.TaskManagerRepository;

@Service("jpa")
public class TaskManagerServiceJpaImpl implements TaskManagerService {

	@Autowired
	TaskManagerRepository repository;
	
	
	@Override
	public boolean addTask(TaskManager taskManager) {
		Date startdate = new Date();
		taskManager.setTaskstartdate(startdate);
		repository.save(taskManager);
		return true;
	}

	@Override
	public boolean removeTask(int taskid) {
		repository.deleteById(taskid);
		return true;
	}

	@Override
	public boolean modifyTask(TaskManager taskManager) {
		repository.update(taskManager.getTask(), taskManager.getTaskenddate(), taskManager.getTaskid());
		return true;
	}

	@Override
	public List<TaskManager> getAllTask() {
		
		 return repository.findAll();
	}

}
