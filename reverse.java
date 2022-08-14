import java.util.Scanner;

class reverse {

    static int isReverse(int num){
        int res = 0;
        
        while(num > 0){
            res = res * 10 + num % 10;
            num /= 10; 
        }

        return res;
    }

    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println(isReverse(num));

        sc.close();

    }
}
