package FitnessCoachingApp;

public class WorkoutPlan {
    private String name;
    private int durationInWeeks;
    private String level;

    public WorkoutPlan(String name, int durationInWeeks, String level) {
        this.name = name;
        this.durationInWeeks = durationInWeeks;
        this.level = level;
    }

   
    public String getName() {
        return name;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "WorkoutPlan{" +
                "name='" + name + '\'' +
                ", durationInWeeks=" + durationInWeeks +
                ", level='" + level + '\'' +
                '}';
    }
}
