package com.test.second.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;


@TableName("c_yard")
@Data
public class Yard implements Serializable {


    private static final long serialVersionUID = 3653051383559468137L;
    private Integer id;
    private String yard;
    private Integer angle;
    private BigDecimal x;
    private BigDecimal y;
    private String ef;
    private Integer bay;
    private Integer row;
    private Integer flo;
    private String area;

    @Override
    public String toString() {
        return "Yard{" +
            "id=" + id +
            ", yard='" + yard + '\'' +
            ", angle=" + angle +
            ", x=" + x +
            ", y=" + y +
            ", ef='" + ef + '\'' +
            ", bay=" + bay +
            ", row=" + row +
            ", flo=" + flo +
            ", area='" + area + '\'' +
            '}';
    }
}
