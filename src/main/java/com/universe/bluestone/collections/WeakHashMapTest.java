package com.universe.bluestone.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * The key of WeakHashMap has weak reference. 
 * If the key has been garbage collected, then the entry in WeakHashMap object will automatically be deleted.
 *  It does not happen in normal HashMap. The entry will not be deleted if the key is garbage collected
 *
 */
public class WeakHashMapTest {
	public static void main(String[] args) throws InterruptedException {
		
		Map<String,String> hashMap= new HashMap<>();
		
        Map<String,String> weakHashMap = new WeakHashMap<>();
        
        String key1 = new String("111");
        String key2 = new String("222");
        String key3 = new String("222");
        
        hashMap.put(key1, "Ramesh");
        weakHashMap.put(key2, "Suresh");
        System.gc();
        System.out.println("Before: hash map value:"+hashMap.get("111")+" and weak hash map value:"+weakHashMap.get("222"));
        System.out.println("Before: hash map value:"+hashMap.get(key1)+" and weak hash map value:"+weakHashMap.get(key3));
        
        key1 = null;
        key2 = null;
        System.gc(); 
      // while(hashMap.get("111")!=null) {
	        
	        Thread.sleep(3000L);
	        System.out.println("After - using keys: hash map value:"+hashMap.get(key1)+" and weak hash map value:"+weakHashMap.get(key2));
	        
	        System.out.println("After - using literals: hash map value:"+hashMap.get("111")+" and weak hash map value:"+weakHashMap.get("222"));
	        System.out.println("After - using literals: hash map value:"+hashMap.get(new String("111"))+" and weak hash map value:"+weakHashMap.get(new String("222")));
        
      // }
        hashMap=null;
        weakHashMap=null;
        //System.out.println("After - using literals: hash map value:"+hashMap.get(new String("111"))+" and weak hash map value:"+weakHashMap.get(new String("222")));
    }
}