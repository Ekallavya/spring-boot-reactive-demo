package com.universe.bluestone.javastreams.collectors;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;
import com.universe.bluestone.dto.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CollectorsGroupingByReducing {

	public static void main(String[] args) {
		List<Bank> allBankList = DataProvider.getBankList();
		
		Comparator<Bank> netWorthComparator = Comparator.comparing(Bank::getNetWorth); 
		
        Map<String, Optional<Bank>> maxByNetworthByBank = allBankList.stream().collect(Collectors.groupingBy(Bank::getName, 
                Collectors.reducing(BinaryOperator.maxBy(netWorthComparator))));
        
        
        maxByNetworthByBank.forEach((k,v)->System.out.println("Bank :"+k+" ,Networth==> "+
                ((Optional<Bank>)v).get().getNetWorth()));

		List<Person> people = List.of(new Person("John", 25), new Person("Jane", 24));

		Optional<Person> oldestPersonOptional = people.stream()
				.collect(Collectors.reducing(
						BinaryOperator.maxBy(Comparator.comparing(Person::getAge))
				));

		oldestPersonOptional.ifPresent(System.out::println);

	}

}
