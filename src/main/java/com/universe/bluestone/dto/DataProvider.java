/**
 * 
 */
package com.universe.bluestone.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class DataProvider {
	
	private static List<Bank> bankList = new ArrayList<>();
	static {
		
		bankList.add(new Bank(1L,"HDFC Home Loans","HDFC","India","Hyderabad","HDFC123",10000000d));
		bankList.add(new Bank(2L,"HDFC Home Loans","HDFC","India","Chennai","HDFC124",20000000d));
		bankList.add(new Bank(3L,"HDFC Home Loans","HDFC","India","Nellore","HDFC125",30000000d));
		bankList.add(new Bank(4L,"HDFC core","HDFC","India","Nellore","HDFC126",350002000d));
		bankList.add(new Bank(5L,"HDFC Core","HDFC","India","Tirupati","HDFC127",90000000d));
		
		
		bankList.add(new Bank(6L,"ICICI Home Loans","ICICI","India","Hyderabad","ICICI123",1300040000d));
		bankList.add(new Bank(7L,"ICICI Home Loans","ICICI","India","Chennai","ICICI124",240000000d));
		bankList.add(new Bank(8L,"ICICI Home Loans","ICICI","India","Nellore","ICICI125",30000000d));
		bankList.add(new Bank(9L,"ICICI Core","ICICI","India","Nellore","ICICI126",35000000d));
		bankList.add(new Bank(10L,"ICICI Core","ICICI","India","Tirupati","ICICI127",990000000d));
		bankList.add(new Bank(11L,"ICICI Insurance","ICICI","India","Nellore","ICICI126",35000000d));
		bankList.add(new Bank(12L,"ICICI Insurance","ICICI","India","Tirupati","ICICI127",990000000d));
		
		bankList.add(new Bank(13L,"HDFC Insurance","HDFC","India","Nellore","HDFC1326",345000000d));
		bankList.add(new Bank(14L,"HDFC Insurance","HDFC","India","Tirupati","HDFC0127",8090000000d));
		
		bankList.add(new Bank(15L,"HDFC Dmat","HDFC","India","Vizag","HDFC12076",3245000000d));
		bankList.add(new Bank(16L,"HDFC Dmat","HDFC","India","Kurnool","HDFC1127",1890000000d));
		
		bankList.add(new Bank(17L,"ICICI Direct","ICICI","India","Bombay","ICICI2127",9900800000d));
		bankList.add(new Bank(18L,"ICICI Direct","ICICI","India","Delhi","ICICI1256",350600000d));
		bankList.add(new Bank(19L,"ICICI Direct","ICICI","India","Kolkata","ICICI1427",9903000000d));
		
		
		bankList.add(new Bank(20L,"Axis Home Loans","Axis","India","Hyderabad","Axis123",11300040000d));
		bankList.add(new Bank(21L,"Axis Home Loans","Axis","India","Chennai","Axis124",2240000000d));
		bankList.add(new Bank(22L,"Axis Home Loans","Axis","India","Nellore","Axis125",330000000d));
		bankList.add(new Bank(23L,"Axis Core","Axis","India","Nellore","Axis126",335000000d));
		bankList.add(new Bank(24L,"Axis Core","Axis","India","Tirupati","Axis127",990000000d));
		bankList.add(new Bank(25L,"Axis Insurance","Axis","India","Nellore","Axis126",335000000d));
		bankList.add(new Bank(26L,"Axis Insurance","Axis","India","Tirupati","Axis127",990000000d));
		bankList.add(new Bank(27L,"Axis Dmat","Axis","India","Nellore","Axis1326",3445000000d));
		bankList.add(new Bank(28L,"Axis Dmat","Axis","India","Tirupati","Axis0127",88090000000d));
		
		
		bankList.add(new Bank(20L,"Citi Home Loans","Citi","India","Bhopal","Citi123",11300040000d));
		bankList.add(new Bank(21L,"Citi Home Loans","Citi","India","Madhurai","Citi124",2240000000d));
		bankList.add(new Bank(22L,"Citi Home Loans","Citi","India","Nanded","Citi125",330000000d));
		bankList.add(new Bank(23L,"Citi Core","Citi","India","Pune","Citi126",335000000d));
		bankList.add(new Bank(24L,"Citi Core","Citi","India","Mumbai","Citi127",990000000d));
		bankList.add(new Bank(25L,"Citi Insurance","Citi","India","Kochi","Citi126",335000000d));
		bankList.add(new Bank(26L,"Citi Insurance","Citi","India","Goa","Citi127",990000000d));
		bankList.add(new Bank(27L,"Citi Dmat","Citi","India","Jaipur","Citi1326",3445000000d));
		bankList.add(new Bank(28L,"Citi Dmat","Citi","India","Delhi","Citi0127",88090000000d));
		
		
		
		//========================Duplicate=================
		
		bankList.add(new Bank(1L,"HDFC Home Loans","HDFC","India","Hyderabad","HDFC123",10000000d));
		bankList.add(new Bank(2L,"HDFC Home Loans","HDFC","India","Chennai","HDFC124",20000000d));
		bankList.add(new Bank(3L,"HDFC Home Loans","HDFC","India","Nellore","HDFC125",30000000d));
		bankList.add(new Bank(4L,"HDFC core","HDFC","India","Nellore","HDFC126",350002000d));
		bankList.add(new Bank(5L,"HDFC Core","HDFC","India","Tirupati","HDFC127",90000000d));
		
		
		bankList.add(new Bank(6L,"ICICI Home Loans","ICICI","India","Hyderabad","ICICI123",1300040000d));
		bankList.add(new Bank(7L,"ICICI Home Loans","ICICI","India","Chennai","ICICI124",240000000d));
		bankList.add(new Bank(8L,"ICICI Home Loans","ICICI","India","Nellore","ICICI125",30000000d));
		bankList.add(new Bank(9L,"ICICI Core","ICICI","India","Nellore","ICICI126",35000000d));
		bankList.add(new Bank(10L,"ICICI Core","ICICI","India","Tirupati","ICICI127",990000000d));
		bankList.add(new Bank(11L,"ICICI Insurance","ICICI","India","Nellore","ICICI126",35000000d));
		bankList.add(new Bank(12L,"ICICI Insurance","ICICI","India","Tirupati","ICICI127",990000000d));
		
		bankList.add(new Bank(13L,"HDFC Insurance","HDFC","India","Nellore","HDFC1326",345000000d));
		bankList.add(new Bank(14L,"HDFC Insurance","HDFC","India","Tirupati","HDFC0127",8090000000d));
		
		bankList.add(new Bank(15L,"HDFC Dmat","HDFC","India","Vizag","HDFC12076",3245000000d));
		bankList.add(new Bank(16L,"HDFC Dmat","HDFC","India","Kurnool","HDFC1127",1890000000d));
		
		bankList.add(new Bank(17L,"ICICI Direct","ICICI","India","Bombay","ICICI2127",9900800000d));
		bankList.add(new Bank(18L,"ICICI Direct","ICICI","India","Delhi","ICICI1256",350600000d));
		bankList.add(new Bank(19L,"ICICI Direct","ICICI","India","Kolkata","ICICI1427",9903000000d));
		
		
		bankList.add(new Bank(20L,"Axis Home Loans","Axis","India","Hyderabad","Axis123",11300040000d));
		bankList.add(new Bank(21L,"Axis Home Loans","Axis","India","Chennai","Axis124",2240000000d));
		bankList.add(new Bank(22L,"Axis Home Loans","Axis","India","Nellore","Axis125",330000000d));
		bankList.add(new Bank(23L,"Axis Core","Axis","India","Nellore","Axis126",335000000d));
		bankList.add(new Bank(24L,"Axis Core","Axis","India","Tirupati","Axis127",990000000d));
		bankList.add(new Bank(25L,"Axis Insurance","Axis","India","Nellore","Axis126",335000000d));
		bankList.add(new Bank(26L,"Axis Insurance","Axis","India","Tirupati","Axis127",990000000d));
		bankList.add(new Bank(27L,"Axis Dmat","Axis","India","Nellore","Axis1326",3445000000d));
		bankList.add(new Bank(28L,"Axis Dmat","Axis","India","Tirupati","Axis0127",88090000000d));
		
		
		bankList.add(new Bank(20L,"Citi Home Loans","Citi","India","Bhopal","Citi123",11300040000d));
		bankList.add(new Bank(21L,"Citi Home Loans","Citi","India","Madhurai","Citi124",2240000000d));
		bankList.add(new Bank(22L,"Citi Home Loans","Citi","India","Nanded","Citi125",330000000d));
		bankList.add(new Bank(23L,"Citi Core","Citi","India","Pune","Citi126",335000000d));
		bankList.add(new Bank(24L,"Citi Core","Citi","India","Mumbai","Citi127",990000000d));
		bankList.add(new Bank(25L,"Citi Insurance","Citi","India","Kochi","Citi126",335000000d));
		bankList.add(new Bank(26L,"Citi Insurance","Citi","India","Goa","Citi127",990000000d));
		bankList.add(new Bank(27L,"Citi Dmat","Citi","India","Jaipur","Citi1326",3445000000d));
		bankList.add(new Bank(28L,"Citi Dmat","Citi","India","Delhi","Citi0127",88090000000d));
		
	
	}
	
	public static List<Bank> getBankList() {
		
		return Collections.unmodifiableList(bankList);
	}

}
