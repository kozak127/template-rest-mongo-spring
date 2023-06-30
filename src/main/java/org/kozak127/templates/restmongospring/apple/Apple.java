package org.kozak127.templates.restmongospring.apple;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "apples")
@Value
public class Apple {

    private String id;
    private String name;

    @Builder(toBuilder = true)
    public Apple(@JsonProperty("id") String id,
                 @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public static Apple fromDto(AppleDTO dto) {
        return Apple.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }
}
