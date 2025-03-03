class college
{
    public int aicteid=720722104;
    public void display()
    {
        System.out.println(aicteid);
    }
}
class dep extends college
{
    public int studentid=179;
    public void disp()
    {
        System.out.println(studentid);
    }
}
class Single_inheritance
{
    public static void main(String arg[])
    {
        dep a = new dep();
        a.display();
        a.disp();
    }
}