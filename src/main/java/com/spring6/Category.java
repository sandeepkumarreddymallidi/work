package com.spring6;


import org.springframework.beans.factory.annotation.Autowired;


    public class Category {
        private String categoryname;
@Autowired
        private Book java;

        public Category(Book java) {
            this.java = java;
        }

        public Category(String categoryname, Book java) {
            this.categoryname = categoryname;
            this.java = java;
        }

        public Category() {
        }

        public String getCategoryname() {
            return categoryname;
        }

        public void setCategoryname(String categoryname) {
            this.categoryname = categoryname;
        }

        public Book getJava() {
            return java;
        }

        public void setJava(Book java) {
            this.java = java;
        }
    }
