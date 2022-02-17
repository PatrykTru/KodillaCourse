package com.kodilla.testing.library;

import com.kodilla.testing.libary.Book;
import com.kodilla.testing.libary.BookLibrary;
import com.kodilla.testing.libary.LibraryDatabase;
import com.kodilla.testing.libary.LibraryUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@DisplayName("Book Directory Test Suite")
@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

        @Test
        void testListBooksWithConditionsReturnList() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

            // When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            // Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksWithConditionMoreThan20() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf015Books = generateListOfNBooks(15);
            List<Book> resultListOf040Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf015Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                    .thenReturn(resultListOf040Books);

            //When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

            //Then
            assertEquals(0,theListOfBooks0.size());
            assertEquals(15,theListOfBooks15.size());
            assertEquals(40,theListOfBooks40.size());




        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            // Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }




        @Test
        void listBooksInHandsOf0Books() {
            //Given
            LibraryUser libraryUser = mock(LibraryUser.class);
            List<Book> listOfBooks = new ArrayList<>();
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                    .thenReturn(listOfBooks);

            //When
            List<Book> usersBooks = libraryDatabaseMock.listBooksInHandsOf(libraryUser);

            //Then
            assertEquals(0,usersBooks.size());

        }

        @Test
        void listBooksInHandsOf1Book() {
            LibraryUser libraryUser = mock(LibraryUser.class);
            List<Book> listOfBooks = generateListOfNBooks(1);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                    .thenReturn(listOfBooks);

            //When
            List<Book> usersBooks = libraryDatabaseMock.listBooksInHandsOf(libraryUser);

            //Then
            assertEquals(1,usersBooks.size());
        }

        @Test
        void listBooksInHandsOf5Books() {
            LibraryUser libraryUser = mock(LibraryUser.class);
            List<Book> listOfBooks = generateListOfNBooks(5);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                    .thenReturn(listOfBooks);

            //When
            List<Book> usersBooks = libraryDatabaseMock.listBooksInHandsOf(libraryUser);

            //Then
            assertEquals(5,usersBooks.size());
        }



}
