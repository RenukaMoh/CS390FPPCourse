package lesson11.needoverridehashcode;

import java.util.Objects;

// Inside your Key class you should override equals(), hashcode(), immutable
public class Pair {
	String first;
	String second;
	public Pair(String f, String s) {
		first = f;
		second = s;
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Pair p = (Pair)ob;
		return p.first == first && p.second == second;
	}
	@Override
	public int hashCode(){
		return Objects.hash(first,second); // JDK 8
	}
	/*@Override
	public int hashCode() {
		int result = 17; //seed
		int hashFirst = first.hashCode();
		int hashSecond = second.hashCode();
		result += 31 * result + hashFirst;
		result += 31 * result + hashSecond;
		return result;
		
		return Objects.hash(first,second);
	}*/

}
