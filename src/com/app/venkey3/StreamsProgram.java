//2. Show that a Base and Derived classes both can be Generic?

package com.app.venkey3;

import java.util.Arrays;
import java.util.List;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class StreamsProgram {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee(100, "ABC"), new Employee(200, "XYZ"),
				new Employee(300, "ASD"));

		emp.stream().map(Employee::getId).forEach((id -> {
			System.out.println("id :" + id);
		}));

	}
}
