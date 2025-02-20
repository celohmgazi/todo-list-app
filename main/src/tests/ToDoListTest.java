package tests;

import main.ToDoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToDoListTest {
    private ToDoList toDoList;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    void testAddTask() {
        toDoList.addTask("Buy groceries", "Shopping");
        toDoList.addTask("Finish report", "Work");

        Assertions.assertEquals(2, toDoList.getTasks().size());
        assertEquals("Buy groceries", toDoList.getTasks().get(0).getDescription());
    }

    @Test
    void testMarkTaskComplete() {
        toDoList.addTask("Buy groceries", "Shopping");
        toDoList.markTaskComplete(0);

        assertTrue(toDoList.getTasks().get(0).isCompleted());
    }

    @Test
    void testMarkTaskCompleteInvalidIndex() {
        toDoList.addTask("Buy groceries", "Shopping");
        toDoList.markTaskComplete(5);
    }

    @Test
    void testDisplayTask() {
        toDoList.addTask("Buy groceries", "Shopping");
        toDoList.addTask("Finish report", "Work");
    }

}
