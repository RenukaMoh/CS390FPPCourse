package lesson8.listapi;

import java.util.Objects;

class Student{
	private   String name;
    private int id;
    private int score;
    
    Student (String name, int id,int score){
      this.name = name;
      this.id = id;
      this.score = score;
  }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return  "(" + name + "," + id + ","+ score +")";
	}
	@Override
	   public boolean equals(Object ob) {
		   // Are they same
		   if(this==ob) return true;
		   // The object is null return false
		   if(ob==null) return false;
		   if(this.getClass()!=ob.getClass()) return false;
		   // Convert the argument in to Apple type
		   Student a = (Student) ob;
		   if(this.name.equals(a.name) && this.id==a.id && this.score == a.score)
			   return true;
		   else
			   return false;
	   }
	@Override
	   public int hashCode() {
			    return Objects.hash(id,name,score);
	   }

}