package com.insightfullogic.java8.answers.chapter2;

import java.util.function.Predicate;
/** 
Would check(x -> x > 5) be inferred, given the following overloads for check ?<br/>
interface IntPred {<br/>
boolean test(Integer value);<br/>
}<br/>
boolean check(Predicate<Integer> predicate);<br/>
boolean check(IntPred predicate);<br/>
 * 名称：<br/>
 * 说明：<br/>
 * @author Finersoft
 * @date 2018年10月15日
 */
public class IntPredTest {

	public static void main(String[] args) {
		Action action = System.out::println;
		action.execute("Hello World!");
		test(System.out::println, "Hello World!");
		
		System.out.println(	check(o->o>5,1));	
		System.out.println(	check(o->o>5,5));	
		System.out.println(	check(o->o>5,10));	
		IntPred<Integer> intpred =x->x>5;
		System.out.println(intpred.test(5));
		System.out.println(intpred.test(1));
		System.out.println(intpred.test(10));
		
		System.out.println(	check2(o->o>5,1));	
		System.out.println(	check2(o->o>5,5));	
		System.out.println(	check2(o->o>5,10));	
		
		IntPred2 intpred2 = x->x>5;
		System.out.println(intpred2.test(5));
		System.out.println(intpred2.test(1));
		System.out.println(intpred2.test(10));
		
		
	}

	static Boolean check(Predicate<Integer> action, Integer value) {
		return action.test(value);
	}

	static void test(Action action, String str) {
		action.execute(str);
	}
	
	static boolean check2(IntPred2 action, Integer value) {
		return action.test(value);
	}
	
	
	
	
}

@FunctionalInterface
interface IntPred<T> {
	boolean test(T value);
}

@FunctionalInterface
interface Action<T> {
	public void execute(T t);
}

@FunctionalInterface
interface IntPred2 {
	boolean test(Integer value);
}