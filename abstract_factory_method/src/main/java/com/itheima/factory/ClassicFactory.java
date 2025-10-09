package com.itheima.factory;

import com.itheima.product.chair.Chair;
import com.itheima.product.chair.ClassicChair;
import com.itheima.product.sofa.ClassicSofa;
import com.itheima.product.sofa.Sofa;
import com.itheima.product.table.ClassicTable;
import com.itheima.product.table.Table;

public class ClassicFactory implements Factory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }
}
