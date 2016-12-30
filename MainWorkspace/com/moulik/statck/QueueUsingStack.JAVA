package com.moulik.stack;

import java.util.Stack;

public class QueueUsingStack {
	private static Stack<Integer> stack1 = new Stack<Integer>();
	private static Stack<Integer> stack2 = new Stack<Integer>();
	
	public static void main(String[] args) {
		QueueUsingStack queue = new QueueUsingStack();
		pushToStack();
		System.out.println("Stack1 "+stack1);
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());
		stack1.push(5);
		stack1.push(6);
		System.out.println("Stack2 "+stack2);
		System.out.println(queue.get());
		stack1.push(7);
		System.out.println(stack1);
		System.out.println(queue.get());
		System.out.println("Stack2 "+stack2);
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println("Stack1 "+stack1);
		System.out.println("Stack2 "+stack2);
		
	}
	
	/*
	 * To return first inserted element that is a queue behavior
	 */
	private int get() {
		/*
		 * transfer all the elements form stack1 to stack2 if stack2 is empty.
		 */
		if(stack1.size()>0 && stack2.size()==0){
			while(stack1.size()>0){
				stack2.push(stack1.pop());
			}
		}
		//pop from statck2 to return first inserted element
		return stack2.pop();
		
	}

	private static void pushToStack() {
		stack1.push(0);
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
	}

}
