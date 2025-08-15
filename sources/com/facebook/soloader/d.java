package com.facebook.soloader;

import android.os.Trace;
import java.io.FileInputStream;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class d {
    static {
        new ReentrantReadWriteLock();
    }

    public static String[] a(String str, fw4 fw4) {
        String[] strArr;
        gw4 gw4;
        int i;
        if (SoLoader.a) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            if (fw4 instanceof gw4) {
                gw4 = (gw4) fw4;
                i = 0;
                while (true) {
                    strArr = tfg.j(gw4);
                    break;
                }
            }
            strArr = tfg.j(fw4);
            if (SoLoader.a) {
                Trace.endSection();
            }
            return strArr;
        } catch (ClosedByInterruptException e) {
            i++;
            if (i <= 4) {
                Thread.interrupted();
                FileInputStream fileInputStream = new FileInputStream(gw4.a);
                gw4.b = fileInputStream;
                gw4.c = fileInputStream.getChannel();
            } else {
                throw e;
            }
        } catch (ja9 e2) {
            try {
                throw hm9.i(str, e2);
            } catch (Throwable th) {
                if (SoLoader.a) {
                    Trace.endSection();
                }
                throw th;
            }
        }
    }
}
