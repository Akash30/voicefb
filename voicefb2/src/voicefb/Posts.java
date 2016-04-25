package voicefb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.restfb.BinaryAttachment;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;

public class Posts {

	
	
	public static void postPhoto(String picture, String caption) throws IOException {

	    FacebookType publishPhotoResponse = FbManager.facebookClient.publish("me/photos",FacebookType.class,
	            BinaryAttachment.with(picture, Files.readAllBytes(Paths.get(picture))),
	            Parameter.with("message", caption));  
	    System.out.println("Published photo ID: " + publishPhotoResponse.getId());
	}
	
	public static void postVideo(String video, String caption) throws IOException {
		System.out.println("Going to post video");
	FacebookType publishVideoResponse = FbManager.facebookClient.publish("me/videos",FacebookType.class,
	            BinaryAttachment.with(video, Files.readAllBytes(Paths.get(video))),
	            Parameter.with("message", caption));  
	System.out.println("Published video ID: " + publishVideoResponse.getId());
	    
	}
	
	public static void updateStatus(String message) {
		FacebookType publishMessageResponse =
				  FbManager.facebookClient.publish("me/feeds", FacebookType.class,
				    Parameter.with("message", message));

				System.out.println("Published message ID: " + publishMessageResponse.getId());
	}
	
	public static void main(String[] args) throws IOException {
//		updateStatus("Fling was great! ~ Vimell Presad");
		//postPhoto("iceland.jpg", "I'd love to visit Iceland one day");
		postVideo("WASTE  2 SECONDS OF YOUR LIFE.mp4", "hahahahahahah xD");
	}
	
}
