package org.zhivko.taskManagement.data.entities;

import org.zhivko.taskManagement.data.entities.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "colors")
public class Color extends BaseEntity {

    @Column(name = "color_name",
            nullable = false,
    columnDefinition = "VARCHAR(100)")
    private String colorName = null;

    @Column(name = "color_code",
            nullable = false,
            columnDefinition = "VARCHAR(100)")
    private String colorCode = null;

    public Color() {
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
}
