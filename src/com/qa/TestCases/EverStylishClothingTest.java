package com.qa.TestCases;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import com.qa.pageObjects.EverStylishClothingPage;

public class EverStylishClothingTest extends EverStylishClothingPage{
	@Test
	public void checkAscSort() throws InterruptedException {
		ascSort();
		Thread.sleep(5000);
		int size=getSize("xpath", "//span[@class='price']");
		System.out.println("size of elements is"+size);
		
		//storing the price in a array
		double[] priceList= new double[size];
		for(int i=0; i<size; i=i+2) {
			String price= getTextMethod("xpath", "//span[@class='price']",i);
			priceList[i]=Double.parseDouble(price);
			System.out.println(price);
		}
		
		//creating a new array to store sorted elements
		double[] sortedArray= new double[size];
		
		//assigning original array to the new and then sorting
		sortedArray=priceList;
		Arrays.sort(sortedArray);
		
		//comparing both the arrays
		sa.assertEquals(priceList, sortedArray);
		
		}
		
	}

