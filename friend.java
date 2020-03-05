import java.util.*;
class friend
{
    public static void newFriend(User u[],int userno)
    {
        Scanner ob=new Scanner(System.in);
        int i;String n;char c,b;boolean flag=false,flag1=false;//declaring variables
        System.out.print("\f");
        System.out.println("\t*************************************************************************************************************************************");
        if(u[userno].ctruser>1)
        {
            System.out.println("\n\t\t\t\t\t\t\t\tENTER FULL NAME TO VIEW USER PROFLES");
            for(i=0;i<u[userno].ctruser;i++)
            {
                if(u[i].userno==userno)//skipping user's details
                continue;
                System.out.println("\n\t\t\t\t\t\t\t\t\t"+(i+1)+"."+u[i].name);//printing name of all users
            }
            System.out.print("\n\t\t\t\t\t\t\t\t\t");
            n=ob.nextLine();//accpeting name entered by user
            n=n.trim();
            do
            {
                for(i=0;i<u[userno].ctruser;i++)
                {
                    if(u[i].name.equalsIgnoreCase(n))//checking if user is valid
                    {
                        u[i].showUser();//printing details
                        flag=true;
                        break;
                    }
                }   
                if(flag==false)
                {
                    System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
                    for(i=0;i<=2000000000;i++);//delay loop
                    newFriend(u,userno);//calling function newFriend
                }
            
                if(flag)
                System.out.println("\n\t\t\t\t\t\t\t\t\t(A)dd Friend");
                System.out.println("\n\t\t\t\t\t\t\t\t\t(E)xit");
                System.out.print("\n\t\t\t\t\t\t\t\t\t");
                b=ob.next().charAt(0);//accepting value
                b=Character.toLowerCase(b);//converting to lowercase
                switch(b)
                {
                    case 'a':
                    u[userno].addFriend(u[i]);//calling function addFriend
                    System.out.println();
                    System.out.println("\n\t\t\t\t\t\t\t\t\t(E)xit");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t");
                    c=ob.next().charAt(0);//accepting value
                    c=Character.toLowerCase(c);//converting to lowercase
                    switch(c)
                    {   
                        case 'e':
                        friend_menu.menu(u,userno);//calling function menu
                        break;
                    }//switch ends
                    break;
            
                    case 'e':
                    friend_menu.menu(u,userno);//calling function menu
                    break;
            
                    default:
                    System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
                    for(i=0;i<=2000000000;i++);//delay loop
                    flag1=true;
                }//switch ends
            }while(flag1);//loop ends
        }
        else
        {
            System.out.println("\n\t\t\t\t\t\t\t\t\tNO USERS FOUND..");
            System.out.println("\n\t\t\t\t\t\t\t\t\t(E)xit");
            System.out.print("\n\t\t\t\t\t\t\t\t\t");
            b=ob.next().charAt(0);//accepting value
            b=Character.toLowerCase(b);//converting to lowercase
            switch(b)
            {
                case 'e':
                friend_menu.menu(u,userno);//calling function menu
                break;
            
                default:
                System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
                for(i=0;i<=2000000000;i++);//delay loop
                newFriend(u,userno);//calling function newFriend
            }//switch ends
        }//if-else ends
    }//method ends
    
    public static void viewFriend(User u[],int userno)
    {
        Scanner ob=new Scanner(System.in);
        int i,f;String n;char a;boolean flag=true;//decalaring variables
        f=u[userno].friendno;//assigning value
        System.out.println("\f");
        System.out.println("\t*************************************************************************************************************************************");
        if(f==0)//checking if user has friends
        System.out.println("\n\t\t\t\t\t\tYOU HAVE NO FRIENDS :(  ADD FRIENDS BY GOING TO THE ADD FRIENDS PAGE");
        else
        {
            System.out.println("\n\t\t\t\t\t\t\t\tENTER FULL NAME TO VIEW USER PROFLES");
            System.out.println("\n\t\t\t\t\t\t\tNAME \t\t\t USERNAME");
            for(i=0;i<f;i++)
            {
                System.out.println("\n\t\t\t\t\t\t"+(i+1)+".\t"+u[userno].friend[i].name+" \t\t "+u[userno].friend[i].username);//printing name and username of friends
            }//for ends
            System.out.print("\n\t\t\t\t\t\t\t\t\t");
            n=ob.nextLine();//accepting name
            n=n.trim();
            for(i=0;i<u[userno].ctruser;i++)
            {
                if(u[i].name.equalsIgnoreCase(n))//checking if valid name is entered
                {
                    u[i].showUser();//printing details
                    flag=false;
                    break;
                }
            }//for ends
            if(flag)
            {
                System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
                for(i=0;i<=2000000000;i++);//delay loop
                viewFriend(u,userno);//calling function viewFriend
            }//if ends
        }//if-else ends
        System.out.println("\n\t\t\t\t\t\t\t\t\t(E)xit");
        System.out.print("\n\t\t\t\t\t\t\t\t\t");
        a=ob.next().charAt(0);//accepting value
        a=Character.toLowerCase(a);//converting to lowercase
        if(a=='e')//checking if value entered is 'e'
        friend_menu.menu(u,userno);
        else
        {
            System.out.println("\nINVALID CHOICE ENTERED PLEASE ENTER CORRECT CHOICE..");
            for(i=0;i<=2000000000;i++);//delay loop
            viewFriend(u,userno);//calling fuction viewFriend
        }
    }//method ends
}