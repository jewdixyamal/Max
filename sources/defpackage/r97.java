package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: r97  reason: default package */
public abstract class r97 {
    public static final wz a;

    /* JADX WARNING: type inference failed for: r1v2, types: [wz, java.util.Collection, java.util.ArrayList] */
    static {
        ? arrayList = new ArrayList(4);
        Collections.addAll(arrayList, new Integer[]{2, 7, 4, 5});
        a = arrayList;
    }

    public static final int a(anc anc, g05 g05) {
        g05.o0();
        Integer valueOf = Integer.valueOf(g05.X);
        wz wzVar = a;
        int indexOf = wzVar.indexOf(valueOf);
        if (indexOf >= 0) {
            return ((Number) wzVar.get(indexOf % wzVar.size())).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations".toString());
    }

    public static final int b(anc anc, g05 g05) {
        anc.getClass();
        g05.o0();
        int i = g05.o;
        if (i != 90 && i != 180 && i != 270) {
            return 0;
        }
        g05.o0();
        return g05.o;
    }

    public static final int c(anc anc, jic jic, g05 g05, boolean z) {
        int i;
        int i2;
        if (!z || jic == null) {
            return 8;
        }
        int b = b(anc, g05);
        g05.o0();
        boolean z2 = false;
        int a2 = a.contains(Integer.valueOf(g05.X)) ? a(anc, g05) : 0;
        if (b == 90 || b == 270 || a2 == 5 || a2 == 7) {
            z2 = true;
        }
        if (z2) {
            g05.o0();
            i = g05.Z;
        } else {
            g05.o0();
            i = g05.Y;
        }
        if (z2) {
            g05.o0();
            i2 = g05.Y;
        } else {
            g05.o0();
            i2 = g05.Z;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) jic.a) / f, ((float) jic.b) / f2);
        float f3 = jic.c;
        if (f * max > f3) {
            max = f3 / f;
        }
        if (f2 * max > f3) {
            max = f3 / f2;
        }
        int i3 = (int) ((max * ((float) 8)) + jic.d);
        if (i3 > 8) {
            return 8;
        }
        if (i3 < 1) {
            return 1;
        }
        return i3;
    }
}
