package math.app.version1.service;

import math.app.version1.model.Answers;
import math.app.version1.model.Hints;
import math.app.version1.model.Tasks;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Service
public interface TaskService {

    Tasks randomTask(String departmentName, Model model, HttpSession session);
    List<Answers> getAnswer(Tasks task);
    void checkTask(String correctAnswer, Model model, HttpSession httpSession);
    List<Hints> getHint(Tasks task);
    String addTask(String departmentName, String stuff, String level, String correctAnswer,
                   String stuffOne, String indexAnswerOne, String stuffTwo,
                   String indexAnswerTwo,String stuffThree, String indexAnswerThree, String stuffFour,
                   String indexAnswerFour, String stuffHintOne, String stuffHintTwo);

    List<Tasks> allTasks();
    void deleteTask(String taskId);
}
