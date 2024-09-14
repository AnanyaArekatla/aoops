package FitnessCoachingApp;

public class FitnessApp {

	public static void main(String[] args) {
        
        WorkoutPlan workoutPlan = new WorkoutPlan("Full Body Strength", 8, "Intermediate");
        System.out.println("Workout Plan Created: " + workoutPlan);

        
        ProgressTracking progressTracking = new ProgressTracking(workoutPlan.getDurationInWeeks());
        System.out.println("Progress Tracking Initialized: " + progressTracking);

        
        progressTracking.updateProgress(4, 5.0, 2.5);  
        System.out.println("Progress Updated After 4 Weeks: " + progressTracking);

        
        progressTracking.updateProgress(4, 2.0, 1.0);  
        System.out.println("Final Progress After 8 Weeks: " + progressTracking);

        
        if (progressTracking.isPlanCompleted()) {
            System.out.println("Workout Plan Completed Successfully!");
        } else {
            System.out.println("Workout Plan Still In Progress.");
        }

        
        UserFeedback userFeedback = new UserFeedback("user123", 5, "Great plan! I've seen awesome results.");
        System.out.println("User Feedback: " + userFeedback);
    }
}