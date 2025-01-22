public class hmm {
    int x=10;
   static int y=20;
   final int z=30;

   final  public void method(){
    System.out.println("this is final method");
   }

    public static void main(String[] args) {
        hmm ob=new hmm();
        System.out.println(ob.x);
        System.out.println(y);
        System.out.println(ob.z);


        
    }
    
}
