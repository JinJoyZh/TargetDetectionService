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

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public LocalDateTime getProcessTime() {
        return processTime;
    }

    public void setProcessTime(LocalDateTime processTime) {
        this.processTime = processTime;
    }

    public LocalDateTime getProcessPerson() {
        return processPerson;
    }

    public void setProcessPerson(LocalDateTime processPerson) {
        this.processPerson = processPerson;
    }
}
