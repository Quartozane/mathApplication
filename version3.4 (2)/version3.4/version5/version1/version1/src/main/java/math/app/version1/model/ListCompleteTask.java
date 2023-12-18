package math.app.version1.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;

@Document(collection = "ListaUkonczonychZadan")
@Data
@Getter
@Setter
@Builder
public class ListCompleteTask {

    @Id
    @Field("_id")
    @NotNull(message = "id is cannot be null")
    private ObjectId id;
    @Field("listaUkonczonychDzialow")
    @NotNull(message = "listOfCompleteDepartment is cannot be null")
    private List<String> nameOfCompleteDepartment;
    @Field("idUzytkownika")
    @NotNull(message = "userId is cannot be null")
    private ObjectId userId;

}
