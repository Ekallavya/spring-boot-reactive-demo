package com.universe.bluestone.javastreams.collectors;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSumming {

	public static void main(String[] args) {
		List<Bank> allBankList = DataProvider.getBankList();
		
		Double  totalNetworth = allBankList.stream().collect(Collectors.summingDouble(Bank::getNetWorth));
		//Double  totalNetworth = allBankList.stream().mapToDouble(Bank::getNetWorth).sum();
		System.out.println("totalNetworth:"+totalNetworth);
		
		
	}

}
