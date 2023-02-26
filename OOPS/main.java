class Employee{
    String name;
    int yoj;
    String adress;


}
public class main {
    public static void main(String[] args) {
        Employee A=new Employee();
        A.name="Robert";
        A.yoj=1994;
        A.adress="64C-WallsStreet";
        System.out.println(A.name+"\t"+ A.yoj+"\t"+A.adress);
        Employee b=new Employee();
        b.name="sam";
        b.yoj=2000;
        b.adress="68D-wallsStreet";
        System.out.println(b.name+"\t"+ b.yoj+"\t"+ b.adress);
        Employee c=new Employee();
        c.name="jhon";
        c.yoj=1999;
        c.adress="26B-wallsStreet";
        System.out.println(c.name+"\t"+c.yoj+"\t"+c.adress);
    }
}
