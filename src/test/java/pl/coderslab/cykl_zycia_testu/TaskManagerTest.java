package pl.coderslab.cykl_zycia_testu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {
    private TaskManager taskManager;


    @BeforeEach
    void prepareData() {
        taskManager = new TaskManager();

    }

    @AfterEach
    void tearDown() {
        taskManager = null;
    }

    @Test
    void addTasksTest() {
        Task task1 = new Task(1, "task1", "abc", "to do");
        Task task2 = new Task(2, "task2", "haha", "in progress");
        Task task3 = new Task(3, "task3", "uuuu", "to do");
        Task task4 = new Task(4, "task4", "xyz", "in progress");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        assertTrue(taskManager.getTasks().contains(task2));
    }


    @Test
    void removeTaskTest() {
        Task task1 = new Task(1, "task1", "abc", "to do");
        Task task2 = new Task(2, "task2", "haha", "in progress");
        Task task3 = new Task(3, "task3", "uuuu", "to do");
        Task task4 = new Task(4, "task4", "xyz", "in progress");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        taskManager.removeTaskById(2);
        assertFalse(taskManager.getTasks().contains(task2));

    }

    @Test
    void changeStatusByIdTest() {
        Task task1 = new Task(1, "task1", "abc", "to do");
        Task task2 = new Task(2, "task2", "haha", "in progress");
        Task task3 = new Task(3, "task3", "uuuu", "to do");
        Task task4 = new Task(4, "task4", "xyz", "in progress");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        taskManager.changeTaskStatus(3, "in progress");
        assertEquals("in progress", task3.getStatus());
    }

    @Test
    void removeNotExistentTaskTest() {
        assertFalse(taskManager.removeTaskById(1));
    }

    @Test
    void changeStatusOfNonExistentTaskTest() {
        taskManager.changeTaskStatus(1, "completed");
        assertTrue(taskManager.getTasks().isEmpty());
    }




}