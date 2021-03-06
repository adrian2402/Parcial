/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.biblioteca.dao;

import com.example.biblioteca.model.Editorial;
import java.util.List;

/**
 *
 * @author Victor Rosales
 */
public interface EditorialDao {
    int create(Editorial edi);
    int update(Editorial edi);
    int delete(int id);
    Editorial read(int id);
    List<Editorial> readAll();
}
