package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo2 {

	public static void main(String[] args) {
		List<Bank> bankList1 = DataProvider.getBankList();

		System.out.println("==========>"+bankList1.stream().filter(bank->bank.getOriginBank().equalsIgnoreCase("ICICI")).collect(Collectors.toList()));
		
	}

}
