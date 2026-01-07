package com.lj.rag.entity.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * @ClassName OrganizationTag
 * @Description 组织标签实体类
 * @Author Dark Chocolate 2069057986@qq.com
 * @Date 2026/1/7 22:14
 * @Version JDK 17
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationTag {

    /**
     * 标签唯一标识
     */
    private String tagId;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 父标签ID (自关联)
     */
    private String parentTag;

    /**
     * 创建者ID
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;
}
