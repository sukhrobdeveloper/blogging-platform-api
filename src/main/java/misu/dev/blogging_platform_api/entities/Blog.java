package misu.dev.blogging_platform_api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "blogs")
public class Blog {

    @Id
    private UUID id;

    @Indexed(unique = true)
    private String title;

    private String content;

    private UUID categoryId;

    private List<String> tags;

    private Timestamp createdAt;

    private Timestamp updatedAt;

}
