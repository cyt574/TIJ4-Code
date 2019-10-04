package com.yichen.thinking.in.java.chapter11;

import java.util.Collection;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class FirstCollectionSequence implements Collection<Pet> {

	private Pet[] pets = Pets.createArray(8);

	@Override
	public int size() {
		return pets.length;
	}

	@Override
	public boolean isEmpty() {
		return pets.length <= 0 ? true : false;
	}

	@Override
	public boolean contains(Object o) {
		if(o != null && o instanceof Pet) {
			for (Pet pet : pets) {
				if ( pet.equals(o)) return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			int index = 0;
			@Override
			public boolean hasNext() {
				return index < pets.length;
			}

			@Override
			public Pet next() {
				return pets[index++];
			}
		};
	}

	@Override
	public Object[] toArray() {
		return pets;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return (T[])pets;
	}

	@Override
	public boolean add(Pet e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends Pet> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException();
	}

	public static void main(String[] args) {
		FirstCollectionSequence c = new FirstCollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}

}
