package org.loong.demonstration;

import org.springframework.core.convert.converter.Converter;

public class StringToUserConverter implements Converter<String, User> {

    @Override
    public User convert (String userStr) {
        User user= new User() ;
        String[] strArr = userStr.split("-");
        Long id= Long.parseLong(strArr[0]);
        String userName = strArr[1];
        String note= strArr[2] ;
        user.setId(id);
        user.setUserName(userName);
        user.setNote(note);
        return user ;
    }
}
class User{
    private Long id;
    private String userName;
    private String note;


    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNote(String note) {
        this.note = note;
    }
}