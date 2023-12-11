package com.example.demo.model.domain;

import com.guanmengyuan.spring.ex.common.model.valid.group.SaveGroup;
import com.guanmengyuan.spring.ex.common.model.valid.group.UpdateGroup;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.core.activerecord.Model;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.Date;

@Accessors(chain = true)
@Data(staticConstructor = "create")
@EqualsAndHashCode(callSuper = true)
public class FieldMap extends Model<FieldMap> {

    @NotNull(groups = {SaveGroup.class, UpdateGroup.class}, message = "不能为空")
    @Id(keyType = KeyType.Auto)
    private String id;

    /**
     * date类型
     */
    private LocalDate dateField;

    /**
     * datetime类型
     */
    private Date datetimeField;


    /**
     * time类型
     */
    private LocalTime timeField;

    /**
     * timestamp类型
     */
    private Timestamp timestampField;

    /**
     * year类型
     */
    private Year yearField;

}