package calc;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface CalculatorService {
	@LambdaFunction(functionName="CalculatorService")
	String calc(String input);
}
