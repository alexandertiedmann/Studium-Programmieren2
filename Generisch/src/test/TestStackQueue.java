package test;

import stapel_warteschlange.*;
/**
 * test for generic stack and queue
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 13.01.2017
 */
public class TestStackQueue {
    public static void main(String[] args) {
        //12.1 a)
        System.out.println("12.1:");
        System.out.println("12.1 a)");
        //int values
	    Integer valInt1 = 3;
	    Integer valInt2 = 5;
	    Integer valInt3 = 1;
        //float values
	    Float valFloat1 = 6f;
	    Float valFloat2 = 9f;
	    Float valFloat3 = 4f;
        //stacks
        Stack stackInt = new Stack();
        Stack stackFloat = new Stack();

        //Integer-Stack
        stackInt.push(valInt1);
        stackInt.push(valInt2);
        stackInt.push(valInt3);
        System.out.println("Integer-Stack: \n" + stackInt.toString());
        System.out.println(stackInt.pop());
        System.out.println(stackInt.top());
        System.out.println(stackInt.isEmpty());

        System.out.println("");

        //Float-Stack
        stackFloat.push(valFloat1);
        stackFloat.push(valFloat2);
        stackFloat.push(valFloat3);
        System.out.println("Float-Stack: \n" + stackFloat.toString());
        System.out.println(stackFloat.pop());
        System.out.println(stackFloat.top());
        System.out.println(stackFloat.isEmpty());

        //12.2 b)
        System.out.println("");
        System.out.println("12.1 b)");
        //double values
        Double valDouble1 = 1.0;
        Double valDouble2 = 5.0;
        Double valDouble3 = 3.0;
        //char values
        Character valChar1 = 'w';
        Character valChar2 = 't';
        Character valChar3 = 'f';
        //queues
        Queue queueDouble = new Queue();
        Queue queueChar = new Queue();

        //Double-Queue
        queueDouble.enqueue(valDouble1);
        queueDouble.enqueue(valDouble2);
        queueDouble.enqueue(valDouble3);
        System.out.println("Double-Queue: \n " + queueDouble.toString());
        System.out.println(queueDouble.dequeue());
        System.out.println(queueDouble.first());
        System.out.println(queueDouble.isEmpty());

        System.out.println("");

        //Char-Queue
        queueChar.enqueue(valChar1);
        queueChar.enqueue(valChar2);
        queueChar.enqueue(valChar3);
        System.out.println("Char-Queue: \n " + queueChar.toString());
        System.out.println(queueChar.dequeue());
        System.out.println(queueChar.first());
        System.out.println(queueChar.isEmpty());
    }
}
