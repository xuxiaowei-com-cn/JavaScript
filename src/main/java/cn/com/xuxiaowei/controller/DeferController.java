package cn.com.xuxiaowei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 延时执行 javascript
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Controller
public class DeferController {

    /**
     * 执行 javascript 页面
     *
     * @param request  请求
     * @param response 响应
     * @param model    页面中的值
     * @return 返回 执行 javascript 页面
     */
    @RequestMapping("defer")
    public String defer(HttpServletRequest request, HttpServletResponse response, Model model) {

        return "defer/index";
    }

}
