package com.example.demo;

import java.util.List;

public interface ProvinceService {
    public void save(Province province);
    public void deleteByID(long id );
    public List<Province> findAll() ;
    public  Province findByID(long id );
}
