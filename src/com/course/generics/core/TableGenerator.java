package com.course.generics.core;

import com.course.generics.model.IronTable;
import com.course.generics.model.Table;
import com.course.generics.model.WoodenTable;

import java.util.Random;

public class TableGenerator implements Generator<Table> {

    private Random random = new Random();
    private Class[] tableTypes = {WoodenTable.class, IronTable.class, Table.class};

    @Override
    public Table generate() {
        int i = random.nextInt(3);
        Table randomTable = null;
        try {
            randomTable = (Table)tableTypes[i].newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return randomTable;
    }
}
