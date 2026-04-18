package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSortedDemo {

	public static void main(String[] args) {
		List<Bank> bankList1 = DataProvider.getBankList();

		System.out.println("==========>"+bankList1.stream().sorted((b1,b2)-> b1.getNetWorth().compareTo(b2.getNetWorth())).collect(Collectors.toList()));
		
		List<Bank> bankList2 = bankList1.stream().sorted((b1,b2)-> b1.getOriginBank().compareTo(b2.getOriginBank())).collect(Collectors.toList());
		
		bankList2.forEach(b-> System.out.println(b));
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<101;i++) {
			list.add(i);
		}
		System.out.println("ASC sort");
		list.stream().mapToInt(i-> i.intValue()).sorted().forEach(i->System.out.print("_"+i));
		System.out.println("\n");
		list.stream().sorted((i,j)-> i.compareTo(j)).forEach(i->System.out.print("_"+i));
		
		System.out.println("\n");
		list.stream().sorted((i,j)-> j.compareTo(i)).forEach(i->System.out.print("_"+i));
	}

}
