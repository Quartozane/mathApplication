package math.app.version1.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "Polecenia")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Tasks implements Serializable {
    @Id
    @Field("_id")
    @NotNull(message = "id is cannot be null")
    private ObjectId id;
    @Field("nazwaDzialu")
    @NotNull(message = "departmentName is cannot be null")
    private String departmentName;
    @Field("tresc")
    @NotNull(message = "stuff is cannot be null")
    private String stuff;
    @Field("poziom")
    @NotNull(message = "level is cannot be null")
    private String level;
    @Field("poprawnaOdpowiedz")
    @NotNull(message = "correctAnswer is cannot be null")
    private String correctAnswer;
    @Field("dataDodania")
    @NotNull(message = "dateAdd is cannot be null")
    private LocalDateTime dateAdd;
    @Field("odpowiedziId")
    @NotNull(message = "answerId is cannot be null")
    private List<ObjectId> answerId;
    @Field("podpowiedzi")
    @NotNull(message = "hints is cannot be null")
    private List<ObjectId> hints;
}
