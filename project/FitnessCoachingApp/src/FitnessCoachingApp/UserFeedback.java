package FitnessCoachingApp;

public class UserFeedback {
    private String userId;
    private int rating; // e.g., 1 to 5
    private String comments;

    public UserFeedback(String userId, int rating, String comments) {
        this.userId = userId;
        this.rating = rating;
        this.comments = comments;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public int getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "UserFeedback{" +
                "userId='" + userId + '\'' +
                ", rating=" + rating +
                ", comments='" + comments + '\'' +
                '}';
    }
}