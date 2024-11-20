package com.SebastianIsmaelG.LibrosAPI.main;

import com.SebastianIsmaelG.LibrosAPI.models.BooksData;
import com.SebastianIsmaelG.LibrosAPI.models.RequestData;
import com.SebastianIsmaelG.LibrosAPI.services.ConvertData;
import com.SebastianIsmaelG.LibrosAPI.services.RequestAPI;

import java.util.*;

public class Main {
    //API DE USO https://gutendex.com/?ref=public_apis
    private final RequestAPI requestAPI = new RequestAPI();
    private final ConvertData convertData = new ConvertData();
    private final Scanner write = new Scanner(System.in);

    String URL_API = "https://gutendex.com/books/";

    public void principalInterface() {

        var json = RequestAPI.obtainData(URL_API);
        var data = convertData.obtainData(json, RequestData.class);

        System.out.println("------------API STADISTICS-----------------");

        System.out.println("Top 10 most downloaded books");
        System.out.println("--------------------");
        data.books().stream().sorted(Comparator.comparing(BooksData::download_count).reversed())
                .limit(10).forEach(System.out::println);
        System.out.println("--------------------");

        System.out.println("Enter the name of the book you want to search : ");
        var book_enter = write.nextLine();
        json = RequestAPI.obtainData(URL_API+"?search="+book_enter.replace(" ",""));
        var searchResult = convertData.obtainData(json,RequestData.class);
        Optional<BooksData> BookSearched = searchResult.books().stream().filter(b -> b.title().toUpperCase()
                .contains(book_enter.toUpperCase())).findFirst();
        if (BookSearched.isPresent()){
            System.out.println(BookSearched.get());
        }else {
            System.out.println("Not found, check data");
        }


    }
}
