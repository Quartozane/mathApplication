/* package math.app.version1;

import jakarta.annotation.PostConstruct;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaneUzytkownik {
    @Autowired
    private UzytkownikRepozytorium uzytkownikRepozytorium;
    ObjectId objectId_1 = new ObjectId("6457da403af873d12de7f441");
    ObjectId objectId_2 = new ObjectId("6457db1c31b057cace542934");
    ObjectId objectId_3 = new ObjectId("6457db3158f887484426b6e2");
    ObjectId objectId_4 = new ObjectId("6457db4de03e6e431217029f");
    ObjectId objectId_5 = new ObjectId("6457dc70999998f842cd6a42");
    @PostConstruct
    public void init()
    {
        Uzytkownik marcin = new Uzytkownik();
        marcin.setImie("Marcin");
        marcin.setNazwisko("Zarzecki");
        marcin.setEmail("m.zarz@wp.pl");
        marcin.setHaslo("Password123");
        marcin.setId(objectId_1);
        marcin.setUkonczone_dzialy(0);
        marcin.setUkonczone_zadania(0);

        Uzytkownik pawel = new Uzytkownik();
        pawel.setImie("Paweł");
        pawel.setNazwisko("Traczewski");
        pawel.setEmail("p.tracz@wp.pl");
        pawel.setHaslo("Password123");
        pawel.setId(objectId_2);
        pawel.setUkonczone_dzialy(0);
        pawel.setUkonczone_zadania(0);

        Uzytkownik karol = new Uzytkownik();
        karol.setImie("Karol");
        karol.setNazwisko("Krakowiak");
        karol.setEmail("k.krakowiak@wp.pl");
        karol.setHaslo("Password123");
        karol.setId(objectId_3);
        karol.setUkonczone_zadania(0);
        karol.setUkonczone_dzialy(0);

        List<Uzytkownik> UzytkownikList = List.of(karol,marcin,pawel);
        for(Uzytkownik uzytkownik : UzytkownikList)
        {
            saveIfNotExistsOne(uzytkownik);
        }



    }
    public void saveIfNotExistsOne(@NotNull Uzytkownik uzytkownik) {
        ObjectId id = uzytkownik.getId();
        if (!uzytkownikRepozytorium.existsById(id)) {
            uzytkownikRepozytorium.save(uzytkownik);
        }
    }

}

 */
