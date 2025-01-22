import java.util.ArrayList;

class Array{

    public static int check(int n){ 
        int ch=0;
       while(n!=0){
        int lastDigit=n%10;
        ch=ch*10+lastDigit;
        n=n/10;  
       }   
    return ch;
    }

    public static ArrayList<Integer> palindrome(int[] arr){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
          int ch=check(arr[i]);
          if(ch==arr[i]){
            temp.add(arr[i]);
          }  
    }
    return temp;
}
public static void palindrome2(int[] arr){
   // ArrayList<Integer> temp=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      int ch=check(arr[i]);
      if(ch==arr[i]){
       System.out.println(ch);
      }  
}

}


public static void main(String[] args) {
    int[] arr={22,33,454,565,31};
    // ArrayList<Integer> re=palindrome(arr);
    // for(int e:re){
    //     System.out.println(e);
    // }
System.out.println(palindrome(arr));
  

  
    
}
}