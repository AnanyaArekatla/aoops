package FitnessCoachingApp;

public class FitnessApp {

	public static void main(String[] args) {
        // Create a workout plan
        WorkoutPlan workoutPlan = new WorkoutPlan("Full Body Strength", 8, "Intermediate");
        System.out.println("Workout Plan Created: " + workoutPlan);

        // Start tracking progress
        ProgressTracking progressTracking = new ProgressTracking(workoutPlan.getDurationInWeeks());
        System.out.println("Progress Tracking Initialized: " + progressTracking);

        // Simulate progress update after 4 weeks
        progressTracking.updateProgress(4, 5.0, 2.5);  // 4 weeks completed, 5 kg weight lost, 2.5 kg muscle gained
        System.out.println("Progress Updated After 4 Weeks: " + progressTracking);

        // Simulate final progress update after completing the plan
        progressTracking.updateProgress(4, 2.0, 1.0);  // Final 4 weeks, 2 kg weight lost, 1 kg muscle gained
        System.out.println("Final Progress After 8 Weeks: " + progressTracking);

        // Check if the plan is completed
        if (progressTracking.isPlanCompleted()) {
            System.out.println("Workout Plan Completed Successfully!");
        } else {
            System.out.println("Workout Plan Still In Progress.");
        }

        // Capture user feedback
        UserFeedback userFeedback = new UserFeedback("user123", 5, "Great plan! I've seen awesome results.");
        System.out.println("User Feedback: " + userFeedback);
    }
}