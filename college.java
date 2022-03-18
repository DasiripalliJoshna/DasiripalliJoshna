public interface college {
    void setAcademicfee();
}
class CSE_dept implements college{
    public void setAcademicfee()
    {
        System.out.println("hello");
    }
}
class Mech_Dept implements college{
    public void setAcademicsfee()
    {
        System.out.println("good morning");
    }
}
class officeadministrator{
    public static void main(String[] args) {
        college obcse=new CSE_dept();
        college mechcse=new Mech_Dept();
    }
}
