import java.util.*;
class Email
{
    String body,subject,sender,to;//datamembers
    Email()//constructor
    {
        body=subject=sender=to="";//assinging default value
    }
    
    public void newMail(User u)
    {
        Scanner ob=new Scanner(System.in);
        int flag=0,i;boolean p=true;//declaring variables
        System.out.println("INITIALIZING EMAIL MODULE...");
        for(i=0;i<=2000000000;i++);//delay loop
        System.out.print("\f");
        sender=u.email;//assigning value
        do
        {
            flag=0;
            System.out.print("To:\t");
            to=ob.nextLine();//accepting email id
            for(i=0;i<to.length();i++)
            {
                char c=to.charAt(i);
                if(c=='@')//checking if @ is present
                {
                    for(int j=i;j<to.length();j++)
                    {
                        char c1=to.charAt(j);
                        if(c1=='.')//checing if . is fresent after @
                        {
                            p=false;break;
                        }
                    }
                }
            }
            if(p)//checking id valid email
            {
                System.out.print("\f");
                System.out.println("Invalid email entered");//printing valid
                flag=2;continue;
            }
        }while(flag==2);//loop ends
        System.out.print("Subject:");
        subject=ob.nextLine();//accepting subject
        System.out.println("\n");
        body=ob.nextLine();//accepting body
        System.out.println("\n\nSENDING EMAIL...");
        for(i=0;i<=2000000000;i++);//delay loop
        System.out.println("EMAIL SENT.. REDIRECTING.");
        for(i=0;i<=2000000000;i++);//delay loop
    }//method ends
}