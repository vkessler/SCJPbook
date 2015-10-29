package _10_29;

import java.util.PriorityQueue;

public class TestQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pqs = new PriorityQueue<Integer>();
		pqs.offer(41);
		pqs.offer(31);
		pqs.offer(21);
		pqs.offer(-1);
		pqs.offer(9);
		pqs.offer(11);
		pqs.offer(10);
		
		System.out.println(pqs.size());
			System.out.println(pqs);
			for(int i = 0; i < pqs.size(); i++)
		//	System.out.println(pqs.);
			
		
//			for(int i : pqs){
//				System.out.print(i + " ");
//			}
		
	}

}
