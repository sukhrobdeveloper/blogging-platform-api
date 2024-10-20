package misu.dev.blogging_platform_api.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TagReqDTO {

    @NotNull(message = "Please enter the name of tag!")
    private String name;

}
