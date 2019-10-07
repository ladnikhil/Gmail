package com.ust.ustspringbootfinal.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "taskinfo")
public class TaskManager {
	
	@Id
	@Column
	@GeneratedValue
	private int taskid;
	@Column
	private String task;
	@Column
	@GeneratedValue
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date taskstartdate;
	@Column
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date taskenddate;
	
	
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public Date getTaskstartdate() {
		return taskstartdate;
	}
	public void setTaskstartdate(Date taskstartdate) {
		this.taskstartdate = taskstartdate;
	}
	public Date getTaskenddate() {
		return taskenddate;
	}
	public void setTaskenddate(Date taskenddate) {
		this.taskenddate = taskenddate;
	}
	
	
	
	
	
	

}
