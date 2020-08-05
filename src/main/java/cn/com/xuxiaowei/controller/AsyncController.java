package cn.com.xuxiaowei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异步响应
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Controller
public class AsyncController {

    /**
     * 异步响应 页面
     *
     * @param request  请求
     * @param response 响应
     * @param model    页面中的值
     * @return 返回 异步响应 页面
     */
    @RequestMapping("async")
    public String async(HttpServletRequest request, HttpServletResponse response, Model model) {

        return "async/index";
    }

}
