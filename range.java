import java.util.*;
public class range {

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            int num=sc.nextInt();
            System.out.print("List of odd numbers from 1 to "+number+": ");
            for (int i=number; i<=num; i++)
            {
                if (i%2!=0)
                {
                    System.out.print(i + " ");
                }
            }
        }
}


