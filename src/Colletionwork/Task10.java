package Colletionwork;

import java.util.priorityQueue;

import java.util.Queue;


	class CochingStudent implements
	Comparable<CochingStudent>{
		int id;
		String name;
		
		public CochingStudent(int id , String name) {
			this.id = id;
			this.name = name;
	}
		@Override
		public int compareTo(CochingStudent o) {
			// TODO Auto-generated method stub
			return this.id - o.id;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "CochingStudent [id=" + id+ " , name= " + name + "]";
	}
		}
	
	public class Task10{
		public static void main(String[] args) {
			Quy7eue<CochingStudent> q =newPriorityQueue<CochingStudent>();
			q.offer("krishna patidar");
			q.isEmpty("");
	}
}