package com.universe.bluestone.javastreams.collectors;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMappingDemo {
	public static void main(String args[]) {
		List<Bank> bankList1 = DataProvider.getBankList();
		List<String> bankNames = bankList1
		        .stream()
		        .collect(Collectors.mapping(Bank::getName, Collectors.toList()));
		    System.out.println("List of Bank names:" + bankNames);
		
	}
}
