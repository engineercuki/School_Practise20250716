package com.sc;

import com.sa.Student;
import com.sa.Student2;
import com.sb.A;
import com.sb.B;

class Add1{ //com.sc.Add1
	public static void main(String[] args){
		//System.out.println("HELLO JAVA");

		Student s=new Student("ABC");

		System.out.println(s.show());

		Student2 s2;
		A a=new A("a",66);
		a.skill();

		System.out.println(a.show());

	}
}