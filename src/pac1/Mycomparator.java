package pac1;

import java.util.Comparator;

public class Mycomparator implements Comparator {
public int compare(Object obj1,Object obj2) {
	int a=(Integer)obj1;
	int b=(Integer)obj2;
	if(a==b) {
		return 0;
	}else if(a>b) {
		return -1;
	}
	else return 1;
}
}
