package ayp2.clase10.stack;

import java.util.NoSuchElementException;

public class ArrayStackDemo {

	public static void main(String[] args) {
		ArrayStack<String> stack = new ArrayStack<String>(1);

		stack.push("A");
		System.out.println(stack);
		stack.push("B");
		System.out.println(stack);
		System.out.println("Se hace pop a la pila: " + stack.pop());
		System.out.println("Se hace peek en la cima de la pila: " + stack.peek());
		System.out.println(stack);
		System.out.println("La pila esta vacia? " + stack.isEmpty());
		System.out.println("Se hace pop a la pila: " + stack.pop());
		System.out.println("Y ahora, la pila esta vacia? " + stack.isEmpty());

		try {
			stack.peek();
		} catch (NoSuchElementException e) {
			System.err.println("No se puede hacer peek de una pila vacia");
		}
		
		try {
			stack.pop();
		} catch (NoSuchElementException e) {
			System.err.println("No se puede hacer pop de una pila vacia");
		}
	}
}