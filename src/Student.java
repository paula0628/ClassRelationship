public class Student extends Person
{
    private int Sid;
    private Course c1;

    Student(int Sid, Course c1, String name)
    {
        super(name);
        this.Sid=Sid;
        this.c1=c1;
    }
    public void displayInfo()
    {
        System.out.println("Student ID : " + this.Sid + " with the name: " + this.name + " " +
                "is enrolled in the course: " + this.c1.cname);
    }
}
