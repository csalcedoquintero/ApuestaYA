package com.uninorte.apuestaya.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Visitante on 5/03/2018.
 */

@Entity
public class Championship {

    @PrimaryKey
    private int id;

    @ColumnInfo (name = "name")
    private String name;

}
