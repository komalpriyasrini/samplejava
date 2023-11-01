package org.studentDB;


public class StudentDatabase {

	public void Studentname() {
		System.out.println("Name:Priya");
	}
	
	public void StudentMark() {
			System.out.println("Mark:1002");
		}
	 public void StudentAddress() {
		 System.out.println("Address: Chennai");
		 
	 }
	 public static void main(String[] args) {
		StudentDatabase StuDB = new StudentDatabase();
		StuDB.Studentname();
		StuDB.StudentMark();
		StuDB.StudentAddress();
		
		
	}
	 
	 
}
