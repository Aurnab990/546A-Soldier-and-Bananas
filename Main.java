import java.util.Scanner;

public class ProjectDetails {
   
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum =0;
        for(int i=1; i<=w; i++) {
        	sum+=k*i;
        	
        }
        int result = sum-n;
        if(result>0) {
        	System.out.println(result);
        }
        else {
        	System.out.println("0");
        }
        
    }
}
