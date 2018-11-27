package xzjia.jsugspringcloudstream.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.Value;

@Value
@ToString
public class Apple {
    private String color;
    private int size;

    @JsonCreator
    public Apple(@JsonProperty("color") String color, @JsonProperty("size") int size) {
        this.color = color;
        this.size = size;
    }

}
