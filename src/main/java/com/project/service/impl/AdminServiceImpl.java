package com.project.service.impl;

import com.project.pojo.Admin;

public interface AdminServiceImpl {
    Object login(String username, String password);
    Object register(Admin admin);
}
