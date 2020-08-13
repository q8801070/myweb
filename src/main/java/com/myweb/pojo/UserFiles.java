package com.myweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
//使用者持有的檔案資訊
public class UserFiles implements Serializable {

    private int id;
    private int fileId;
    private String fileName;
    private int size;
    private int type;
    private int downloadTime;
    private String postfix;



}
