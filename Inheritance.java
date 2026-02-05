public class Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.color="grey";
        shark.eat();
        shark.breathe();
        shark.swims();
        
    }
}
class Animal{
 String color ;
 public void eat(){
    System.out.println("Eats");
 }
 public void breathe(){
    System.out.println("Breathes");
 }
 }
 class Fish extends Animal{
    int fins;
    public void swims(){
        System.out.println("Swims");
    }
 }
    

