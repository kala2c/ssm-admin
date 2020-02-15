package com.project.service;

import com.project.dao.AdminMapper;
import com.project.pojo.Admin;
import com.project.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class AdminService implements AdminServiceImpl {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Object login(String username, String password) {
        Admin admin = adminMapper.selectByUsername(username);

        if (admin == null) {
            return null;
        }

        if (admin.getPassword().equals(password)) {
            return admin;
        } else {
            return null;
        }
    }

    @Override
    public Integer register(Admin admin) {
        return adminMapper.insert(admin);
    }
}
