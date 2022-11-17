package kr.kwangan2.jpatest.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="BOARD")
@Data
public class Board implements Serializable {
	
	@Id
	@GeneratedValue
	private Long seq;
	private String title;
	private String writer;
	private String content;
	private Date createDate;
	private Long cnt;
   
}	// class
