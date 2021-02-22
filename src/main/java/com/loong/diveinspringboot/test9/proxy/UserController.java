package com.loong.diveinspringboot.test9.proxy;


import com.loong.diveinspringboot.test7.new1.RequestInfo;
import com.loong.diveinspringboot.test7.new3.MetricsCollector;
import com.loong.diveinspringboot.test7.old.UserVo;

public class UserController implements IUserController {
    //...省略其他属性和方法...
    private MetricsCollector metricsCollector; // 依赖注入

    @Override
    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // ... 省略login逻辑...

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        //...返回UserVo数据...
        return null;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // ... 省略register逻辑...

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        //...返回UserVo数据...
        return null;
    }
}