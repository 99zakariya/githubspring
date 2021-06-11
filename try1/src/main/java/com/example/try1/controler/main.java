package com.example.try1.controler;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import com.example.try1.Dao.MaterVehicleDao;
import com.example.try1.Dao.SessionDetailRepo;
import com.example.try1.Dao.UserDao;
import com.example.try1.pojo.MaterVehicle;
import com.example.try1.pojo.SessionDetail;
import com.example.try1.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class main {
    @Autowired
    SessionDetailRepo sdr;
    @Autowired
    UserDao udao;
    @Autowired
    MaterVehicleDao mvDao;
    @RequestMapping("/")
     public ModelAndView home(@RequestHeader(value = "User-Agent") String user,HttpSession hs,HttpServletRequest req)//@RequestHeader(value = "User-Agent") String user,)
    {
        System.out.println("welcome home");
        // //ud.save(u);
        ModelAndView mv=new ModelAndView("home");

        String id=hs.getId();
        String  ip= req.getRemoteAddr();
        mv.addObject("sid", id);
        mv.addObject("us", user);
        mv.addObject("ip", ip);
        log(user, hs, req);
        
        return mv;
    }
    @RequestMapping("/home")
    
    public String home1()
    {
        System.out.println("welcome home2");
        return "home";
    }
    @RequestMapping("/insert")
    public ModelAndView insertRec( String reg,String mobile,String email,@RequestHeader(value = "User-Agent") String user,HttpSession hs,HttpServletRequest req)
    {
        System.out.println("welcome to insert "+reg+" "+mobile+" "+ email);
        SessionDetail ses= log(user, hs, req);
        MaterVehicle mv=mvDao.findById(reg).orElse(null);
        
        if(mv==null)
        {
            ModelAndView mvob=new ModelAndView("home");
            mvob.addObject("ermsg", "Not valid registration no");
            return mvob;
            
        }
        else
        {

            User usr=new User(ses, mv, email, mobile);
            udao.save(usr);
            ModelAndView mvob=new ModelAndView("vahicleform");
            mvob.addObject("vehicle", mv);
            return mvob;
        
        }

       
    }

    public SessionDetail log( String user,HttpSession hs,HttpServletRequest req)
    {
        String id=hs.getId();
        String  ip= req.getRemoteAddr();
       
         SessionDetail sd=new SessionDetail(id, new Date(), user, ip);
         sdr.save(sd);
         return sd;
    }
}
