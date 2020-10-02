package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


@Data//set get 方法

public class BaseCatalog1 implements Serializable {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseCatalog1() {
    }



    @Id
    @Column
    private String id;
    @Column
    private String name;
}