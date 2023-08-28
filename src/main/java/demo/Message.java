package demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    @JsonProperty("dataType")
    private String dataType;
    public void setDataType(String dataType){
        this.dataType = dataType;
    }

    @JsonProperty("dataPath")
    private String dataPath;
    public void setDataPath(String dataPath){
        this.dataPath = dataPath;
    }

}
