package lk.ijse.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="bookinfo")
public class BookInfo {
    @Id
    private String isbn;
    private String title;
    private String writer;
    private int pages;
}