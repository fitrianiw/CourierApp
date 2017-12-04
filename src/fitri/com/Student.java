package fitri.com;

public class Student {
    String studentName;
       
    public Student(){
           
    }
    public Student(String studentName){
        this.studentName = studentName;
    }
       
    public String toString(){
           
        if(studentName==null)
            return "No Name";
        return studentName;
    }
}
    
