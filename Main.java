import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class Main {
public static  void  main(String args[])
{
	String AcessToken="EAACEdEose0cBAAHx7doNO1QlFkAeZBe8rRjZAFCzFbhMgz5Hds7Ll0facriQytx0xwJjNcTlfSm4cDiZBXJ2SoRKTJwZAGwNAz91MdOVmklZBAKkprWlUTaGGB6p5smSvwFvy5YQegBqM2LrJIBzcgtcOODLfkbjAhV9xXBLk2AZDZD";
	
	@SuppressWarnings("deprecation")
	FacebookClient fbclient=new DefaultFacebookClient(AcessToken);
	User me=fbclient.fetchObject("me", User.class );
	System.out.println(me.getBirthday());
	System.out.println(me.getHometownName());
}
}
