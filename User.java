import java.util.*;
class User
{
    //datamembers
    static String user[]={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
    static String pass[]={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
    static String eid[]={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
    static int ctruser=0;
    int userno;
    String username,password,email,name;
    int emailno=0,friendno=0;
    Email e[]=new Email[100];
    User friend[]=new User[100];
    
    
    public int newUser()
    {
        Scanner ob=new Scanner(System.in);
        int a=1;char c;int i;boolean p=true;//declaring variables
        System.out.print("\nEnter Firstname:");
        name=ob.next();//accepting first name
        name.trim();//removing balnk spaces
        System.out.print("\nEnter Lastname:\t");
        String n1=ob.next();//accepting last name
        n1.trim();//removing blank spaces
        name=name+" "+n1;//saving name
        do
        {
            if(a==0)//checking if username is taken
            System.out.println("USERNAME TAKEN");
            System.out.print("\nEnter Username:\t");
            username=ob.next();//accpeting username
            a=newUseru(username);//checking if username is taken
        }while(a==0);//loop ends
        a=1;//resetting value
        do
        {
            if(a==0)
            {
            System.out.print("EMAIL TAKEN");//printing
        }
            System.out.print("\nEnter Email:\t");
            email=ob.next();//accepting email
            email.trim();//removing blank spaces
                for(i=0;i<email.length();i++)
                {
                    c=email.charAt(i);//extraacting characters
                        if(c=='@')//checking if @ is present
                        {
                            for(int j=i;j<email.length();j++)
                            {
                                char c1=email.charAt(j);
                                if(c1=='.')//checing if . is fresent after @
                                {
                                    p=false;break;
                                }
                            }
                        }
                    }
            if(p)//checking id valid email
            {
                System.out.println("Invalid email entered");//printing valid
                a=2;continue;
            }
            a=newUsere(email);//checking if email is taken
        }while(a==0 || a==2);//loop ends
        System.out.print("\nEnter Password:\t");
        password=ob.next();//accepting password
        password.trim();//removing blankspaces
        newUserp(password);//user created
        userno=ctruser;//assinging user number
        ctruser++;//counting number of users created
        return ctruser;//returning value
        }//method ends
        
        
    public int newUseru(String username)
    {
        for(int i=0;i<=ctruser;i++)
        {
            if(username.equals(user[i]))//checking if username is taken
            {
            return 0;        
        }
        }
        user[ctruser]=username;//adding username to array
        return 1;//returning value
    }
    public int newUsere(String email)
    {
        for(int i=0;i<=ctruser;i++)
        {
            if(eid[i].equals(email))//checking if email is taken
            {
            return 0;//returning value
        }
        }
        eid[ctruser]=email;//adding to array

        return 1;//returning value
    }
    public void newUserp(String password)
    {
        pass[ctruser]=password;//adding to array
        
    }
    
    public void showUser()
    {
        System.out.print("\f");
        System.out.println("\t*************************************************************************************************************************************");
        System.out.println("\n\t\t\t\t\t\t\t\tName:\t\t"+name);//printing name
        System.out.println("\n\t\t\t\t\t\t\t\tUsername:\t"+username);//printing username
        System.out.println("\n\t\t\t\t\t\t\t\tEmail:\t\t"+email);//printing email
        System.out.println("\n\t*************************************************************************************************************************************");
    }
    
    public void userDetails()
    {
        System.out.println("\n\t\t\t\t\t\t\t\tName:\t\t"+name);//printing name
        System.out.println("\n\t\t\t\t\t\t\t\tUsername:\t"+username);//printing username
        System.out.println("\n\t\t\t\t\t\t\t\tEmail:\t\t"+email);//printing email
        System.out.println("\n\t\t\t\t\t\t\t\tPassword:\t"+password);//printing password
    }
    
    public void setUser()
    {
        Scanner ob=new Scanner(System.in);
        int a=1;boolean p=true;
        System.out.println("\n\t\t\t\t\t\t\t\t\tCHOOSE WHAT TO EDIT:");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(N)ame");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(U)sername");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(E)mail");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(P)assword");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(B)ack");
        System.out.print("\n\t\t\t\t\t\t\t\t\t");
        char b=ob.next().charAt(0);//accepting choice
        b=Character.toLowerCase(b);//converting to lowercase
        switch(b)
        {
            case 'n':
            user[userno]="";
            name="";
            System.out.print("\n\t\t\t\t\t\t\t\tEnter Firstname:");
            name=ob.next();//accepting firstname
            name.trim();
            System.out.print("\n\t\t\t\t\t\t\t\tEnter Lastname:");
            String n1=ob.next();//accepting lastname
            n1.trim();
            name=name+" "+n1;//updating value
            break;
            
            case 'u':
            user[userno]="";//resetting value
            username="";//resetting value
            a=1;
            do
            {
                if(a==0)
                System.out.println("\n\t\t\t\t\t\t\t\tUSERNAME TAKEN");
                System.out.print("\n\t\t\t\t\t\t\t\tEnter Username:");
                username=ob.next();//accepting username
                a=newUseru(username);//checking if username is taken
            }while(a==0);
            break;
            
            case 'e':
            eid[userno]="";
            email="";
            a=1;
            do
            {
                if(a==0)
                System.out.println("\n\t\t\t\t\t\t\t\tEMAIL TAKEN");
                System.out.print("\n\t\t\t\t\t\t\t\tEnter email:");
                email=ob.next();//accepting email
                email.trim();//removing blank spaces
                for(int i=0;i<email.length();i++)
                {
                    char c=email.charAt(i);
                        if(c=='@')//checking if @ is present
                        {
                            for(int j=i;j<email.length();j++)
                            {
                                char c1=email.charAt(j);
                                if(c1=='.')//checing if . is fresent after @
                                {
                                    p=false;break;
                                }
                            }
                        }
                    }
                    if(p)//checking id valid email
                    {
                        System.out.println("\n\t\t\t\t\t\t\t\tInvalid email entered");//printing valid
                        a=2;continue;
                    }
                    a=newUsere(email);//checking if email is taken
                }while(a==0 || a==2);
            break;
            
            case 'p':
            pass[userno]="";//resetting value
            password="";//resetting value
            System.out.print("\n\t\t\t\t\t\t\t\tEnter password:");
            password=ob.next();//accepting password
            password.trim();//removing blank spaces
            newUserp(password);//adding new password
            break;
            
            case 'b':
            return;
        }//switch emds
    }//method ends
    
    
    
    public void addEmail(Email e)
    {
        this.e[emailno]=new Email();//instanciating new email
        this.e[emailno]=e;//saving email
        emailno++;//updating value
    }
    
    public void addFriend(User u)
    {
        friend[friendno]=new User();//instantiating new friend
        friend[friendno]=u;//saving friend
        System.out.println("\n\t\t\t\t\t\t\t\t\tFriend Added!");
        friendno++;//updating value
    }
    
    public boolean isFriend(String username)
    {
        int i;
        for(i=0;i<(friendno);i++)
        {
            if(friend[i].username.equals(username))//checking if friend
            return true;//returning value
        }
        return false;//returning value
    }
}