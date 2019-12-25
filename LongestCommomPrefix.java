package guvi;

import java.util.*;
import java.util.Scanner;

public class LongestCommomPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String arr[] = new String[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.next();
		}
		ArrayList<Integer> len = new ArrayList<>();
		for(int i  = 0;i < n;i++) {
			len.add(arr[i].length());
		}
		int temp = len.get(0);
		int ind = 0;
		for(int i = 1;i < n;i++) {
			if(len.get(i) <  temp) {
				temp = len.get(i);
				ind = i;
			}
		}
		char ch[] = arr[ind].toCharArray();
		lable :for(int j = 0;j < n;j++) {
			if(j == ind) {
				continue;
			}
			for(int i  = 0;i < arr[ind].length();i++) {
				if(ch[i] == arr[j].charAt(i)) {
					System.out.print(ch[i]);
				}else {
					System.out.println("not matching");
					break lable;
				}
			}
			break;
		}
	}

}
