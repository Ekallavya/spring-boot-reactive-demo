package com.universe.bluestone.javastreams.collectors;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingByDemo {

	public static void main(String[] args) {
		List<Bank> allBankList = DataProvider.getBankList();
		
		Map<String,List<Bank>>  bankGroups = allBankList.stream().collect(Collectors.groupingBy(Bank::getOriginBank));
		
		bankGroups.forEach((k,v)->{System.out.println(k);
		System.out.println(v);});
		
		Map<String,List<Bank>>  bankGroups1 = allBankList.stream().collect(Collectors.groupingBy(Bank::getLocation));
		
		bankGroups1.forEach((k,v)->{System.out.println(k);
		System.out.println(v);});
		
		

	}

}
