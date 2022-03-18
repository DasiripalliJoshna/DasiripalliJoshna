 abstract class abs {
    abstract void checkatm_balance();

}
class abstraction extends abs {
    void checkatm_balance() {
        System.out.println("hello");
    }


     static void main(String[] args) {

        abs obj = new bank();
        obj.checkatm_balance();
    }
}

