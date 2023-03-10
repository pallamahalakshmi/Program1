import java.util.Scanner;

public class subtwonumbers
{
    public static void main(String args[])
    {
        int x, y, sub;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no: ");
        x = sc.nextInt();
        System.out.print("Enter the second no: ");
        y = sc.nextInt();
        sub = sub(x, y);
        System.out.println("The sub of two numbers x and y is: " + sub);
    }
    //method that calculates the sum
    public static int sub(int a, int b)
    {
        int sub = a - b;
        return sub;
    }
}
