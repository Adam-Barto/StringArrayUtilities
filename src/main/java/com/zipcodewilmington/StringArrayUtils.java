package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
        //return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
        //return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
//        if(Arrays.toString(array).contains(value)){
////            return true;
////        }
        //Remember to use Arrays.toString(), rather then array.toString()
        //System.out.println(Arrays.toString(array));
        return Arrays.toString(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> value = new ArrayList<>();
        for (int i = array.length-1; i >= 0; i--){
            value.add(array[i]);
        }
        array = value.toArray(new String[0]); //This converts it to an Array of type String so String[]
        return array;
        //return null;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
//        if (Arrays.toString(array).equals(Arrays.toString(reverse(array)))){
//            return true;
//        }
        return Arrays.toString(array).equals(Arrays.toString(reverse(array)));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //ArrayList<String> alpha = new ArrayList<>(26);
        int start = Character.getNumericValue('a');
        int stop = Character.getNumericValue('z');
        for(int i = start; i <= stop; i++){
            System.out.println(Character.forDigit(i,36));
           if (!contains(array,String.valueOf(Character.forDigit(i,36)))
           && (!contains(array,String.valueOf(Character.forDigit(i,36)).toUpperCase()))){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String c : array) {
            if (value.equals(c)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList <String> value = new ArrayList<>(List.of(array));
        value.remove(valueToRemove);
        array = value.toArray(new String[0]);
        return array;
        //return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
