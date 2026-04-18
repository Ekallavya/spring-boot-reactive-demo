package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMinMaxDemo {

	public static void main(String[] args) {
		List<Bank> bankList1 = DataProvider.getBankList();
		List<Double> bankNetworthList = bankList1.stream().map(bank-> bank.getNetWorth()).collect(Collectors.toList());
		System.out.println("==========>"+bankNetworthList);
		System.out.println("==========>Min"+bankNetworthList.stream().min((Double::compareTo)));
		System.out.println("==========>Max"+bankNetworthList.stream().max(((d1,d2)->d1.compareTo(d2))));
		
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<10;i++)list.add(i);
		
		System.out.println("==========>Max :"+list.stream().max(((d1,d2)->d1.compareTo(d2))));
		System.out.println("==========>Max :"+list.stream().max(((d1,d2)->d1.compareTo(d2))).isPresent());
		System.out.println("==========>Max :"+list.stream().max(((d1,d2)->d1.compareTo(d2))).get());

	}

}
