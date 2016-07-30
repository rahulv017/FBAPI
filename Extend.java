import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.types.User;

public class Extend {
	public static  void  main(String args[])
	{
		String AcessToken="(generated from developers.facebook.com)";
		
		@SuppressWarnings("deprecation")
		FacebookClient fbclient=new DefaultFacebookClient(AcessToken);
		AccessToken extend=fbclient.obtainExtendedAccessToken("295629384123101", "ea284d739b4e5fbbbc644c1eda3ea2e1");
		System.out.println(extend.getAccessToken());
		System.out.println(extend.getExpires());
	}
}
