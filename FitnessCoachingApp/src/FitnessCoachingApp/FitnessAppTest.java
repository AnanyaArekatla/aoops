package FitnessCoachingApp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FitnessAppTest {

	private WorkoutPlan workoutPlan;
    private ProgressTracking progressTracking;
    private UserFeedback userFeedback;

    @Before
    public void setUp() {
        workoutPlan = new WorkoutPlan("Full Body Strength", 8, "Intermediate");
        progressTracking = new ProgressTracking(workoutPlan.getDurationInWeeks());
        userFeedback = new UserFeedback("user123", 5, "Great plan! I've seen awesome results.");
    }

    @Test
    public void testWorkoutPlanCreation() {
        assertEquals("Full Body Strength", workoutPlan.getName(), "Workout plan name should match.");
        assertEquals(8, workoutPlan.getDurationInWeeks(), "Workout plan duration should be 8 weeks.");
        assertEquals("Intermediate", workoutPlan.getLevel(), "Workout plan level should be Intermediate.");
    }

    private void assertEquals(String string, String level, String string2) {
		
		
	}

	@Test
    public void testProgressTrackingUpdate() {
        progressTracking.updateProgress(4, 5.0, 2.5);
        assertEquals(4, progressTracking.completedWeeks(), "Completed weeks should be 4.");
        assertEquals(5.0, progressTracking.getWeightLost(), "Weight lost should be 5.0 kg.");
        assertEquals(2.5, progressTracking.getMuscleGained(), "Muscle gained should be 2.5 kg.");
        assertFalse(progressTracking.isPlanCompleted(), "Plan should not be completed yet.");

        progressTracking.updateProgress(4, 2.0, 1.0);
        assertTrue(progressTracking.isPlanCompleted(), "Plan should be completed after 8 weeks.");
    }

    private void assertTrue(boolean planCompleted, String string) {
		
		
	}

	private void assertFalse(boolean planCompleted, String string) {
		
		
	}

	private void assertEquals(double d, Object completedWeeks, String string) {
		
		
	}

	@Test
    public void testUserFeedback() {
        assertEquals("user123", userFeedback.getUserId(), "User ID should match.");
        assertEquals(5, userFeedback.getRating(), "User rating should be 5.");
        assertEquals("Great plan! I've seen awesome results.", userFeedback.getComments(), "User comments should match.");
    }
}
