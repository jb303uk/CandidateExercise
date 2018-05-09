package shop;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShopTest {
	private static final double DELTA = 1e-15;
	
	@Test
	public void CountItems() {
		List<String> testShopData = new ArrayList<String>();
		testShopData.add("apple");
		testShopData.add("apple");
		testShopData.add("orange");
		testShopData.add("apple");
		
		Shop jbShop = new Shop();
		jbShop.setStringList(testShopData);
		assertEquals(4,jbShop.getListCount());

	}
	@Test
	public void PriceCheck() {

		List<String> testShopData = new ArrayList<String>();
		Shop jbShop = new Shop();
		testShopData.add("apple");
		testShopData.add("apple");
		testShopData.add("orange");
		testShopData.add("apple");

		jbShop.setStringList(testShopData);
		assertEquals(2.05,Prices.ListToTotal(testShopData),DELTA);

	}
	@Test
	public void DiscountCheck() {

		List<String> testShopData = new ArrayList<String>();
		Shop jbShop = new Shop();
		testShopData.add("apple");
		testShopData.add("apple");
		testShopData.add("orange");
		testShopData.add("orange");
		testShopData.add("orange");
		testShopData.add("apple");
		testShopData.add("apple");
		
		jbShop.setStringList(testShopData);
		assertEquals(1.45,jbShop.getDiscount(),DELTA);

	}
	@Test
	public void NoDiscountCheck() {

		List<String> testShopData = new ArrayList<String>();
		Shop jbShop = new Shop();
		testShopData.add("apple");
		testShopData.add("orange");

		jbShop.setStringList(testShopData);
		assertEquals(0.0,jbShop.getDiscount(),DELTA);

	}
}
