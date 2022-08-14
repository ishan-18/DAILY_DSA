import java.util.Scanner;

// Pattern 
// if n = 4
// 1
// 12
// 123
// 1234

class pattern1 {
    public static void main(String args[]) {
        int n;
        int i = 1, j = 1;
        int val = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            for(int space = 1; space <= n - i; space++){
                System.out.print(" ");    
            }
 
            for(j = 0; j < i; j++){
                val = i + j;
                System.out.print(val);
            }
            System.out.println();

            for(int r = 1; r < i; r++){
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
