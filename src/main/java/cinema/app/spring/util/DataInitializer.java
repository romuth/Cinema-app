package cinema.app.spring.util;

import cinema.app.spring.model.Role;
import cinema.app.spring.model.User;
import cinema.app.spring.service.RoleService;
import cinema.app.spring.service.UserService;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRole(Role.Authority.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRole(Role.Authority.USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@i.ua");
        admin.setPassword("admin123");
        admin.setRoles(Set.of(adminRole));
        User user = new User();
        user.setEmail("test@gmail.com");
        user.setPassword("1234");
        user.setRoles(new HashSet<>());
        user.getRoles().add(userRole);
        userService.add(admin);
        userService.add(user);
    }
}
