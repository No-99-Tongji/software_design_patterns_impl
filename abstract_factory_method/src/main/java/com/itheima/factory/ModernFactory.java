package com.itheima.factory;

import com.itheima.product.chair.Chair;
import com.itheima.product.chair.ModernChair;
import com.itheima.product.sofa.ModernSofa;
import com.itheima.product.sofa.Sofa;
import com.itheima.product.table.ModernTable;
import com.itheima.product.table.Table;

public class ModernFactory implements Factory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
