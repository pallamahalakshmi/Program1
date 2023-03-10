    import java.util.Scanner;
    public class Addtwonumbers
    {
        public static void main(String args[])
        {
            int x, y, sum;
            Scanner sc = new Scanner(System.in);
            System.out.print("enter 1st no: ");
            x = sc.nextInt();
            System.out.print("enter 2nd no: ");
            y = sc.nextInt();
            sum = sum(x, y);
            System.out.println("The sum of two no's x and y is: " + sum);
        }
        //method that calculates the sum
        public static int sum(int a, int b)
        {
            int sum = a + b;
            return sum;
        }
    }

