import java.util.*;
class Start
{
    static User u[]=new User[100];
    static int l=0;
    static int ctr=0;
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        char a;int i;//declaring variables
        System.out.print("\f");
        System.out.println("\t\t\t\t      ,gg,                                                  ,ggggggggggg,          ");
System.out.println("\t\t\t\t     i8\"\"8i                                          ,dPYb,dP\"\"\"88\"\"\"\"\"\"Y8,        ");
System.out.println("\t\t\t\t     `8,,8'                                          IP'`YbYb,  88      `8b        ");
System.out.println("\t\t\t\t      `88'                          gg               I8  8I `\"  88      ,8P        ");
System.out.println("\t\t\t\t      dP\"8,                         \"\"               I8  8'     88aaaad8P\"         ");
System.out.println("\t\t\t\t     dP' `8a    ,ggggg,    ,gggg,   gg     ,gggg,gg  I8 dP      88\"\"\"\"Y8ba  ,ggg,  ");
System.out.println("\t\t\t\t    dP'   `Yb  dP\"  \"Y8gggdP\"  \"Yb  88    dP\"  \"Y8I  I8dP       88      `8bi8\" \"8i ");
System.out.println("\t\t\t\t_ ,dP'     I8 i8'    ,8I i8'        88   i8'    ,8I  I8P        88      ,8PI8, ,8I ");
System.out.println("\t\t\t\t\"888,,____,dP,d8,   ,d8',d8,_    __,88,_,d8,   ,d8b,,d8b,_      88_____,d8'`YbadP' ");
System.out.println("\t\t\t\ta8P\"Y88888P\" P\"Y8888P\"  P\"\"Y8888PP8P\"\"Y8P\"Y8888P\"`Y88P'\"Y88    88888888P\" 888P\"Y888");
                                                                                                 
        System.out.println("\n\n");
        System.out.println("\t*************************************************************************************************************************************");
        System.out.print("\t\t\t\t(S)ign Up");
        System.out.print("\t\t\t\t(L)ogin");
        System.out.println("\t\t\t\t(E)xit");
        System.out.println("\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        a=ob.next().charAt(0);
        a=Character.toLowerCase(a);//converting to lowercase
        if(Character.isDigit(a))
        {
            System.out.println("\nPLEASE ENTER THE FIRST CHARACTER OF THE DESIRED OPTION");
            for(i=0;i<=2000000000;i++);
            main();
        }
        switch(a)
        {
            case 's'://case for new User
            u[l]=new User();//instantiation of new iinstance of user
            l=u[l].newUser();//setting value to variable l
            System.out.print("\f");
            main();//calling main function
            break;
            
            case 'l'://case for login
            System.out.print("\f");
            System.out.println("LOGIN MODULE INITIATED...");
            Login.login(u);//calling login function
            break;
           
            case 'e'://case for exit
            break;
            
            default:
            if(ctr<3)
            {
                System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
                ctr++;
                for(i=0;i<=2000000000;i++);//delay loop
                main();
            }
            else
                System.out.println("TOO MANY INVALID CHOICES.. PROGRAM ENDS.");//program ends
        }
    }
}