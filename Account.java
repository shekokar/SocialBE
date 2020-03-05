import java.util.*;
class Account
{
    static int ctr=0;
    public static void viewAccount(User u[],int userno)
    {
        Scanner ob=new Scanner(System.in);
        int i;
        System.out.print("\f");
        System.out.println("\t*************************************************************************************************************************************");
        u[userno].userDetails();//printing user details
        System.out.println("\t*************************************************************************************************************************************");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(E)dit Details");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(B)ack");
        System.out.print("\n\t\t\t\t\t\t\t\t\t");
        char a=ob.next().charAt(0);//accepting value
        a=Character.toLowerCase(a);//converting to lowercase
        switch(a)
        {
            case 'e':
            System.out.print("\f");
            System.out.println("\t*************************************************************************************************************************************");
            u[userno].userDetails();//printing user details
            System.out.println("\t*************************************************************************************************************************************");
            u[userno].setUser();//alling function setUser
            viewAccount(u,userno);//calling function viewAccount
            break;
            
            case 'b':
            MAIN.main(u,userno);//calling function MAIN.main
            break;
            
            default:
            if(ctr<3)
            {
                System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
                ctr++;
                for(i=0;i<=2000000000;i++);//delay loop
                viewAccount(u,userno);
            }
            else
                System.out.println("TOO MANY INVALID CHOICES.. PROGRAM ENDS.");//program ends
        }//switch ends
      }//mwthod ends
    }
