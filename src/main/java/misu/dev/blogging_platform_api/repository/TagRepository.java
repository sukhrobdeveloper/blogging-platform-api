package misu.dev.blogging_platform_api.repository;

import misu.dev.blogging_platform_api.entities.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface TagRepository extends MongoRepository<Tag, UUID> {
}
