package math.app.version1.service.Impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import math.app.version1.model.ListCompleteTask;
import math.app.version1.model.User;
import math.app.version1.repository.ListCompleteTaskRepository;
import math.app.version1.repository.UserRepository;
import math.app.version1.security.PasswordEncoder;
import math.app.version1.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ListCompleteTaskRepository listCompleteTaskRepository;

    public String loginPost(String mail, String password) {
        User user = userRepository.findByMail(mail);
        if (user != null) {
            if (passwordEncoder.decodePassword(user.getPassword()).equals(password)) {
                if (user.getMail().equals("admin@mathMasters.pl")) {
                    return "redirect:/public/admin-page";
                } else {
                    return "redirect:/public/department-select";
                }
            }
        }
        return "loginPage";
    }

    public String registerPost(String firstName, String lastName, String mail, String password) {
        User user = User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .mail(mail)
                .password(passwordEncoder.encodePassword(password))
                .numberCompleteTasks(0)
                .numberOfCompleteDepartment(0)
                .build();
        userRepository.save(user);
        return "register complete";
    }

    public void changePassword(String lastPassword, String newPassword, Model model, HttpSession session) {
        String mail = (String) session.getAttribute("mail");
        User user = userRepository.findByMail(mail);
        log.info(mail);
        if (user != null) {
            if (lastPassword.equals(passwordEncoder.decodePassword(user.getPassword()))) {
                user.setPassword(passwordEncoder.encodePassword(newPassword));
                model.addAttribute("correctChange", true);
                userRepository.save(user);
            }
        } else {
            model.addAttribute("incorrectPassword", true);
        }
    }

    public void changeMail(String lastMail, String newMail, Model model, HttpSession session) {
        String mail = (String) session.getAttribute("mail");
        User user = userRepository.findByMail(mail);
        log.info(mail);
        if (user != null) {
            if (lastMail.equals(user.getMail())) {
                user.setMail(newMail);
                model.addAttribute("correctChange", true);
                userRepository.save(user);
            }
        } else {
            model.addAttribute("incorrectMail", true);
        }
    }

    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public void sortUserByCompleteTask(Model model) {
        List<User> users = userRepository.findAll();
        Comparator<User> comparator = Comparator.comparingInt(User::getNumberCompleteTasks);
        users.sort(comparator.reversed());
        model.addAttribute("sortedUsers", users);
    }

    public void deleteUser(HttpSession session) {
        String mail = (String) session.getAttribute("loginUserMail");
        User user = userRepository.findByMail(mail);
        userRepository.deleteById(user.getId());
    }

    public void findByLoginUserId(HttpSession session, Model model) {
        String mail = (String) session.getAttribute("loginUserMail");
        User user = userRepository.findByMail(mail);
        ListCompleteTask listCompleteTask = listCompleteTaskRepository.findByUserId(user.getId());
        if (listCompleteTask != null) {
            List<String> listCompleteDepartment = listCompleteTask.getNameOfCompleteDepartment();
            model.addAttribute("listCompleteDepartment", listCompleteDepartment);
        } else {
            model.addAttribute("listCompleteDepartment", new ArrayList<String>());
        }
    }
}
