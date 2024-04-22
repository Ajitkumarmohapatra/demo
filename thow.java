class thow{
    void devide()
    {
       try
       {
        int a = 100,b=0,c;
        c=a/b;
        System.out.println(c);
       }
       catch(Exception e)
       {
        e.printStackTrace();
       }
    }
    public static void main(String []args)
    {
        thow obj = new thow();
        obj.devide();
        System.out.println("checking for Abnormal termination");

    }

}
