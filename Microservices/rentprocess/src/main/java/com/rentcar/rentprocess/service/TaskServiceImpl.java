package com.rentcar.rentprocess.service;

import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{
    @Override
    public boolean validateDL(String dlNo) {
        return dlNo.contains("a");
    }
}
