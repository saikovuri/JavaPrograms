package com.topcoder.easy;

public class ArrayStack {
	int size=0;
	int top =-1;
	int max_size =10;
    int arr[] = new int[max_size] ;

    public void push(int n)
    {
    	if(top == max_size-1 )
    	{
    		System.out.println("Stack is full");
    		return;
    	}
    	top++;
    	arr[top] =n;
    	size++;
    	
    }
    public void pop()
    {
    	if(top ==-1)
    	{
    		System.out.println("Stack is empty");
    		return;
    	}
    	
    	System.out.println("Popped element is :" +arr[top]);
    	top--;
    	size--;
    }
    
    public void display()
    {
    	for(int i =0 ; i<=top ;i++)
    	{
    		System.out.println(arr[i]);
    	}
    }
	
	
	public static void main(String[] args) {
	
		ArrayStack as = new ArrayStack();
		
		as.push(1);
		as.push(2);
		as.push(3);
		as.pop();
		as.pop();
		
		System.out.println("After Popping");
		as.display();

	}

}
