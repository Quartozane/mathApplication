/* package math.app.version1;

import jakarta.annotation.PostConstruct;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class DanePoziom {
    @Autowired
    private PoziomRepozytorium poziomRepozytorium;
    @Autowired
    private PolecenieRepozytorium polecenieRepozytorium;
    ObjectId objectId_latwy = new ObjectId("642dce3aee266907e571344f");
    ObjectId objectId_sredni = new ObjectId("642dce3bee266907e5713450");
    ObjectId objectId_trudny = new ObjectId("642dce3bee266907e5713451");
    @PostConstruct
    public void init()
    {
        Poziom latwy = new Poziom();
        latwy.setPoziom("Łatwy");
        latwy.setId(objectId_latwy);
        List<Polecenie> polecenia = polecenieRepozytorium.findByPoziom("Łatwy");
        latwy.setPolecenie(polecenia);

        Poziom sredni = new Poziom();
        sredni.setPoziom("Średni");
        sredni.setId(objectId_sredni);
        List<Polecenie> poleceniav1 = polecenieRepozytorium.findByPoziom("Średni");
        sredni.setPolecenie(poleceniav1);

        Poziom trudny = new Poziom();
        trudny.setPoziom("Trudny");
        trudny.setId(objectId_trudny);
        List<Polecenie> poleceniav2 = polecenieRepozytorium.findByPoziom("Trudny");
        trudny.setPolecenie(poleceniav2);

        List<Poziom> PoziomList = List.of(latwy, sredni, trudny);
        for(Poziom poziom: PoziomList)
        {
            saveIfNotExists(poziom);
        }

    }
    public void saveIfNotExists(@NotNull Poziom poziom) {
        if (poziom.getId() == null) {
            poziomRepozytorium.save(poziom);
        } else {
            Optional<Poziom> existingPoziom = poziomRepozytorium.findById(poziom.getId());
            if (existingPoziom.isEmpty()) {
                poziomRepozytorium.save(poziom);
            }
        }
    }
}
*/

