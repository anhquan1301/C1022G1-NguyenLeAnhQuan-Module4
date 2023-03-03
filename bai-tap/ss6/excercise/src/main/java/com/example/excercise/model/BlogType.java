package com.example.excercise.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "blog_type")
public class BlogType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="blog_type_name")
    private String nameBlogType;
    @OneToMany(mappedBy = "blogType")
    private Set<Blog> blogSet;
    public BlogType() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNameBlogType() {
        return nameBlogType;
    }

    public void setNameBlogType(String nameBlogType) {
        this.nameBlogType = nameBlogType;
    }
    public Set<Blog> getBlogSet() {
        return blogSet;
    }

    public void setBlogSet(Set<Blog> blogSet) {
        this.blogSet = blogSet;
    }

}
