// SAVE BookInfo
$("#btns>button[type='button']").eq(0).on("click", () => {
    console.log("SAVE Clicked..");
    let isbn = $("#isbn").val();
    let title = $("#title").val();
    let writer = $("#writer").val();
    let pages = $("#pages").val();

    console.log("ISBN : "+isbn);
    console.log("Title : "+title);
    console.log("Writer : "+writer);
    console.log("Pages : "+pages);

    // Create a JavaScript object
    let bookInfoObject = {
        isbn: isbn,
        title: title,
        writer: writer,
        pages: pages
    };
    console.log("BoolInfoObject");
    console.log(bookInfoObject);

    // Convert the JavaScript object to a JSON string
    let bookInfoJSON = JSON.stringify(bookInfoObject);
    console.log("BoolInfoJSON : "+bookInfoJSON);

    //AJAX
    const http = new XMLHttpRequest();
    http.onreadystatechange = () =>{
        if(http.readyState == 4 && http.status == 200){
            console.log("BookInfo Saved..");
            console.log("State : "+http.readyState);
        }else{
            console.log("BookInfo Save Failed..");
            console.log("State : "+http.readyState);
        }
    }
    http.open("POST", "http://localhost:2526/books/book",true);
    http.setRequestHeader("Content-Type", "application/json");
    http.send(bookInfoJSON);
});