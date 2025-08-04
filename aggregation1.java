import java.util.Scanner;
class Student
{
private String name;
private int rollno;
public Student(String name, int rollno)
{
this.name=name;
this.rollno=rollno;
}

public void showStudent()
{
System.out.println("Name of the student : "+name);
System.out.println("Rollno. of the student : "+rollno);
}
}
class Department
{
private String dept;
private Student[] student;
public Department(String dept,Student[] student)
{
this.dept=dept;
this.student=student;
}
public void showDept()
{
System.out.println("Department name : "+dept);
System.out.println("Student details");
for(Student s:student)
{
s.showStudent();
}
}
} 
class aggregation1
{
public static void main(String args[])
{
Student s1=new Student("xxx",1041);
Student s2=new Student("yyy",1042);
Student[] studentList={s1,s2};
Department dep=new Department("CSE",studentList);
dep.showDept();
}
}
