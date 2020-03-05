import java.util.*;
class social_menu
{
    static int i=0;
    static int ctr=0;
    static Message m[]=new Message[100];
    public static void main(User u[],int userno)
    {
        Scanner ob=new Scanner(System.in);
        char a,in;int j,k;boolean p,flag=true;//declaring variables
        System.out.print("\f");
        System.out.println("\t*************************************************************************************************************************************");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(N)ew Message");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(F)eed");
        System.out.println("\n\t\t\t\t\t\t\t\t\t(B)ack");
        System.out.print("\n\t\t\t\t\t\t\t\t\t");
        a=ob.next().charAt(0);//accepting value
        a=Character.toLowerCase(a);//converting to lowercase
        switch(a)
        {
            case 'n':
            m[i]=new Message();//instantiating new message
            m[i].newMessage(u[userno]);//calling function newMessage
            i++;
            main(u,userno);
            break;
            
            case 'f':
            System.out.println("\f");
            System.out.println("\t*************************************************************************************************************************************");
            if(u[userno].friendno!=0)
            { 
                for(j=0;j<i;j++)
                {
                    p=u[userno].isFriend(m[j].username);//checking if user is friend
                    if(p)
                    {
                        System.out.println("\t"+m[j].name.toUpperCase()+"\t\t@"+m[j].username);//printing name and username
                        System.out.println();
                        System.out.println("\t"+m[j].message);//printing message
                        System.out.println("\n\n");
                        flag=false;
                    }//if ends
                }//loop ends
            }
            if(flag)//checking if messages are present to be displayed
            System.out.println("\n\t\t\t\t\t\t\t\tNO MESSAGES TO BE DISPLAYED");
            System.out.println("\t*************************************************************************************************************************************");
            System.out.println("\n\t\t\t\t\t\t\t\t\t(E)xit");
            System.out.print("\n\t\t\t\t\t\t\t\t\t");
            in=ob.next().charAt(0);//accepting value
            in=Character.toLowerCase(in);
            if(in=='e');//checking if value= 'e'
            main(u,userno);
            break;
                      
            case 'b':
            MAIN.main(u,userno);
            break;
            
            default:
            if(ctr<3)
            {
                System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
                ctr++;//updating value
                for(k=0;k<=2000000000;k++);//delay loop
                main(u,userno);
            }
                else
                System.out.println("TOO MANY INVALID CHOICES.. PROGRAM ENDS.");
            }//switch ends
        }//main ends
    }