package js225cy_assign1;

public class RandomSum {

	public static void main(String[] args) {
		
		double a=Math.floor(Math.random()*100)+1;//To store a random number between the range 1 to 100
		int a1=(int)a;//To convert the number to integer form
		double b=Math.floor(Math.random()*100)+1;//To store a random number between the range 1 to 100
		int b1=(int)b;//To convert the number to integer form
		double c=Math.floor(Math.random()*100)+1;//To store a random number between the range 1 to 100
        int c1=(int)c;//To convert the number to integer form
        double d=Math.floor(Math.random()*100)+1;//To store a random number between the range 1 to 100
        int d1=(int)d;//To convert the number to integer form
        double e=Math.floor(Math.random()*100)+1;//To store a random number between the range 1 to 100
        int e1=(int)e;//To convert the number to integer form
        System.out.println("Five random numbers: "+a1+" "+b1+" "+c1+" "+d1+" "+e1);
	    System.out.println("There sum is "+(a1+b1+c1+d1+e1));
	}
	

}
