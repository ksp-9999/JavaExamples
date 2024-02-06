class Person{
	String name;
	int age;
	int height;
	int weight;
	String color;
	Person(String name,int age,int height,int weight,String color){
	this.name=name;
	this.age=age;
	this.height=height;
	this.weight=weight;
	this.color=color;
	}
	public void getPersonDetails(){
	System.out.println("Name: "+name+", Age: "+age+", color: "+color);
	}
}
class Student extends Person{
	int rollno;
	String std;
	Student(int rollno, String std,String name,int age,int height,int weight,String color){
	super(name,age,height,weight,color);
	this.rollno=rollno;
	this.std=std;
	}
	public void getStudentDetails(){
	System.out.println("Rollno: "+rollno+", Name: "+name+" Class: "+std);
	}
}
class Test{
	public static void main(String[] args){
	Student s= new Student(101,"tenth","sai prasad",25,6,73,"fair");
	s.getStudentDetails();
	s.getPersonDetails();
	}
}
