package vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class TargetVo {
    @ApiModelProperty(value = "目标名称")
    @TableField("target_name_")
    @JsonProperty("targetName")
    @Excel(name = "目标名称")
    private String targetName;

    @ApiModelProperty(value = "目标类型(字典表-目标类型)")
    @TableField("target_type_")
    @JsonProperty("targetType")
    private String targetType;

    @ApiModelProperty(value = "目标类别(字典表-目标类别)")
    @TableField("target_category_")
    @JsonProperty("targetCategory")
    @Excel(name = "目标类别")
    private String targetCategory;

    @ApiModelProperty(value = "经度(小数格式，保留小数点后6位)")
    @TableField("longitude_")
    @JsonProperty("longitude")
    @Excel(name = "经度(小数格式，保留小数点后6位)")
    private String longitude;

    @ApiModelProperty(value = "纬度(小数格式，保留小数点后6位)")
    @TableField("latitude_")
    @JsonProperty("latitude")
    @Excel(name = "纬度(小数格式，保留小数点后6位)")
    private String latitude;

    @ApiModelProperty(value = "目标高程")
    @TableField("target_altitude_")
    @JsonProperty("targetAltitude")
    @Excel(name = "目标高程")
    private String targetAltitude;

    @ApiModelProperty(value = "定位误差")
    @TableField("loc_error_")
    @JsonProperty("locError")
    @Excel(name = "定位误差")
    private Integer locError;

    @ApiModelProperty(value = "速度(km/h，小数格式，保留小数点后2位)")
    @TableField("velocity_")
    @JsonProperty("velocity")
    @Excel(name = "速度(km/h，小数格式，保留小数点后2位)")
    private String velocity;

    @ApiModelProperty(value = "方向(方向角度，小数格式，保留小数点后2位)")
    @TableField("direct_")
    @JsonProperty("direct")
    @Excel(name = "方向(方向角度，小数格式，保留小数点后2位)")
    private String direct;

    @ApiModelProperty(value = "尺寸")
    @TableField("size_")
    @JsonProperty("size")
    @Excel(name = "尺寸")
    private String size;

    @ApiModelProperty(value = "材质")
    @TableField("material_")
    @JsonProperty("material")
    @Excel(name = "材质")
    private String material;

    @ApiModelProperty(value = "要害")
    @TableField("key_points_")
    @JsonProperty("keyPoints")
    @Excel(name = "要害")
    private String keyPoints;

    @ApiModelProperty(value = "工作状态(1:是 0:否)")
    @TableField("work_status_")
    @JsonProperty("workStatus")
    @Excel(name = "工作状态(1:是 0:否)")
    private String workStatus;

    @ApiModelProperty(value = "伪装状态(有/无)")
    @TableField("mask_status_")
    @JsonProperty("maskStatus")
    @Excel(name = "伪装状态(有/无)")
    private String maskStatus;

    @ApiModelProperty(value = "伪装类型(遮盖/假)")
    @TableField("mask_type_")
    @JsonProperty("maskType")
    @Excel(name = "伪装类型(遮盖/假)")
    private String maskType;

    @ApiModelProperty(value = "毁伤状态(字典表-毁伤状态)")
    @TableField("damage_status_")
    @JsonProperty("damageStatus")
    @Excel(name = "毁伤状态")
    private String damageStatus;

    @ApiModelProperty(value = "周边防护情况")
    @TableField("nearby_guard_")
    @JsonProperty("nearbyGuard")
    @Excel(name = "周边防护情况")
    private String nearbyGuard;

    @ApiModelProperty(value = "周边典型（参照）地物")
    @TableField("nearby_terrain_")
    @JsonProperty("nearbyTerrain")
    @Excel(name = "周边典型（参照）地物")
    private String nearbyTerrain;

    @ApiModelProperty(value = "国家/地区(字典表-国家/地区)")
    @TableField("nation_region_")
    @JsonProperty("nationRegion")
    @Excel(name = "国家/地区")
    private String nationRegion;

    @ApiModelProperty(value = "机弦号")
    @TableField("jxh_")
    @JsonProperty("jxh")
    @Excel(name = "机弦号")
    private String jxh;

    @ApiModelProperty(value = "敌我属性")
    @TableField("iff_")
    private String iff;

    @ApiModelProperty(value = "威胁等级")
    @TableField("threat_level_")
    private String threatLevel;

    @ApiModelProperty(value = "优先级")
    @TableField("priority_")
    private String priority;

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getTargetCategory() {
        return targetCategory;
    }

    public void setTargetCategory(String targetCategory) {
        this.targetCategory = targetCategory;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getTargetAltitude() {
        return targetAltitude;
    }

    public void setTargetAltitude(String targetAltitude) {
        this.targetAltitude = targetAltitude;
    }

    public Integer getLocError() {
        return locError;
    }

    public void setLocError(Integer locError) {
        this.locError = locError;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getKeyPoints() {
        return keyPoints;
    }

    public void setKeyPoints(String keyPoints) {
        this.keyPoints = keyPoints;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public String getMaskStatus() {
        return maskStatus;
    }

    public void setMaskStatus(String maskStatus) {
        this.maskStatus = maskStatus;
    }

    public String getMaskType() {
        return maskType;
    }

    public void setMaskType(String maskType) {
        this.maskType = maskType;
    }

    public String getDamageStatus() {
        return damageStatus;
    }

    public void setDamageStatus(String damageStatus) {
        this.damageStatus = damageStatus;
    }

    public String getNearbyGuard() {
        return nearbyGuard;
    }

    public void setNearbyGuard(String nearbyGuard) {
        this.nearbyGuard = nearbyGuard;
    }

    public String getNearbyTerrain() {
        return nearbyTerrain;
    }

    public void setNearbyTerrain(String nearbyTerrain) {
        this.nearbyTerrain = nearbyTerrain;
    }

    public String getNationRegion() {
        return nationRegion;
    }

    public void setNationRegion(String nationRegion) {
        this.nationRegion = nationRegion;
    }

    public String getJxh() {
        return jxh;
    }

    public void setJxh(String jxh) {
        this.jxh = jxh;
    }

    public String getIff() {
        return iff;
    }

    public void setIff(String iff) {
        this.iff = iff;
    }

    public String getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
