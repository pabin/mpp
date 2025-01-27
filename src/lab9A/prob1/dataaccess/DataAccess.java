package lab9A.prob1.dataaccess;

import java.util.HashMap;

import lab9A.prob1.business.Book;
import lab9A.prob1.business.LibraryMember;

public interface DataAccess {
    public HashMap<String, lab9A.prob1.business.Book> readBooksMap();

    public HashMap<String, User> readUserMap();

    public HashMap<String, lab9A.prob1.business.LibraryMember> readMemberMap();
}
