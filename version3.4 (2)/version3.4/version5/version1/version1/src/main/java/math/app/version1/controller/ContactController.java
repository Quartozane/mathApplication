package math.app.version1.controller;

import math.app.version1.model.ContactForm;
import math.app.version1.model.Department;
import math.app.version1.service.Impl.DepartmentDataHelper;
import math.app.version1.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/public")
public class ContactController {

    @Autowired
    private JavaMailSender emailSender;
    private final DepartmentDataHelper departmentDataHelper;

    @Autowired
    public ContactController(DepartmentDataHelper departmentDataHelper) {
        this.departmentDataHelper = departmentDataHelper;
    }

    @PostMapping("/send-email")
    public String sendEmail(@ModelAttribute ContactForm contactForm, Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("mastersmath28@gmail.com");
        message.setSubject(contactForm.getType() + " - " + contactForm.getName() + " " + contactForm.getSurname());
        message.setText(contactForm.getMessage() + "\n\nOd: " + contactForm.getName() + " " + contactForm.getSurname());

        emailSender.send(message);

        model.addAttribute("message", "E-mail został wysłany poprawnie!");

        return "departmentSelect";
    }
}
