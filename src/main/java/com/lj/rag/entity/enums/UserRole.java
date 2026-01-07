package com.lj.rag.entity.enums;

import lombok.Getter;

/**
 * @ClassName UserRole
 * @Description
 * @Author Dark Chocolate 2069057986@qq.com
 * @Date 2026/1/7 22:21
 * @Version JDK 17
 */
@Getter
public enum UserRole {
    USER("普通用户"),
    ADMIN("管理员");

    private final String description;

    UserRole(String description) {
        this.description = description;
    }

}
