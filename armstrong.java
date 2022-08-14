import java.util.Scanner;

public class armstrong {

    static boolean isArmstrong(int num){
        int res = 0, sum = 0, temp = num;
        while(num > 0){
            res =  num % 10;
            sum += res * res * res;
            num /= 10;
        }

        return (temp == sum);
        
    }

    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println(isArmstrong(num));

        sc.close();
    }
}
