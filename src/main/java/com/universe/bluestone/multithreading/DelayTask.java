package com.universe.bluestone.multithreading;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayTask implements Delayed {
    private final String taskName;
    private final long absoluteExpireTime; // Timestamp when this task expires

    public DelayTask(String taskName, long delayInMillis) {
        this.taskName = taskName;
        // Calculate the exact future system time when this task becomes available
        this.absoluteExpireTime = System.currentTimeMillis() + delayInMillis;
    }

    public String getTaskName() {
        return taskName;
    }

    // Calculates how much time is left until expiration
    @Override
    public long getDelay(TimeUnit unit) {
        long diff = absoluteExpireTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    // Orders elements based on which one expires first
    @Override
    public int compareTo(Delayed other) {
        if (this.absoluteExpireTime < ((DelayTask) other).absoluteExpireTime) {
            return -1;
        }
        if (this.absoluteExpireTime > ((DelayTask) other).absoluteExpireTime) {
            return 1;
        }
        return 0;
    }
}