import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        DoorFirstRiddle ob= new DoorFirstRiddle();
        ob.guessNumber(num);
        
        
        
    }

}
