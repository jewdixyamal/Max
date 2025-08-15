package defpackage;

import java.util.Locale;
import ru.ok.tamtam.nano.b;

/* renamed from: l9c  reason: default package */
public abstract class l9c {
    public static final /* synthetic */ int a = 0;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, e9c] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, cy4] */
    /* JADX WARNING: type inference failed for: r5v3, types: [lh4, java.lang.Object] */
    public static e9c a(h9c h9c, long j) {
        ? obj = new Object();
        t9c t9c = h9c.a;
        obj.b = t9c;
        obj.d = h9c.b;
        obj.c = j;
        int ordinal = t9c.ordinal();
        if (ordinal == 1) {
            ? obj2 = new Object();
            obj2.a = ((by4) h9c).c;
            obj.f = obj2;
        } else if (ordinal == 2) {
            ? obj3 = new Object();
            obj3.a = ((j3e) h9c).c;
            obj.e = obj3;
        } else if (ordinal == 3) {
            x10 x10 = ((vc6) h9c).c;
            byte[] byteArray = qw8.toByteArray(b.o(x10));
            g03 g03 = new g03(6);
            g03.c = byteArray;
            g03.b = x10.s0;
            obj.g = g03;
        } else if (ordinal != 4) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + h9c.a);
        }
        return obj;
    }
}
