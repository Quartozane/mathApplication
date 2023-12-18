package math.app.version1.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;

@Document(collection = "Odpowiedzi")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Answers {
    @Id
    @Field("_id")
    @NotNull(message = "id is cannot be null")
    private ObjectId id;
    @Field("tresc")
    @NotNull(message = "stuff cannot be null")
    private String stuff;
    @Field("indexOdpowiedzi")
    @NotNull(message = "indexAnswers cannot be null")
    private String indexAnswers;
}
