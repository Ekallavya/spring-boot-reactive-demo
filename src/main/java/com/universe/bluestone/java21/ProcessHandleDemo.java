package com.universe.bluestone.java21;

public class ProcessHandleDemo {
    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        //Stream<ProcessHandle> allProcessHandles=ProcessHandle.allProcesses();
        System.out.println("Current Process ID: " + currentProcess.pid());
        System.out.println("Current Process Info: " + currentProcess.info());


        // Create a child process (for demonstration purposes)
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("java", "-version");
            Process childProcess = processBuilder.start();

            ProcessHandle childProcessHandle = childProcess.toHandle();
            System.out.println("Child Process ID: " + childProcessHandle.pid());
            System.out.println("Child Process Info: " + childProcessHandle.info());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
