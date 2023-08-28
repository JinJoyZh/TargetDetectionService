package vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class MessageImageAttachmentVo extends MessageAttachmentVo {
    @ApiModelProperty(value = "影像类型")
    @TableField("image_type_")
    @JsonProperty("imageType")
    private String imageType;

    @ApiModelProperty(value = "技术")
    @TableField("image_technology_")
    @JsonProperty("imageTechnology")
    private String imageTechnology;
}
