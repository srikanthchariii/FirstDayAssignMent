package com.app.venkey;

abstract class Employee {
	private int id;
	private String name;
	private String dept;

	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
}

class PermanentEmployee extends Employee {
	private float salary;

	public PermanentEmployee(int id, String name, String dept, float salary) {
		super(id, name, dept);
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [salary=" + salary + "]" + super.toString();
	}
}

class ContractEmployee extends Employee {
	private float payperday;

	public ContractEmployee(int id, String name, String dept, float payperday) {
		super(id, name, dept);
		this.payperday = payperday;
	}

	public float getPayperday() {
		return payperday;
	}

	public void setPayperday(float payperday) {
		this.payperday = payperday;
	}

	@Override
	public String toString() {
		return "ContractEmployee [payperday=" + payperday + "]" + super.toString();
	}
}
