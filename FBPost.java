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
		String AcessToken="(generated from developers.facebook.com)";
		
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
