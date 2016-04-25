public class Main {
    public static void main (String[] args) {
        if (args.length == 1) {
            String status = args[0]; 
            Posts.updateStatus(status); 
        } else if (args.length == 3) {
            int function = Integer.parseInt(args[0]); 
            if (function == 1) {
                String status = args[1]; 
                String photo = args[2]; 
                Posts.postPhoto(photo, status); 
            } else if (function == 2) {
                String status = args[1];
                String video = args[2]; 
                Posts.postVideo(video, status); 
            } else {
		System.out.println("invalid function signifier");
                System.exit(1);
            }
        } else {
		System.out.println("invalid input");
            	System.exit(1); 
        }
    }
}
