package org.sdag;

import org.sdag.interfaces.IRunner;
import org.sdag.linkedlists.LinkedListRunner;
import org.sdag.queues.QueueRunner;
import org.sdag.stacks.StackRunner;

public class RunnerFactory {
    public static IRunner getRunner(String structureID) {
        if(structureID.equals("A")) {
            return new LinkedListRunner();
        }
        if(structureID.equals("B")) {
            return new StackRunner();
        }
        if(structureID.equals("C")) {
            return new QueueRunner();
        }
        if(structureID.equals("I")) {
            System.out.println("Exiting the program. Goodbye!!!");
            System.exit(0);
        }

        return new NullRunner();
    }
}
