public class polymorphism {
    public static void main(String args[]){
 Calculator c=new Calculator();
 System.out.println(c.sum(2,5));
 System.out.println(c.sum((float)5.6,(float) 9.6));
 System.out.println(c.sum(2,4,5));
    }
    
}//method over loading
class Calculator{
    
    int sum(int a ,int b){
    return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b ,int c){
        return a+b+c;
    }

}