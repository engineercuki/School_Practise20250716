package com.sb;
import com.sa.Student; //import+絕對路徑 ->權限開放
import com.sa.Student2;
//class A extends com.sa.Student{
	//繼承如果沒有放在同一個資料夾,編譯錯誤 error: file not found: com\sa\A.java
public class A extends Student implements Student2{
	private int chi;
	A(String name,int chi){
		super(name);
		this.chi=chi;
	}

	public void skill(){
		System.out.println("A skill");
	}

	public String show(){
		return super.show()+"\t國文:"+chi;
	}
}