package com.ust.ustspringbootfinal.service;

import java.util.List;


import com.ust.ustspringbootfinal.dto.TaskManager;

public interface TaskManagerService {
	
	public boolean addTask(TaskManager taskManager);

	public boolean removeTask(int taskid);
	
	public boolean modifyTask(TaskManager taskManager);
	
	public List<TaskManager> getAllTask();

}
