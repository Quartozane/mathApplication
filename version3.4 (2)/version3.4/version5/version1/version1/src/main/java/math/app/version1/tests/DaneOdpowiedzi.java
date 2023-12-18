/*package math.app.version1;

import jakarta.annotation.PostConstruct;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DaneOdpowiedzi {
    @Autowired
    private OdpowiedziRepozytorium odpowiedziRepozytorium;
    @Autowired
    private DzialRepozytorium dzialRepozytorium;
    @Autowired
    private PolecenieRepozytorium polecenieRepozytorium;
    ObjectId objectId = new ObjectId("60aebcd18b1d701c78fb9a9f");
    ObjectId objectId_1 = new ObjectId("64220d2f3c0fce4cd8cf2623");
    ObjectId objectId_2 = new ObjectId("64220d473c0fce47b834b9e6");
    ObjectId objectId_3 = new ObjectId("64220d503c0fce2a88d6d495");
    ObjectId objectId_4 = new ObjectId("64220d5b3c0fce4454f0e913");
    ObjectId objectId_5 = new ObjectId("64220d683c0fce56505792ad");
    ObjectId objectId_6 = new ObjectId("64220d713c0fce5b7c986349");
    ObjectId objectId_7 = new ObjectId("64220d7e3c0fce3794f5d1da");
    ObjectId objectId_8 = new ObjectId("64220d8c3c0fce50281a3b0a");
    ObjectId objectId_9 = new ObjectId("64220d993c0fce4bb4a3e832");
    ObjectId objectId_10 = new ObjectId("64220dba3c0fce07e00377a1");
    ObjectId objectId_11 = new ObjectId("64220dc63c0fce22f4815427");
    ObjectId objectId12 = new ObjectId("642ef53f43ed9e48334bad01");
    ObjectId objectId13 = new ObjectId("642ef53f43ed9e48334bad02");
    ObjectId objectId14 = new ObjectId("642ef53f43ed9e48334bad00");
    ObjectId objectId15 = new ObjectId("642ef53f43ed9e48334bad10");
    ObjectId objectId16 = new ObjectId("642ef53f43ed9e48334bad40");
    ObjectId objectId17 = new ObjectId("642ef53f43ed9e48334bad30");
    ObjectId objectId18 = new ObjectId("642af53f43ed9e48334bad40");
    ObjectId objectId19 = new ObjectId("642bf53f43ed9e48334bad30");
    ObjectId objectId20 = new ObjectId("642cf53f43ed9e48334bad40");
    ObjectId objectId21 = new ObjectId("642df53f43ed9e48334bad30");
    ObjectId objectId22 = new ObjectId("642af53f43ed9b48334bad30");
    ObjectId objectId23 = new ObjectId("642bf53f43ed9a48334bad50");
    ObjectId objectId24 = new ObjectId("643906cbe79bce41c6c46b9f");
    ObjectId objectId25 = new ObjectId("64390701ad79ba54be56edf2");
    ObjectId objectId26 = new ObjectId("643ce7ca07d750ce20526195");
    ObjectId objectId27 = new ObjectId("643ce1e45836b2290555ba3a");
    ObjectId objectId28 = new ObjectId("643ce1ee78c9d37b5e3859d8");
    ObjectId objectId29 = new ObjectId("643ce1f8e39b43c769e6fd40");
    @PostConstruct
    public void init() {
        Odpowiedzi odpowiedzA = new Odpowiedzi();
        odpowiedzA.setId(objectId);
        odpowiedzA.setTresc("26000");
        odpowiedzA.setIndexOdpowiedzi("A");

        Odpowiedzi odpowiedzB = new Odpowiedzi();
        odpowiedzB.setId(objectId_1);
        odpowiedzB.setTresc("26600");
        odpowiedzB.setIndexOdpowiedzi("B");

        Odpowiedzi odpowiedzC = new Odpowiedzi();
        odpowiedzC.setId(objectId_2);
        odpowiedzC.setTresc("27000");
        odpowiedzC.setIndexOdpowiedzi("C");

        Odpowiedzi odpowiedzD = new Odpowiedzi();
        odpowiedzD.setId(objectId_3);
        odpowiedzD.setTresc("30000");
        odpowiedzD.setIndexOdpowiedzi("D");

        Odpowiedzi odpowiedzA_quest1 = new Odpowiedzi();
        odpowiedzA_quest1.setId(objectId_4);
        odpowiedzA_quest1.setTresc("1300");
        odpowiedzA_quest1.setIndexOdpowiedzi("A");

        Odpowiedzi odpowiedzB_quest1 = new Odpowiedzi();
        odpowiedzB_quest1.setId(objectId_5);
        odpowiedzB_quest1.setTresc("1500");
        odpowiedzB_quest1.setIndexOdpowiedzi("B");

        Odpowiedzi odpowiedzC_quest1 = new Odpowiedzi();
        odpowiedzC_quest1.setId(objectId_6);
        odpowiedzC_quest1.setTresc("1000");
        odpowiedzC_quest1.setIndexOdpowiedzi("C");

        Odpowiedzi odpowiedzD_quest1 = new Odpowiedzi();
        odpowiedzD_quest1.setId(objectId_7);
        odpowiedzD_quest1.setTresc("2000");
        odpowiedzD_quest1.setIndexOdpowiedzi("D");


        Odpowiedzi odpowiedzA_quest2 = new Odpowiedzi();
        odpowiedzA_quest2.setId(objectId_8);
        odpowiedzA_quest2.setTresc("35600");
        odpowiedzA_quest2.setIndexOdpowiedzi("A");

        Odpowiedzi odpowiedzB_quest2 = new Odpowiedzi();
        odpowiedzB_quest2.setId(objectId_9);
        odpowiedzB_quest2.setTresc("40000");
        odpowiedzB_quest2.setIndexOdpowiedzi("B");

        Odpowiedzi odpowiedzC_quest2 = new Odpowiedzi();
        odpowiedzC_quest2.setId(objectId_10);
        odpowiedzC_quest2.setTresc("30000");
        odpowiedzC_quest2.setIndexOdpowiedzi("C");

        Odpowiedzi odpowiedzD_quest2 = new Odpowiedzi();
        odpowiedzD_quest2.setId(objectId_11);
        odpowiedzD_quest2.setTresc("35700");
        odpowiedzD_quest2.setIndexOdpowiedzi("D");

        Odpowiedzi odpowiedzi_quest4_yes = new Odpowiedzi();
        odpowiedzi_quest4_yes.setId(objectId12);
        odpowiedzi_quest4_yes.setTresc("Tak jest podzielne przez 3");
        odpowiedzi_quest4_yes.setIndexOdpowiedzi("A");

        Odpowiedzi odpowiedzi_quest4_no = new Odpowiedzi();
        odpowiedzi_quest4_no.setId(objectId13);
        odpowiedzi_quest4_no.setTresc("Nie, nie jest podzielne przez 3");
        odpowiedzi_quest4_no.setIndexOdpowiedzi("B");

        Odpowiedzi odpowiedzi_quest5_yes = new Odpowiedzi();
        odpowiedzi_quest5_yes.setId(objectId14);
        odpowiedzi_quest5_yes.setTresc("Tak jest podzielna przez 9");
        odpowiedzi_quest5_yes.setIndexOdpowiedzi("A");

        Odpowiedzi odpowiedzi_quest5_no = new Odpowiedzi();
        odpowiedzi_quest5_no.setId(objectId15);
        odpowiedzi_quest5_no.setTresc("Nie, nie jest podzielna przez 9");
        odpowiedzi_quest5_no.setIndexOdpowiedzi("B");

        Odpowiedzi odpowiedzi_quest6_yes = new Odpowiedzi();
        odpowiedzi_quest6_yes.setId(objectId16);
        odpowiedzi_quest6_yes.setTresc("Tak jest podzielna przez 3");
        odpowiedzi_quest6_yes.setIndexOdpowiedzi("A");

        Odpowiedzi odpowiedzi_quest6_no = new Odpowiedzi();
        odpowiedzi_quest6_no.setId(objectId17);
        odpowiedzi_quest6_no.setTresc("Nie, nie jest podzielna przez 3");
        odpowiedzi_quest6_no.setIndexOdpowiedzi("B");

        Odpowiedzi odpowiedzi_zad7_A = new Odpowiedzi();
        odpowiedzi_zad7_A.setId(objectId18);
        odpowiedzi_zad7_A.setTresc("Tak jest podzielna przez 3 a liczba zaogrąglona to 23400");
        odpowiedzi_zad7_A.setIndexOdpowiedzi("A");

        Odpowiedzi odpowiedzi_zad7_B = new Odpowiedzi();
        odpowiedzi_zad7_B.setId(objectId19);
        odpowiedzi_zad7_B.setTresc("Nie, nie jest podzielna przez 3 a liczba zaokrąglona to 23400");
        odpowiedzi_zad7_B.setIndexOdpowiedzi("B");

        Odpowiedzi odpowiedzi_zad7_C = new Odpowiedzi();
        odpowiedzi_zad7_C.setId(objectId20);
        odpowiedzi_zad7_C.setTresc("Nie, nie jest podzielna przez 3 a liczba zaokrąglona to 23500");
        odpowiedzi_zad7_C.setIndexOdpowiedzi("C");

        Odpowiedzi odpowiedzi_zad7_D = new Odpowiedzi();
        odpowiedzi_zad7_D.setId(objectId21);
        odpowiedzi_zad7_D.setTresc("Tak jest podzielna przez 3 a liczba zaokrąglona to 23500");
        odpowiedzi_zad7_D.setIndexOdpowiedzi("D");

        Odpowiedzi odpowiedzi_zad8_A = new Odpowiedzi();
        odpowiedzi_zad8_A.setId(objectId22);
        odpowiedzi_zad8_A.setTresc("4/5");
        odpowiedzi_zad8_A.setIndexOdpowiedzi("A");

        Odpowiedzi odpowiedzi_zad8_B = new Odpowiedzi();
        odpowiedzi_zad8_B.setId(objectId23);
        odpowiedzi_zad8_B.setTresc("10/13");
        odpowiedzi_zad8_B.setIndexOdpowiedzi("B");

        Odpowiedzi odpowiedzi_zad8_C = new Odpowiedzi();
        odpowiedzi_zad8_C.setId(objectId24);
        odpowiedzi_zad8_C.setTresc("12/15");
        odpowiedzi_zad8_C.setIndexOdpowiedzi("C");

        Odpowiedzi odpowiedzi_zad8_D = new Odpowiedzi();
        odpowiedzi_zad8_D.setId(objectId25);
        odpowiedzi_zad8_D.setTresc("8/9");
        odpowiedzi_zad8_D.setIndexOdpowiedzi("D");

        Odpowiedzi odpowiedzi_zad9_A = new Odpowiedzi();
        odpowiedzi_zad9_A.setId(objectId26);
        odpowiedzi_zad9_A.setTresc("1,2,3");
        odpowiedzi_zad9_A.setIndexOdpowiedzi("A");

        Odpowiedzi odpowiedzi_zad9_B = new Odpowiedzi();
        odpowiedzi_zad9_B.setId(objectId27);
        odpowiedzi_zad9_B.setTresc("2,3,4");
        odpowiedzi_zad9_B.setIndexOdpowiedzi("B");

        Odpowiedzi odpowiedzi_zad9_C = new Odpowiedzi();
        odpowiedzi_zad9_C.setId(objectId28);
        odpowiedzi_zad9_C.setTresc("4,5,6");
        odpowiedzi_zad9_C.setIndexOdpowiedzi("C");

        Odpowiedzi odpowiedzi_zad9_D = new Odpowiedzi();
        odpowiedzi_zad9_D.setId(objectId29);
        odpowiedzi_zad9_D.setTresc("6,7,8");
        odpowiedzi_zad9_D.setIndexOdpowiedzi("D");




        List<Odpowiedzi> OdpowiedziList = List.of(odpowiedzA, odpowiedzB, odpowiedzC, odpowiedzD, odpowiedzA_quest1, odpowiedzB_quest1, odpowiedzC_quest1, odpowiedzD_quest1, odpowiedzA_quest2, odpowiedzB_quest2, odpowiedzC_quest2, odpowiedzD_quest2, odpowiedzi_quest4_yes, odpowiedzi_quest4_no, odpowiedzi_quest5_no, odpowiedzi_quest5_yes,odpowiedzi_quest6_yes,odpowiedzi_quest6_no,odpowiedzi_zad7_A,odpowiedzi_zad7_B,odpowiedzi_zad7_C,odpowiedzi_zad7_D,odpowiedzi_zad8_A,odpowiedzi_zad8_B,odpowiedzi_zad8_C,odpowiedzi_zad8_D,odpowiedzi_zad9_A,odpowiedzi_zad9_B,odpowiedzi_zad9_C,odpowiedzi_zad9_D);
        for (Odpowiedzi odpowiedzi : OdpowiedziList) {
            saveIfNotExistsOne(odpowiedzi);
        }
    }

    public void saveIfNotExistsOne(@NotNull Odpowiedzi odpowiedzi) {
        ObjectId id = odpowiedzi.getId();
        if (!odpowiedziRepozytorium.existsById(id)) {
               odpowiedziRepozytorium.save(odpowiedzi);
        }
    }
}
*/

