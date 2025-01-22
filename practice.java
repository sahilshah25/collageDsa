public class practice{
    public static boolean armstrong(int number){
        int n=number;
       
        int totalsum=0;
        while(n!=0){
            int digit=n%10;
            int sum=digit*digit*digit*digit;
            totalsum+=sum;
            n=n/10;
            
        }
        if(totalsum==number){
            return true;
        }
        return false;
        
    }   

    public static boolean palindrome(int n){
        int m=n;
        int local=0;
        while(m!=0){
            int digit=m%10;
            
        
            local =local*10+digit;
            m=m/10;
             
        }
        if(local==n){
            return true;
        }
       
        return false ;
        
    }
    public static void main(String[] args) {
        
        boolean re= armstrong(121);
        boolean res=palindrome(121);
        System.out.println(res);
    }
}