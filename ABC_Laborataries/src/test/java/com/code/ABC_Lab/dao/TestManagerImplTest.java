package com.code.ABC_Lab.dao;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestManagerImplTest {

    private TestManagerImpl labSystem;

    @BeforeEach
    public void setUp() {
        labSystem = new TestManagerImpl();
    }
    
    @Test
    public void insertNewTestSuccess() {
        HashMap<String, String> Test = new HashMap<>();
        Test.put("testCode", "1");
        Test.put("testName", "Blood Culture");
        Test.put("testPrize", "1250");
        Test.put("testTimeslot", "8am");

        String testCode = labSystem.insertNewTest(Test);
        assertNotNull(testCode);
    }
    
    @Test
    public void insertNewTestInvalidDetails() {
        HashMap<String, String> Test = new HashMap<>();

        String testCode = labSystem.insertNewTest(Test);
        assertNull(testCode);
    }}
