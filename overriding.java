import java.util.*;

public  class overriding{
    public static void main(String[] args) {
        c c1=new c();
        c1.marry();



    }
}
class p {

     public void property() {
         System.out.println("cash");
     }

     public void marry() {
         System.out.println("lakshmi");
     }
 }
         class c extends p{
            public void marry() {
                System.out.println("roopa");
            }
        }


