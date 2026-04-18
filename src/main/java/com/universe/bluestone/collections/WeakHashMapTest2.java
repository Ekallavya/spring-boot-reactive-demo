package com.universe.bluestone.collections;

import java.util.WeakHashMap;

public class WeakHashMapTest2 {
	
	static class CustomKey{
		
		private int id;
		private String name;
		private String speciality;
		private String country;
		CustomKey(){}
		public CustomKey(int id, String name, String speciality, String country) {
			super();
			this.id = id;
			this.name = name;
			this.speciality = speciality;
			this.country = country;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSpeciality() {
			return speciality;
		}
		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((country == null) ? 0 : country.hashCode());
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			//return result;
			return 299;
		}
		@Override
		public boolean equals(Object obj) {
			
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			CustomKey other = (CustomKey) obj;
//			if (country == null) {
//				if (other.country != null)
//					return false;
//			} else if (!country.equals(other.country))
//				return false;
//			if (id != other.id)
//				return false;
//			if (name == null) {
//				if (other.name != null)
//					return false;
//			} else if (!name.equals(other.name))
//				return false;
//			return true;
			return true;
		}
		
		
		
	}

	public static void main(String[] args) {
		
		CustomKey key1 = new CustomKey(1,"Krish","Allrounder","Dwaraka");
		CustomKey key2 = new CustomKey(2,"Arjun","Archer","Indraprasta");
		CustomKey key3 = new CustomKey(3,"Bheem","Wrestler","Hashtina");
		CustomKey key4 = new CustomKey(4,"Nakul","HorseRider","Uttaranchal");
		CustomKey key5 = new CustomKey(5,"Sahadev","Astrologer","Kamboj");
		CustomKey key6 = new CustomKey();
		CustomKey key7 = new CustomKey();
		CustomKey key8 = new CustomKey();
		CustomKey key9 = new CustomKey();
		
		System.out.println("key1 ref:"+key1);
		System.out.println("key2 ref:"+key2);
		System.out.println("key3 ref:"+key3);
		System.out.println("key4 ref:"+key4);
		System.out.println("key5 ref:"+key5);
		System.out.println("key6 ref:"+key6);
		System.out.println("key7 ref:"+key7);
		System.out.println("key8 ref:"+key8);
		System.out.println("key9 ref:"+key9);
	
		
		WeakHashMap<CustomKey ,String> custMap = new WeakHashMap<>();
		
		custMap.put(key1, "111");
		custMap.put(key2, "222");
		custMap.put(key3, "333");
		custMap.put(key4, "444");
		custMap.put(key5, "555");
		
		System.out.println("custMap:"+custMap);
		
		if(key8==key9) {
			System.out.println("keys are equal");
		}else {
			System.out.println("keys are not equal");
		}
		
		for(CustomKey cust:custMap.keySet())
		System.out.println(cust.hashCode()+"--"+cust.getId()+"--"+cust.getName()+"--"+cust.getSpeciality()+"--"+cust.getCountry() +"--Value:"+custMap.get(cust));

		
		key1 = null;
		key2 = null;
		key3 = null;
		key4 = null;
		key5 = null;
		System.gc();
		for(CustomKey cust:custMap.keySet())
			System.out.println(cust.hashCode()+"--"+cust.getId()+"--"+cust.getName()+"--"+cust.getSpeciality()+"--"+cust.getCountry() +"--Value:"+custMap.get(cust));

	}

}
