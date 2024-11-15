package com.ws12.vttp5a_ssf_day02l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ws12.vttp5a_ssf_day02l.model.Student;


@Controller
@RequestMapping("/students")
public class StudentController {
    List<Student> students = new ArrayList<>();
    
    @RequestMapping(path= {"", "/allStudents"}, method=RequestMethod.GET)
    public String studentListing(Model model) throws ParseException{
        String dob ="18 Dec 1975 10:25:00.000 GMT";
        //convert string to epoch (long)
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS zzz");
        Date dDob = sdf.parse(dob);
        Long epochDob = dDob.getTime();

        Student s1 = new Student(1,"Damien", "test", epochDob, "dahfj@ghfdjd.com", "25 ddj 2123");
        students.add(s1);
        Student s2 = new Student(2,"Damien", "test", epochDob, "dahfj@ghfdjd.com", "25 ddj 2123");
        students.add(s2);
        Student s3 = new Student(3,"Damien", "test", epochDob, "dahfj@ghfdjd.com", "25 ddj 2123");
        students.add(s3);
        
        Long epochTime = 188103300000L;
        Date dTime = new Date(epochTime);
        System.out.println(dTime.toString());
        model.addAttribute("students", students);
        return "studentList";
    }
}
