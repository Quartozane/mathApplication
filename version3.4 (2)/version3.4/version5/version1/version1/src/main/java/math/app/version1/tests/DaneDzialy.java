/*package math.app.version1;


import jakarta.annotation.PostConstruct;
import math.app.version1.model.Dzial;
import math.app.version1.repository.DzialRepozytorium;
import math.app.version1.repository.PolecenieRepozytorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DaneDzialy {

    @Autowired
    private PolecenieRepozytorium polecenieRepozytorium;

    @Autowired
    private DzialRepozytorium dzialRepozytorium;

    @PostConstruct
    public void init() {


        Dzial dzial_1 = new Dzial();
        dzial_1.setNazwaDzialu("Cyfry, podzielność i zaokrąglanie liczb");

        Dzial dzial_2 = new Dzial();
        dzial_2.setNazwaDzialu("Sprzedaż, ceny, rabaty, zniżki");

        Dzial dzial_3 = new Dzial();
        dzial_3.setNazwaDzialu("Procenty");

        Dzial dzial_4 = new Dzial();
        dzial_4.setNazwaDzialu("Podział proporcjonalny");

        Dzial dzial_5 = new Dzial();
        dzial_5.setNazwaDzialu("Odczytywanie danych z tabel, wykresów, diagramów");

        Dzial dzial_6 = new Dzial();
        dzial_6.setNazwaDzialu("Średnia Arytmetyczna");

        Dzial dzial_7 = new Dzial();
        dzial_7.setNazwaDzialu("Działania na ułamkach");

        Dzial dzial_8 = new Dzial();
        dzial_8.setNazwaDzialu("Potęgi");

        Dzial dzial_9 = new Dzial();
        dzial_9.setNazwaDzialu("Pierwiastki");

        Dzial dzial_10 = new Dzial();
        dzial_10.setNazwaDzialu("Wyrażenia algebraiczne");

        Dzial dzial_11 = new Dzial();
        dzial_11.setNazwaDzialu("Wyrażenia algebraiczne na rysunkach ");

        Dzial dzial_12 = new Dzial();
        dzial_12.setNazwaDzialu("Oblicz wyrażenia");

        Dzial dzial_13 = new Dzial();
        dzial_13.setNazwaDzialu("Zadania tekstowe");

        Dzial dzial_14 = new Dzial();
        dzial_14.setNazwaDzialu("Kąty w figurach");

        Dzial dzial_15 = new Dzial();
        dzial_15.setNazwaDzialu("Długości w figurach");

        Dzial dzial_16 = new Dzial();
        dzial_16.setNazwaDzialu("Obwody figur");

        Dzial dzial_17 = new Dzial();
        dzial_17.setNazwaDzialu("Pola Figur");

        Dzial dzial_18 = new Dzial();
        dzial_18.setNazwaDzialu("Oś liczbowa");

        Dzial dzial_19 = new Dzial();
        dzial_19.setNazwaDzialu("Układ współrzędnych");

        Dzial dzial_20 = new Dzial();
        dzial_20.setNazwaDzialu("Udowodnij, uzasadnij");

        Dzial dzial_21 = new Dzial();
        dzial_21.setNazwaDzialu("Sześcian, prostopadłościan");

        Dzial dzial_22 = new Dzial();
        dzial_22.setNazwaDzialu("Graniastosłup, ostrosłup");

        List<Dzial> dzialList = List.of(dzial_1, dzial_2, dzial_3, dzial_4, dzial_5, dzial_6, dzial_7, dzial_8, dzial_9, dzial_10, dzial_11, dzial_12, dzial_13, dzial_14, dzial_15, dzial_16, dzial_17, dzial_18, dzial_19, dzial_20, dzial_21, dzial_22);

        for(Dzial dzial : dzialList)
        {
            if (!dzialRepozytorium.existsByNazwaDzialu(dzial.getNazwaDzialu()))
            {
                dzialRepozytorium.save(dzial);
            }
        }

    }
}

 */