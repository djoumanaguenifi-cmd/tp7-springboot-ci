package com.example.demo;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.model.Student;          
import com.example.demo.repository.StudentRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest 
class DemoTestApplicationTests { 
 
    @Test 
    void contextLoads() { 
    } 
} 

