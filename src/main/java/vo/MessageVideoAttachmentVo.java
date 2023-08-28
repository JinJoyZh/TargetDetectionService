package vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

public class MessageVideoAttachmentVo extends MessageAttachmentVo {
    @TableField("start_time_")
    @JsonProperty("startTime")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "时长")
    @TableField("duration")
    @JsonProperty("duration")
    private Integer duration;
}
