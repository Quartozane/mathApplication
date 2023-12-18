package math.app.version1.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "podpowiedzi")
public class Hints {

    @Id
    @Field("_id")
    @NotNull(message = "id is cannot be null")
    private ObjectId id;
    @Field("tresc")
    @NotNull(message = "stuff is cannot be null")
    private String stuff;
}
