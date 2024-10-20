package misu.dev.blogging_platform_api.controllers;

import misu.dev.blogging_platform_api.payload.TagReqDTO;
import misu.dev.blogging_platform_api.payload.TagResDTO;
import misu.dev.blogging_platform_api.services.TagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class TagControllerImpl implements TagController {

    private final TagService tagService;

    public TagControllerImpl(TagService tagService) {
        this.tagService = tagService;
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
