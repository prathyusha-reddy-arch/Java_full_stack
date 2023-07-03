package corejava.getterSetter;

public class Student {
    String fname="Prathyusha";
    String lname="Yanala";

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public float gpa =3.8f;

    public float getGpa() {
        return gpa;
    }

    public Student(String fname, String lname, float gpa) {
        this.fname=fname;
        this.lname=lname;
        this.gpa = gpa;
    }



    public void setName(String fname,String lname,float gpa)
    {
        this.fname=fname;
        this.lname=lname;
        this.gpa =gpa;

    }

    @Override
    public String toString() {
        return this.fname+" "+this.lname+" "+this.gpa;
    }
}

