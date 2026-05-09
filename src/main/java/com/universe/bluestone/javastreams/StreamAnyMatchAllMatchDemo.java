package com.universe.bluestone.javastreams;

//import java.util.ArrayList;
//import java.util.LinkedHashMap;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.List;
//import java.util.Map;
//import java.util.Set;
import java.util.stream.Collectors;

public class StreamAnyMatchAllMatchDemo {
	public static void main(String[] args) {
	List<Bank> bankList1 = DataProvider.getBankList();

	System.out.println("==========>"+bankList1.stream().anyMatch(bank->bank.getOriginBank().equalsIgnoreCase("ICICI")));
	System.out.println("==========>"+bankList1.stream().allMatch(bank->bank.getOriginBank().equalsIgnoreCase("ICICI")));
	System.out.println("==========>"+bankList1.stream().filter(bank->bank.getOriginBank().equalsIgnoreCase("ICICI")).collect(Collectors.toList()));
	
	}
}
