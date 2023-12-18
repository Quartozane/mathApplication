/*package math.app.version1.tests;
import math.app.version1.model.Answers;
import math.app.version1.model.Hints;
import math.app.version1.model.Tasks;
import math.app.version1.repository.DepartmentRepository;
import math.app.version1.repository.HintsRepository;
import math.app.version1.repository.TasksRepository;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Component
public class DanePolecenie {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private TasksRepository tasksRepository;

    @Autowired
    private HintsRepository hintsRepository;
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
    ObjectId objectId_zad1 = new ObjectId("642dce37ee266907e571344c");
    ObjectId objectId_zad2 = new ObjectId("642dce37ee266907e571344d");
    ObjectId objectId_zad3 = new ObjectId("642dce38ee266907e571344e");
    ObjectId objectId_zad4 = new ObjectId("642dce38ee266907e571344f");
    ObjectId objectId12 = new ObjectId("642ef53f43ed9e48334bad01");
    ObjectId objectId13 = new ObjectId("642ef53f43ed9e48334bad02");
    ObjectId objectId_zad5 = new ObjectId("642dce38ee266907e571344a");
    ObjectId objectId14 = new ObjectId("642ef53f43ed9e48334bad00");
    ObjectId objectId15 = new ObjectId("642ef53f43ed9e48334bad10");
    ObjectId objectId_zad6 = new ObjectId("642dce38ee266907e571344b");
    ObjectId objectId16 = new ObjectId("642ef53f43ed9e48334bad40");
    ObjectId objectId17 = new ObjectId("642ef53f43ed9e48334bad30");
    ObjectId objectId_zad7 = new ObjectId("642dde38ee266907e571344b");
    ObjectId objectId18 = new ObjectId("642af53f43ed9e48334bad40");
    ObjectId objectId19 = new ObjectId("642bf53f43ed9e48334bad30");
    ObjectId objectId20 = new ObjectId("642cf53f43ed9e48334bad40");
    ObjectId objectId21 = new ObjectId("642df53f43ed9e48334bad30");
    ObjectId objectId_zad8 = new ObjectId("642dfe38ee264907e571344f");
    ObjectId objectId22 = new ObjectId("642af53f43ed9b48334bad30");
    ObjectId objectId23 = new ObjectId("642bf53f43ed9a48334bad50");
    ObjectId objectId24 = new ObjectId("643906cbe79bce41c6c46b9f");
    ObjectId objectId25 = new ObjectId("64390701ad79ba54be56edf2");
    ObjectId objectId_zad9 = new ObjectId("643cde8be117e71f0c8175ec");
    ObjectId objectId26 = new ObjectId("643ce7ca07d750ce20526195");
    ObjectId objectId27 = new ObjectId("643ce1e45836b2290555ba3a");
    ObjectId objectId28 = new ObjectId("643ce1ee78c9d37b5e3859d8");
    ObjectId objectId29 = new ObjectId("643ce1f8e39b43c769e6fd40");

    @PostConstruct
    public void init() {

        Tasks zad1 = new Tasks();
        zad1.setStuff("Zaokrąglij do tysięcy liczbę 26675");
        String poziomTrudnosci = "Łatwy";
        String encodedPoziomTrudnosci = Base64.getEncoder().encodeToString(poziomTrudnosci.getBytes());
        zad1.setLevel(encodedPoziomTrudnosci);
        zad1.setId(objectId_zad1);
        ObjectId podpowiedzId = new ObjectId("642ef53f43ed9e48334bad06");
        if (hintsRepository.existsById(podpowiedzId)) {
            Hints podpowiedz = hintsRepository.findById(podpowiedzId).orElse(null);
            if (podpowiedz != null) {
                podpowiedz.setId(podpowiedzId);
                zad1.setHints(List.of(podpowiedz));
            }
        }
        zad1.setDepartmentName("Cyfry, podzielność i zaokrąglanie liczb");
        zad1.setDateAdd(LocalDateTime.now());
        zad1.setCorrectAnswer("C");
        zad1.setAnswerId(new ArrayList<>(List.of(
                new Answers(objectId, "26000", "A"),
                new Answers(objectId_1, "26600", "B"),
                new Answers(objectId_2, "27000", "C"),
                new Answers(objectId_3, "30000", "D")
        )));
        Tasks zad2 = new Tasks();
        zad2.setStuff("Zaokrąglij do setek liczbę 1325");
        zad2.setLevel("Łatwy");
        zad2.setId(objectId_zad2);
        ObjectId podpowiedzId1 = new ObjectId("642ef53f43ed9e48334bad07");
        if (hintsRepository.existsById(podpowiedzId1)) {
            Hints podpowiedz1 = hintsRepository.findById(podpowiedzId1).orElse(null);
            if (podpowiedz1 != null) {
                podpowiedz1.setId(podpowiedzId1);
                zad2.setHints(List.of(podpowiedz1));
            }
        }
        zad2.setDepartmentName("Cyfry, podzielność i zaokrąglanie liczb");
        zad2.setDateAdd(LocalDateTime.now());
        zad2.setCorrectAnswer("A");
        zad2.setAnswerId(new ArrayList<>(List.of(
                new Answers(objectId_4, "1300", "A"),
                new Answers(objectId_5, "1500", "B"),
                new Answers(objectId_6, "1000", "C"),
                new Answers(objectId_7, "2000", "D")
        )));
        Tasks zad3 = new Tasks();
        zad3.setStuff("Zaokrąglij do setek liczbę 35675");
        zad3.setLevel("Łatwy");
        zad3.setId(objectId_zad3);
        ObjectId podpowiedzId2 = new ObjectId("642ef53f43ed9e48334bad04");
        if (hintsRepository.existsById(podpowiedzId2)) {
            Hints podpowiedz2 = hintsRepository.findById(podpowiedzId2).orElse(null);
            if (podpowiedz2 != null) {
                podpowiedz2.setId(podpowiedzId2);
                zad3.setHints(List.of(podpowiedz2));
            }
        }
        zad3.setDepartmentName("Cyfry, podzielność i zaokrąglanie liczb");
        zad3.setDateAdd(LocalDateTime.now());
        zad3.setCorrectAnswer("D");
        zad3.setAnswerId(new ArrayList<>(List.of(
                new Answers(objectId_8, "35600", "A"),
                new Answers(objectId_9, "40000", "B"),
                new Answers(objectId_10, "30000", "C"),
                new Answers(objectId_11, "35700", "D")
        )));
        Tasks zad4 = new Tasks();
        zad4.setDepartmentName("Cyfry, podzielność i zaokrąglanie liczb");
        zad4.setStuff("Sprawdź podzielność liczby 41532 przez 3");
        zad4.setLevel("Średni");
        zad4.setId(objectId_zad4);
        ObjectId podpowiedzId3 = new ObjectId("642ef54043ed9e48334bad05");
        if (hintsRepository.existsById(podpowiedzId3)) {
            Hints podpowiedz3 = hintsRepository.findById(podpowiedzId3).orElse(null);
            if (podpowiedz3 != null) {
                podpowiedz3.setId(podpowiedzId3);
                zad4.setHints(List.of(podpowiedz3));
            }
        }
        zad4.setDateAdd(LocalDateTime.now());
        zad4.setCorrectAnswer("A");
        zad4.setAnswerId(new ArrayList<>(List.of(
                new Answers(objectId12, "Tak jest podzielne przez 3", "A"),
                new Answers(objectId13, "Nie, nie jest podzielne przez 3", "B")
        )));
        Tasks zad5 = new Tasks();
        zad5.setDepartmentName("Cyfry, podzielność i zaokrąglanie liczb");
        zad5.setStuff("Czy liczba 4009 jest podzielna przez 9? ");
        zad5.setLevel("Średni");
        zad5.setId(objectId_zad5);
        ObjectId podpowiedziId4 = new ObjectId("642ef54043ed9e48334bad02");
        if(hintsRepository.existsById(podpowiedziId4))
        {
            Hints podpowiedz4 = hintsRepository.findById(podpowiedziId4).orElse(null);
            if(podpowiedz4 != null)
            {
                podpowiedz4.setId(podpowiedziId4);
                zad5.setHints(List.of(podpowiedz4));
            }
        }
        zad5.setDateAdd(LocalDateTime.now());
        zad5.setCorrectAnswer("B");
        zad5.setAnswerId(new ArrayList<>(List.of(
                new Answers(objectId14, "Tak jest podzielna przez 9", "A"),
                new Answers(objectId15, "Nie, nie jest podzielna przez 9","B")
        )));
        Tasks zad6 = new Tasks();
        zad6.setDepartmentName("Cyfry, podzielność i zaokrąglanie liczb");
        zad6.setStuff("Czy liczba 2600 jest podzielna przez 3? ");
        zad6.setLevel("Średni");
        zad6.setId(objectId_zad6);
        ObjectId podpowiedziId5 = new ObjectId("642ef54043ed9e48334bad20");
        if(hintsRepository.existsById(podpowiedziId5))
        {
            Hints podpowiedz6 = hintsRepository.findById(podpowiedziId5).orElse(null);
            if(podpowiedz6 != null)
            {
                podpowiedz6.setId(podpowiedziId5);
                zad6.setHints(List.of(podpowiedz6));
            }
        }
        zad6.setDateAdd(LocalDateTime.now());
        zad6.setCorrectAnswer("B");
        zad6.setAnswerId(new ArrayList<>(List.of(
                new Answers(objectId16, "Tak jest podzielna przez 3", "A"),
                new Answers(objectId17, "Nie, nie jest podzielna przez 3","B")
        )));
        Tasks zad7 = new Tasks();
        zad7.setDepartmentName("Cyfry, podzielność i zaokrąglanie liczb");
        zad7.setStuff("Czy liczba 23432 po zaokrągleniu do setek jest podzielna przez 3? Jak wygląda ta liczba po zaokrągleniu? ");
        zad7.setLevel("Trudny");
        zad7.setId(objectId_zad7);
        ObjectId podpowiedziId6 = new ObjectId("642ef32043ed9e48334bad20");
        if(hintsRepository.existsById(podpowiedziId6))
        {
            Hints podpowiedz7 = hintsRepository.findById(podpowiedziId6).orElse(null);
            if(podpowiedz7 != null)
            {
                podpowiedz7.setId(podpowiedziId6);
                zad7.setHints(List.of(podpowiedz7));
            }
        }
        zad7.setDateAdd(LocalDateTime.now());
        zad7.setCorrectAnswer("A");
        zad7.setAnswerId(new ArrayList<>(List.of(
                new Answers(objectId18, "Tak jest podzielna przez 3 a liczba zaogrąglona to 23400", "A"),
                new Answers(objectId19, "Nie, nie jest podzielna przez 3 a liczba zaokrąglona to 23400","B"),
                new Answers(objectId20, "Nie, nie jest podzielna przez 3 a liczba zaokrąglona to 23500","C"),
                new Answers(objectId21, "Tak jest podzielna przez 3 a liczba zaokrąglona to 23500","D")
        )));

        Tasks zad8 = new Tasks();
        zad8.setDepartmentName("Cyfry, podzielność i zaokrąglanie liczb");
        zad8.setStuff("Znajdź dwie liczby całkowite, jedna będzie licznikiem a druga mianownikiem Twojego ułamka, które jako ułamek będą reprezentować liczbę 0,(8) ");
        zad8.setLevel("Trudny");
        zad8.setId(objectId_zad8);
        ObjectId podpowiedziId7 = new ObjectId("642fe12043ed9e48334bad20");
        if(hintsRepository.existsById(podpowiedziId7))
        {
            Hints podpowiedz8 = hintsRepository.findById(podpowiedziId7).orElse(null);
            if(podpowiedz8 != null)
            {
                podpowiedz8.setId(podpowiedziId7);
                zad8.setHints(List.of(podpowiedz8));
            }
        }
        zad8.setDateAdd(LocalDateTime.now());
        zad8.setCorrectAnswer("D");
        zad8.setAnswerId(new ArrayList<>(List.of(
                new Answers(objectId22, "4/5", "A"),
                new Answers(objectId23, "10/13","B"),
                new Answers(objectId24, "12/15","C"),
                new Answers(objectId25, "8/9","D")
        )));
        Tasks zad9 = new Tasks();
        zad9.setDepartmentName("Cyfry, podzielność i zaokrąglanie liczb");
        zad9.setStuff("Znajdź 3 kolejne liczby całkowite, których suma dwóch pierwszych liczb podzielona przez trzecią liczbę daje wynik 3/2");
        zad9.setLevel("Trudny");
        zad9.setId(objectId_zad9);
        ObjectId podpowiedziId8 = new ObjectId("643ce0d09c4dab42ec0c3880");
        if(hintsRepository.existsById(podpowiedziId8))
        {
            Hints podpowiedz9 = hintsRepository.findById(podpowiedziId8).orElse(null);
            if(podpowiedz9 != null)
            {
                podpowiedz9.setId(podpowiedziId8);
                zad8.setHints(List.of(podpowiedz9));
            }
        }
        zad9.setDateAdd(LocalDateTime.now());
        zad9.setCorrectAnswer("C");
        zad9.setAnswerId(new ArrayList<>(List.of(
                new Answers(objectId26, "1,2,3", "A"),
                new Answers(objectId27, "2,3,4","B"),
                new Answers(objectId28, "4,5,6","C"),
                new Answers(objectId29, "6,7,8","D")
        )));

        List<Tasks> tasksList = List.of(zad1, zad2, zad3,zad4, zad5,zad6,zad7,zad8,zad9);
        for (Tasks tasks : tasksList) {
            saveIfNotExists(tasks);
        }
        String decodedPoziomTrudnosci = new String(Base64.getDecoder().decode(encodedPoziomTrudnosci));
        System.out.println(encodedPoziomTrudnosci);
        System.out.println(decodedPoziomTrudnosci);
    }
    public void saveIfNotExists(@NotNull Tasks tasks) {
        if (tasks.getId() == null) {
            tasksRepository.save(tasks);
        } else {
            Optional<Tasks> existingPolecenie = tasksRepository.findById(tasks.getId());
            if (existingPolecenie.isEmpty()) {
                tasksRepository.save(tasks);
            }
        }
    }

    }
*/