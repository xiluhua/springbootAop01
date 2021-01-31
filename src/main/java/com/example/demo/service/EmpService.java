package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmpService {
    public String find(Integer id) {
        System.out.println("find(" + id + ")...");
        // 等待2秒
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        return "emp";
    }
}