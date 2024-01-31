package org.sdag;

import org.sdag.interfaces.IRunner;
import org.sdag.linkedlists.LinkedListRunner;
import org.sdag.stacks.StackRunner;

public class RunnerFactory {
    public static IRunner getRunner(String structureID) {
        if(structureID.equals("A")) {
            return new LinkedListRunner();
        }
        else if(structureID.equals("B")) {
            return new StackRunner();
        }

        return new NullRunner();
    }
}
