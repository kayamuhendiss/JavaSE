package _07.classMembers.declaration.package02;

import _07.classMembers.declaration.package01.Data;

public class SubDataDiffrentPackage extends Data {
    public void method(){
        System.out.println(publicVar);
        System.out.println(protectedVar);
        //System.out.println(defaultVar); ->LEGAL DEGIL
        // Kalitim soz konusu oldugunda ,farkli paket oldugunda kalitim ozelligi kullanilarak
        // memberlara erisim saglanabilir
    }

}
