/**
 * 
 */
package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class StreamsDistinctDemo {

	public static void main(String[] args) {
	
		List<Bank> bankList1 = DataProvider.getBankList();
		
		System.out.println("==========> Total Records Count :"+bankList1.size());
		
		System.out.println("==========> Distinct Records :"+bankList1.stream().distinct().collect(Collectors.toList()));
		System.out.println("==========> distinct size : "+bankList1.stream().distinct().collect(Collectors.toList()).size());

	}

}
