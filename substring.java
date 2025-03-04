class substring
{
    public static void main(String arg[])
    {
        String s1="Thanya";
        String s=s1.substring(3);
        System.out.println("The Substring of the String is = "+s);
        StringBuffer sb = new StringBuffer("Hello");
        String s2=sb.substring(3);
        System.out.println("The Substring of the String Buffer is = "+s2);
        StringBuilder str=new StringBuilder("this is JAVA");
        String s3=str.substring(6);
        System.out.println("The is a substring of Sring Builder is = "+s3);
    }
}