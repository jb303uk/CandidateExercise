package shop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Shop {
	static List<String> PurchasedItems = new ArrayList<String>();
	private static double FinalTot;
	private static double DiscountTot;
	static NumberFormat formatter = NumberFormat.getCurrencyInstance();

	static int xForxItems = 0;
	static String OfferItem = null;
	public static void main(String[] args) {
		for (String fruit : args) {
		    PurchasedItems.add(fruit);
		  }
		System.out.println("Purchased => " + PurchasedItems);
		System.out.println("Before Offers => " + formatter.format(Prices.ListToTotal(PurchasedItems)));
		
        xForxItems = 2;
        OfferItem = "Apple";
		DiscountTot += Prices.Discounter(PurchasedItems,xForxItems,OfferItem);		

        xForxItems = 3;
        OfferItem = "Orange";
		DiscountTot += Prices.Discounter(PurchasedItems,xForxItems,OfferItem);		

		System.out.println("Final Discount => " + formatter.format(DiscountTot));
		System.out.println("Final Price => " + formatter.format(Prices.ListToTotal(PurchasedItems)-DiscountTot));
	}
	
	
	public void setStringList(List<String> stringList)
		{
		    Shop.PurchasedItems = stringList;
		}
	public List<String> getStringList() 
		{
		    return this.PurchasedItems;
		}
	public int getListCount() 
	{
	    return this.PurchasedItems.size();
	}
	public static double getFinalPrice() 
	{
	    return Prices.ListToTotal(PurchasedItems) - DiscountTot;	    
	}
}




