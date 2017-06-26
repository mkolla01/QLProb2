package com.string.sort.stringsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import com.sample.program.StringSort;

public class StringSort 
{
    public static void main( String[] args )
    {
    	StringSort sr=new StringSort();
        List<String> unSortedList =sr.createStrList();
        System.out.println("Unsorted List Equals ==="+unSortedList);
        
       //sort the list by using Collections framework 
        Collections.sort(unSortedList);
       System.out.println("Sorted List Equals ==="+unSortedList); 
    }


public List<String> createStrList()
{
    List<String> strList=new ArrayList<String>();
    strList.add("redis");
    strList.add("cassandra");
    strList.add("couchdb");
    strList.add("mongodb");
    strList.add("dynamodb");
    return strList;
    
}
}