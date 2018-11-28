package xzjia.jsugspringcloudstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import xzjia.jsugspringcloudstream.model.Apple;

@SpringBootApplication
@EnableBinding(Source.class)
@RequestMapping("/apple")
public class JsugSpringCloudStreamSourceApplication {

    @Autowired
    private Source source;

    public static void main(String[] args) {
        SpringApplication.run(JsugSpringCloudStreamSourceApplication.class, args);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendToUpStream(@RequestBody Apple apple) {
        this.source.output().send(MessageBuilder.withPayload(apple)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
