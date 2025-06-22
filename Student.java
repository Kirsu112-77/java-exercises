
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
private String id;
public String name;
private int grade;
public Student(String id,String name){
    this.id = id;
    this.name=name;
}  
public void changeGrade(int gradeGivenByUser){
    this.grade = gradeGivenByUser;
}
public String getgrade(){
    int grade = this.grade;
     if (this.grade<0) {
         return"Invalid Marks";

     }
     else{
         if(grade>70){
             return"A+";
         }
         else{
             return"Filed";
         }
     }
     


}
}