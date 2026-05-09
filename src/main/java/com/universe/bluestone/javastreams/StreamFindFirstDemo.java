package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.Arrays;
import java.util.List;

public class StreamFindFirstDemo {

	public static void main(String[] args) {
		
		List<Bank> bankList1 = DataProvider.getBankList();
		System.out.println("0==========>size :"+bankList1.size());
		System.out.println("1==========>"+bankList1.stream().findFirst());
		System.out.println("2==========>"+bankList1.get(0));
		System.out.println("3==========>"+bankList1.stream().findAny());
		System.out.println("4==========>"+bankList1.get((bankList1.size()-1)));

		System.out.println("-------------------------------------------");
		String[] strArray = {"I", "Love", "Stack", "Overflow"};

		String result = Arrays.stream(strArray)
				.filter(s -> s.length() > 4)
				.findFirst()
				.orElse("No match found");

		System.out.println(result);
		
	}

}
