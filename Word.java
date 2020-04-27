import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("To be or not to be"); 
		String str=sc.nextLine();
	    String[] array = str.split(" ");
		 for(String s:array){
			 StringBuilder builder = new StringBuilder();
             System.out.print(builder.append(s).reverse()+ " ");
		}

    }

}