package xzjia.jsugspringcloudstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.SendTo;
import xzjia.jsugspringcloudstream.model.Apple;

import java.util.function.Function;

@SpringBootApplication
@EnableBinding(Processor.class)
public class JsugSpringCloudStreamProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsugSpringCloudStreamProcessorApplication.class, args);
	}

//	@StreamListener(Processor.INPUT)
//    @SendTo(Processor.OUTPUT)
//    public String uppercase(Apple apple) {
//        System.out.println("Processing" + apple.toString());
//	    return apple.toString().toUpperCase();
//    }

    @Bean
    public Function<Apple, String> uppercase() {
	    return x -> x.toString().toUpperCase();
    }

    @Bean
    public Function<String, String> reverse() {
	    return x -> new StringBuilder(x).reverse().toString();
    }

}
