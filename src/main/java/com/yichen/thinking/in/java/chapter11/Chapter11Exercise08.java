package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class Chapter11Exercise08 {

	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>(); 
		gerbils.add(new Gerbil("1"));
		gerbils.add(new Gerbil("2"));
		gerbils.add(new Gerbil("3"));
		
		Iterator<Gerbil> it = gerbils.iterator();
		while (it.hasNext()) {
			Gerbil gerbil =  it.next();
			gerbil.hop();
		}
	}

}
