package com.vanshika;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;

/**
 * Unit test for simple App.
 */
// public class AppTest 
// {
//     /**
//      * Rigorous Test :-)
//      */
//     @Test
//     public void shouldAnswerWithTrue()
//     {
//         assertTrue( true );
//     }
// }
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
 public class TestShapes{
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all the test cases");
    }
    @AfterAll
    static void afterall(){
        System.out.println("after all the test cases");
    }
    Shapes shape;
    @BeforeEach
    void setup(){
        shape=new Shapes();
        System.out.println("before each test case");
    }
    @Test
    @EnabledOnOs(OS.WINDOWS)
    @EnabledOnJre(JRE.JAVA_11);
    @EnabledForJreRange(min=JRE.JAVA_11,max=JRE.JAVA_25);

    void testComputeSqaureArea(){
        // Shapes shape=new Shapes();
        double ar=shape.computeAreaSquare(4);
        double er=16.0;
        assumeTrue(true);
        assertEquals(er,ar);
            
    }
    @Test
    void testComputeCircleArea(){
        // Shapes shape=new Shapes();
        double ar=shape.computeCircleArea(5);
        double er=78.5;
        assertEquals(er,ar,()->"Test case failed!");
        
    }
    @Test
    void testComputeRectangleArea(){
        // Shapes shapes=new Shapes();
        assertEquals(16.0,shape.computeAreaRectangle(4.0, 4.0));
    }
    @AfterEach
    void cleanup(){
        System.out.println("Executed after each test case");
    }
}
// class TestGenerateUniqueID{
// @Test
// void testGenerateUniqueId(){
//     // String id1=IDGenerator.generateUniqueID();
//     // String id2=IDGenerator.generateUniqueID();
//     // assertNotEquals(id1,id2);
//     String str="Vanshika";
//     assertTrue(str.equals("Junit"));
// }
// }
