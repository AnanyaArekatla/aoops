package FitnessCoachingApp;

public class ProgressTracking {
    private int completedWeeks;
    private int totalWeeks;
    private double weightLost;
    private double muscleGained;

    public ProgressTracking(int totalWeeks) {
        this.totalWeeks = totalWeeks;
        this.completedWeeks = 0;
        this.weightLost = 0.0;
        this.muscleGained = 0.0;
    }

    public void updateProgress(int weeks, double weightLost, double muscleGained) {
        this.completedWeeks += weeks;
        this.weightLost += weightLost;
        this.muscleGained += muscleGained;
    }

    public boolean isPlanCompleted() {
        return completedWeeks >= totalWeeks;
    }

    @Override
    public String toString() {
        return "ProgressTracking{" +
                "completedWeeks=" + completedWeeks +
                ", totalWeeks=" + totalWeeks +
                ", weightLost=" + weightLost +
                ", muscleGained=" + muscleGained +
                '}';
    }

	public double getWeightLost() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object completedWeeks() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getMuscleGained() {
		// TODO Auto-generated method stub
		return 0;
	}
}