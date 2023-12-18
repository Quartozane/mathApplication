package math.app.version1.service.Impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import math.app.version1.exception.AllTasksCompletedException;
import math.app.version1.exception.NoTaskInDatabase;
import math.app.version1.model.*;
import math.app.version1.repository.*;
import math.app.version1.service.TaskService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TasksRepository tasksRepository;
    private final AnswersRepository answersRepository;
    private final HintsRepository hintsRepository;
    private final UserRepository userRepository;
    private final ListCompleteTaskRepository listCompleteTaskRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Tasks randomTask(String departmentName, Model model, HttpSession session) {
        List<Tasks> allTasksByName = tasksRepository.findAllByDepartmentName(departmentName);

        if (allTasksByName != null && !allTasksByName.isEmpty()) {
            List<ObjectId> completedTasksIds = (List<ObjectId>) session.getAttribute("completedTasks");
            if (completedTasksIds == null) {
                completedTasksIds = new ArrayList<>();
            }

            List<ObjectId> finalCompletedTasksIds = completedTasksIds;
            allTasksByName.removeIf(task -> finalCompletedTasksIds.contains(task.getId()));

            if (!allTasksByName.isEmpty()) {
                Collections.shuffle(allTasksByName);
                Tasks task = allTasksByName.get(0);
                model.addAttribute("task", task);
                List<Answers> answers = getAnswer(task);
                model.addAttribute("answers", answers);
                session.setAttribute("correctAnswer", task.getCorrectAnswer());
                session.setAttribute("task", task);
                session.setAttribute("taskId", task.getId());

                return task;
            } else {
                String userMail = (String) session.getAttribute("loginUserMail");
                User user = userRepository.findByMail(userMail);
                String nameOfDepartment = (String) session.getAttribute("selectedDepartment");
                ListCompleteTask completeTask = listCompleteTaskRepository.findByUserId(user.getId());
                if(completeTask!=null) {
                    List<String> completeDepartment = completeTask.getNameOfCompleteDepartment();
                    if (!completeDepartment.contains(nameOfDepartment)) {
                        completeDepartment.add(nameOfDepartment);
                        mongoTemplate.save(completeTask, "ListaUkonczonychZadan");
                        user.setNumberOfCompleteDepartment(user.getNumberOfCompleteDepartment() + 1);
                        userRepository.save(user);
                    }
                }
                else {
                    List<String> nameOfDepartmentList = new ArrayList<>();
                    nameOfDepartmentList.add(departmentName);
                    ListCompleteTask listCompleteTask = ListCompleteTask.builder()
                            .userId(user.getId())
                            .nameOfCompleteDepartment(nameOfDepartmentList)
                            .build();
                    listCompleteTaskRepository.save(listCompleteTask);
                }
                throw new AllTasksCompletedException("Wszystkie zadania zostały rozwiązane");

            }
        } else {
            throw new NoTaskInDatabase("Brak dostępnych zadań w bazie danych");
        }
    }

    public List<Answers> getAnswer(Tasks task) {
        List<ObjectId> listAnswer = task.getAnswerId();
        List<Answers> listAllAnswer = new ArrayList<>();
        for(ObjectId l: listAnswer) {
            Answers answers = answersRepository.findById(l).orElse(null);
            listAllAnswer.add(answers);
        }
        return listAllAnswer;
    }

    public List<Hints> getHint(Tasks task) {
        List<ObjectId> listHints = task.getHints();
        List<Hints>listAllHints = new ArrayList<>();
        for(ObjectId l: listHints) {
            Hints hints = hintsRepository.findById(l).orElse(null);
            listAllHints.add(hints);
        }
        return listAllHints;
    }

    public String addTask(String departmentName, String stuff, String level, String correctAnswer,
                                 String stuffOne, String indexAnswerOne, String stuffTwo,
                                 String indexAnswerTwo,String stuffThree, String indexAnswerThree, String stuffFour,
                                 String indexAnswerFour, String stuffHintOne, String stuffHintTwo) {

        ObjectId id = new ObjectId();
        ObjectId id1 = new ObjectId();
        ObjectId id2 = new ObjectId();
        ObjectId id3 = new ObjectId();
        ObjectId id4 = new ObjectId();
        ObjectId id5 = new ObjectId();
        Answers answers = Answers.builder()
                .id(id)
                .indexAnswers(indexAnswerOne)
                .stuff(stuffOne)
                .build();
        Answers answers1 = Answers.builder()
                .id(id1)
                .indexAnswers(indexAnswerTwo)
                .stuff(stuffTwo)
                .build();
        Answers answers2 = Answers.builder()
                .id(id2)
                .indexAnswers(indexAnswerThree)
                .stuff(stuffThree)
                .build();
        Answers answers3 = Answers.builder()
                .id(id3)
                .indexAnswers(indexAnswerFour)
                .stuff(stuffFour)
                .build();
        List<Answers> answersList = new ArrayList<>();
        answersList.add(answers);
        answersList.add(answers1);
        answersList.add(answers2);
        answersList.add(answers3);
        answersRepository.saveAll(answersList);
        Hints hints = Hints.builder()
                .id(id4)
                .stuff(stuffHintOne)
                .build();
        Hints hints1 = Hints.builder()
                .id(id5)
                .stuff(stuffHintTwo)
                .build();
        List<Hints> hintsList = new ArrayList<>();
        hintsList.add(hints);
        hintsList.add(hints1);
        hintsRepository.saveAll(hintsList);
        Optional<Answers> answersFind = answersRepository.findById(answers.getId());
        List<ObjectId> answerId = new ArrayList<>();
        answerId.add(answers.getId());
        answerId.add(answers1.getId());
        answerId.add(answers2.getId());
        answerId.add(answers3.getId());
        List<ObjectId> hintsId = new ArrayList<>();
        hintsId.add(hints.getId());
        hintsId.add(hints.getId());
        Tasks task = Tasks.builder()
                .departmentName(departmentName)
                .level(level)
                .stuff(stuff)
                .correctAnswer(correctAnswer)
                .dateAdd(LocalDateTime.now())
                .answerId(answerId)
                .hints(hintsId)
                .build();
        tasksRepository.save(task);
        return "Add user complete!";

    }

    public List<Tasks> allTasks() {
        return tasksRepository.findAll();
    }

    public void checkTask(String answer, Model model, HttpSession session) {
        String correctAnswer = (String) session.getAttribute("correctAnswer");
        String userMail = (String) session.getAttribute("loginUserMail");

        if (correctAnswer.equals(answer)) {
            User user = userRepository.findByMail(userMail);
            user.setNumberCompleteTasks(user.getNumberCompleteTasks() + 1);
            userRepository.save(user);
            model.addAttribute("resultAttribute","Correct");

            List<ObjectId> completedTasksIds = (List<ObjectId>) session.getAttribute("completedTasks");
            if (completedTasksIds == null) {
                completedTasksIds = new ArrayList<>();
            }

            ObjectId currentTaskId = (ObjectId) session.getAttribute("taskId");
            completedTasksIds.add(currentTaskId);
            session.setAttribute("completedTasks", completedTasksIds);

            randomTask((String) session.getAttribute("selectedDepartment"), model, session);
        } else {
            model.addAttribute("resultAttribute", "Incorrect");

            User user = userRepository.findByMail(userMail);
            user.setNumberCompleteTasks(user.getNumberCompleteTasks() - 1);
            userRepository.save(user);

            Tasks task = tasksRepository.findById((ObjectId) session.getAttribute("taskId")).orElse(null);
            model.addAttribute("task", task);
            List<Answers> answers = getAnswer(task);
            List<Hints> allHintsCurrentTask = getHint(task);

            Hints hint = allHintsCurrentTask.get(Math.toIntExact(Math.round(Math.random() * (allHintsCurrentTask.size() - 1))));
            model.addAttribute("hint", hint);
            model.addAttribute("answers", answers);

            session.setAttribute("correctAnswer", task.getCorrectAnswer());
            session.setAttribute("task", task);
            session.setAttribute("taskId", task.getId());
        }
    }

    public void deleteTask(String taskId) {
        ObjectId objectId = new ObjectId(taskId);
        tasksRepository.deleteById(objectId);
    }
}

