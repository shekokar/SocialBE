import java.util.*;
class MAIN
{
    static int ctr=0;
    public static void main(User u[],int userno)
    {
        Scanner ob=new Scanner(System.in);
        int i;
        System.out.print("\f");
        System.out.println("\t*************************************************************************************************************************************");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(E)mail");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(S)ocial");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(F)riends");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(M)y Account");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(L)ogout");
        System.out.print("\n\t\t\t\t\t\t\t\t\t");
        char a=ob.next().charAt(0);//accepting value 
        a=Character.toLowerCase(a);//converting to lowercase
        switch(a)
        {
            case 'e':
            email_main.menu(u,userno);//calling function email_main.menu()
            break;
            
            case 's':
            social_menu.main(u,userno);//calling function social_main.menu()
            break;
            
            case 'f':
            friend_menu.menu(u,userno);//calling function friend_main.menu()
            break;
            
            case 'm':
            Account.viewAccount(u,userno);//calling function Account.viewAccount()
            break;
            
            case 'l':
            Start.main();//calling function Start.main()
            break;
            
            default:
            if(ctr<3)
            {
                System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
                ctr++;//updating value
                for(i=0;i<=2000000000;i++);//delay loop
                main(u,userno);//calling function main()
            }
            else
                System.out.println("TOO MANY INVALID CHOICES.. PROGRAM ENDS.");
            }//switch ends
        }//function ends

    }