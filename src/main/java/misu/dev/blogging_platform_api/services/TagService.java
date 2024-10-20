package misu.dev.blogging_platform_api.services;

import misu.dev.blogging_platform_api.payload.TagReqDTO;
import misu.dev.blogging_platform_api.payload.TagResDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface TagService {

    ResponseEntity<List<TagResDTO>> get();

    ResponseEntity<TagResDTO> getOne(UUID id);

    ResponseEntity<TagResDTO> add(TagReqDTO tagReqDTO);

    ResponseEntity<TagResDTO> update(UUID id, TagReqDTO tagReqDTO);

    ResponseEntity<?> delete(UUID id);

}
