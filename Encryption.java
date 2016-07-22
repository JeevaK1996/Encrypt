# Encrypt
import java.util.Scanner;

public class Encrypt {


	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		int b[]=new int[5];
		for(int j=0;j<b.length;j++){
			b[j]=a.nextInt();
		}
		char []res=new char[b.length];
		for(int i=0;i<b.length;i++){
			res[i]=(char) (b[i]+96);
			System.out.println(res[i]);
		}
		
	}

}
