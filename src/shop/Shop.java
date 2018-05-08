package shop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Shop {
	static List<String> PurchasedItems = new ArrayList<String>();
	private static double FinalTot;
	public static void main(String[] args) {
		for (String fruit : args) {
		    PurchasedItems.add(fruit);
		  }
		FinalTot = Prices.ListToTotal(PurchasedItems);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.println(PurchasedItems + " => " + formatter.format(FinalTot));
	
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
}




