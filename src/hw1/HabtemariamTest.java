package hw1;

public class HabtemariamTest{
/* String name yohannes
 int student id 0249
 String introduction software engineer*/
 {
private final String name;
private final String id;
private final String loginID;
private final int year: // year
 
public Student (String name, String id, String loginID, int year) (
 this.name = name:
 this.id = id;
 this.loginID = loginID;
 this.vear = year;
System.out.println("Student created with name:" + name);
 }
public Student(String name, String id, String loginID){

 //I just call the above constructor with year as 1, which will handle printing the Student
this(name, id, loginID, 1);
}
public String getName0) {
return name:
}
public String getid0) (
return id
}
public String getLoginID(){
return loginID;
}
public int getYear () {
return year:
}
public static void main(String] args)
Student s1 = new Student ("mahamud", "i am from kenya", "0898");
Student s2 = new Student ("yohannes", "i am from ethiopia", "0249");
}
}
