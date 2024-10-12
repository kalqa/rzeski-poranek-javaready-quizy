class UserService {

    private UserRepository userRepository;
    private UserService userService;
    private EmailService emailService;
    private StatisticsService statisticsService;

    public UserService(UserRepository userRepository, UserService userService, EmailService emailService, StatisticsService statisticsService) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.emailService = emailService;
        this.statisticsService = statisticsService;
    }

    public void registerNewUser(User user) {
        userRepository.save(user);
        emailService.sendEmail(user, "Witamy w systemie!");
        statisticsService.incrementUserRegistrations();
    }

    public UserRegistrationResult registerNewUser2(User user) {
        userRepository.save(user);
        boolean emailSent = emailService.sendEmail2(user, "Witamy w systemie!");
        boolean statisticsUpdated = statisticsService.incrementUserRegistrations2();
        return new UserRegistrationResult(emailSent, statisticsUpdated);
    }
}
