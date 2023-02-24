package org.lib;

import edu.demo.*;

public class HighProductivityPC {
    private final Computer highProductivityComputer;

    public HighProductivityPC(Computer highProductivityComputer) {
        this.highProductivityComputer = highProductivityComputer;
    }

    public String confirmPcProductivity(String suffix){
        return highProductivityComputer.getProductivity().concat(" ").concat(suffix);
    }
}
