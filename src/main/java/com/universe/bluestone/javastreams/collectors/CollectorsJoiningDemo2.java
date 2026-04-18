package com.universe.bluestone.javastreams.collectors;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsJoiningDemo2 {

	public static void main(String[] args) {
		List<Bank> bankList1 = DataProvider.getBankList();
		
		Set<String> locations = bankList1.stream().map(b-> b.getLocation()).collect(Collectors.toSet());
		
		String str = locations.stream().collect(Collectors.joining(",","{","}"));
		
		System.out.println(str);

	}

}
