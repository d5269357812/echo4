package linebot;

import com.amazonaws.services.lambda.runtime.Context;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.ReplyMessage;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.response.GetMessageEventResponse;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Introspected
public class Handler extends MicronautRequestHandler<Map<String, Object>, ApiGatewayResponse> {

	public void handleTextMessageEvent(MessageEvent<TextMessageContent> event) throws IOException {
//		log.info("Got text event: {}", event);
//		handleTextContent(event.getReplyToken(), event, event.getMessage());

	}

	@Override
	public ApiGatewayResponse execute(Map<String, Object> input) {
//		LineMessagingClient client = LineMessagingClient.builder("jpkaZF4J41V3hTOT7kinpR16tTormHg0pKDpr5UJX6sOyeIETiHnXOYveDupNa6Zk6KKE1B+zZSiKQJ8qSrGVCeDD2EEsRzXeOEImKtQfrU1UjvLysgAvcRoGpMVos79emD+gZT3uJvF1O2pLJIQkgdB04t89/1O/w1cDnyilFU=").build();
//		Message msg = new ;
//		ReplyMessage msg = new ReplyMessage(event.getReplyToken(),msg);

//		client.replyMessage();
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
