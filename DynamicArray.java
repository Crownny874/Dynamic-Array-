
public class DynamicArray {
	
	public static void main(String[] args) {
	 
		Dynamic arr = new Dynamic();
		arr.add(5);
		arr.add(4);
	   arr.add(3);
	
		arr.addFirst(20);
		arr.addLast(25);
		arr.addAt(6,9);
	 int get = arr.get(2);
	 System.out.println("Data:"+get);
		
		arr.print();
		
		
	 }	
} 
