package vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
//import com.spacesystech.rhjk.base.hs.model.TargetDamageAssessment;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.util.List;

public class MessageVo {
    @ApiModelProperty(value = "场景编码")
    @TableField("scene_code_")
    @JsonProperty("sceneCode")
    @Excel(name = "场景编码")
    private String sceneCode;

    @ApiModelProperty(value = "上报时间")
    @Excel(name = "上报时间")
    private LocalDateTime reportTime;

    @ApiModelProperty(value = "目标批号")
    @TableField("target_batch_num_")
    @JsonProperty("targetBatchNum")
    @Excel(name = "目标批号")
    private String targetBatchNum;

    @ApiModelProperty(value = "目标基本信息")
    @TableField("target")
    @JsonProperty("target")
    private TargetVo targetVo;

    @ApiModelProperty(value = "目标基本信息")
    @TableField("targetScout")
    @JsonProperty("targetScout")
    private TargetScoutVo targetScoutVo;


    @ApiModelProperty(value = "数量")
    @TableField("quantity_")
    @JsonProperty("quantity")
    @Excel(name = "数量")
    private String quantity;

    @ApiModelProperty(value = "情报来源")
    @TableField("intelligence_source_")
    @JsonProperty("intelligenceSource")
    @Excel(name = "情报来源")
    private String intelligenceSource;

    @ApiModelProperty("附件信息")
    @TableField(exist=false)
    @JsonProperty("fileList")
    private List<MessageAttachmentVo> fileList;

    @ApiModelProperty("影像信息")
    @TableField(exist=false)
    @JsonProperty("imageList")
    private List<MessageImageAttachmentVo> imageList;

    @ApiModelProperty("视频信息")
    @TableField(exist=false)
    @JsonProperty("videoList")
    private List<MessageVideoAttachmentVo> videoList;


    @ApiModelProperty(value = "报文录入类型(1:电子录入 2图片录入)")
    @TableField("message_type_")
    @JsonProperty("messageType")
    @Excel(name = "报文录入类型(1:电子录入 2:图片录入)")
    private String messageType;

    @ApiModelProperty(value = "备注")
    @TableField("memo_")
    @JsonProperty("memo")
    @Excel(name = "备注")
    private String memo;

    @ApiModelProperty(value = "可信度")
    @TableField("credibility_")
    @JsonProperty("credibility")
    @Excel(name = "可信度")
    private String credibility;

    @ApiModelProperty("需要合并的成果id")
    @TableField(exist=false)
    private List<String> resultIds;

    @ApiModelProperty(value = "自动解析文本")
    @TableField("automatic_analysis_text_")
    @JsonProperty("automaticAnalysisText")
    @Excel(name = "自动解析文本")
    private String automaticAnalysisText;

//    @ApiModelProperty(value = "毁伤信息")
//    @TableField(exist = false)
//    private TargetDamageAssessment targetDamageAssessment;

    @ApiModelProperty(value = "位置")
    @TableField("location_")
    @Excel(name = "位置")
    private String location;

    @ApiModelProperty(value = "标志信息")
    @TableField("sign_info_")
    @Excel(name = "标志信息")
    private String signInfo;

    @ApiModelProperty(value = "基本信息")
    @TableField("base_info_")
    @Excel(name = "基本信息")
    private String baseInfo;

    @ApiModelProperty(value = "地位信息")
    @TableField("status_info_")
    @Excel(name = "地位信息")
    private String statusInfo;

    @ApiModelProperty(value = "分佈信息")
    @TableField("distribution_info_")
    @Excel(name = "分佈信息")
    private String distributionInfo;

    @ApiModelProperty(value = "地形信息")
    @TableField("terrain_info_")
    @Excel(name = "地形信息")
    private String terrainInfo;

    @ApiModelProperty(value = "电子信息")
    @TableField("electronic_info_")
    @Excel(name = "电子信息")
    private String electronicInfo;

    @ApiModelProperty(value = "任务名称")
    @TableField("task_name_")
    @Excel(name = "任务名称")
    private String taskName;

    @ApiModelProperty(value = "发现时间")
    @TableField("find_time_")
    @JsonProperty("findTime")
    private LocalDateTime findTime;

    @ApiModelProperty(value = "消失时间")
    @TableField("vanish_time_")
    @JsonProperty("vanishTime")
    private LocalDateTime vanishTime;

    @ApiModelProperty(value = "发现位置")
    @TableField("find_location_")
    @JsonProperty("findLocation")
    private String findLocation;

    @ApiModelProperty(value = "消失位置")
    @TableField("vanish_location_")
    @JsonProperty("vanishLocation")
    private String vanishLocation;

    @ApiModelProperty(value = "毁伤信息")
    @TableField("hit_info_")
    @Excel(name = "毁伤信息")
    private String hitInfo;

    @ApiModelProperty(value = "打击信息")
    @TableField("spy_info_")
    @Excel(name = "打击信息")
    private String spyInfo;

    @ApiModelProperty(value = "数据来源")
    @TableField("data_resource_")
    @Excel(name = "数据来源")
    private String dataResource;

    @ApiModelProperty(value = "分发状态（【success】成功 / 【failure】失败）")
    @TableField("send_stauts_")
    @Excel(name = "分发状态")
    private String sendStauts ;

    @ApiModelProperty(value = "分发次数")
    @TableField("send_again_count_")
    @Excel(name = "分发重试次数")
    private String sendAgainCount = "0";

    @ApiModelProperty(value = "雷达信息列表")
    @TableField(exist = false)
    private List<RadorVo> radorList;

    @ApiModelProperty(value = "是否经过处理 0处理1未处理")
    @JsonProperty("jxProcess")
    @TableField(exist = false)
    private String jxProcess;

    @ApiModelProperty(value = "解析文件类型")
    @JsonProperty("jxFileType")
    @TableField(exist = false)
    private String jxFileType;

    @ApiModelProperty(value = "处理时间")
    @TableField("process_time_")
    @JsonProperty("processTime")
    @Excel(name = "处理时间")
    private LocalDateTime processTime;

    @ApiModelProperty(value = "处理单位")
    @TableField("process_org_")
    @JsonProperty("processOrg")
    @Excel(name = "处理单位")
    private String processOrg;

    @ApiModelProperty(value = "处理人")
    @TableField("process_person_")
    @JsonProperty("processPerson")
    @Excel(name = "处理人")
    private String processPerson;

    @ApiModelProperty(value = "审核人")
    @TableField("audit_person_")
    @JsonProperty("auditPerson")
    @Excel(name = "审核人")
    private String auditPerson;

    @TableField(exist=false)
    @ApiModelProperty(value = "上报人名称")
    private String reportPerson;

    @ApiModelProperty(value = "上报单位")
    @TableField("report_org_")
    @JsonProperty("reportOrg")
    @Excel(name = "上报单位")
    private String reportOrg;
}
