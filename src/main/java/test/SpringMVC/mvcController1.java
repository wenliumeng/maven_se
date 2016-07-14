package test.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * xxx
 * Created by seyMour on 2016/4/27.
 * ☞120465271@qq.com☜
 */

@Controller
@RequestMapping("/mvc")
public class mvcController1{

    /**
     * 注解的方法级别引用
     * @return
     */
    @RequestMapping(value = "/hello")
    public String hello(){
        System.out.println("---------------hello---------------");
        return "hello";
    }

    /**
     * 参数绑定
     * @param name
     * @return
     */
    @RequestMapping(value = "/person")
    public String toPerson(@RequestParam("name") String name){
        System.out.println("--------------" + name + "---------------");
        return "hello";
    }

    /**
     * Rest风格参数
     * @param name
     * @return
     */
    @RequestMapping("/person1/{name}")
    public String toPersonrest(@PathVariable String name){
        System.out.println("-------------" + name + "----------------");
        return "hello";
    }

    /**
     * Rest风格2
     * @param somename
     * @return
     */
    @RequestMapping(value = "/person2/{name}")
    public void toPersonrest1(@PathVariable("name") String somename){
        System.out.println("-----------" + somename + "-------------");
    }

    /**
     * 同时绑定多个参数
     * @return
     */
    @RequestMapping(value = "person3/{name}/age/{age}")
    public void toPersonrest2(@PathVariable String name,@PathVariable String age){
        System.out.println("-------" + name + "  " + age + "----------");
    }

    /**
     * 正则表达式
     * @return
     */
    @RequestMapping(value = "reg/{textualPart:[a-z-]+}.{test:[\\d]+}")
    public void Rege(@PathVariable String textualPart,@PathVariable String test){
        System.out.println("-------" + textualPart +"   "  + test+ "--------");
    }

    @RequestMapping("/param")
    public String testRequestParam(@RequestParam("id") Integer id, @RequestParam("name") String name) {
        System.out.println(id + "  " + name);
        return "hello";
    }

}
