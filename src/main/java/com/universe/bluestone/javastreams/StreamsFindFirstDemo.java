package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.List;

public class StreamsFindFirstDemo {

	public static void main(String[] args) {
		
		List<Bank> bankList1 = DataProvider.getBankList();
		System.out.println("0==========>size :"+bankList1.size());
		System.out.println("1==========>"+bankList1.stream().findFirst());
		System.out.println("2==========>"+bankList1.get(0));
		System.out.println("3==========>"+bankList1.stream().findAny());
		System.out.println("4==========>"+bankList1.get((bankList1.size()-1)));
		
		
		
	}

}
