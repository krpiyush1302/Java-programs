public class fact
{
    public static void main(String arg[])
    {
       int num,fact=1,i;
       String s1;
       s1=arg[0];
       num=Integer.parseInt(s1);
       if(num==0)
       {
        System.out.println("Factorial=1");
       }
       else
       {
         for(i=1;i<=num;i++)
         {
            fact=fact*i;
         }
      }
        System.out.println("Factorial="+fact);
   }
}
