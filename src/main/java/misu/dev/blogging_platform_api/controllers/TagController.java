package misu.dev.blogging_platform_api.controllers;

import misu.dev.blogging_platform_api.payload.TagReqDTO;
import misu.dev.blogging_platform_api.payload.TagResDTO;
import misu.dev.blogging_platform_api.utils.AppConstant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping(AppConstant.TAG_CONTROLLER)
public interface TagController {

    @GetMapping(AppConstant.GET)
    ResponseEntity<List<TagResDTO>> get();

    @GetMapping(AppConstant.GET + "/{id}")
    ResponseEntity<TagResDTO> getOne(@PathVariable(name = "id") UUID id);

    @PostMapping(AppConstant.ADD)
    ResponseEntity<TagResDTO> add(@RequestBody TagReqDTO tagReqDTO);

    @PutMapping(AppConstant.UPDATE + "/{id}")
    ResponseEntity<TagResDTO> update(@PathVariable(name = "id") UUID id,
                                     @RequestBody TagReqDTO tagReqDTO);

    @DeleteMapping(AppConstant.DELETE + "/{id}")
    ResponseEntity<?> delete(@PathVariable(name = "id") UUID id);

}
