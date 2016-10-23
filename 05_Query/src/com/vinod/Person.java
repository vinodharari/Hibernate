package com.vinod;
public class Person {
		private int id;
		private String firstName;
		private String address;
		private String education;
		private int age;
		private int salary;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEducation() {
			return education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString(){
			StringBuffer sb=new StringBuffer();
			sb.append("id = "+id);
			sb.append(",First Name = "+firstName);
			sb.append(",Address = "+address);
			sb.append(",Education = "+education);
			sb.append(",Age = "+age);
			sb.append(",Salary = "+salary);
			return sb.toString();
		}
}

