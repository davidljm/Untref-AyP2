package ayp2.clase06;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

	static void showPush(Stack<Integer> pila, Integer value) {
		pila.push(value);
		System.out.println("`push(" + value + ")`. Pila: " + pila);
	}

	static void showPop(Stack<Integer> pila) {
		Integer value = pila.pop();
		System.out.println("`pop()` -> " + value + ". Pila: " + pila);
	}

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("Pila: " + stack);

		showPush(stack, 42);
		showPush(stack, 66);
		showPush(stack, 99);
		showPop(stack);
		showPop(stack);
		showPop(stack);

		try {
			showPop(stack);
		} catch (EmptyStackException e) {
			System.out.println("Pila vacía");
		}
	}

}
