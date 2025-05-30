package lesson8.arraybasedlist;


import java.util.*;

public class MyStringListSortSearch  {
	private final int INITIAL_LENGTH = 50;
	private String[] strArray; 
	private int size;
	
	
	public MyStringListSortSearch() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
		
	}
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	/** removes first occurrence of s */
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		//System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}

	/******* sorting methods ********/
	public void sort(){
		if(strArray == null || size<=1) return;
		
		int temp = 0;
		for(int i = 0; i < size; ++i){
			int nextMinPos = minpos(i,size-1);
			swap(i,nextMinPos); 
		}
		
	}
	void swap(int i, int j){
		String temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;
		
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){		
		String min = strArray[bottom];
		int index = bottom;
		for(int i = bottom+1; i <= top; ++i){
			if(strArray[i].compareTo(min)<0){ 
				min = strArray[i];
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}

	/********* end sorting methods ********/
	
	/******** binary search methods ********/
	
	//search a sorted array
	boolean binSearch(String val) {
		boolean b = recurse(0,size()-1, val);
		return b;
	}

  // a = lower index, b = higher index , targer = val
	boolean recurse(int a, int b, String val) {
		int mid = (a+b)/2;
		if(strArray[mid].equals(val)) return true;
		if(a > b) return false;
		if(val.compareTo(strArray[mid])>0) 
			return recurse(mid+1, b, val);
		return recurse(a,mid-1,val);
	}

	/********* end binary search methods *****/

	public static void main(String[] args){
		String[] testArr = {"big", "small", "tall", "short", "round", "square", "enormous", "tiny","gargantuan", "lilliputian", "numberless", "none", "vast", "miniscule"};
		MyStringListSortSearch list = new MyStringListSortSearch();
		for(int i = 0; i < testArr.length; ++i) {
			list.add(testArr[i]);
		}
		list.sort();
		System.out.println("The list in sorted order:");
		System.out.println(list.toString());
		System.out.println();
		
		System.out.println("\"number\" is in the list? "+list.binSearch("number"));
		System.out.println("\"tiny\" is in the list? "+list.binSearch("tiny"));
	}
}