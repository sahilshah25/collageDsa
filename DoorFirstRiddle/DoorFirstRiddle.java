public class DoorFirstRiddle{
    public int energyPoints=100;

    public void hint(int num){

    }

 

   public int guessNumber(int n){

    while(energyPoints>5){
        if(n%3==2 && n%5==4 && n%7==5){
            System.out.println("door two blocked");
        }else{
            energyPoints -=5;
        }
    }
    return 0;
       
   }



    
}