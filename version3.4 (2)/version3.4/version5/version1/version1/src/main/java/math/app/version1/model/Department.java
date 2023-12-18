package math.app.version1.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Document(collection = "Dzialy")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Department {
    @Id
    @Field("_id")
    @NotNull(message = "id is cannot be null")
    private ObjectId id;
    @Field("nazwaDzialu")
    @NotNull(message = "nameOfDepartment cannot be null")
    private String nameOfDepartment;

    @Field("poziom")
    @NotNull(message = "level cannot be null")
    private String level;
}

