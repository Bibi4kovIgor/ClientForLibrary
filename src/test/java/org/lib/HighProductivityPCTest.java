package org.lib;

import edu.demo.Computer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class HighProductivityPCTest {

    public static final String HIGH_PRODUCTIVITY = "High Productivity";
    @Mock
    private static Computer computer = mock(Computer.class);

    @BeforeAll
    public static void init() {
        when(computer.getProductivity()).thenReturn(HIGH_PRODUCTIVITY);
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    @Test
    void getProductivity() {
        HighProductivityPC highProductivityPC = new HighProductivityPC(computer);
        final String suffix = "confirmed from test";
        String expected = HIGH_PRODUCTIVITY.concat(" ").concat(suffix);
        String actual = highProductivityPC.confirmPcProductivity(suffix);
        assertEquals(expected, actual);
    }
}