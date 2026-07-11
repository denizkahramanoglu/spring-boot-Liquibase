package com.example.LiquiBaseTest.service;

import com.example.LiquiBaseTest.entity.TestEntity;
import com.example.LiquiBaseTest.repository.TestRepository;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public TestEntity getById(Integer id) {
        return testRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Test verisi bulunamadı: " + id));
    }
}