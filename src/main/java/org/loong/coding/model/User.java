package org.loong.coding.model;

import org.loong.coding.CustomValid.MyConstraint;

/**
 * @author xiongtaolong
 * @date 2019-06-29 17:41
 */
public class User {

    @MyConstraint(message = "这是一次测试")
    private String userName;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
