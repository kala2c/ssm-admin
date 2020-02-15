package com.project.controller;

import com.project.common.ServerResponse;
import com.project.pojo.Admin;
import com.project.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     *用户登录
     * @param username
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<Admin> login(@RequestParam("username") String username,@RequestParam("password") String password, HttpSession session) {
        Admin admin = (Admin) adminService.login(username, password);

        return ServerResponse.createBySuccess("success", admin);
    }

    /**
     * 添加用户
     * @param admin
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<Object> create(Admin admin) {
        adminService.register(admin);
        return ServerResponse.createBySuccess();
    }
}
