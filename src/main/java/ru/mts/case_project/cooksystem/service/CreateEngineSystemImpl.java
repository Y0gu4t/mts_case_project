package ru.mts.case_project.cooksystem.service;

import ru.mts.case_project.cooksystem.engine.Machine;

import java.util.ArrayList;
import java.util.List;

public class CreateEngineSystemImpl implements CreateEngineSystem{
    private EngineFactory engineFactory;

    public CreateEngineSystemImpl(EngineFactory engineFactory) {
        this.engineFactory = engineFactory;
    }

    @Override
    public List<Machine> createMachines() {
        List<Machine> machinesList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            machinesList.add(engineFactory.createEngine(10));
        }
        for (int i = 0; i < 3; i++) {
            machinesList.add(engineFactory.createEngine(5));
        }
        for (int i = 0; i < 5; i++) {
            machinesList.add(engineFactory.createEngine(2));
        }
        return machinesList;
    }
}
