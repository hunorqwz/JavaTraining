package impl;

import calc.Operation;

public class Devide implements Operation {

	@Override
	public Double calc(Double a, Double b) {
		try {
			return a/b;
		} catch (Exception e) {
			System.out.println("Exception"+e.getMessage());
			return null;
		}
	}

}
