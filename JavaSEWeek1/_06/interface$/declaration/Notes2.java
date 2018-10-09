package _06.interface$.declaration;

import javax.management.ObjectName;
import java.lang.management.GarbageCollectorMXBean;
//Bir class birden fazla interface implements edebilir

public class Notes2 implements Runnable ,GarbageCollectorMXBean {
    @Override
    public void run() {

    }

    @Override
    public long getCollectionCount() {
        return 0;
    }

    @Override
    public long getCollectionTime() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public String[] getMemoryPoolNames() {
        return new String[0];
    }

    @Override
    public ObjectName getObjectName() {
        return null;
    }
}
