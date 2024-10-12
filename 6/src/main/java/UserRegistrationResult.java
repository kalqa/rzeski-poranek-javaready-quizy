class UserRegistrationResult {


    private final boolean emailSent;
    private final boolean statisticsUpdated;

    public UserRegistrationResult(boolean emailSent, boolean statisticsUpdated) {
        this.emailSent = emailSent;
        this.statisticsUpdated = statisticsUpdated;
    }

    public boolean isEmailSent() {
        return false;
    }

    public boolean isStatisticsUpdated() {
        return false;
    }
}