package misu.dev.blogging_platform_api.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "categories")
public class Category {

    @Id
    private UUID id;

    private String name;
    private String description;

    public Category(UUID id) {
        this.id = id;
    }

}
