package com.imooc.dataobject;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
//@DynamicUpdate是可以跟随系统时间载入数据库的
//@Data是用于简化set和get的重复操作
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    public ProductCategory() {}

    public ProductCategory(String categoryName, Integer categoryType) {
            this.categoryName = categoryName;
            this.categoryType = categoryType;
    }
}
