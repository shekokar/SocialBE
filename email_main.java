import java.util.*;
class email_main
{
    static int i=0;
    static int ctr=0;
    static Email e[]=new Email[100];
    public static void menu(User u[],int userno)
    {
        Scanner ob=new Scanner(System.in);
        char a;int k,j;//declaring variables
        System.out.print("\f");
        System.out.println("\t*************************************************************************************************************************************");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(N)ew Email");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(I)nbox");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(B)ack");
        System.out.print("\n\t\t\t\t\t\t\t\t\t");
        a=ob.next().charAt(0);//accepting value
        a=Character.toLowerCase(a);//converting to lowercase
        switch(a)
        {
            case 'n':
            e[i]=new Email();//instantiating email
            e[i].newMail(u[userno]);//calling function newMail
            for(j=0;j<u[userno].ctruser;j++)
            { 
                if((u[j].email).equals(e[i].to))
                {
                    u[j].addEmail(e[i]);//calling function addEmail
                }
            }
            i++;//updating value
            menu(u,userno);
            break;
            
            case 'i':
            Inbox.inbox(u,userno);//calling function Inbox.inbox
            break;
                   
            case 'b':
            MAIN.main(u,userno);//calling function MAIN.menu
            break;
            
            default:
            if(ctr<3)
            {
                System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
                ctr++;//updating value
                for(k=0;k<=2000000000;k++);//delay loop
                menu(u,userno);//calling function menu
            }
            else
                System.out.println("TOO MANY INVALID CHOICES.. PROGRAM ENDS.");
                        
            }//switch ends
        }//method ends
}