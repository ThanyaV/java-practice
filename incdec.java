class Main
{ 
    public static void main (String s[])
    {
       int x=10;
       int v=--x + x++ + ++x + --x + x++;
       System.out.println("v="+v);
       int z=x++ + --x + ++x + x++ + ++x;
       System.out.println("z="+z);
       int a=--x + --x + --x + --x;
       System.out.println("a="+a);
    }
}   