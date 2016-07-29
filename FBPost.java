import java.util.List;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.types.Post;

public class FBPost {
	public static  void  main(String args[])
	{
		int counter=0;
		String AcessToken="EAAEM35RtAt0BAFoYk3RjMGJbYFu9dwcflKyCZC3BkiPYBRsYT3lCBorHmwqclIiGfeP63r3VZCoYnJub0qIqXDNZAVEy1afuUsQib5SBffJ3kOC46SAUZC9MNrWXpg5cJvaMrJfisMHh7ijSZANZCKimtFWuNZB1dGWHhYzxvc0owZDZD";
		
		@SuppressWarnings("deprecation")
		FacebookClient fbclient=new DefaultFacebookClient(AcessToken);
		Connection<Post> conn=fbclient.fetchConnection("me/feed", Post.class);
		for(List<Post>page :conn)
		{
			for(Post apost:page)
			{
				counter++;
				System.out.println(apost.getMessage());
				System.out.println(apost.getStory());
			}
		}
		System.out.println(counter);
	}
}
