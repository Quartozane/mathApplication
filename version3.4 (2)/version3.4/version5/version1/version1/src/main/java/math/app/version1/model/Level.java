package math.app.version1.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Document(collection = "poziom")
public class Level {
    @Id
    @Field("_id")
    @NotNull(message = "id is cannot be null")
    private ObjectId id;
    @Field("poziom")
    @NotNull(message = "level is cannot be null")
    private String level;
    @DocumentReference
    @Field("polecenie")
    @NotNull(message = "task is cannot be null")
    private List<Tasks> task;
}
