import java.util.*;
class Message
{
    String message,username,name;//datamembers
    int i;
    Message()//default constructor
    {
        //setting default values to the datamembers
        message="";
        username="";
        name="";
    }
    
    public void newMessage(User u)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("ENTER MESSAGE:");
        System.out.println();
        message=ob.nextLine();//accepting message
        username=u.username;//saving username of user
        name=u.name;//saving name of user
        System.out.println("POSTING MESSAGE...");
        for(i=0;i<=2000000000;i++);//delay loop
    }//method ends
}//class ends