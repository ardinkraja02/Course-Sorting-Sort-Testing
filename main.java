
/*
Bubble Sort:
What is the worst case big O and what kind of input would cause that?
	The worst case is O(n^2) which occurs when a reverse sorted list is given
	to the program. 
What is the best case big O and what kind of input would cause that?
	The best case is O(n) which occurs when the list is already sorted. 
Insertion Sort:
What is the worst case big O and what kind of input would cause that?
	The worst case for insertion sort is a reverse sorted list. This causes
	the sort to compare each of the elements with the one before and keep
	moving it back for each element. The time would be O(n^2).
What is the best case big O and what kind of input would cause that?
	The best case for insertion sort is an already sorted list because it
	would exit the search as soon as it realizes the list is already sorted 
	so it would have an O(n) runtime. 
Selection Sort:
What is the worst case big O and what kind of input would cause that?
What is the best case big O and what kind of input would cause that?
	There is no best or worst case it will always have a runtime of O(n^2) 
	because it needs to check each element against all other elements no matter 
	how sorted or unsorted it is. 
*/

import java.util.ArrayList;
public class main {
	
	public static void main (String [] args) {
		
		ArrayList<Course> list = new ArrayList<Course>();
		
		Course c = new Course("CS",271,"Unix and C programming");
		Course a = new Course("CS", 241, "Data Structures and Algorithms");
		Course b = new Course("CIS", 151, "Game Development");
		a.toString();
		b.toString();
		c.toString();
		list.add(a);
		list.add(b);
		list.add(c);
		insertionSort(list);
		print(list);
	}

	public static void print (ArrayList<Course> a) {
		for (int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
	public static void bubbleSort(ArrayList<Course> a) {
		int n = a.size();
	    for (int i = 1; i<n; i++) {
		   /* if this pair is out of order */
		      if (a.get(i-1).compareTo(a.get(i))>0) {
				 Course temp = a.get(i-1);
				 a.set(i-1,a.get(i));
				 a.set(i,temp);
				    } // end if
	    } // end for
				    
	}
	public static void insertionSort(ArrayList<Course> a) { // broken
		int i = 1;
		while (i < a.size()) {
		   int j = i;
		    while (j > 0 && a.get(j-1).compareTo(a.get(j)) > 0) {
		        Course temp = a.get(j);
		        a.set(j,a.get(j-1));
		        a.set(j-1, temp);
		        j = j - 1;
		}  //end while;
		    i = i + 1;
		}//end while;
	}
	public static void selectionSort(ArrayList<Course> a) {
		/* a[0] to a[aLength-1] is the array to sort */
		int i,j;
		int aLength = a.size(); // Initialize to a's length
		
		for (i = 0; i < aLength-1; i++){
		    int jMin = i;
		    for (j = i+1; j < aLength; j++) {
		        if (a.get(j).compareTo(a.get(j-1))<0) {
		            jMin = j;
		        }
		    }//end loop

		    if (jMin != i){
		        Course temp = a.get(i);
		        a.set(i,a.get(jMin));
		        a.set(jMin, temp);
		    }
		}//end loop
	}

}
