package calc;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;

public class LambdaInvoker {
	final AWSLambda awsLambdaClient;
	final CalculatorService lambdaService;
	
	LambdaInvoker(){
		awsLambdaClient = AWSLambdaClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
		lambdaService = LambdaInvokerFactory.builder()
				.lambdaClient(awsLambdaClient)
				.build(CalculatorService.class);
	}
	
	public String invokeLambda(String input) {
		
		String ret = lambdaService.calc(input);
		return ret;
	}
}
