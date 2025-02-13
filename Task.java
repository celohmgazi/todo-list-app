public class Task {
    private String description;
    private  boolean isCompleted;
    private String category;

    public Task(String description, boolean isCompleted, String category) {
        this.description = description;
        this.isCompleted = isCompleted;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
    public  boolean isCompleted() {
        return isCompleted;
    }
    public String getCategory() {
        return category;
    }
    public void markAsCompleted() {
        isCompleted = true;
    }
    @Override
    public String toString() {
        return (isCompleted ? "[X] " :  "[ ] " + description) + " (Category: " + category + ")";
    }
}

