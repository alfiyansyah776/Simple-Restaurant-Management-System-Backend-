package com.inn.cafe.DAO;

import com.inn.cafe.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

    List<Category> getAllCategory();

}
