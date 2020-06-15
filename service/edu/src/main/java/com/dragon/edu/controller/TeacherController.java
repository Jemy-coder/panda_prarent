package com.dragon.edu.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.dragon.edu.entity.Teacher;
import com.dragon.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JEMY
 * @since 2020-06-15
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("create")
    public String create(@RequestBody Teacher teacher){
        teacherService.save(teacher);
        return "OK";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable("id") int id){
        teacherService.removeById(id);
        return "OK";
    }

    @PutMapping("update/{id}")
    public String update(@PathVariable("id") int id, @RequestBody Teacher teacher){
        UpdateWrapper<Teacher> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",id);
        teacherService.update(teacher,updateWrapper);
        return "OK";
    }

    @GetMapping("list")
    public List<Teacher> list(){
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        return teacherService.list(queryWrapper);
    }

}

