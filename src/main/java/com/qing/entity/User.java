package com.qing.entity;

import lombok.Data;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @Author: zhching
 * @Date: 2019/7/2 10:42
 * @Version 1.0
 */
@Data
@Document(collection = "user")
public class User {
    @Id
    private String id;
    @Field(value = "name")
    private String name;
    @Field(value = "age")
    private Integer age;
}
