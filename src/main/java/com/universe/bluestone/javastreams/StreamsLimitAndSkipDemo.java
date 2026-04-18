package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsLimitAndSkipDemo {

	public static void main(String[] args) {
		List<Bank> bankList1 = DataProvider.getBankList();

		System.out.println("==========>"+bankList1.stream().limit(10).anyMatch(bank->bank.getOriginBank().equalsIgnoreCase("ICICI")));
		System.out.println("==========>"+bankList1.stream().skip(72).allMatch(bank->bank.getOriginBank().equalsIgnoreCase("ICICI")));
		System.out.println("==========>"+bankList1.stream().skip(74).allMatch(bank->bank.getOriginBank().equalsIgnoreCase("ICICI")));
		System.out.println("==========>"+bankList1.stream().filter(bank->bank.getOriginBank().equalsIgnoreCase("ICICI")).collect(Collectors.toList()));
		
		}

}
