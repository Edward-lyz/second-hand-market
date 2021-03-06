package com.example.demo5.service;


import com.example.demo5.dao.AnnounceRepository;
import com.example.demo5.domain.Announce;
import com.example.demo5.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AnnounceService {
    @Autowired
    private AnnounceRepository announceRepository;

    //    分页获取最新的商品信息
    public Page<Announce> listAnnounce(Pageable pageable) {
        return announceRepository.findAll(pageable);
    }


    //保存公告
    public Announce saveAnnounce(Announce announce) {
        announce.setCreateTime(new Date());
        return announceRepository.save(announce);
    }
}
