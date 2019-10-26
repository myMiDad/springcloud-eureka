package com.tom.cloud.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * ClassName: User
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 16:52
 */

@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private Integer userAge;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
