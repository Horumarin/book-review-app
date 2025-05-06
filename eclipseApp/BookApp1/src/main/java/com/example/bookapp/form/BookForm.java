package com.example.bookapp.form;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class BookForm {
	private Long Id;

    @NotBlank(message = "タイトルは必須です")
    private String title;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "日付は必須です")
    private LocalDate date;

    @NotNull(message = "価格は必須です")
    @Min(value = 0, message = "価格は0円以上で入力してください")
    private Integer price;

    @Size(max = 1000, message = "内容は1000文字以内で入力してください")
    private String contents;

    public BookForm() {}

    public BookForm(Long id,String title, LocalDate date, Integer price, String contents) {
    	this.Id = id;
        this.title = title;
        this.date = date;
        this.price = price;
        this.contents = contents;
    }
    

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
    
    
}
