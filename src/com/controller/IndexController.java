package com.controller;

import com.entity.UserEntity;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

@Controller
public class IndexController{
    @Autowired
    private UserService userService;
    @RequestMapping("index")
    public ModelAndView findAll( HttpServletRequest request) throws Exception {
        ModelAndView mva=new ModelAndView("index");
        mva.addObject("list",userService.findAll());
        return mva;
    }
    @RequestMapping("/delete")
    public  ModelAndView delete(Integer uid){
        userService.delete(uid);
        ModelAndView mav=new ModelAndView("redirect:/index");
        return  mav;
    }
    @RequestMapping("/update")
    public  ModelAndView update(UserEntity user, @RequestParam("pic")MultipartFile file, HttpServletRequest request){
        if (file.getSize()>0) {
            String path=request.getRealPath("/");
            String oldname=file.getOriginalFilename();
            String ext=oldname.substring(oldname.lastIndexOf("."));
            String newname=UUID.randomUUID().toString()+ext;

            File f=new File(path+"/imgs/"+newname);
            f.getParentFile().mkdirs();
            try {
                file.transferTo(f);
                user.setImg(newname);
                System.out.println(user.getImg());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        userService.update(user);
        ModelAndView mav=new ModelAndView("redirect:/index");
        return  mav;

    }

    @RequestMapping("add")
    public  ModelAndView insert(UserEntity user,@RequestParam("pic") MultipartFile file,HttpServletRequest request){
        if (file.getSize()>0) {
            String path=request.getRealPath("/");
            String oldname=file.getOriginalFilename();
            String ext=oldname.substring(oldname.lastIndexOf("."));
            String newname=UUID.randomUUID().toString()+ext;

            File f=new File(path+"/imgs/"+newname);
            f.getParentFile().mkdirs();
            try {
                file.transferTo(f);
                user.setImg(newname);
                System.out.println(user.getImg());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        userService.add(user);
        ModelAndView mav=new ModelAndView("redirect:/index");
        return  mav;
    }
    @RequestMapping("/findOne")
    public  ModelAndView findOne(Integer uid){
        ModelAndView mav=new ModelAndView("MyJsp");
        mav.addObject("findOne",userService.findOne(uid));
        mav.addObject("Car",userService.findCar());
        return  mav;
    }
    @RequestMapping("/findCar")
    public ModelAndView findCar(){
        ModelAndView mva=new ModelAndView("MyJsp");
        mva.addObject("Car",userService.findCar());
        return mva;
    }

}
