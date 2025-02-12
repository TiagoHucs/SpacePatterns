package com.hucs.behavioral.interpreter;

class LaunchCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executing: Launch Rocket!");
    }
}
