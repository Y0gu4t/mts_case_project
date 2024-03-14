package ru.mts.case_project.cooksystem.service;

import ru.mts.case_project.cooksystem.engine.BakeMachine;
import ru.mts.case_project.cooksystem.engine.Machine;

import java.util.List;

public class EngineFactory {

    public Machine createEngine(int capacity) {
        return new BakeMachine(capacity);
    }
}
