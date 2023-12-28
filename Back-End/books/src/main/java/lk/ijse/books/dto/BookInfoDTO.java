package lk.ijse.books.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookInfoDTO implements Serializable {
    private String isbn;
    private String title;
    private String writer;
    private int pages;
}