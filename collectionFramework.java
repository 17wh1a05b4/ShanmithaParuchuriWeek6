package Epam;

import java.util.Arrays;

public class collectionFramework<E> {
	    private static final int C = 10;
	    private Object value[];
	    private int n = 0;
	    private void capacity() {
			 int newSize = value.length * 2;
			 value = Arrays.copyOf(value, newSize);
		 }
	    
	    public collectionFramework() {
	        value = new Object[C];
	    }
	    
		 public E get(int i) {
			 if (i >= n || i < 0) {
				 throw new IndexOutOfBoundsException("Index is: " + i + ", Size is:" + i);
			 }
			 return (E) value[i];
		 }
		 
		 public void adding(E e) {
			 if (n == value.length) {
				 capacity();
			 }
			 value[n++] = e;
		 }
	
	 public E remove(int i) {
		   if (i < 0 || i >= n) {
			 throw new IndexOutOfBoundsException("Index is: " + i + ", Size is:" + i);
		   }
		   int ele = value.length - ( i + 1 );
		   Object item = value[i];
	       System.arraycopy( value, i + 1, value, i, ele ) ;
	       n--;
	    return (E) item;
	 }
	 
	 public int size() {
		 return n;
	 }
	 
	 public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append('[');
		 for(int i = 0; i < n ;i++) {
			 sb.append(value[i].toString());
			 if(i<n-1){
				 sb.append(",");
			 }
		 }
		 sb.append(']');
		 return sb.toString();
	 }
}