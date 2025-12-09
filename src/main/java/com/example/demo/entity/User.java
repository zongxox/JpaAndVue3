package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@EntityListeners(AuditingEntityListener.class) //自動填入 建立或更新時間 以及 建立或修改 使用者
@Table(name = "user") //映射哪個資料表
@Entity //宣告為實體類
//不繼承 Base使用方式
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    //unique開啟數據庫唯一約束
    @Column(name = "account", unique = true)
    private String account;

    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @CreatedBy //設定為建立者，當實體被INSERT 時會預設值。
    @Column(name = "create_by") //對應資料表欄位名稱
    private String createBy;

    //紀錄 資料建立時間
    @CreatedDate //設定為建立時間，當實體被INSERT 時會預設值。
    @Temporal(TemporalType.TIMESTAMP) //宣告日期和時間
    @Column(name = "create_time") //對應資料表欄位名稱
    private Date createTime;

    //紀錄 最後修改這筆資料的人
    @LastModifiedBy //設定為修改者，當實體被UPDATE 時會預設值。
    @Column(name = "update_by") //對應資料表欄位名稱
    private String updateBy;

    //紀錄 最後更新時間
    @LastModifiedDate //設定為修改時間，當實體被UPDATE 時會預設值。
    @Temporal(TemporalType.TIMESTAMP)//宣告日期和時間
    @Column(name = "update_time") //對應資料表欄位名稱
    private Date updateTime;


}
