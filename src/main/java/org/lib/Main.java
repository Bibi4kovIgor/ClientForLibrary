package org.lib;

import edu.demo.*;

public class Main implements Constants {

    public static void main(String[] args) {
        Computer computer = new ComputerImplementation(
                HIGH_PRODUCTIVITY_COMPUTER_NAME,
                ACCESSORIES);
        final String suffix = "Confirmed";
        HighProductivityPC highProductivityPC = new HighProductivityPC(computer);
        System.out.println(highProductivityPC.confirmPcProductivity(suffix));
    }
}