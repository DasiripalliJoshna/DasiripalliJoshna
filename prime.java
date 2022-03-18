
    import java.util.*;
    public class prime{

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int min =sc.nextInt();
            int max = sc.nextInt();

            for(int n=min;n<=max;n++) {

                if(isPrime(n)) {
                    System.out.println(n);
                }
            }
        }

        public static boolean isPrime(int num) {
            for(int i = 2; i <= num/i; ++i) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

