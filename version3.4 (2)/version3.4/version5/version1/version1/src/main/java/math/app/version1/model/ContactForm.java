package math.app.version1.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ContactForm {

    private String name;
    private String surname;
    private String type;
    private String message;

}
