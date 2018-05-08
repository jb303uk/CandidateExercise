package shop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Prices {
	public static double GetPrice(String item)
	{		
		double thePrice;
		switch (item.toLowerCase()) {
        case "apple":  thePrice = 0.60;
                 break;
        case "orange": thePrice = 0.25;
                 break;        
        default: thePrice = 0.0;
                 break;
    }
		return thePrice;
	}
	
	public static int CountItem(String item, String CompareTo)
	{		
		int theCount = 0;
		if (item.toLowerCase().equalsIgnoreCase(CompareTo))
		{
			theCount = 1;
		}
		return theCount;
	}
	
	public static double ListToTotal(List<String> MyList)
	{
		double totPrice2 = 0;
		for (String parameter : MyList) {
			totPrice2 += Prices.GetPrice(parameter);
		  }
		return totPrice2;
	}
	public static int ListCountItem(List<String> MyList,String MyOffer)
	{
		int theCount = 0;
		for (String parameter : MyList) {
			theCount += Prices.CountItem(parameter, MyOffer);
		  }
		return theCount;
	}
	public static double Discounter(List<String> MyList,int OfferInt, String MyOffer)
	{
		int FinalCountOfItem = 0;
		int xForxQty = 0;
		List<String> xForxItems = new ArrayList<String>();
		double DiscountTot;
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		FinalCountOfItem = Prices.ListCountItem(MyList, MyOffer);
		xForxQty = FinalCountOfItem/OfferInt;		
		
        for (int i = 1; i <= xForxQty; i++) {
        	xForxItems.add(MyOffer);
        }
        
		DiscountTot = Prices.ListToTotal(xForxItems);
		
		System.out.println(xForxQty + " x " + MyOffer + "(s) Discount => " + formatter.format(DiscountTot));
		return DiscountTot;
	}
}
