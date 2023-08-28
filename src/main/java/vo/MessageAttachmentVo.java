package vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

public class MessageAttachmentVo {
    @ApiModelProperty(value = "文件类型")
    @TableField(exist =false)
    private String fileType;

    @ApiModelProperty(value = "文件路径")
    @TableField(exist =false)
    private String filePath;

    @ApiModelProperty(value = "文件名称")
    @TableField(exist =false)
    private String fileName;

    @TableField("process_time_")
    @JsonProperty("processTime")
    private LocalDateTime processTime;

    @TableField("process_person_")
    @JsonProperty("processPerson")
    private LocalDateTime processPerson;
}
