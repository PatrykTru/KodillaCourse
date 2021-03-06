package com.kodilla.testing.libary;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
       if(titleFragment.length()<3 )return bookList;
       List<Book> resultList = libraryDatabase
               .listBooksWithCondition(titleFragment);
       if(resultList.size() > 20) return resultList;
       bookList=resultList;
       return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        return libraryDatabase.listBooksInHandsOf(libraryUser);
    }

}
