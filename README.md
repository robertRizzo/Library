
# Library Management System

### Overview
This program simulates a simple **Library Management System**. It allows users to manage a collection of books, including adding new books, displaying them, sorting by price or title, and searching for books by title or price. The system supports both regular books and eBooks, with the latter having additional properties such as file size. The program is written in Java and utilizes several programming concepts, including object-oriented principles such as inheritance, method overloading, method overriding, arrays, ArrayLists, and common algorithms like sorting and searching.

### Features
- **Add Books**: Users can add books or eBooks to the library.
- **Display Books**: Users can view all the books with details like title, price, book ID, and the date they were added.
- **Sort Books**: The program supports sorting books either by price (using Bubble Sort) or by title (using Selection Sort).
- **Search for Books**: Linear search is used to search for books either by title or by price.
- **Date and Time**: Each book is automatically assigned the date and time when it is added.
- **Random Book ID**: Each book gets a random ID when it is added to the system.
- **Static Variables and Methods**: The program tracks the total number of books using a static variable.

### How to Use
1. **Run the Program**: When the program is run, the user will be presented with a menu with the following options:
    - Add a book or an eBook.
    - Display all books.
    - Sort the books by title or price.
    - Search for books by title.
    - Exit the program.

2. **Add a Book**: When adding a book, you can choose to add either a regular book or an eBook (which includes a file size in MB).

3. **Display All Books**: This option will display a list of all books currently in the library, including the title, price, ID, and the date and time they were added.

4. **Sort Books**: You can choose to sort the books either by title or by price.

5. **Search for a Book**: You can search for a book by entering its title, or, in a different method, by price.

6. **Exit**: Exit the program when done.

### Known Issues
The program has several problems that require debugging and fixing. As part of your exercise, you need to identify and resolve these issues. Here's a summary of what's not working as expected:

1. **Date and Time Formatting**:
    - The date and time displayed when books are added appear in a default format that is not very user-friendly. The program currently outputs the date in its raw form, which might be difficult to read.

2. **Search Method**:
    - The search functionality only works with a book's title but might not handle searches by price properly. Additionally, there could be issues with method overloading when searching by different data types.

3. **Sorting Issues**:
    - While sorting by price and title works in theory, the sorting algorithm might not always behave as expected. There could be problems with how the sorting algorithms swap elements or handle book data.

4. **Book Count**:
    - The program keeps track of the total number of books using a static variable. However, there may be issues with the count not updating correctly, especially when adding eBooks.

5. **Lack of a Switch Menu**:
    - The program lacks an interactive menu where users can easily switch between different actions such as adding a book, sorting, or searching. Although the main methods are implemented, the program does not have an intuitive interface for users to choose actions.

6. **Generics Missing**:
    - The program could benefit from the use of generics for handling collections more efficiently, but this is not currently implemented.

### Your Task
Your task is to identify the bugs and issues in the program based on the behavior described above. As you work through the program, look for incorrect behavior in these areas and attempt to fix it.

- **Focus on debugging**: Pay close attention to the logic in the sorting, searching, and static variables.
- **Think about design improvements**: Consider how the program can be improved with better structuring of classes and the use of Java’s object-oriented features.
- **Work with the existing code**: Do not rewrite the entire program but focus on resolving the specific issues.

### Example Runs

#### 1. Start the Program and Show Menu
```
Library Menu:
1. Add Book
2. Display All Books
3. Sort Books by Price
4. Sort Books by Title
5. Search Book by Title
6. Exit

Enter your choice: 1
```

#### 2. Add a Regular Book
```
Enter book title: Java Programming
Enter book price: 299.99
Book added: Java Programming

Library Menu:
1. Add Book
2. Display All Books
3. Sort Books by Price
4. Sort Books by Title
5. Search Book by Title
6. Exit

Enter your choice: 1
```

#### 3. Add an eBook
```
Enter book title: Python Programming
Enter book price: 199.99
Enter file size (MB): 5.0
Book added: Python Programming

Library Menu:
1. Add Book
2. Display All Books
3. Sort Books by Price
4. Sort Books by Title
5. Search Book by Title
6. Exit

Enter your choice: 2
```

#### 4. Display All Books
```
All books:
Title: Java Programming, Price: 299.99, Book ID: 576, Added Date: 02/10/2024 10:15:30
Title: Python Programming, Price: 199.99, Book ID: 824, Added Date: 02/10/2024 10:16:12
File Size: 5.00 MB

Library Menu:
1. Add Book
2. Display All Books
3. Sort Books by Price
4. Sort Books by Title
5. Search Book by Title
6. Exit

Enter your choice: 3
```

#### 5. Sort Books by Price (Bubble Sort)
```
Sorting books by price:
All books:
Title: Python Programming, Price: 199.99, Book ID: 824, Added Date: 02/10/2024 10:16:12
File Size: 5.00 MB
Title: Java Programming, Price: 299.99, Book ID: 576, Added Date: 02/10/2024 10:15:30

Library Menu:
1. Add Book
2. Display All Books
3. Sort Books by Price
4. Sort Books by Title
5. Search Book by Title
6. Exit

Enter your choice: 4
```

#### 6. Sort Books by Title (Selection Sort)
```
Sorting books by title:
All books:
Title: Java Programming, Price: 299.99, Book ID: 576, Added Date: 02/10/2024 10:15:30
Title: Python Programming, Price: 199.99, Book ID: 824, Added Date: 02/10/2024 10:16:12
File Size: 5.00 MB

Library Menu:
1. Add Book
2. Display All Books
3. Sort Books by Price
4. Sort Books by Title
5. Search Book by Title
6. Exit

Enter your choice: 5
```

#### 7. Search for a Book with Title "Java"
```
Searching for book with title 'Java':
Title: Java Programming, Price: 299.99, Book ID: 576, Added Date: 02/10/2024 10:15:30

Library Menu:
1. Add Book
2. Display All Books
3. Sort Books by Price
4. Sort Books by Title
5. Search Book by Title
6. Exit

Enter your choice: 6
```

#### 8. Exit the Program
```
Enter your choice: 6
Goodbye!
```
