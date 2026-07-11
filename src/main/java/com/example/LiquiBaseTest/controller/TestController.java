package com.example.LiquiBaseTest.controller;

import com.example.LiquiBaseTest.entity.TestEntity;
import com.example.LiquiBaseTest.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestEntity> getTestById(@PathVariable Integer id) {
        TestEntity testEntity = testService.getById(id);
        return ResponseEntity.ok(testEntity);
    }
}