import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(int num){
        int original = num;
        int rev=0;
        while(num!=0){
            int rem = num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        if(original==rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check palindrome");
        int num = sc.nextInt();
        boolean res = isPalindrome(num);
        if(res==true){
            System.out.println("the given number is palindrome");
        }else{
            System.out.println("the given number is not palindrome");
        }
    }
}
