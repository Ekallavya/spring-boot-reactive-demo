package com.universe.bluestone.reactive.flux;

import com.universe.bluestone.dto.Bank;
import com.universe.bluestone.dto.DataProvider;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import reactor.core.publisher.Flux;

import java.util.*;

// A helper class to hold the group key and its items
@Data // Lombok annotation for getters/setters (or create manually)
@AllArgsConstructor // Lombok annotation for constructor (or create manually)
@ToString // Lombok annotation for toString (or create manually)
class RemainderCollector {
    private int remainder;
    private List<Integer> items;
}

public class FluxGroupByExample {
    public static void main(String[] args) {
        Flux.range(1, 30) // 1. Source Flux of numbers from 1 to 30
            .groupBy(i -> i % 3) // 2. Group by the remainder of division by 3
            .flatMap(gf -> gf.collectList() // 3. For each GroupedFlux (gf), collect all items into a List
                           .map(l -> new RemainderCollector(gf.key(), l))) // 4. Map the list to a RemainderCollector, using the group's key
            .subscribe(System.out::println); // 5. Subscribe to print the final results


        List<Bank> bankList=DataProvider.getBankList();
        Map<String ,List<Bank>>  hashMap= new HashMap<>();

        Flux.fromIterable(bankList)
                .groupBy(Bank::getOriginBank) // Group by origin bank
                .flatMap(groupedFlux -> groupedFlux.collectList() // Collect each group into a List
                        .map(list -> {
                            return hashMap.put(groupedFlux.key() ,list);
                        })) // Map to a CityBankCollector
                .subscribe(System.out::println); // Print the results
       }
}
//output:
//RemainderCollector(remainder=0, items=[3, 6, 9, 12, 15, 18, 21, 24, 27, 30])
//RemainderCollector(remainder=1, items=[1, 4, 7, 10, 13, 16, 19, 22, 25, 28])
//RemainderCollector(remainder=2, items=[2, 5, 8, 11, 14, 17, 20, 23, 26, 29])