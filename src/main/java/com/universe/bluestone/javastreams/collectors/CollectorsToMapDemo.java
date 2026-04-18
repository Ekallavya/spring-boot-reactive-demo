package com.universe.bluestone.javastreams.collectors;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToMapDemo {
	public static void main(String[] args) {
		
	List<Bank> bankList1 = DataProvider.getBankList();

	System.out.println("==========>"+bankList1.stream().filter(bank->bank.getOriginBank().equalsIgnoreCase("ICICI")).collect(Collectors.toList()));
	
	Set<Bank> bankSet = bankList1.stream().collect(Collectors.toSet());
	System.out.println("==========>"+bankSet);
	System.out.println("==========>set size :"+bankSet.size());
	
	Map<Integer, Bank> bankMap  = bankSet.stream().collect(Collectors.toMap(bank->Integer.valueOf(bank.hashCode()),bank->bank));
	bankMap.forEach((key,value)->System.out.println("==========>"+key +"="+value));
	Set<Map.Entry<Integer, Bank>> mapEntrySet =  bankMap.entrySet();
	
	
	List<Map.Entry<Integer, Bank>> sortedMapEntryList = mapEntrySet.stream().sorted((b1,b2)-> b1.getValue().getNetWorth().compareTo(b2.getValue().getNetWorth())).collect(Collectors.toList());
	
	LinkedHashMap<Long, Bank> linkedHashMap = new LinkedHashMap<>();
	
	sortedMapEntryList.forEach(e->linkedHashMap.put(/*e.getKey()*/e.getValue().getId(),e.getValue()));
	linkedHashMap.forEach((key,value)->System.out.println("==========>"+key +"="+value));
	
	Comparator<Map.Entry<Integer, Bank>> networthComparator = Comparator.comparing( entry->entry.getValue().getNetWorth());
	
	List<Map.Entry<Integer, Bank>> sortedMapEntryList1 = mapEntrySet.stream().sorted(networthComparator).collect(Collectors.toList());
	
	

	}
}
