import java.util.*;

class prime {

    static boolean isPrime(int num){

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("Prime");
        }else{
            System.out.println("Non Prime");
        }

        sc.close();
        
    }
}
