package misu.dev.blogging_platform_api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tags")
public class Tag {

    @Id
    private UUID id;

    private String name;

    public Tag(UUID id) {
        this.id = id;
    }
    
}
