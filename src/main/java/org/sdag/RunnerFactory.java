package org.sdag;

import org.sdag.interfaces.IRunner;
import org.sdag.linkedlists.LinkedListRunner;

public class RunnerFactory {
    public static IRunner getRunner(String structureID) {
        if(structureID.equals("A")) {
            return new LinkedListRunner();
        }

        return new NullRunner();
    }
}
