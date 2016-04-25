package voicefb;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;
import com.restfb.types.User;


public class FbManager {

//	public static String MY_APP_SECRET = "12c53854b95773d42178a34c6e552abd";
	public static String MY_APP_SECRET = "2b00c0c62d575444a13997fdebef4b1f";
//	public static String MY_APP_ID = "1704389486468640";
	public static String MY_APP_ID = "999931050055870";
	
	//public static LoggedInFacebookClient l = new LoggedInFacebookClient(MY_APP_ID, MY_APP_SECRET, Version.LATEST);
	//static DefaultFacebookClient d = new DefaultFacebookClient(Version.LATEST);
	//public static AccessToken accessToken = d.obtainAppAccessToken(MY_APP_ID, MY_APP_SECRET);
//	public static String MY_ACCESS_TOKEN = "EAACEdEose0cBAOcey51p0fAZBiZBZCIZBoZAVwjJfdOAGXvOFaAJESOuHi7Xyf4KWlttBQ5YmGcSHXh9jfZC0GmwOQ0AwO68ygQ9cZAZCwdTnpsdrPYCSTeh2AZAweEUZAAOePvtHha4tevb56AI8LN99Ul3xjS8ZCgssvCfeeuGzbQMwZDZD";
	public static String MY_ACCESS_TOKEN = "EAACEdEose0cBADvZByyXqXZAuT20VvOkvLZCmaYUj4tVZBQK5IhjS7E01TMAGMcyA6pWKJZCumG03LldZAtPlTkICI19v4By8nAtb1Q9xKjgucJ0VSVPG62x1IKjBIecyKoakCj7BZBXHpIBNYNETKnC8ybl4ZChat6ZBOxgtq7ZCv7eO7D95Nbjql";
	public static FacebookClient facebookClient = new DefaultFacebookClient(MY_ACCESS_TOKEN, Version.LATEST);
	
//	public static void main(String[] args) {
//		//System.out.println(MY_ACCESS_TOKEN);
//		//System.out.println(accessToken.getTokenType());
//		//System.out.println(facebookClient.)
//		//System.out.println(x);
//		User user = facebookClient.fetchObject("me", User.class);
//	System.out.println("User name: " + user.getName());
//	
//	}
	
	
	
}

