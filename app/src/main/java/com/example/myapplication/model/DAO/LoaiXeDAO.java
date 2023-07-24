package com.example.myapplication.model.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.myapplication.model.LoaiXe;

import java.util.List;

@Dao
public interface LoaiXeDAO {
    @Insert
    void insert(LoaiXe... loaiXes);
    @Query("SELECT EXISTS(SELECT 1 FROM table_loaixe WHERE ten_loai_xe = :tenLoaiXe )")
    boolean isLoaiXeExist(String tenLoaiXe);
    @Query("select * from table_loaixe")
    List<LoaiXe> getAll();

    @Query("select ten_loai_xe from table_loaixe where id_loai_xe= :idLoaiXe")
    String getTenLoaiXeByID(int idLoaiXe);

    @Query("select ten_loai_xe from table_loaixe")
    List<String> getTenLoaiXe();

    @Query("select id_loai_xe from table_loaixe where ten_loai_xe= :tenLoaiXe")
    int getIDLoaiXe(String tenLoaiXe);
}
