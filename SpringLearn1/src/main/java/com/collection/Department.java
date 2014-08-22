package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Department {
	private String name;
	private String [] empName;
	private List<Employee> empList;
	private Set<Employee> empSets;
	private Map<String,Employee> empMaps;
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEmpName() {
		return empName;
	}
	public void setEmpName(String[] empName) {
		this.empName = empName;
	}
	public Set<Employee> getEmpSets() {
		return empSets;
	}
	public void setEmpSets(Set<Employee> empSets) {
		this.empSets = empSets;
	}
	public Map<String, Employee> getEmpMaps() {
		return empMaps;
	}
	public void setEmpMaps(Map<String, Employee> empMaps) {
		this.empMaps = empMaps;
	}
	
	
}
