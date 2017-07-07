import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import calc.Operation;
import impl.Add;

public class Calculator {
	public static void main(String[] args) {
		Operation add1 = new Add();
		BinaryOperator<Double> add = add1::calc;
		BinaryOperator<Double> substract = (p1, p2) -> p1 - p2;
		BinaryOperator<Double> multiply = (p1, p2) -> p1 * p2;
		BinaryOperator<Double> divide = (p1, p2) -> {
			try {
				return p1 / p2;
			} catch (Exception e) {
				System.out.println("Exception:" + e.getMessage());
				return null;
			}
		};

		Calculator calculator = new Calculator();

		calculator.print(add, 2D, 3D);
		calculator.print(substract, 2D, 3D);
		calculator.print(multiply, 2D, 3D);
		calculator.print(divide, 2D, 0D);

		BinaryOperator<Double> adder = (p1, p2) -> p1 + p2;
		Consumer<BinaryOperator<Double>> printer = p -> System.out.println(adder.apply(2d, 3d));
		printer.accept(adder);

	}

	public void print(BinaryOperator<Double> operation, Double double1, Double double2) {
		// System.out.println(operation.apply(double1,double2));

	}
}
