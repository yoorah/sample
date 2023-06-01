package Day11.Ex03_Generic;

//제네릭
class KeyValue<K, V> {
	
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey( ) {
		this.key = (K);
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}


public class TwoTypeGeneric {

	public static void main(String[] args) {
		
		//
		//
		//
		//
    	// KeyValue<String Integer> kv = new KeyValue<
		KeyValue<String, Integer> kv = new KeyValue<>();
		
		kv.setKey("Java");
		kv.setValue(100);
		
		KeyValue<Integer, String> kv2 = new KeyValue();
		kv2.setKey(100);
		kv2.setValue("Java");
		
		System.out.println("kv key : " + kv.getKey());
		System.out.println("kv- value : " + kv.getKey());
		
		System.out.println("kv2- key : " + kv2.getKey());
		System.out.println("kv2- value : " + kv2.getKey());
		
		// Void : 
		KeyValue<Integer, String> kv3 = new KeyValue();
		kv3.setKey("키 값만");
		Integer key3 = kv3.getKey();
		System.out.println("key3 : " + key3);
		
	    
		 
		
	}
	
}
