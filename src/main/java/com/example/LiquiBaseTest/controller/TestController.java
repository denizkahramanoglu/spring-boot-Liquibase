package com.example.LiquiBaseTest.controller;

import com.example.LiquiBaseTest.dto.TestResponseDto;
import com.example.LiquiBaseTest.entity.TestEntity;
import com.example.LiquiBaseTest.service.TestService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<TestResponseDto> getTestById(@PathVariable Integer id) {
        return Optional.ofNullable(testService.getById(id))
                .map(entity -> TestResponseDto.builder() // Builder kullanımı
                        .isim(entity.getIsim())
                        .email(entity.getEmail())
                        .build())
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}