package eu.kielczewski.example.controller;

import eu.kielczewski.example.domain.User;
import eu.kielczewski.example.service.UserService;
import eu.kielczewski.example.util.UserUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    private UserController userController;

    @Before
    public void setUp() throws Exception {
        userController = new UserController(userService);
    }

    @Test
    public void shouldCreateUser() throws Exception {
        final User user = UserUtil.createUser();
        userController.createUser(user);
        // verify user was passed to UserService
        verify(userService, times(1)).save(user);
    }

    @Test
    public void shouldListAllUsers() throws Exception {
        userController.listUsers();
        // verify user was passed to UserService
        verify(userService, times(1)).getList();
    }

}
