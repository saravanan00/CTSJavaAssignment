package com.cts.arraylist;

	public class ListComparable implements Comparable<ListComparable> {
		private String studentname;
	    private int rollno;
	    private int studentage;

	    public ListComparable(int rollno, String studentname, int studentage) {
	        this.rollno = rollno;
	        this.studentname = studentname;
	        this.studentage = studentage;
	    }
		public String getStudentname() {
			return studentname;
		}
		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public int getStudentage() {
			return studentage;
		}
		public void setStudentage(int studentage) {
			this.studentage = studentage;
		}
		
		@Override
		public int compareTo(ListComparable o) {
			 int compareage=((ListComparable)o).getStudentage();
		        /* For Ascending order*/
		        return this.studentage-compareage;
			//return  studentage-o.studentage;
			
		}
		@Override
		public String toString() {
			return "ListComparable [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
		}
		

	}

