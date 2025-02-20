package tests;

import main.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    private Task task;

    @BeforeEach
    void setUp() {
        task = new Task("Read a book", "Leisure");
    }

    @Test
    void testTaskInitialization() {
        assertEquals("Read a book", task.getDescription());
        assertEquals("Leisure", task.getCategory());
        assertFalse(task.isCompleted());
    }

    @Test
    void testMarkAsCompleted() {
        task.markAsCompleted();
         assertTrue(task.isCompleted());
    }
}
