import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class Main {
public static  void  main(String args[])
{
	String AcessToken="(generated from developers.facebook.com)";
	
	@SuppressWarnings("deprecation")
	FacebookClient fbclient=new DefaultFacebookClient(AcessToken);
	User me=fbclient.fetchObject("me", User.class );
	System.out.println(me.getBirthday());
	System.out.println(me.getHometownName());
}
}
