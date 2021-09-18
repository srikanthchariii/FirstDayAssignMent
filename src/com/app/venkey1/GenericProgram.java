//3. Employee use Stream's map() method to get only employee ids and print using forEach

package com.app.venkey1;

class Test<T> {
	T t;

	Test(T ob1) {
		t = ob1;
	}

	T getOb() {
		return t;
	}
}

class Test2<T, S> extends Test<T> {
	S s;

	Test2(T ob1, S ob2) {
		super(ob1);
		s = ob2;
	}

	S getOb2() {
		return s;
	}
}

public class GenericProgram {
	public static void main(String[] args) {
		Test2<Integer, String> t = new Test2<Integer, String>(100, "ABC");

		System.out.println(t.getOb());
		System.out.println(t.getOb2());
	}

}