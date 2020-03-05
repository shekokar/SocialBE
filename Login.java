import java.util.*;
class Login
{   
    public static void login(User u[])
    {
        String username,password;//declaring variables
        User a=new User();boolean p=true;int i;//decalring variables
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter username:\t");
        username=ob.next();//accepting username
        System.out.print("Enter password:\t");
        password=ob.next();//accepting password
        for(i=0;i<=a.ctruser;i++)
        {
            if(a.user[i].equals(username) && a.pass[i].equals(password))
            {
                System.out.println("Successful Login");
                p=false;
                MAIN.main(u,i);//calling funtion main
                break;
            }
            else if(a.user[i].equals(username) && a.pass[i].equals(password)==false)
            {
                System.out.println("Incorrect Password");
                p=false;
                Start.main();//calling function main()
                break;
            }
        }
        if(p)
        {
            System.out.println("Invalid User..");
            System.out.println("Redirecting to Home...");
            for(i=0;i<=2000000000;i++);//delay loop
            Start.main();//calling function main()
        }//if ends
    }//method ends
}