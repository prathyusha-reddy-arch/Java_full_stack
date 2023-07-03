package corejava.oops;


class poly1 {

    public void poly()
    {
        System.out.println("in poly1");
    }
}

public class poly2 extends poly1{
    public void poly()
    {
        System.out.println("in poly2");
    }
    public void poly2(){
        System.out.println("in poly2 and in method which is not over ridden");
    }
}
