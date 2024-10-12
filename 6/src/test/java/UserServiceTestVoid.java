import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class UserServiceTestVoid {
    @Mock
    private UserRepository userRepository;
    @Mock
    private EmailService emailService;
    @Mock
    private StatisticsService statisticsService;

    @InjectMocks
    private UserService userService;

    @Test
    void shouldRegisterNewUser() {
        // given
        User user = new User("test@example.com");
        // when
        userService.registerNewUser(user);
        // then
        // Musimy sprawdzić każde wywołanie
        verify(userRepository).save(user);
        verify(emailService).sendEmail(user, "Witamy w systemie!");
        verify(statisticsService).incrementUserRegistrations();
    }
}
