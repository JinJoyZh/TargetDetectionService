package vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

public class TargetScoutVo {
    @ApiModelProperty(value = "侦获手段(字典表-侦获手段)")
    @TableField("scout_type_")
    @JsonProperty("scoutType")
    @Excel(name = "侦获手段")
    private String scoutType;

    @ApiModelProperty(value = "侦获时间")
    @TableField("scout_time_")
    @JsonProperty("scoutTime")
    @Excel(name = "侦获时间")
    private LocalDateTime scoutTime;

    @ApiModelProperty(value = "侦察技术(字典表-侦察技术)")
    @TableField("scout_tech_")
    @JsonProperty("scoutTech")
    @Excel(name = "侦察技术")
    private String scoutTech;

    @ApiModelProperty(value = "侦察设备")
    @TableField("scout_equipment_")
    @JsonProperty("scoutEquipment")
    private String scoutEquipment;

    @ApiModelProperty(value = "侦察距离")
    @TableField("scout_distance_")
    @JsonProperty("scoutDistance")
    @Excel(name = "侦察距离")
    private String scoutDistance;

    @ApiModelProperty(value = "定位时间")
    @TableField("positioning_time_")
    @JsonProperty("positioningTime")
    @Excel(name = "定位时间")
    private LocalDateTime positioningTime;

    @ApiModelProperty(value = "移动状态(1:移动 0:静止)")
    @TableField("mobile_status_")
    @JsonProperty("mobileStatus")
    @Excel(name = "移动状态")
    private String mobileStatus;

}
