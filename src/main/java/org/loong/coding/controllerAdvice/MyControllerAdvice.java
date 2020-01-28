package org.loong.coding.controllerAdvice;

import org.loong.coding.model.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author xiongtaolong
 * @date 2019-06-29 18:28
 */
@ControllerAdvice
public class MyControllerAdvice{

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public String exceptionHandler(HttpServletRequest request, MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        StringBuilder builder = new StringBuilder();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            builder.append(fieldError.getDefaultMessage());
        }
        return builder.toString();
    }


    @ModelAttribute(value = "user")
    public User globalModelAttribute() {
        User user = new User();
        user.setAge(11);
        return user;
    }


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy/MM/dd"), true);
        binder.registerCustomEditor(Date.class, editor);
    }

    public static void main(String[] args) {
        //读者可以试一下下面这段代码
        List<Users> list = new ArrayList<>();
        Users user = new Users();
        user.setIdNumber("123");
        user.setName("1");
        list.add(user);
        Users user1= new Users();
        user1.setIdNumber("123");
        user1.setName(null);
        list.add(user1);

        Map<String, Users> collect = list.stream().collect(Collectors.toMap(Users::getIdNumber, users -> users, (a, b) -> a));
        System.out.println(collect);
    }


}
class Users{
    private String idNumber;

    private String name;


    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
