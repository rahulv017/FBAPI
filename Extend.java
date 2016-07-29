import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.types.User;

public class Extend {
	public static  void  main(String args[])
	{
		String AcessToken="EAAEM35RtAt0BAFoYk3RjMGJbYFu9dwcflKyCZC3BkiPYBRsYT3lCBorHmwqclIiGfeP63r3VZCoYnJub0qIqXDNZAVEy1afuUsQib5SBffJ3kOC46SAUZC9MNrWXpg5cJvaMrJfisMHh7ijSZANZCKimtFWuNZB1dGWHhYzxvc0owZDZD";
		
		@SuppressWarnings("deprecation")
		FacebookClient fbclient=new DefaultFacebookClient(AcessToken);
		AccessToken extend=fbclient.obtainExtendedAccessToken("295629384123101", "ea284d739b4e5fbbbc644c1eda3ea2e1");
		System.out.println(extend.getAccessToken());
		System.out.println(extend.getExpires());
	}
}
