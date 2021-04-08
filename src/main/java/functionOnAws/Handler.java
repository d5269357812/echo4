package functionOnAws;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Introspected
public class Handler extends MicronautRequestHandler<Map<String, Object>, ApiGatewayResponse> {


	@Override
	public ApiGatewayResponse execute(Map<String, Object> input) {
		Response responseBody = new Response("Hello, the current time is " + new Date());
		Map<String, String> headers = new HashMap<>();
		headers.put("X-Powered-By", "AWS Lambda & Serverless");
		headers.put("Content-Type", "application/json");
		return ApiGatewayResponse.builder()
				.setStatusCode(200)
				.setObjectBody(responseBody)
				.setHeaders(headers)
				.build();
	}
}
