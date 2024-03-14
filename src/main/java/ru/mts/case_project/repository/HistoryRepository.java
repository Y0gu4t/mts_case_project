package ru.mts.case_project.repository;

import ru.mts.case_project.entity.history.History;

import java.util.List;

public interface HistoryRepository {

    void addHistory(History history);

    void removeHistory(History history);

    List<History> getAllHistories();
}
