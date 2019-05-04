package model;

import javax.persistence.*;
@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private String author;

    public Blog(String title, String content, String author, Category category) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Blog() {}

        @Override
        public String toString() {
            return String.format("Blog[id=%d, title='%s', content='%s', author='%s']", id, title, content, author);
        }

        @ManyToOne
        @JoinColumn(name = "category_id")
        private Category category;


        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }
    }

