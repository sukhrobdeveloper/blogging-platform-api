package misu.dev.blogging_platform_api.services;

import misu.dev.blogging_platform_api.payload.TagReqDTO;
import misu.dev.blogging_platform_api.payload.TagResDTO;
import misu.dev.blogging_platform_api.repository.TagRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    public TagServiceImpl(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public ResponseEntity<List<TagResDTO>> get() {
        return null;
    }

    @Override
    public ResponseEntity<TagResDTO> getOne(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<TagResDTO> add(TagReqDTO tagReqDTO) {
        return null;
    }

    @Override
    public ResponseEntity<TagResDTO> update(UUID id, TagReqDTO tagReqDTO) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(UUID id) {
        return null;
    }

}
