class palindrome{

    static void isPalindrome(){
        int num = 121, res = 0;
        int temp = num;
        while(num > 0){
            res = res * 10 + num % 10;
            num /= 10;
        }

        if(temp == res){
            System.out.println("Palindrome");
        }else{
            System.out.println("No Palindrome");
        }
    }
    public static void main(String args[]){
        isPalindrome();
    }
}