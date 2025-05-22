package lesson11.needoverridehashcode;

public class Test {
	boolean b;
	char c;
	String s;
	@Override
	public int hashCode() {
		int hv = 19;
		int bv = b?1:0;
		hv = hv + bv;
		hv = hv + (int)c;
		hv+=s.hashCode();
		return hv;
	}

}
