package com.dragon.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dragon.entity.Teacher;
import com.dragon.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JEMY
 * @since 2020-06-14
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("list")
    public List<Teacher> list(){
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        return teacherService.list(queryWrapper);
    }

}

