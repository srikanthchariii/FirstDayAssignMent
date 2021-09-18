package com.app.venkey;

import java.util.TreeSet;

public class DuplicateProgram1 {
	public static void main(String[] args) {

		TreeSet<Employee> ts = new TreeSet<>((e1, e2) -> e1.getId() - e2.getId());
		ts.add(new ContractEmployee(01, "Name1", "Name2", 1.5f));
		ts.add(new ContractEmployee(01, "Name1", "Name2", 1.5f));

		System.out.println();
		for (Employee emp : ts) {
			System.out.print(emp + "\t");
		}

	}
}
