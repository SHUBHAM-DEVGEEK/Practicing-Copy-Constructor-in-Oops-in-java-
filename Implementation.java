public class Implementation {
    public static void main (String args[]){
        Queen q=new Queen();
        q.moves();

    }
    
}
interface chessPlay{
    void moves();
}
class Queen implements chessPlay{
    public void moves(){
        System.out.println("left , right , top , down , diagonal");
    } 
}
class Rook implements chessPlay{
    public void moves(){
        System.out.println("left , right , up ,dowm");
    }
}
