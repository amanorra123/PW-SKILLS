class trangle{
    int a,b,c;
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public double getParameter(){
        return (a + b + c) / 2.0;
    }

}
public class Q2 {
    public static void main(String[] args) {
        trangle t=new trangle();
        t.a=3;
        t.b=4;
        t.c=5;
        System.out.println(t.getArea());
        System.out.println(t.getParameter());
    }
}
