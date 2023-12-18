/*package math.app.version1;

import jakarta.annotation.PostConstruct;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PodpowiedziDane {
    ObjectId objectId_1 = new ObjectId("642ef53f43ed9e48334bad06");
    ObjectId objectId_2 = new ObjectId("642ef53f43ed9e48334bad07");
    ObjectId objectId_3 = new ObjectId("642ef53f43ed9e48334bad04");
    ObjectId objectId_4 = new ObjectId("642ef54043ed9e48334bad05");
    ObjectId objectId_5 = new ObjectId("642ef54043ed9e48334bad02");
    ObjectId objectId_6 = new ObjectId("642ef54043ed9e48334bad20");
    ObjectId objectId_7 = new ObjectId("642ef32043ed9e48334bad20");
    ObjectId objectId_8 = new ObjectId("642fe12043ed9e48334bad20");
    ObjectId objectId_9 = new ObjectId("643ce0d09c4dab42ec0c3880");
    @Autowired
    private DzialRepozytorium dzialRepozytorium;
    @Autowired
    private PolecenieRepozytorium polecenieRepozytorium;
    @Autowired
    private PodpowiedziRepozytorium podpowiedziRepozytorium;

    @PostConstruct
    public void init() {
        Podpowiedzi podpowiedzZad1 = new Podpowiedzi();
        podpowiedzZad1.setId(objectId_1);
        podpowiedzZad1.setTresc("Skoro liczbę, musisz zaokrąglić do tysięcy musisz pomyśleć, jak zapisać liczbę, tak by liczba była pełną liczbą tysięcy. Pamiętaj , że w przypadku tysięcy od 500 zaokrąglasz w górę! ");

        Podpowiedzi podpowiedzZad2 = new Podpowiedzi();
        podpowiedzZad2.setId(objectId_2);
        podpowiedzZad2.setTresc("Liczbę zaokrąglasz do setek. Pomyśl gdzie masz części setne swojej liczby a następnie zaokrąglij. Pamiętaj, że od 50 zaokrąglasz w górę! ");

        Podpowiedzi podpowiedzZad3 = new Podpowiedzi();
        podpowiedzZad3.setId(objectId_3);
        podpowiedzZad3.setTresc("Liczbę zaokrąglasz do setek. Pomyśl gdzie masz części setne swojej liczby a następnie zaokrąglij. Pamiętaj, że od 50 zaokrąglasz w górę!!");

        Podpowiedzi podpowiedzZad4 = new Podpowiedzi();
        podpowiedzZad4.setId(objectId_4);
        podpowiedzZad4.setTresc("Suma cyfr, z których składa się Twoja liczba musi być podzielna przez 3 ");

        Podpowiedzi podpowiedziZad5 = new Podpowiedzi();
        podpowiedziZad5.setId(objectId_5);
        podpowiedziZad5.setTresc("Podziel pisemnie 4009 przez 9 w celu sprawdzenia czy działanie zostawia resztę z dzielenia czy nie. Jeśli działanie ma resztę z dzielenia naturalnie nie możemy uznać tej liczby za podzielną przez 9. Jeśli reszta z dzielenia wynosi 0 to liczba jest podzielna");

        Podpowiedzi podpowiedziZad6 =new Podpowiedzi();
        podpowiedziZad6.setId(objectId_6);
        podpowiedziZad6.setTresc("Liczba jest podzielna przez 3 jeśli suma cyfr, z których sie składa jest podzielna przez 3");

        Podpowiedzi podpowiedziZad7 = new Podpowiedzi();
        podpowiedziZad7.setId(objectId_7);
        podpowiedziZad7.setTresc(" Od 50 liczba >  |  podzielność przez 3 sprawdzasz na przykładzie : 1+2+3 = 6");

        Podpowiedzi podpowiedziZad8 = new Podpowiedzi();
        podpowiedziZad8.setId(objectId_8);
        podpowiedziZad8.setTresc("Użyj kalkulatora");

        Podpowiedzi podpowiedziZad9 = new Podpowiedzi();
        podpowiedziZad9.setId(objectId_9);
        podpowiedziZad9.setTresc("Podstaw podpowiedzi pod treść");

        List<Podpowiedzi> PodpowiedziList = List.of(podpowiedzZad1, podpowiedzZad2, podpowiedzZad3, podpowiedzZad4, podpowiedziZad5,podpowiedziZad6,podpowiedziZad7,podpowiedziZad8, podpowiedziZad9);
        for (Podpowiedzi podpowiedzi : PodpowiedziList) {
            saveIfNotExists(podpowiedzi);
        }
    }

    public void saveIfNotExists(@NotNull Podpowiedzi podpowiedzi) {
        ObjectId id = podpowiedzi.getId();
        if (id == null || !podpowiedziRepozytorium.existsById(id)) {
            podpowiedziRepozytorium.save(podpowiedzi);
        }
    }
}
*/

