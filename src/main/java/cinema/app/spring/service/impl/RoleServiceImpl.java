package cinema.app.spring.service.impl;

import cinema.app.spring.dao.RoleDao;
import cinema.app.spring.model.Role;
import cinema.app.spring.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleDao.getByName(roleName).get();
    }
}
