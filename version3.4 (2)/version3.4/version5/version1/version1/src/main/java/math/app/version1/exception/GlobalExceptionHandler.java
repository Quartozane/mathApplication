package math.app.version1.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.thymeleaf.exceptions.TemplateInputException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AllTasksCompletedException.class)
    public String handleAllTasksCompletedException(Model model) {
        model.addAttribute("resultAttribute", "AllTaskCompleted");
        return "redirect:/public/department-complete";
    }

    @ExceptionHandler(NoTaskInDatabase.class)
    public String handleNoTaskInDatabaseException() {
        return "redirect:/public/no-task-in-database";
    }

    @ExceptionHandler(TemplateInputException.class)
    public String handleNoResolvingTemplate() {
        return "redirect:/public/error-resolving-template";
    }
}
