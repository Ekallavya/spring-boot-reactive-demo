package com.universe.bluestone.javastreams.collectors;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAveragingDemo {

	public static void main(String[] args) {
		List<Bank> allBankList = DataProvider.getBankList();
		
		Double  avgNetworth = allBankList.stream().collect(Collectors.averagingDouble(Bank::getNetWorth));
		
		System.out.println("avgNetworth:"+avgNetworth);
		
		
	}

}
