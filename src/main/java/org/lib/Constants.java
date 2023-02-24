package org.lib;

import edu.demo.Accessory;
import edu.demo.OperationMemory;
import edu.demo.Processor;
import edu.demo.Storage;

import java.util.List;

public interface Constants {
    String HIGH_PRODUCTIVITY_COMPUTER_NAME = "Some high productivity PC";
    int HIGH_PRODUCTIVITY_RAM_TIMING = 12;
    int HIGH_PRODUCTIVITY_RAM_VOLUME = 16000;
    String HIGH_PRODUCTIVITY_RAM_MODEL = "Teams Elite";
    String HIGH_PRODUCTIVITY_CPU_MODEL = "Intel i9";
    int HIGH_PRODUCTIVITY_CPU_CLOCK_SPEED = 6000;
    int HIGH_PRODUCTIVITY_CPU_GENERATION = 12;
    String HIGH_PRODUCTIVITY_STORAGE_MODEL = "Kingston";
    int HIGH_PRODUCTIVITY_STORAGE_VOLUME = 1200;
    String HIGH_PRODUCTIVITY_STORAGE_TYPE = "M.2";

    OperationMemory HIGH_PRODUCTIVITY_RAM =
            new OperationMemory(
                    HIGH_PRODUCTIVITY_RAM_MODEL,
                    HIGH_PRODUCTIVITY_RAM_TIMING,
                    HIGH_PRODUCTIVITY_RAM_VOLUME);
    Processor HIGH_PRODUCTIVITY_PROCESSOR =
            new Processor(
                    HIGH_PRODUCTIVITY_CPU_MODEL,
                    HIGH_PRODUCTIVITY_CPU_CLOCK_SPEED,
                    HIGH_PRODUCTIVITY_CPU_GENERATION);

    Storage HIGH_PRODUCTIVITY_STORAGE =
            new Storage(
                    HIGH_PRODUCTIVITY_STORAGE_MODEL,
                    HIGH_PRODUCTIVITY_STORAGE_VOLUME,
                    HIGH_PRODUCTIVITY_STORAGE_TYPE);
    // Mutable list
    List<Accessory> ACCESSORIES = List.of(
            HIGH_PRODUCTIVITY_RAM,
            HIGH_PRODUCTIVITY_PROCESSOR,
            HIGH_PRODUCTIVITY_STORAGE);
}
