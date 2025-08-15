package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* renamed from: pv1  reason: default package */
public interface pv1 {
    mv1 A();

    void b(t55 t55) {
        int i;
        int s = s();
        if (s != 1) {
            int s2 = au1.s(s);
            if (s2 == 1) {
                i = 32;
            } else if (s2 == 2) {
                i = 0;
            } else if (s2 == 3) {
                i = 1;
            } else if (s != 1 && s != 2 && s != 3 && s != 4) {
                throw null;
            } else {
                return;
            }
            int i2 = i & 1;
            ArrayList arrayList = t55.a;
            if (i2 == 1) {
                t55.c("LightSource", String.valueOf(4), arrayList);
            }
            t55.c("Flash", String.valueOf(i), arrayList);
        }
    }

    nje c();

    long getTimestamp();

    nv1 r();

    int s();

    lv1 v();

    CaptureResult y() {
        return null;
    }
}
