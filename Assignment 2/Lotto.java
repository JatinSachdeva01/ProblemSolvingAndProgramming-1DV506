package js225cy_assign2;

public class Lotto {

	public static void main(String[] args) {
      System.out.println("The Lotto numbers this week: ");
      int[] arr=new int[7];
      
	for(int i=0;i<7;i++)
	{arr[i]=(int)Math.floor(Math.random()*35)+1;//To get random number between 1 and 35

	for(int j=0;j<i;j++)
	{
		
		if(arr[j]==arr[i])//To check if two random numbers are not same
			i--;
		
	}
}
	for(int p=0;p<7;p++)
	{	System.out.print(arr[p]+" ");
	}}}