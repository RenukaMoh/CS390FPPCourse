package lesson5.bookabstract;

public class TestClass {

	public static void main(String[] args) {
		//Book ob;
		//Book ob = new Book(); // ob is a type of Book at compile time as well as runtime
		Book Ejava = new Ebook("Java","Horstman",45.78,"pdf"); // java is a type of Book at compile time, type of Ebook at runtime
		Book Pjava = new PaperBook("Java","Horstman",45.78,true);
			
		Book[] books = new Book[3]; // Decalring array as a type of Book
		
		books[0] = Ejava;
		books[1] = Pjava;
		books[2] = new Ebook("Java8","Renuka",50.67,"kindle");
		for (Book b: books){
			b.read(); // Runtime polymorphism, behavior comes from Either Ebook or PaperBook
			b.turning();
		}

		//double sum = totalPrice(books);
		//System.out.println(sum);
	}

	public static double totalPrice(Book[] col) {
		double tot = 0.0;
		
		if(col==null || col.length==0)
			return 0.0;
		for(Book b:col) {
			tot = tot + b.getPrice();
		}
		return tot;
	}
	
}
