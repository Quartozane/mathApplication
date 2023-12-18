package math.app.version1.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Document(collection = "Uzytkownicy")
@Data
@Getter
@Setter
@Builder
public class User implements Serializable {

    @Id
    @Field("_id")
    @NotNull(message = "id is cannot be null")
    private ObjectId id;
    @Field("imie")
    @NotNull(message = "name is cannot be null")
    private String firstName;
    @Field("nazwisko")
    @NotNull(message = "surname is cannot be null")
    private String lastName;
    @Field("email")
    @NotNull(message = "mail is cannot be null")
    private String mail;
    @Field("haslo")
    @NotNull(message = "password is cannot be null")
    private String password;
    @Field("ukonczone_zadania")
    @NotNull(message = "numberCompleteTasks is cannot be null")
    private int numberCompleteTasks;
    @Field("ukonczone_dzialy")
    @NotNull(message = "numberOfCompleteDepartment is cannot be null")
    private int numberOfCompleteDepartment;
}
