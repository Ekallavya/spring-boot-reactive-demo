package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapDemo {

	public static void main(String[] args) {
		
		List<Bank> bankList1 = DataProvider.getBankList();
		System.out.println("==========>"+bankList1.stream().map(bank-> bank.getLocation()).collect(Collectors.toList()));
		System.out.println("==========>"+bankList1.stream().map(bank-> {bank.setNetWorth(0d);return bank;}).collect(Collectors.toList()));
		
		List<List<String>> list = new ArrayList<>();
		
		list.add(bankList1.stream().map(bank-> bank.getLocation()).collect(Collectors.toList()));
		list.add(bankList1.stream().map(bank-> bank.getOriginBank()).collect(Collectors.toList()));
		list.add(bankList1.stream().map(bank-> bank.getName()).collect(Collectors.toList()));
		list.add(bankList1.stream().map(bank-> bank.getCountry()).collect(Collectors.toList()));
		
		System.out.println("==========>"+list.stream().flatMap(s-> s.stream()).collect(Collectors.toList()));
		
		
		System.out.println("==========>"+list.stream().flatMap(s-> s.stream()));
		
		
		
		
		
	}

}
