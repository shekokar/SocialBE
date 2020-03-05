import java.util.*;
class Inbox
{
    public static void inbox(User u[],int userno)
    {
        Scanner ob=new Scanner(System.in);
        char a;int in=0,j;//declaring variables
        System.out.print("\f");
        System.out.println("\t*************************************************************************************************************************************");
        System.out.println("\n\t\t\t\t\t\t\t\t\tINBOX");
        System.out.println("\n\t\t\t\t\t\t\t\tENTER EMAIL NUMBER TO VIEW EMAIL\n\n");
        if(u[userno].emailno<1)//checking if emails are recieved
        {
         System.out.println("\n\t\t\t\t\t\t\t\tNo Emails Recieved");
        }
        else
        {
            System.out.println("\n\t\t\t\tEMAIL NO \t\t SENDER \t\t\t\t SUBJECT");
            for(j=0;j<u[userno].emailno;j++)
            {
                System.out.println("\n\t\t\t\t"+(j+1)+".\t\t\t"+u[userno].e[j].sender+"\t\t\t"+u[userno].e[j].subject);//printing email number,sender and subject
            }
            System.out.print("\n\t\t\t\t\t\t\t\t\t");        
            a=ob.next().charAt(0);//accepting value
            if(Character.isDigit(a))
            {
                in=Integer.parseInt(""+a);//converting to integer
            }
            in--;
            if(in<j && in>=0)//checking if valid email number is entered
            {
                System.out.print("\f");
                System.out.println("\n\t*************************************************************************************************************************************");
                System.out.println("\tFrom: "+u[userno].e[in].sender);//printing sender
                System.out.println("\tSubject: "+u[userno].e[in].subject+"\n");//printing subject
                System.out.println("\t"+u[userno].e[in].body);//printing email
            }                     
            else
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\tInvalid entry");
            }            
        }
        System.out.println("\t*************************************************************************************************************************************");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(B)ack");
        System.out.print("\n\t\t\t\t\t\t\t\t\t");
        a=ob.next().charAt(0);//accepting value
        a=Character.toLowerCase(a);//converting to lowercase
        if(a=='b')//checking if value equals to 'b'
        email_main.menu(u,userno);//calling function email_main.menu
    }//method ends
}
