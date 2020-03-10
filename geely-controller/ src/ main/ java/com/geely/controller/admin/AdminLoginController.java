package com.geely.controller.admin;

import com.geely.entity.EmployeeAccountTb;
import com.geely.service.EmployeeAccountTbService;
import com.geely.valid.AccountValid;
import com.geely.vo.ResponseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@Api(value = "管理员登录控制器")
@RestController
@RequestMapping("/api/geely/admin")
public class AdminLoginController {
    @Autowired
    private EmployeeAccountTbService employeeAccountTbService;

    @ApiOperation(value = "管理员登录方法")
    @PostMapping("/employee/account/password")
    @ResponseBody
    public ResponseVO AdminLogin(@Valid AccountValid accountValid, BindingResult bindingResult){
        ResponseVO<Object> responseVO = new ResponseVO<>();
        if(bindingResult.hasErrors()){
            responseVO.setCode("401");
            responseVO.setMessage("账号密码不能为空!");
        }else {
            EmployeeAccountTb employeeAccountTb = employeeAccountTbService.selectByUserNameAndPassword(accountValid.getUsername(), accountValid.getPassword());
            if(employeeAccountTb == null){
                responseVO.setCode("401");
                responseVO.setMessage("账号或密码错误，请检查后重试!");
            }else {
                responseVO.setCode("200");
                responseVO.setMessage("登录成功");
            }
        }
        return responseVO;
    }
    @ApiOperation(value = "测试方法")
    @GetMapping("/test")
    @ResponseBody
    public ResponseVO test(){
        ResponseVO<Object> responseVO = new ResponseVO<>();
        responseVO.setMessage("测试");
        responseVO.setCode("200");
        return responseVO;
    }
}
