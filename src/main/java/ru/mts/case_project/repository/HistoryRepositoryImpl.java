package ru.mts.case_project.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.mts.case_project.entity.history.History;

import java.util.ArrayList;
import java.util.List;

public class HistoryRepositoryImpl implements HistoryRepository {

    Logger logger = LogManager.getLogger();

    private List<History> histories = new ArrayList<>();

    @Override
    public void addHistory(History history) {
        logger.info("Add new history to list");
        histories.add(history);
    }

    @Override
    public void removeHistory(History history) {
        logger.info("Remove history from list");
        histories.remove(history);
    }

    @Override
    public List<History> getAllHistories() {
        logger.info("Get all histories");
        return histories;
    }
}
