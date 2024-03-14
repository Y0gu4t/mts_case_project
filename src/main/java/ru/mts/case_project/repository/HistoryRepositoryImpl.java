package ru.mts.case_project.repository;

import ru.mts.case_project.entity.history.History;

import java.util.ArrayList;
import java.util.List;

public class HistoryRepositoryImpl implements HistoryRepository {

    private List<History> histories = new ArrayList<>();

    @Override
    public void addHistory(History history) {
        histories.add(history);
    }

    @Override
    public void removeHistory(History history) {
        histories.remove(history);
    }

    @Override
    public List<History> getAllHistories() {
        return histories;
    }
}
