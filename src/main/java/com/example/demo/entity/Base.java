package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class) //自動填入 建立或更新時間 以及 建立或修改 使用者
public class Base {
//	//紀錄 誰建立了這筆資料
//	@CreatedBy //設定為建立者，當實體被INSERT 時會預設值。
//	@Column(name = "CREATE_BY") //對應資料表欄位名稱
//	private String create_by;
//
//	//紀錄 資料建立時間
//	@CreatedDate //設定為建立時間，當實體被INSERT 時會預設值。
//	@Temporal(TemporalType.TIMESTAMP) //宣告日期和時間
//	@Column(name = "CREATE_TIME") //對應資料表欄位名稱
//	private Date create_time;
//
//	//紀錄 最後修改這筆資料的人
//	@LastModifiedBy //設定為修改者，當實體被UPDATE 時會預設值。
//	@Column(name = "UPDATE_BY") //對應資料表欄位名稱
//	private String update_by;
//
//	//紀錄 最後更新時間
//	@LastModifiedDate //設定為修改時間，當實體被UPDATE 時會預設值。
//	@Temporal(TemporalType.TIMESTAMP)//宣告日期和時間
//	@Column(name = "UPDATE_TIME") //對應資料表欄位名稱
//	private Date update_time;
}
