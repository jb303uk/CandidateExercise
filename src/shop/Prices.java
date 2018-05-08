package shop;

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
	

	public static double ListToTotal(List<String> MyList)
	{
		double totPrice2 = 0;
		for (String parameter : MyList) {
			totPrice2 += Prices.GetPrice(parameter);
		  }
		return totPrice2;
	}
}
