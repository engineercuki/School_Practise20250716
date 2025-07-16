package com.sa;
public class Student{
	//完整路徑 com\sa\Student -> 繼承絕對路徑寫法 com.sa.Student

	private String name; 
	//Student(String name) //建構式沒有 public 無法被跨資料夾繼承呼叫
	public Student(String name)
	{
		this.name=name;
	}

	public String show()
	{
		return "名:"+name;
	}
	
}