package math.app.version1.service;

import math.app.version1.model.User;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService  {

     String loginPost(String mail, String password);
     //void encodeAllPasswords();
     String registerPost(String firstName, String lastName, String mail, String password);
     void changePassword(String lastPassword, String newPassword, Model model, HttpSession session);
     void changeMail(String lastMail, String newMail, Model model, HttpSession session);
     List<User> allUsers();
     void sortUserByCompleteTask(Model model);
     void deleteUser(HttpSession session);
     void findByLoginUserId(HttpSession session,Model model);
}
