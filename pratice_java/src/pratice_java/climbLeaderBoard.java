package pratice_java;

import java.util.Arrays;
import java.util.Scanner;

public class climbLeaderBoard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
//
		int n = sc.nextInt();
		int[] ranked = new int[n];
//		
		System.out.print("ranked[0] :");
		ranked[0]=sc.nextInt();
//		
		for(int i=1;i<n;) {
			
			int temp = sc.nextInt();
			
		if(temp!=ranked[i-1]) {
			ranked[i]=temp;
			i++;
		}
		
		else if(temp==ranked[i-1]){
			n--;
		}
		
		}
		for(int i=0;i<n;i++) {
			System.out.print(ranked[i] + " ");
			
		}
		
		
		System.out.print("m : ");
		int m = sc.nextInt();
		
		int[] player = new int[m];
		
		System.out.print("player[0] :");
		for(int i=0;i<m;i++) {
			player[i]=sc.nextInt();
		}
		
		for(int i=0;i<player.length;i++) {
		int rank = 1;
			for(int j=0;j<ranked.length;j++) {
				
				if(player[i]<ranked[j]) {
					rank++;
				}
				
				
			}
			System.out.print(rank + " ");
		}
	}
	
}
