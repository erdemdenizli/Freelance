import java.util.Scanner;

public class CountJavaAndPython {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    
	    int countJava = 0;
	    int countPyt = 0;
	    String java = sentence;
	    String pyt = sentence;
	    
	    while(java.contains("java") && java.length()>=4) {
	      //if(java.length()>4)
	      java = java.substring(java.indexOf("java")+4, java.length());
	      //else java = "";
	      countJava++;
	    }
	    while(pyt.contains("python")) {
	      if(pyt.length()>4)
	      pyt = pyt.substring(pyt.indexOf("python")+4, pyt.length());
	      else pyt = "";
	      countPyt++;
	    }
	    System.out.print(countPyt==countJava);
	}

}
