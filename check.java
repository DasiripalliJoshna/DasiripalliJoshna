public class check {
    public static void main(String[] args) {
        try {


            String  x = null;{
                System.out.println(x.length());

            }


        }

        catch(Exception e)
        {
            System.out.println("null value");
        }
        finally{
            System.out.println("harman");
        }
    }

}
