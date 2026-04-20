package pl.coderslab.cykl_zycia_testu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private Task task;

    @BeforeEach
    void prepareTask() {
        task = new Task(1, "task1", "testowy task", "to do");
    }

    @AfterEach
    void tearDown() {
        task = null;
    }


    @Test
    void testChangeStatus() {
        task.changeStatus("in progress");
        assertEquals("in progress", task.getStatus());
    }


    @Test
    void completeTask() {
        task.completeTask();
        assertEquals("completed", task.getStatus());
    }


}