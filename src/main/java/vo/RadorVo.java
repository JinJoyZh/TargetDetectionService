package vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class RadorVo {
    @ApiModelProperty(value = "雷达型号(默认下拉框从字典表-雷达型号取值；界面可编辑)")
    @TableField("rador_type_")
    @JsonProperty("radorType")
    @Excel(name = "雷达型号")
    private String radorType;

    @ApiModelProperty(value = "工作体制(字典值)")
    @TableField("work_system_")
    @JsonProperty("workSystem")
    @Excel(name = "工作体制")
    private String workSystem;

    @ApiModelProperty(value = "雷达用途(字典表-雷达用途)")
    @TableField("rador_usage_")
    @JsonProperty("radorUsage")
    @Excel(name = "雷达用途")
    private String radorUsage;

    @ApiModelProperty(value = "载频类型(字典表-载频类型)")
    @TableField("rf_type_")
    @JsonProperty("rfType")
    @Excel(name = "载频类型")
    private String rfType;

    @ApiModelProperty(value = "载频值")
    @TableField("rf_value_")
    @JsonProperty("rfValue")
    @Excel(name = "载频值")
    private String rfValue;

    @ApiModelProperty(value = "载频最大值")
    @TableField("rf_max_")
    @JsonProperty("rfMax")
    @Excel(name = "载频最大值")
    private String rfMax;

    @ApiModelProperty(value = "载频最小值")
    @TableField("rf_min_")
    @JsonProperty("rfMin")
    @Excel(name = "载频最小值")
    private String rfMin;

    @ApiModelProperty(value = "重复周期类型")
    @TableField("pri_type_")
    @JsonProperty("priType")
    @Excel(name = "重复周期类型")
    private String priType;

    @ApiModelProperty(value = "重复周期值(小数格式，保留小数点后6位)")
    @TableField("pri_value_")
    @JsonProperty("priValue")
    @Excel(name = "重复周期值(小数格式，保留小数点后6位)")
    private String priValue;

    @ApiModelProperty(value = "重复周期最大值(小数格式，保留小数点后6位)")
    @TableField("pri_max_")
    @JsonProperty("priMax")
    @Excel(name = "重复周期最大值(小数格式，保留小数点后6位)")
    private String priMax;

    @ApiModelProperty(value = "重复周期最小值(小数格式，保留小数点后6位)")
    @TableField("pri_min_")
    @JsonProperty("priMin")
    @Excel(name = "重复周期最小值(小数格式，保留小数点后6位)")
    private String priMin;

    @ApiModelProperty(value = "脉宽类型")
    @TableField("pw_type_")
    @JsonProperty("pwType")
    @Excel(name = "脉宽类型")
    private String pwType;

    @ApiModelProperty(value = "脉宽值(小数格式，保留小数点后6位)")
    @TableField("pw_value_")
    @JsonProperty("pwValue")
    @Excel(name = "脉宽值(小数格式，保留小数点后6位)")
    private String pwValue;

    @ApiModelProperty(value = "脉宽最大值(小数格式，保留小数点后6位)")
    @TableField("pw_max_")
    @JsonProperty("pwMax")
    @Excel(name = "脉宽最大值(小数格式，保留小数点后6位)")
    private String pwMax;

    @ApiModelProperty(value = "脉宽最小值(小数格式，保留小数点后6位)")
    @TableField("pw_min_")
    @JsonProperty("pwMin")
    @Excel(name = "脉宽最小值(小数格式，保留小数点后6位)")
    private String pwMin;

    @ApiModelProperty(value = "脉内调制类型")
    @TableField("intm_type_")
    @JsonProperty("intmType")
    private String intmType;

    @ApiModelProperty(value = "脉内调制值")
    @TableField("intm_value_")
    @JsonProperty("intmValue")
    private String intmValue;

    @ApiModelProperty(value = "扫描类型")
    @TableField("scan_type_")
    @JsonProperty("scanType")
    private String scanType;

    @ApiModelProperty(value = "扫描周期")
    @TableField("scan_value_")
    @JsonProperty("scanValue")
    private String scanValue;

    @ApiModelProperty(value = "信号样式")
    @TableField("sign_style_")
    @JsonProperty("signStyle")
    private String signStyle;
}
