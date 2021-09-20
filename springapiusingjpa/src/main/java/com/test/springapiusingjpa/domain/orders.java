package com.test.springapiusingjpa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors(chain = true)
@Entity //注意声明为实体类
public class orders {
    @Id
    private Integer oid;
    private String time;
    private String oamount;
    private String totil;
}
