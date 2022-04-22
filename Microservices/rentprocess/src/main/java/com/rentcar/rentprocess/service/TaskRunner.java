package com.rentcar.rentprocess.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class TaskRunner implements CommandLineRunner {
    @Autowired
    TaskService taskService;

    @Override
    public void run(String... args) throws Exception {
        if(args.length > 0)
        {
            System.out.println("task running success");
            if(taskService.validateDL(args[0]))
            {
                System.out.println("Valid token ");
            }
            else
            {
                System.out.println("invalid token");
            }
        }
        else {
            System.out.println("task running failed");
        }
    }
}
