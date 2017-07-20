package com.example.xmc.hao.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by xmc on 2017/7/17.
 */
@Entity
public class ExamOverviewBean {
    @Id(autoincrement = true)
    private Long id;

    private  int scroe;

    public int getScroe() {
        return this.scroe;
    }

    public void setScroe(int scroe) {
        this.scroe = scroe;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Generated(hash = 44030174)
    public ExamOverviewBean(Long id, int scroe) {
        this.id = id;
        this.scroe = scroe;
    }

    @Generated(hash = 349826799)
    public ExamOverviewBean() {
    }
}
