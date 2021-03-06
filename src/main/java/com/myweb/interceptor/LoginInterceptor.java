package com.myweb.interceptor;

import com.myweb.utils.ConfigurationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.myweb.pojo.User;


//已經登入者不允許進入登入註冊頁面，會導向雲端管理頁面。
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    ConfigurationFactory configurationFactory;


    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        System.out.println("攔截");

        //獲取session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute(configurationFactory.getUserSession());

        //判斷該session是否已經有用戶在使用
        if(user != null){
            System.out.println("here");
            //已經有用戶在使用，跳轉回登錄頁面，不允許登錄，強行跳轉。
            request.getRequestDispatcher("/router/checkGoCloudManagement").forward(request,response); //轉發至雲端管理頁面
            return true;
        }
        return true;

    }

}












