package chapter8.labs.lab2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Lab 2: 컬렉션 프레임워크 활용하기
 *
 * 도서 관리 시스템의 주요 기능을 구현한 클래스입니다.
 */
public class LibraryManager {
    // 도서 목록 (ArrayList 활용)
    private List<Book> books;
    
    // 사용자별 대여 현황 (HashMap 활용)
    private Map<String, List<Book>> userBorrowMap;
    
    // 도서 카테고리 (HashSet 활용)
    private Set<String> categories;


    /**
     * 생성자
     */
    public LibraryManager() {
        // TODO: 필드를 초기화하세요.
        books = new ArrayList<>();
        userBorrowMap = new HashMap<>();
        categories = new HashSet<>();
    }
    
    /**
     * 도서 추가 메소드
     */
    public void addBook(Book book) {
        // TODO: 도서를 추가하고, 카테고리도 Set에 추가하세요.
        books.add(book);
        categories.add(book.getCategory());
    }
    
    /**
     * 도서 검색 메소드 (제목으로 검색)
     */
    public List<Book> searchBooksByTitle(String title) {
        // TODO: 제목에 검색어가 포함된 도서를 검색하세요.
        return books.stream().filter(b -> b.getTitle().contains(title)).collect(Collectors.toList());
    }
    
    /**
     * 도서 검색 메소드 (저자로 검색)
     */
    public List<Book> searchBooksByAuthor(String author) {
        // TODO: 저자명으로 도서를 검색하세요.
        return books.stream().filter(b -> b.getAuthor().contains(author)).collect(Collectors.toList());
    }
    
    /**
     * 도서 대여 메소드
     */
    public boolean borrowBook(String userId, String isbn) {
        // TODO: 도서를 대여하고, 사용자별 대여 현황을 업데이트하세요.
        List<Book> borrowBooks = userBorrowMap.get(userId);

        if (borrowBooks == null) {
            borrowBooks = new ArrayList<>();
        }

        Book book1;

        if((book1 = books.stream().filter(book -> book.getIsbn().equals(isbn)).toList().get(0)) != null) {
            borrowBooks.add(book1);
            userBorrowMap.put(userId, borrowBooks);
            return true;
        }

        return false;
    }
    
    /**
     * 도서 반납 메소드
     */
    public boolean returnBook(String userId, String isbn) {
        // TODO: 도서를 반납하고, 사용자별 대여 현황을 업데이트하세요.
        List<Book> borrowBooks = userBorrowMap.get(userId);
        Book book1;
        if((book1 = books.stream().filter(book -> book.getIsbn().equals(isbn)).toList().get(0)) != null) {
            borrowBooks.remove(book1);
            userBorrowMap.put(userId, borrowBooks);
            return true;
        }
        return false;
    }
    
    /**
     * 사용자의 대여 도서 목록 조회 메소드
     */
    public List<Book> getBorrowedBooks(String userId) {
        // TODO: 사용자가 대여한 도서 목록을 반환하세요.
        return userBorrowMap.get(userId);
    }
    
    /**
     * 도서 정렬 메소드 (제목 기준)
     */
    public List<Book> getSortedBooksByTitle() {
        // TODO: 제목 기준으로 정렬된 도서 목록을 반환하세요.
        List<Book> sortedByTitleList = new ArrayList<>(books);
        sortedByTitleList.sort(Comparator.comparing(Book::getTitle));
        return sortedByTitleList;
    }
    
    /**
     * 도서 정렬 메소드 (출판년도 기준)
     */
    public List<Book> getSortedBooksByYear() {
        // TODO: 출판년도 기준으로 정렬된 도서 목록을 반환하세요.
        List<Book> sortedByYearList = new ArrayList<>(books);
        sortedByYearList.sort(Comparator.comparing(Book::getPublicationYear));
        return sortedByYearList;
    }
    
    /**
     * 도서 정렬 메소드 (가격 기준)
     */
    public List<Book> getSortedBooksByPrice() {
        // TODO: 가격 기준으로 정렬된 도서 목록을 반환하세요.
        List<Book> sortedByPriceList = new ArrayList<>(books);
        sortedByPriceList.sort(Comparator.comparing(Book::getPrice));
        return sortedByPriceList;
    }
    
    /**
     * 카테고리 목록 조회 메소드
     */
    public Set<String> getCategories() {
        // TODO: 모든 카테고리를 반환하세요.
        return categories;
    }
    
    /**
     * 카테고리별 도서 목록 조회 메소드
     */
    public List<Book> getBooksByCategory(String category) {
        // TODO: 특정 카테고리에 속한 도서 목록을 반환하세요.
        return books.stream().filter(book -> book.getCategory().equals(category)).toList();
    }
    
    /**
     * 전체 도서 목록 조회 메소드
     */
    public List<Book> getAllBooks() {
        // TODO: 전체 도서 목록을 반환하세요.
        return books;
    }
} 