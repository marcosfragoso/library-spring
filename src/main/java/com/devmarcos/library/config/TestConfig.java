package com.devmarcos.library.config;

import com.devmarcos.library.entities.*;
import com.devmarcos.library.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PublishingCompanyRepository publishingCompanyRepository;
    @Autowired
    private LoanRepository loanRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "09129595410", "Marcos Vinícius", "83999824405", "fragoso@gmail.com");
        User u2 = new User(null, "07629542410", "Thereza Lídya", "83949864565", "thereza@gmail.com");
        User u3 = new User(null, "12329567410", "Roger Guedes", "83149864565", "roger@gmail.com");
        User u4 = new User(null, "08629453210", "Renato Augusto", "83249864565", "renato@gmail.com");
        User u5= new User(null, "01329542410", "Yuri Alberto", "83939864565", "yuri@gmail.com");
        User u6 = new User(null, "17629542410", "Fagner Lemos", "83449864565", "fagner@gmail.com");
        User u7 = new User(null, "27629542410", "Cássio Ramos", "83549864565", "cassio@gmail.com");
        User u8 = new User(null, "37629542410", "Fausto Vera", "83649864565", "vera@gmail.com");
        User u9 = new User(null, "47629542410", "Gustavo Mantuan", "83749864565", "mantuan@gmail.com");
        User u10 = new User(null, "57629542410", "Marcus Rashford", "88949864565", "rashford@gmail.com");
        User u11 = new User(null, "67629542410", "Joana Maria", "88934564565", "joana@gmail.com");
        User u12 = new User(null, "77629542410", "Sophia Fragoso", "81049864565", "sophia@gmail.com");

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12));

        Category c1 = new Category(null, "Terror");
        Category c2 = new Category(null, "Aventura");
        Category c3 = new Category(null, "Ficção Religiosa");
        Category c4 = new Category(null, "Romance");
        Category c5 = new Category(null, "Poesia");
        Category c6 = new Category(null, "Religião");
        Category c7 = new Category(null, "Ciências Exatas");
        Category c8 = new Category(null, "Novela");
        Category c9 = new Category(null, "Conto");
        Category c10 = new Category(null, "Psicologia");
        Category c11 = new Category(null, "Biografias");
        Category c12 = new Category(null, "Programação");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12));

        PublishingCompany p1 = new PublishingCompany(null, "Companhia da Letras", "Avenida Epitácio Pessoa", "8333831723");
        PublishingCompany p2 = new PublishingCompany(null, "Editora Aleph", "Rua José Araújo", "8333442367");
        PublishingCompany p3 = new PublishingCompany(null, "Editora Intríseca", "Rua Presidente Pessoa", "8436542367");
        PublishingCompany p4 = new PublishingCompany(null, "Grupo Editorial Record", "Avenida Vila Medeiros", "8137782367");
        PublishingCompany p5 = new PublishingCompany(null, "Editora Rocco", "Rua José Bonifácio", "5531442367");
        PublishingCompany p6 = new PublishingCompany(null, "Globo Livros", "Rua Ourissanga", "8399444267");
        PublishingCompany p7 = new PublishingCompany(null, "Darkside Books", "Rua Almeida Barreto", "8312345367");
        PublishingCompany p8 = new PublishingCompany(null, "Harper Collins", "Avenida Presidente Getúlio Vargas", "1233442367");
        PublishingCompany p9 = new PublishingCompany(null, "Editora Arqueiro", "Avenida Rio Negro", "4463442367");
        PublishingCompany p10 = new PublishingCompany(null, "Leya", "Avenida Alcides Lajes Magalhães", "887642367");
        PublishingCompany p11 = new PublishingCompany(null, "Saraiva", "Rua Hipólito de Camargo", "9133954367");
        PublishingCompany p12 = new PublishingCompany(null, "Editora Principis", "Avenida Piracema", "1146142367");

        publishingCompanyRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12));

        Author a1 = new Author(null, "Stephen King", "M", "1947", "Americano");
        Author a2 = new Author(null, "Monteiro Lobato", "M", "1882", "Brasileiro");
        Author a3 = new Author(null, "José Saramago", "M", "1922", "Português");
        Author a4 = new Author(null, "Clarice Lispector", "F", "1920", "Brasileira");
        Author a5 = new Author(null, "Edgar Allan Poe", "M", "1809", "Americano");
        Author a6 = new Author(null, "Fiódor Dostoiévski", "M", "1821", "Russo");
        Author a7 = new Author(null, "William Shakespeare", "M", "1564", "Inglês");
        Author a8 = new Author(null, "Marcel Proust", "M", "1871", "Francês");
        Author a9 = new Author(null, "Miguel de Cervantes", "M", "1547", "Espanhol");
        Author a10 = new Author(null, "Gabriel García Márquez", "M", "1927", "Colombiano");
        Author a11 = new Author(null, "Franz Kafka", "M", "1883", "Alemão");
        Author a12 = new Author(null, "Jorge Luis Borges", "M", "1899", "Argentino");

        authorRepository.saveAll(Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12));

        Book b1 = new Book(null, "It - A Coisa", "1986");
        Book b2 = new Book(null, "O Saci", "1921");
        Book b3 = new Book(null, "Caim", "2009");
        Book b4 = new Book(null, "A Hora da Estrela", "1977");
        Book b5= new Book(null, "O Corvo", "1845");
        Book b6 = new Book(null, "Crime e Castigo", "1866");
        Book b7 = new Book(null, "Romeu e Julieta", "1597");
        Book b8 = new Book(null, "Em Busca do Tempo Perdido", "1913");
        Book b9 = new Book(null, "Dom Quixote", "1605");
        Book b10 = new Book(null, "Cem Anos de Solidão", "1967");
        Book b11 = new Book(null, "A Metamorfose", "1915");
        Book b12 = new Book(null, "Ficciones", "1944");

        bookRepository.saveAll(Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12));

        b1.getAuthors().add(a1);
        b2.getAuthors().add(a2);
        b3.getAuthors().add(a3);
        b4.getAuthors().add(a4);
        b5.getAuthors().add(a5);
        b6.getAuthors().add(a6);
        b7.getAuthors().add(a7);
        b8.getAuthors().add(a8);
        b9.getAuthors().add(a9);
        b10.getAuthors().add(a10);
        b11.getAuthors().add(a11);
        b12.getAuthors().add(a12);

        b1.getCategories().add(c1);
        b2.getCategories().add(c2);
        b3.getCategories().add(c3);
        b4.getCategories().add(c4);
        b5.getCategories().add(c2);
        b6.getCategories().add(c2);
        b7.getCategories().add(c4);
        b8.getCategories().add(c4);
        b9.getCategories().add(c4);
        b10.getCategories().add(c4);
        b11.getCategories().add(c8);
        b12.getCategories().add(c9);
        b3.getCategories().add(c6);

        b1.getPublishingCompanies().add(p1);
        b2.getPublishingCompanies().add(p2);
        b3.getPublishingCompanies().add(p3);
        b4.getPublishingCompanies().add(p4);
        b5.getPublishingCompanies().add(p5);
        b6.getPublishingCompanies().add(p6);
        b7.getPublishingCompanies().add(p7);
        b8.getPublishingCompanies().add(p8);
        b9.getPublishingCompanies().add(p9);
        b10.getPublishingCompanies().add(p10);
        b11.getPublishingCompanies().add(p11);
        b12.getPublishingCompanies().add(p12);

        bookRepository.saveAll(Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12));

        Loan l1 = new Loan(null, b1, u1, "27-02-2023", "27-03-2023");
        Loan l2 = new Loan(null, b2, u1, "17-02-2023", "17-03-2023");
        Loan l3 = new Loan(null, b3, u2, "22-02-2023", "22-03-2023");
        Loan l4 = new Loan(null, b4, u3, "01-03-2023", "01-04-2023");
        Loan l5 = new Loan(null, b5, u4, "01-04-2023", "01-05-2023");
        Loan l6 = new Loan(null, b6, u5, "01-05-2023", "01-06-2023");
        Loan l7 = new Loan(null, b7, u6, "01-06-2023", "01-07-2023");
        Loan l8 = new Loan(null, b8, u7, "01-07-2023", "01-08-2023");
        Loan l9 = new Loan(null, b9, u8, "01-08-2023", "01-09-2023");
        Loan l10 = new Loan(null, b10, u9, "01-09-2023", "01-10-2023");
        Loan l11 = new Loan(null, b11, u10, "01-10-2023", "01-11-2023");
        Loan l12 = new Loan(null, b12, u11, "01-11-2023", "01-12-2023");
        Loan l13 = new Loan(null, b1, u12, "01-12-2023", "01-01-2024");

        loanRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13));
    }
}
