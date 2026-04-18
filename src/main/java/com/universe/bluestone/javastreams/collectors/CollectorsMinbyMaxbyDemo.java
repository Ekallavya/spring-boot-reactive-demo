package com.universe.bluestone.javastreams.collectors;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMinbyMaxbyDemo {

	public static void main(String[] args) {
		List<Bank> allBankList = DataProvider.getBankList();
		
		Bank  minBank = allBankList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Bank::getNetWorth))).get();
		
		System.out.println("min Networth :"+minBank.getNetWorth());
		Bank  maxBank = allBankList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Bank::getNetWorth))).get();
		System.out.println("max Networth :"+maxBank.getNetWorth());
	}

}
