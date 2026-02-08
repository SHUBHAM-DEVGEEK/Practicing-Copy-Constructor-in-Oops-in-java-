

public class AbstractClass {
    public static void main(String[] args) {
        horse h =new horse();
        System.out.println(h.eat);
        
        
        
    }
    
}
abstract class Animal{
    void walk(){
        System.out.println("walks");
    }
    Animal(){
     String color ="brown";
     System.out.println(color);
    }
}
class horse extends Animal{
    String eat="eat grass";
  
}

