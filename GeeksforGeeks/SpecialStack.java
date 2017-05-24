package com.practice;

import java.util.Stack;

/*
 * Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
 *  and an additional operation getMin() which should return minimum element from the SpecialStack.
 *  All these operations of SpecialStack must be O(1). To implement SpecialStack, 
 * you should only use standard Stack data structure and no other data structure like arrays, list, .. etc.
 */
public class SpecialStack{
	
	Stack<Integer> spStack;
	Stack<Integer> auxiliaryStack;
	
	public SpecialStack(){
		spStack = new Stack<>();
		auxiliaryStack = new Stack<>();
	}
	
	private void push(int item){
		spStack.push(item);
		if(auxiliaryStack.isEmpty()){
			auxiliaryStack.push(item);
		}else if(item < auxiliaryStack.peek()){
			auxiliaryStack.push(item);
		}
		
	}
	
	private int pop(){
		if(spStack.peek()>auxiliaryStack.peek())
			return spStack.pop();
		else if(spStack.peek() == auxiliaryStack.peek())
		{
			spStack.pop();
			return auxiliaryStack.pop();
		}
		else return 0;
	}
	
	private int getMin(){
		if(!auxiliaryStack.isEmpty())
		return auxiliaryStack.peek();
		else return 0;
	}
	
	public static void main(String[] args) {
		
		SpecialStack ss = new SpecialStack();
		ss.push(4);
		ss.push(3);
		ss.push(8);
		ss.push(2);
		ss.push(9);
		ss.push(1);
		ss.push(6);
		System.out.println("Minimum element>>>>>>> "+ss.getMin());
		System.out.println("Pop element>>>>>>> "+ ss.pop());
		System.out.println("Pop element>>>>>>> "+ ss.pop());
		System.out.println("Minimum element>>>>>>> "+ss.getMin());
		
		

	}

}
