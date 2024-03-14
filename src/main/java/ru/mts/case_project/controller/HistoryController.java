package ru.mts.case_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.mts.case_project.entity.history.History;

@Controller
public class HistoryController {

    @GetMapping("/api/history/add")
    public void addHistory(@RequestBody History history) {

    }
}
