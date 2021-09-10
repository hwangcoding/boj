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
		studentList.add(new Student("Ȳ�Ժ�", 10));
		studentList.add(new Student("��Ժ�", 13));
		studentList.add(new Student("��Ժ�", 26));
		studentList.add(new Student("��Ժ�", 32));
		studentList.add(new Student("��Ժ�", 22));
		studentList.add(new Student("Ȳ�Ժ�", 28));
		studentList.add(new Student("��Ժ�", 28));
		studentList.add(new Student("��Ժ�", 28));
		studentList.add(new Student("��Ժ�", 28));
		studentList.add(new Student("��Ժ�", 28));
		System.out.println("������");
		printList(studentList);
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.getAge(),  o2.getAge());
			}
		}.thenComparing(Student::getName));
		System.out.println("������");
		printList(studentList);
		
		Collections.sort(studentList, (o1, o2) -> Integer.compare(o2.getAge(),o1.getAge()));
		System.out.println("������");
		printList(studentList);
		
	}
	
	public static <T> void printList (List<T> list) {
		for(int i = 0 ; i <list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
}
