package com.itheima.factory;

import com.itheima.product.chair.Chair;
import com.itheima.product.sofa.Sofa;
import com.itheima.product.table.Table;

public interface Factory {
    Chair createChair();
    Table createTable();
    Sofa  createSofa();
}
