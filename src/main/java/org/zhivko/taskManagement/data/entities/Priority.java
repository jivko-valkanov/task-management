package org.zhivko.taskManagement.data.entities;

public enum Priority {

    HIGHEST(3),
    HIGH(2),
    NORMAL(1),
    LOW(0);

    private final int priority;

    Priority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return this.priority;
    }

}
