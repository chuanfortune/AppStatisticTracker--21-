package com.nolanlawson.apptracker.util;

import java.lang.reflect.Array;

public class ArrayUtil {
	
	// copied from Java 6 source
	
	 public static int[] copyOfRange(int[] original, int start, int end) {
         if (start <= end) {
             if (original.length >= start && 0 <= start) {
                 int length = end - start;
                 int copyLength = Math.min(length, original.length - start);
                 int[] copy = new int[length];
                 System.arraycopy(original, start, copy, 0, copyLength);
                 return copy;
             }
             throw new ArrayIndexOutOfBoundsException();
         }
         throw new IllegalArgumentException();
     }

	
    public static boolean[] copyOf(boolean[] original, int newLength) {
        boolean[] copy = new boolean[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }

    public static int[] copyOf(int[] original, int newLength) {
        int[] copy = new int[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }
	public static <T> T[] copyOf(T[] original, int newLength) {
		            return (T[]) copyOf(original, newLength, original.getClass());
		      }
	
    public static <T,U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType) {
        T[] copy = ((Object)newType == (Object)Object[].class)
            ? (T[]) new Object[newLength]
            : (T[]) Array.newInstance(newType.getComponentType(), newLength);
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }
    public static Object[] concatenate(Object[] first, Object[] second) {
        Object[] result = new Object[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
          result[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
          result[i + first.length] = second[i];
        }
        return result;
      }    

    public static int[] concatenate(int[] first, int[] second) {
      int[] result = new int[first.length + second.length];
      for (int i = 0; i < first.length; i++) {
        result[i] = first[i];
      }
      for (int i = 0; i < second.length; i++) {
        result[i + first.length] = second[i];
      }
      return result;
    }

    public static boolean[] concatenate(boolean[] first, boolean[] second) {
      boolean[] result = new boolean[first.length + second.length];
      for (int i = 0; i < first.length; i++) {
        result[i] = first[i];
      }
      for (int i = 0; i < second.length; i++) {
        result[i + first.length] = second[i];
      }
      return result;
    }
    
    public static boolean contains(int[] arr, int value) {
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == value) {
    			return true;
    		}
    	}
    	return false;
    }
    
}
