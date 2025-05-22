package lesson6.slidecodes;

import lesson6.slidecodes.OuterStaticDemo.MyStaticNestedClass;

public class TestOuterStatic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			OuterStaticDemo.MyStaticNestedClass cl = new OuterStaticDemo.MyStaticNestedClass(); //OK
			OuterStaticDemo m = new OuterStaticDemo();
			// Directly call Static methods and fields outside any class
		MyStaticNestedClass ins = new MyStaticNestedClass();

		System.out.println("Static Instance method call");
			ins.myOtherMethod();
		System.out.println("Direct Static method call");
			MyStaticNestedClass.myStaticMethod();
			//the following is illegal-- compiler error
	//OuterStaticDemo.MyStaticNestedClass cl2 = m.new MyStaticNestedClass();
		//	OuterStaticDemo.MyStaticNestedClass cl2 =  new OuterStaticDemo.MyStaticNestedClass();
			//cl2.myOtherMethod();
	}
}
