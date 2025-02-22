package misu.dev.blogging_platform_api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tags")
public class Tag {

    @Id
    private UUID id;

    @Indexed(unique = true)
    private String name;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    public Tag(UUID id) {
        this.id = id;
    }
    
}
