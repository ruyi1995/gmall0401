package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


@Data

public class BaseCatalog2 implements Serializable {
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCatalog1Id() {
        return catalog1Id;
    }

    @Id
    @Column
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatalog1Id(String catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    @Column
    private String name;
    @Column
    private String catalog1Id;

    public BaseCatalog2() {
    }
}
