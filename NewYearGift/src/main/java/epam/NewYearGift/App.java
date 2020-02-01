package epam.NewYearGift;

import java.util.Arrays;
import java.util.Scanner;

import epam.NewYearGift.Gift;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.print("Welcome to gifts");
        System.out.print("Enter number of gifts :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Gift gifts[] = new Gift[n];
        for(int i=0;i<gifts.length;i++)
        {
        	System.out.println("Enter number of Mango Bytes : ");
        	String name = "Gift"+i;
        	System.out.println("Enter number of Mango Bytes : ");
        	int x = i+1;
        	System.out.println("Enter number of Coffe Bytes : ");
        	int y = i+2;
        	Gift singleGift = new Gift(name,x,y);
        	gifts[i] = singleGift;
        }
        System.out.print("Gits sorted in order");
        Arrays.sort(gifts);
        for(Gift g : gifts)
        {
        	System.out.println(" Name :"+g.getName() +"weight :"+g.getTotalWeight() );
        }
    }
}
