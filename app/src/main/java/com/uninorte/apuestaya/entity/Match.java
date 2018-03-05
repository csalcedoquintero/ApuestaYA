package com.uninorte.apuestaya.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Visitante on 5/03/2018.
 */

@Entity
public class Match {

    @PrimaryKey
    private int id;

    private int championship;
}
