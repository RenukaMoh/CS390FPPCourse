package lesson8.listapi;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getName().compareTo(o2.getName())!=0)
			return o1.getName().compareTo(o2.getName());
		if(Integer.compare(o1.getId(), o2.getId())!=0)
			return Integer.compare(o1.getId(), o2.getId());
		else
		return Integer.compare(o1.getScore(), o2.getScore());
	}

}
