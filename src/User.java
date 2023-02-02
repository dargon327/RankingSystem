public class User {
    private int rank,progress;
    public User() {
        rank = -8;
        progress = 0;
    }
    public String toString() {
        return "User{rank=" + rank + ", progress=" + progress + "}";
    }
    public int getRank() {
        return rank;
    }
    public int getProgress() {
        return progress;
    }
    public void incProgress(int progressRank) {
        if (progressRank != 0 && progressRank <= 8 && progressRank >= -8) {
            if (progressRank > 0 && rank < 0) {
                progressRank--;
            }
            if(progressRank < 0 && rank > 0) {
                progressRank++;
            }
            if (progressRank > rank) {
                progress += (progressRank-rank) * (progressRank-rank) * 10;
            } else if (progressRank == rank) {
                progress += 3;
            } else if (progressRank == rank-1) {
                progress += 1;
            }
            while (progress > 100) {
                progress -= 100;
                if (rank == 8) {
                    continue;
                }
                rank++;
                if (rank == 0) {
                    rank++;
                }

            }
        } else {
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        }
    }
}
