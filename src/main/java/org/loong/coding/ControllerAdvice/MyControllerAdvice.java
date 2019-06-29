package org.loong.coding.ControllerAdvice;

import org.loong.coding.model.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

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


}
