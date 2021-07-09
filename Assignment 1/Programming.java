package js225cy_assign1;
import java.util.Scanner;
public class Programming {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.print("What is the first Programming laguage? ");
String lang1=sc.nextLine();
System.out.print("And the second? ");
String lang2=sc.nextLine();
System.out.print("And the third? ");
String lang3=sc.nextLine();
String l1=lang1.toUpperCase();//To convert l1 to upper case
String l2=lang2.toUpperCase();//To convert l2 to upper case
String l3=lang3.toUpperCase();//To convert l3 to upper case

if(l1.compareTo(l2)<0&&l1.compareTo(l3)<0&&l2.compareTo(l3)<0)//To check if l1 is comes first in alphabetical order and then l2 and then l3
    System.out.println("Alphabetical Order is "+lang1+" "+lang2+" "+lang3);
if(l1.compareTo(l2)<0&&l1.compareTo(l3)<0&&l3.compareTo(l2)<0)//To check if l1 is comes first in alphabetical order and then l3 and then l2
	System.out.println("Alphabetical Order is "+lang1+" "+lang3+" "+lang2);
if(l2.compareTo(l1)<0&&l2.compareTo(l3)<0&&l1.compareTo(l3)<0)//To check if l2 is comes first in alphabetical order and then l1 and then l3
    System.out.println("Alphabetical Order is "+lang2+" "+lang1+" "+lang3);
if(l2.compareTo(l1)<0&&l2.compareTo(l3)<0&&l3.compareTo(l1)<0)//To check if l2 is comes first in alphabetical order and then l3 and then l1
	System.out.println("Alphabetical Order is "+lang2+" "+lang3+" "+lang1);
if(l3.compareTo(l1)<0&&l3.compareTo(l2)<0&&l2.compareTo(l1)<0)//To check if l3 is comes first in alphabetical order and then l2 and then l1
	System.out.println("Alphabetical Order is "+lang3+" "+lang2+" "+lang1);
if(l3.compareTo(l1)<0&&l3.compareTo(l2)<0&&l1.compareTo(l2)<0)//To check if l3 is comes first in alphabetical order and then l1 and then l2
	System.out.println("Alphabetical Order is "+lang3+" "+lang1+" "+lang2);
	sc.close();}
}
