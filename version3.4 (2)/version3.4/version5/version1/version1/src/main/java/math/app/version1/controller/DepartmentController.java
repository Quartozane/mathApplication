package math.app.version1.controller;

import lombok.extern.slf4j.Slf4j;
import math.app.version1.model.Department;
import math.app.version1.model.Tasks;
import math.app.version1.service.Impl.DepartmentDataHelper;
import math.app.version1.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/public")
@Slf4j
public class DepartmentController {

    private final DepartmentDataHelper departmentDataHelper;
    private final TaskService taskService;

    @Autowired
    public DepartmentController(DepartmentDataHelper departmentDataHelper, TaskService taskService) {
        this.departmentDataHelper = departmentDataHelper;
        this.taskService = taskService;
    }

    @GetMapping(path = "/department-select")
    public String getAllDepartment(Model model, HttpSession httpSession) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        log.info(httpSession.getAttribute("loginUser").toString());
        return "departmentSelect";
    }

    @GetMapping(path="/department-select-mobile")
    public String getMobileVers(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "departmentSelectMobileVers";
    }

    @GetMapping(path ="/department-select-small")
    public String getSmallVers(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "departmentSelectSmallView";
    }

    @GetMapping("/department-complete")
    public String departmentComplete(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "departmentComplete";
    }

    @GetMapping("/Potęgi")
    public String showDepartmentPage(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Potęgi");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Potęgi");
        return "potęgi";
    }
    @GetMapping("/Potęgi-mobile")
    public String showDepartmentPageMobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Potęgi");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Potęgi");
        return "potęgiMobile";
    }

    @GetMapping("/Potęgi-small")
    public String showDepartmentPageSmall(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Potęgi");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Potęgi");
        return "potęgiSmall";
    }

    @PostMapping("/Potęgi")
    public String checkTask(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "potęgi";
    }

    @GetMapping("/Pierwiastki")
    public String showDepartmentPage1(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Pierwiastki");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Pierwiastki");
        return "pierwiastki";
    }

    @GetMapping("/Pierwiastki-small")
    public String showDepartmentPage1Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Pierwiastki");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Pierwiastki");
        return "pierwiastkiSmall";
    }

    @GetMapping("/Pierwiastki-mobile")
    public String showDepartmentPage1Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Pierwiastki");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Pierwiastki");
        return "pierwiastkiMobile";
    }

    @PostMapping("/Pierwiastki")
    public String checkTask1(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "pierwiastki";
    }

    @GetMapping("/Procenty")
    public String showDepartmentPage2(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Procenty");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Procenty");
        return "procenty";
    }

    @GetMapping("/Procenty-small")
    public String showDepartmentPage2Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Procenty");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Procenty");
        return "procentySmall";
    }

    @GetMapping("/Procenty-mobile")
    public String showDepartmentPage2Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Procenty");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Procenty");
        return "procentyMobile";
    }

    @PostMapping("/Procenty")
    public String checkTask2(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "procenty";
    }

    @GetMapping("/Graniastosłupy")
    public String showDepartmentPage3(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Graniastosłupy");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Graniastosłupy");
        return "graniastosłupy";
    }

    @GetMapping("/Graniastosłupy-small")
    public String showDepartmentPage3Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Graniastosłupy");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Graniastosłupy");
        return "graniastosłupySmall";
    }

    @GetMapping("/Graniastosłupy-mobile")
    public String showDepartmentPage3Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Graniastosłupy");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Graniastosłupy");
        return "graniastosłupyMobile";
    }

    @PostMapping("/Graniastosłupy")
    public String checkTask3(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "graniastosłupy";
    }

    @GetMapping("/Ostrosłupy")
    public String showDepartmentPage4(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Ostrosłupy");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Ostrosłupy");
        return "ostrosłupy";
    }

    @GetMapping("/Ostrosłupy-small")
    public String showDepartmentPage4Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Ostrosłupy");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Ostrosłupy");
        return "ostrosłupySmall";
    }

    @GetMapping("/Ostrosłupy-mobile")
    public String showDepartmentPage4Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Ostrosłupy");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Ostrosłupy");
        return "ostrosłupyMobile";
    }

    @PostMapping("/Ostrosłupy")
    public String checkTask4(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "ostrosłupy";
    }

    @GetMapping("/Prędkość, droga, czas")
    public String showDepartmentPage5(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Prędkość, droga, czas");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Prędkość, droga, czas");
        return "prędkośćDrogaCzas";
    }

    @GetMapping("/Prędkość, droga, czas-small")
    public String showDepartmentPage5Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Prędkość, droga, czas");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Prędkość, droga, czas");
        return "prędkośćDrogaCzasSmall";
    }

    @GetMapping("/Prędkość, droga, czas-mobile")
    public String showDepartmentPage5Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Prędkość, droga, czas");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Prędkość, droga, czas");
        return "prędkośćDrogaCzasMobile";
    }

    @PostMapping("/Prędkość, droga, czas")
    public String checkTask5(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "prdkośćDrogaCzas";
    }

    @GetMapping("/Prawdopodobieństwo")
    public String showDepartmentPage6(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Prawdopodobieństwo");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Prawdopodobieństwo");
        return "prawdopodobieństwo";
    }

    @GetMapping("/Prawdopodobieństwo-small")
    public String showDepartmentPage6Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Prawdopodobieństwo");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Prawdopodobieństwo");
        return "prawdopodobieństwoSmall";
    }

    @GetMapping("/Prawdopodobieństwo-mobile")
    public String showDepartmentPage6Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Prawdopodobieństwo");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Prawdopodobieństwo");
        return "prawdopodobieństwoMobile";
    }

    @PostMapping("/Prawdopodobieństwo")
    public String checkTask6(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "prawdopodobieństwo";
    }

    @GetMapping("/Rozwiązywanie równań")
    public String showDepartmentPage7(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Rozwiązywanie równań");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Rozwiązywanie równań");
        return "rozwiązywanieRównań";
    }

    @GetMapping("/Rozwiązywanie równań-small")
    public String showDepartmentPage7Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Rozwiązywania równań");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Rozwiązywania równań");
        return "rozwiązywanieRównańSmall";
    }

    @GetMapping("/Rozwiązywanie równań-mobile")
    public String showDepartmentPage7Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Rozwiązywania równań");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Rozwiązywania równań");
        return "rozwiązywanieRównańMobile";
    }

    @PostMapping("/Rozwiązywanie równań")
    public String checkTask7(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "rozwiązywanieRównań";
    }

    @GetMapping("/Rozwiązywanie nierówności")
    public String showDepartmentPage8(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Rozwiązywania nierówności");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Rozwiązywania nierówności");
        return "rozwiązywanieNierówności";
    }

    @GetMapping("/Rozwiązywanie nierówności-small")
    public String showDepartmentPage8Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Rozwiązywania nierówności");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Rozwiązywania nierówności");
        return "rozwiązywanieNierównościSmall";
    }

    @GetMapping("/Rozwiązywanie nierówności-mobile")
    public String showDepartmentPage8Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Rozwiązywania nierówności");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Rozwiązywania nierówności");
        return "rozwiązywanieNierównościMobile";
    }

    @PostMapping("/Rozwiązywanie nierówności")
    public String checkTask8(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "rozwiązywanieNierówności";
    }

    @GetMapping("/Pojęcie funkcji")
    public String showDepartmentPage9(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Pojęcie funkcji");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Pojęcie funkcji");
        return "pojęcieFunkcji";
    }

    @GetMapping("/Pojęcie funkcji-small")
    public String showDepartmentPage9Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Pojęcie funkcji");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Pojęcie funkcji");
        return "pojęcieFunkcjiSmall";
    }

    @GetMapping("/Pojęcie funkcji-mobile")
    public String showDepartmentPage9Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Pojęcie funkcji");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Pojęcie funkcji");
        return "pojęcieFunkcjiMobile";
    }

    @PostMapping("/Pojęcie funkcji")
    public String checkTask9(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "pojęcieFunkcji";
    }

    @GetMapping("/Funkcja liniowa")
    public String showDepartmentPage10(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Funkcja liniowa");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Funkcja liniowa");
        return "funkcjaLiniowa";
    }

    @GetMapping("/Funkcja liniowa-small")
    public String showDepartmentPage10Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Funkcja liniowa");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Funkcja liniowa");
        return "funkcjaLiniowaSmall";
    }

    @GetMapping("/Funkcja liniowa-mobile")
    public String showDepartmentPage10Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Funkcja liniowa");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Funkcja liniowa");
        return "funkcjaLiniowaMobile";
    }

    @PostMapping("/Funkcja liniowa")
    public String checkTask10(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "funkcjaLiniowa";
    }

    @GetMapping("/Funkcja kwadratowa")
    public String showDepartmentPage11(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Funkcja kwadratowa");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Funkcja kwadratowa");
        return "funkcjaKwadratowa";
    }

    @GetMapping("/Funkcja kwadratowa-small")
    public String showDepartmentPage11Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Funkcja kwadratowa");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Funkcja kwadratowa");
        return "funkcjaKwadratowaSmall";
    }

    @GetMapping("/Funkcja kwadratowa-mobile")
    public String showDepartmentPage11Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Funkcja kwadratowa");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Funkcja kwadratowa");
        return "funkcjaKwadratowaMobile";
    }

    @PostMapping("/Funkcja kwadratowa")
    public String checkTask11(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "funkcjaKwadratowa";
    }

    @GetMapping("/Bryły")
    public String showDepartmentPage12(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Bryły");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Bryły");
        return "bryły";
    }

    @GetMapping("/Bryły-small")
    public String showDepartmentPage12Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Bryły");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Bryły");
        return "bryłySmall";
    }

    @GetMapping("/Bryły-mobile")
    public String showDepartmentPage12Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Bryły");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Bryły");
        return "bryłyMobile";
    }

    @PostMapping("/Bryły")
    public String checkTask12(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "bryły";
    }

    @GetMapping("/Bryły obrotowe")
    public String showDepartmentPage13(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Bryły obrotowe");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Bryły obrotowe");
        return "bryłyObrotowe";
    }

    @GetMapping("/Bryły obrotowe-small")
    public String showDepartmentPage13Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Bryły obrotowe");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Bryły obrotowe");
        return "bryłyObrotoweSmall";
    }

    @GetMapping("/Bryły obrotowe-mobile")
    public String showDepartmentPage13Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Bryły obrotowe");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Bryły obrotowe");
        return "bryłyObrotoweMobile";
    }

    @PostMapping("/Bryły obrotowe")
    public String checkTask13(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "bryłyObrotowe";
    }

    @GetMapping("/Wielomiany")
    public String showDepartmentPage14(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Wielomiany");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Wielomiany");
        return "wielomiany";
    }

    @GetMapping("/Wielomiany-small")
    public String showDepartmentPage14Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Wielomiany");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Wielomiany");
        return "wielomiany";
    }

    @GetMapping("/Wielomiany-mobile")
    public String showDepartmentPage14Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Wielomiany");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Wielomiany");
        return "wielomiany";
    }

    @PostMapping("/Wielomiany")
    public String checkTask14(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "wielomiany";
    }

    @GetMapping("/Poziom Podstawowy")
    public String showDepartmentPage15(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Poziom Podstawowy");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Poziom Podstawowy");
        return "poziomPodstawowy";
    }

    @GetMapping("/Poziom Podstawowy-small")
    public String showDepartmentPage15Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Poziom Podstawowy");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Poziom Podstawowy");
        return "poziomPodstawowySmall";
    }

    @GetMapping("/Poziom Podstawowy-mobile")
    public String showDepartmentPage15Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Poziom Podstawowy");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Poziom Podstawowy");
        return "poziomPodstawowyMobile";
    }

    @PostMapping("/Poziom Podstawowy")
    public String checkTask15(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "poziomPodstawowy";
    }

    @GetMapping("/Poziom Rozszerzony")
    public String showDepartmentPage16(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Poziom Rozszerzony");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Poziom Rozszerzony");
        return "poziomRozszerzony";
    }

    @GetMapping("/Poziom Rozszerzony-small")
    public String showDepartmentPage16Small(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Poziom Rozszerzony");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Poziom Rozszerzony");
        return "poziomRozszerzonySmall";
    }

    @GetMapping("/Poziom Rozszerzony-mobile")
    public String showDepartmentPage16Mobile(Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        session.setAttribute("selectedDepartment", "Poziom rozszerzony");
        Tasks task = taskService.randomTask((String) session.getAttribute("selectedDepartment"),model,session);
        log.info((String) session.getAttribute("selectedDepartment"));
        model.addAttribute("selectedDepartment", "Poziom Rozszerzony");
        return "poziomRozszerzonyMobile";
    }

    @PostMapping("/Poziom Rozszerzony")
    public String checkTask16(@RequestParam("answer") String answer, Model model, HttpSession session) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        taskService.checkTask(answer, model, session);
        String resultAttribute = (String) model.getAttribute("resultAttribute");
        if (resultAttribute != null) {
            model.addAttribute(resultAttribute);
        }
        return "poziomRozszerzony";
    }
}
