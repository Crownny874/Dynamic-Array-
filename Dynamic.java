
public class Dynamic {
	int capacity = 5;
	int[] arr;
	int size;
public void add(int a) { 
	if(size != -1) {
		grow();
	}
	arr[size] = a;
	size++;
}
public void swap(int[] arr,int index,int index2) {
	int temp = arr[index];
	arr[index] = arr[index2];
	arr[index2] = temp;
}
public void grow() {
	 int i = 5;
	 while(capacity == 5) {
	    while(i == 5) {
			 i = i * 2;
		 capacity = i;
		arr = new int[capacity];
	  }
	 }
	 }
public void sort(int[] arr) {
	for(int i = 0; i < arr.length; i++) {
		
		for(int j = 0; j < arr.length-i-1; j++) {
			
			if(arr[j] > arr[j+1]) {
				swap(arr,j,j+1);
				}
			  }
			}
		}
public boolean contains(int a) {
	for(int i = 0; i < arr.length; i++) {
	if(arr[i] == a) {
		return true;
	  } else {
	  }
	  }
		return false;
	}
public void addFirst(int data) {
	for(int i = size; i > 0; i--) {
		arr[i] = arr[i-1];
	}
	arr[0] = data;
	 size++;
}
public int getFirst() {
	return arr[0];
}
public int getLast() {
	int value = capacity-1;
	return arr[value];
}
public int search(int data) {
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] == data) {
			return i;
		} 
		}
		return -1;
   }
 
public void addLast(int data) {
	
	arr[capacity-1] = data;
}
public void delete() {
	if(size != -1) {
	 arr[size-1] = 0;
	   size--;
	   }
}
public void deleteAt(int index) {
	if(size != -1) {
		
	for(int i = index; i < size; i++) {
		arr[i] = arr[i+1];
	}
	 arr[size] = 0;
	   size--;
	}
}
public void deleteAll() {
	for(int i = 0; i < arr.length; i++) {
	if(size != -1) {
		arr[i] = capacity - capacity;
	}
	}
}
public void ReplaceWith(int index,int a) {
	arr[index] = a;
}
public void addAt(int index,int a) {
	if(size != -1) {
		grow();
	}
	for(int i = size; i > index; i--) {
	   arr[i] = arr[i-1];
	}
	arr[index] = a;
	 size++;
}
public int get(int index) {
  for(int i = 0; i < arr.length; i++) {
	  if(arr[i] == index) {
		  }
		 }
		  return arr[index];
	  }
public void arrSize() {
	System.out.println(size);
}
public void arrCapacity() {
	System.out.println(capacity);
}
public void print() {
	for(int i : arr) {
		System.out.println(i);
		}
	}
public boolean isEmpty() {
		if(size == 0) {
			return true;
		} 
		return false;
		}
  }

