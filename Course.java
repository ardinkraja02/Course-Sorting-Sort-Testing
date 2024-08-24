
public class Course implements Comparable<Course>{

	String dept;
	int num;
	String course;
	
	public Course(String dept, int num, String course) {
		this.dept=dept;
		this.num=num;
		this.course=course;
	}
	public String toString() {
		return dept + " " + num + " " + course;
	}
	public int compareTo(Course other) {
		if (dept.compareTo(other.dept) < 0) return -1;
		if (dept.compareTo(other.dept)  > 0) return 1;
		if (num > other.num) return 1;
		if (num < other.num) return -1;
		return 0;
	}

	}

