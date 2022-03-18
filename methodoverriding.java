public class methodoverriding {

        void run(){System.out.println("Vehicle is running");}
    }

    class Bike extends methodoverriding{
        public static void main(String args[]){

            Bike obj = new Bike();

            obj.run();
        }
    }

