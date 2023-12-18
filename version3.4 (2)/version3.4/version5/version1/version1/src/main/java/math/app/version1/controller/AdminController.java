package math.app.version1.controller;

import math.app.version1.model.Department;
import math.app.version1.model.Tasks;
import math.app.version1.model.User;
import math.app.version1.service.Impl.DepartmentDataHelper;
import math.app.version1.service.TaskService;
import math.app.version1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/public")
public class AdminController {

    private final DepartmentDataHelper departmentDataHelper;
    private final TaskService taskService;
    private final UserService userService;

    @Autowired
    public AdminController(DepartmentDataHelper departmentDataHelper, TaskService taskService,UserService userService) {
        this.departmentDataHelper = departmentDataHelper;
        this.taskService = taskService;
        this.userService = userService;
    }

    @GetMapping("/admin-page")
    public String adminPageGet(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        List<Tasks> task = taskService.allTasks();
        model.addAttribute("tasks",task);
        List<User> user = userService.allUsers();
        model.addAttribute("users",user);
        return "adminPage";
    }

    @PostMapping("/admin-add-task")
    public String addTask(@RequestParam("departmentName") String departmentName, @RequestParam("stuff") String stuff,
                          @RequestParam("level") String level,@RequestParam("correctAnswer") String correctAnswer,
                          @RequestParam("stuffOne") String stuffOne, @RequestParam("indexAnswerOne") String indexAnswerOne,
                          @RequestParam("stuffTwo")  String stuffTwo, @RequestParam("indexAnswerTwo") String indexAnswerTwo,
                          @RequestParam("stuffThree")String stuffThree,@RequestParam("indexAnswerThree") String indexAnswerThree,
                          @RequestParam("stuffFour")String stuffFour, @RequestParam("indexAnswerFour") String indexAnswerFour,
                          @RequestParam("stuffHintOne")String stuffHintOne, @RequestParam("stuffHintTwo") String stuffHintTwo,Model model) {

        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);

        String result = taskService.addTask(departmentName,stuff,level,correctAnswer,stuffOne,indexAnswerOne,stuffTwo,
                indexAnswerTwo,stuffThree,indexAnswerThree,stuffFour,indexAnswerFour,stuffHintOne,stuffHintTwo);
        if (result != null) {
            model.addAttribute("addTaskComplete",true);
            return "adminPage";
        }
        else {
            model.addAttribute("error",true);
            return "adminPage";
        }
    }

    @PostMapping("/delete-task")
    public String deleteTask(@RequestParam("taskId") String taskId, Model model) {
        taskService.deleteTask(taskId);
        return "redirect:/public/admin-page";
    }
}
