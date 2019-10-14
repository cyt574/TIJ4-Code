package com.yichen.thinking.in.java.chapter11;

//: holding/NonCollectionSequence.java
import typeinfo.pets.*;
import java.util.*;

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {

	@Override
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	public Iterable<Pet> reversed() {
		return new Iterable<Pet>() {
			@Override
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>() {
					private int index = pets.length - 1;

					@Override
					public Pet next() {
						return pets[index--];
					}

					@Override
					public boolean hasNext() {
						return index >= 0;
					}
				};
				
			}
		};
	}

	public Iterable<Pet> randomized() {
		return new Iterable<Pet>() {
			@Override
			public Iterator<Pet> iterator() {
				List<Pet> petList = new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(petList, new Random(47));
				return petList.iterator();
			}
		};

	}

	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		for (Pet pet : nc.reversed())
			System.out.print(pet + " ");
		System.out.println();
		for (Pet pet : nc.randomized())
			System.out.print(pet + " ");
		System.out.println();
		for (Pet pet : nc)
			System.out.print(pet + " ");
	}
} /*
	 * Output: 0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
	 */// :~
