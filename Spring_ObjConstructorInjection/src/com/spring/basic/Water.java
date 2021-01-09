package com.spring.basic;

public class Water {
String typeOfFish;

@Override
public String toString() {
	return "Water [typeOfFish=" + typeOfFish + "]";
}

public Water(String typeOfFish) {
	super();
	this.typeOfFish = typeOfFish;
}

}
