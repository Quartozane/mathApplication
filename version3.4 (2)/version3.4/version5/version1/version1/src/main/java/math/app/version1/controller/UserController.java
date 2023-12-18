package math.app.version1.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import math.app.version1.model.Department;
import math.app.version1.model.User;
import math.app.version1.repository.UserRepository;
import math.app.version1.service.Impl.DepartmentDataHelper;
import math.app.version1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/public")
@Slf4j
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;
    private final DepartmentDataHelper departmentDataHelper;

    @Autowired
    public UserController(DepartmentDataHelper departmentDataHelper, UserService userService,UserRepository userRepository) {
        this.departmentDataHelper = departmentDataHelper;
        this.userService = userService;
        this.userRepository = userRepository;

    }

    @GetMapping("/")
    public String loginGet() {
        return "loginPage";
    }

    @GetMapping("/register-page")
    public String registerGet() {
        return "registerPage";
    }

    @GetMapping("/change-password-small")
    public String changePasswordSmallGet(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "changePasswordSmall";
    }

    @GetMapping("/change-password")
    public String changePasswordGet(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "changePassword";
    }

    @GetMapping("/change-password-mobile")
    public String changePasswordMobileGet(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "changePasswordMobileVers";
    }

    @GetMapping("/change-mail")
    public String changeMailGet(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "changeMail";
    }

    @GetMapping("/change-mail-small")
    public String changeMailSmallGet(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "changeMailSmall";
    }

    @GetMapping("/change-mail-mobile")
    public String changeMailMobileGet(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "changeMailMobileVers";
    }

    @PostMapping("/login-page")
    public String loginPost(@RequestParam("mail") String mail, @RequestParam("password") String password, Model model, HttpSession httpSession) {
        httpSession.setAttribute("mail",mail);
        String result = userService.loginPost(mail, password);
        User user = userRepository.findByMail(mail);
        if (result != null && result.equals("redirect:/public/department-select")) {
            httpSession.setAttribute("loginUser",user);
            model.addAttribute("loginUser",user);
            httpSession.setAttribute("loginUserMail",mail);
            //log.info(httpSession.getAttribute("loginUser").toString());
            return result;
        }
        else if(result != null && result.equals("redirect:/public/admin-page")) {
            return result;
        }
        else {
            model.addAttribute("loginError",true);
            return "loginPage";
        }
    }

    @PostMapping("/register-post")
    public String registerPost(@RequestParam("firstName") String firstname, @RequestParam("lastName") String lastName,
                               @RequestParam("mail") String mail, @RequestParam("password") String password, Model model) {
        if(userRepository.findByMail(mail) == null) {
            String result = userService.registerPost(firstname, lastName, mail, password);
            if (result != null) {
                model.addAttribute("registerComplete", true);
                return "loginPage";
            } else {
                model.addAttribute("error", true);
                return "registerPage";
            }
        }
        else {
            model.addAttribute("mailDuplicate",true);
            return "registerPage";
        }
    }

    @GetMapping("/user-page")
    public String userPage(HttpSession httpSession,Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        //log.info(httpSession.getAttribute("loginUser").toString());
        httpSession.getAttribute("loginUser");
        userService.findByLoginUserId(httpSession,model);
        model.addAttribute("loginUser",httpSession.getAttribute("loginUser"));
        return "userPage";
    }
    @GetMapping("user-rank-page")
    public String userRankPage(HttpSession session,Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.getAttribute("loginUser");
        userService.sortUserByCompleteTask(model);
        model.getAttribute("sortedUsers");
        model.addAttribute("loginUser",session.getAttribute("loginUser"));
        return "userRankPage";
    }

    @GetMapping("user-rank-page-small")
    public String userRankPageSmall(HttpSession session,Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.getAttribute("loginUser");
        userService.sortUserByCompleteTask(model);
        model.getAttribute("sortedUsers");
        model.addAttribute("loginUser",session.getAttribute("loginUser"));
        return "userRankSmall";
    }

    @GetMapping("user-rank-page-mobile")
    public String userRankPageMobile(HttpSession session,Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.getAttribute("loginUser");
        userService.sortUserByCompleteTask(model);
        model.getAttribute("sortedUsers");
        model.addAttribute("loginUser",session.getAttribute("loginUser"));
        return "userRankPageMobile";
    }

    @GetMapping("/user-page-small")
    public String userPageSmall(HttpSession httpSession,Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        //log.info(httpSession.getAttribute("loginUser").toString());
        httpSession.getAttribute("loginUser");
        model.addAttribute("loginUser",httpSession.getAttribute("loginUser"));
        return "userPageSmall";
    }

    @GetMapping("/user-page-mobile")
    public String userPageMobile(HttpSession httpSession,Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        //log.info(httpSession.getAttribute("loginUser").toString());
        httpSession.getAttribute("loginUser");
        model.addAttribute("loginUser",httpSession.getAttribute("loginUser"));
        return "userPageMobileVers";
    }

    @PostMapping("/change-password")
    public String changePassword(HttpSession session,Model model,@RequestParam("lastPassword")String lastPassword,@RequestParam("newPassword") String newPassword) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        userService.changePassword(lastPassword,newPassword,model,session);
        return "changePassword";
    }

    @PostMapping("/change-mail")
    public String changeMail(HttpSession session,Model model,@RequestParam("lastMail")String lastMail,@RequestParam("newMail") String newMail) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        userService.changeMail(lastMail,newMail,model,session);
        return "changeMail";
    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/public/";
    }

    @PostMapping("/delete-user")
    public String deleteUser(HttpSession session,Model model) {
        userService.deleteUser(session);
        model.addAttribute("deleteComplete",true);
        return "loginPage";
    }
}
