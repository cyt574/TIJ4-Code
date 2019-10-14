package innerclasses;

import java.util.ArrayList;
import java.util.Iterator;

//: innerclasses/Sequence.java
//Holds a sequence of Objects.


public class SecondSequence {
	private Object[] items;
	private int next = 0;

	public SecondSequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceIterator implements Iterator<Object> {
		private int i = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i < items.length;
		}

		@Override
		public Object next() {
			return items[i++];
		}
	}

	public Iterator<Object> iterator() {
		return new SequenceIterator();
	}

	public static void main(String[] args) {
		SecondSequence sequence = new SecondSequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Iterator<Object> iterator = sequence.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
} /*
	 * Output: 0 1 2 3 4 5 6 7 8 9
	 */// :~