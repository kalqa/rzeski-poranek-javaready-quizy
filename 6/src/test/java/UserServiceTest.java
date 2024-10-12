import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    @Mock
    private EmailService emailService;
    @Mock
    private StatisticsService statisticsService;

    @InjectMocks
    private UserService userService;

    @Test
    void shouldRegisterNewUserAndReturnCorrectResult() {
        // given
        User user = new User("test@example.com");
        // when
        UserRegistrationResult result = userService.registerNewUser2(user);
        // then
        assertThat(result).isNotNull()
                .extracting(UserRegistrationResult::isEmailSent, UserRegistrationResult::isStatisticsUpdated)
                .containsExactly(true, true);
    }
}
