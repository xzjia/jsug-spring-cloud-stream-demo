package xzjia.jsugspringcloudstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class JsugSpringCloudStreamSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsugSpringCloudStreamSinkApplication.class, args);
	}

	@StreamListener(Sink.INPUT)
    public void sink(String value) {
        System.out.println("Received " + value);
    }

}
