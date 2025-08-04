import java.util.Scanner;
class Dept
{
private String dept;
private int deptId;
public Dept(String dept, int deptId)
{
this.dept=dept;
this.deptId=deptId;
}
public void dispDept()
{
System.out.println("Department name : "+dept);
System.out.println("Department id : "+deptId);
}
}
class Student
{
private String name;
private String id;
private Dept dept;
public Student(String name, String id, Dept dept)
{
this.name=name;
this.id=id;
this.dept=dept;
}
public void showStu()
{
System.out.println("Name of the Student : "+name);
System.out.println("Student id : "+id);
}
public void showDetails()
{
showStu();
dept.dispDept();
}
}
class aggregation
{
public static void main(String args[])
{
Dept d1=new Dept("CSE",104);
Student stu=new Student("xxx","1041",d1);
stu.showDetails();
}
}


 