package com.code.ABC_Lab.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ResultManagerImplTest {
	
    private ResultManagerImpl labSystem;
    
    @BeforeEach
    public void setUp() {
        labSystem = new ResultManagerImpl();
    }

	@Test
    public void insertNewResultSuccess() {
        HashMap<String, String> Result = new HashMap<>();
        Result.put("resultno", "2");
        Result.put("testRefno", "456");
        Result.put("patientName", "Sahan");
        Result.put("testCode", "2");
        Result.put("testName", "FBC");
        Result.put("testResult", "Normal");
        Result.put("testComment", "Normal");


        boolean resultno = labSystem.insertNewResult(Result);
        assertTrue(resultno);
    }

    @Test
    public void testEnterTestResultInvalidDetails() {
        HashMap<String, String> Result = new HashMap<>();
        
        boolean resultno = labSystem.insertNewResult(Result);
        assertFalse(resultno);
    }
}
