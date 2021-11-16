package com.main;

import java.util.ArrayList;
import java.util.Collections;

import com.service.Student;
/**
 * 
 * @author mounika.kuna
 *
 */
public class StudentMain {
	public static void main(String args[]){  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(111,"Mounika",16));  
		al.add(new Student(333,"Mouni",17));  
		al.add(new Student(222,"Moni",15));  

		Collections.sort(al);  
		for(Student st:al){  
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());  
		}  
	}  
}
