package test.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import test.SpringMVC.model.Person;

/**
 * xxx
 * Created by seyMour on 2016/4/27.
 * ☞120465271@qq.com☜
 */

/*@Controller
@RequestMapping("/mvc")*/
public class mvcController implements org.springframework.web.servlet.mvc.Controller{

    /*@RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/person")
    public String toPerson(String name,double age){
        System.out.println(name + " " + age);
        return "hello";
    }

    @RequestMapping("/person1")
    public String toPerson(Person p){
        System.out.println(p.getName() + " " + p.getAge());
        return "hello";
    }

    @RequestMapping("/param")
    public String testRequestParam(@RequestParam(value = "id") Integer id, @RequestParam(value = "name") String name) {
        System.out.println(id + "  " + name);
        return "hello";
    }*/

    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("-----------------------hello world-------------------");
        return new ModelAndView("/chongdingxiang");
    }
}
