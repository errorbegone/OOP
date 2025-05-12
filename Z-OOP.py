from abc import ABC, abstractmethod
from collections import defaultdict

class BookExistsError(Exception):
    def __init__(self):
        super().__init__("Book with title already exists in repo...")

class BookNotFoundError(Exception):
    def __init__(self):
        super().__init__("Book does not exist in repo...")

class Library(object):
    __obj = None
    __init = False
    def __new__(cls, *args, **kwargs):
        if cls.__obj is None:
            cls.__obj = super().__new__(cls)
        return cls.__obj
    
    def __init__(self):
        if not Library.__init:
            self.repo = defaultdict(Book)
            Library.__init = True

class User(ABC):
    @abstractmethod
    def searchBook(self, title: str) -> bool:
        pass

class Book(object):
    def __init__(self, title: str, author: str, user: User, status: str = "Available"):
        self.__title = title
        self.__author = author
        self.__user = user
        self.__status = status
    
    def getTitle(self) -> str:
        return self.__title
    
    def changeStatus(self) -> None:
        if self.__status == "Borrowed":
            self.__status = "Available"
        else:
            self.__status = "Borrowed"

class Librarian(User):
    __lib_repo = []
    def __init__(self, id: int, name: str):
        self._id = id
        self._name = name
        Librarian.__lib_repo.append(self)

    def addBook(self, book: Book):
        if book.getTitle() not in Library().repo:
            Library().repo[book.getTitle()] = book
        else:
            raise BookExistsError()
    
    def searchBook(self, title: str) -> bool:
        if title not in Library().repo:
            raise BookNotFoundError()
        return True

