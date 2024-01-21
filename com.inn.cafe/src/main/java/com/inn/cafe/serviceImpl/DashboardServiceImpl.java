package com.inn.cafe.serviceImpl;

import com.inn.cafe.DAO.BillDAO;
import com.inn.cafe.DAO.CategoryDAO;
import com.inn.cafe.DAO.ProductDAO;
import com.inn.cafe.Model.Category;
import com.inn.cafe.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    CategoryDAO categoryDAO;

    @Autowired
    ProductDAO productDAO;

    @Autowired
    BillDAO billDAO;

    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        Map<String, Object> map = new HashMap<>();
        map.put("category", categoryDAO.count());
        map.put("product", productDAO.count());
        map.put("bill", billDAO.count());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
