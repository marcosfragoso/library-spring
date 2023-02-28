# library-spring-boot-JPA-hibernate
Design of a library system using spring-boot-JPA-hibernate.


  PROJETO MODELAGEM DE UMA BIBLIOTECA 


 O projeto segue seguinte lógica:
 
 Entidades: Author, Book, Category, Loan, PublishingCompany e User.
 
 Assumiu-se que um Autor pode escrever vários Livros. 
 Assim como um Livro pode ser escrito por vários Autores.
 (Relacionamento muitos para muitos/ @ManyToMany)
 
 Um Livro pode ter 1 ou mais Categorias. 
 Assim como uma Categoria pode ter vários Livros.
 (Relacionamento muitos para muitos/ @ManyToMany)
 
 Um livro pode ser publicado em 1 ou mais editoras. 
 Assim como uma editora pode publicar vários Livros.
 (Relacionamento muitos para muitos/ @ManyToMany)
 
 Um Usuário pode realizar vários Empréstimos.
 Mas cada Empréstimo só pode ser realizado por 1 Usuário.
 (Relacionamento 1 para muitos / @OneToMany da entidade User)
 (Relacionamento muitos para 1 / @ManyToOne da entidade Loan)
 
 Um Livro pode conter em vários Empréstimos.
 Mas cada Empréstimo só pode ser realizado por 1 Livro.
 (Relacionamento 1 para muitos / @OneToMany da entidade Book)
 (Relacionamento muitos para 1 / @ManyToOne da entidade Loan)
 
 
 
 
 
 
