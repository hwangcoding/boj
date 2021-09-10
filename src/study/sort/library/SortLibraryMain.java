package study.sort.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import common.CommonUtil;

public class SortLibraryMain {

	public static void main (String [] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("È²±Ôºó", 10));
		studentList.add(new Student("±è±Ôºó", 13));
		studentList.add(new Student("¹é±Ôºó", 26));
		studentList.add(new Student("Äá±Ôºó", 32));
		studentList.add(new Student("Èæ±Ôºó", 22));
		studentList.add(new Student("È²±Ôºó", 28));
		studentList.add(new Student("±è±Ôºó", 28));
		studentList.add(new Student("¹é±Ôºó", 28));
		studentList.add(new Student("Äá±Ôºó", 28));
		studentList.add(new Student("Èæ±Ôºó", 28));
		System.out.println("Á¤·ÄÀü");
		printList(studentList);
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.getAge(),  o2.getAge());
			}
		}.thenComparing(Student::getName));
		System.out.println("Á¤·ÄÈÄ");
		printList(studentList);
		
		Collections.sort(studentList, (o1, o2) -> Integer.compare(o2.getAge(),o1.getAge()));
		System.out.println("Á¤·ÄÈÄ");
		printList(studentList);
		
	}
	
	public static <T> void printList (List<T> list) {
		for(int i = 0 ; i <list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
}
