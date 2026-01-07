package com.lj.rag.entity.user;

import com.lj.rag.entity.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @ClassName User
 * @Description
 * @Author Dark Chocolate 2069057986@qq.com
 * @Date 2026/1/7 22:09
 * @Version JDK 17
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * 用户唯一标识
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 加密后的密码
     */
    private String password;

    /**
     * 用户角色 (对应数据库 ENUM)
     */
    private UserRole role;

    /**
     * 用户所属组织标签，多个用逗号分隔
     * 建议：在业务逻辑层可以使用 .split(",") 转为 List<String> 处理
     */
    private String orgTags;

    /**
     * 用户主组织标签
     */
    private String primaryOrg;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;
}
