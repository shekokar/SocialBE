import java.util.*;
class friend_menu
{
    static int ctr=0;
    public static void menu(User u[],int userno)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("\t*************************************************************************************************************************************");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(V)iew Friends");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(A)dd Friends");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(B)ack");
        System.out.print("\n\t\t\t\t\t\t\t\t\t");
        int i;char a;//declaring variables
        a=ob.next().charAt(0);//accepting value
        a=Character.toLowerCase(a);//converting to lowercase
        switch(a)
        {
            case 'v':
            friend.viewFriend(u,userno);//calling function friend.viewFriend
            break;
            
            case 'a':
            friend.newFriend(u,userno);//calling function friend.newFriend
            break;
            
            case 'b':
            MAIN.main(u,userno);//calling function MAIN.main
            break;
            
            default:
            if(ctr<3)
            {
                System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
                ctr++;//updating value
                for(i=0;i<=2000000000;i++);//delay loop
                menu(u,userno);//calling function menu
            }
            else
                 System.out.println("TOO MANY INVALID CHOICES.. PROGRAM ENDS.");
        }//switch ends
    }//method ends
}