package com.bridgelabz.stack;

public class StackMain
{
   public static void main(String[] args)
   {
       StackService<Integer> stack = new StackService<>();
       stack.push(70);
       stack.push(30);
       stack.push(56);
       stack.print();

       stack.pop();
       stack.peak();
       stack.print();
   }
}
