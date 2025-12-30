package com.lambda.functional_interfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/*
//Traditional way - OOPs
class SupplierImpl implements Supplier<LocalDateTime>{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}
*/
public class SupplierInterfaceExample {
    public static void main(String[] args) {

    //  Supplier<LocalDateTime> supplier = new SupplierImpl();
    //  System.out.println(supplier.get());

        //Lambda Expression

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

    }
}
