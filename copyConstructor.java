public class copyConstructor {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Shubham";
        s1.roll=45;
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        s1.setpass("abcd");
        Student s2=new Student(s1);
        s2.setpass("cdef");
        s2.marks[2]=100;
     System.out.println("Student name is "+ s1.name +" and his Roll Number is  "+ s1.roll +" and updated password is " + s2.getpass());
     for(int i=0;i<3;i++){
    System.out.println(s2.marks[i]);
  }
    }
    
}
class Student{
    public String name;
    public int roll;
    public int marks [];
    private String pass;
    Student(){
       marks =new int[3]; 
    }

    Student (Student s1){
    this.name=s1.name;
    this.roll=s1.roll;
    this.pass=s1.pass;
    this.marks=s1.marks;
    }
    public void setpass(String pass){
        this.pass=pass;
    }
    public String getpass(){
    return pass;
 }
}
