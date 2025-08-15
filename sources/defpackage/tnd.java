package defpackage;

import android.os.Handler;

/* renamed from: tnd  reason: default package */
public final class tnd {
    public static final tnd a = new Object();
    public static kpa b;

    public static void a() {
        vha vha;
        kpa kpa = b;
        if (!(kpa == null || (vha = (vha) kpa.b) == null)) {
            i50 i50 = vha.a;
            i50.getClass();
            Handler handler = cia.a;
            cia.b((zha) i50.s0, yha.o);
        }
        b = null;
    }

    public static void b(dj1 dj1, k56 k56) {
        kpa kpa = b;
        if (kpa == null || ((dj1) kpa.a).compareTo(dj1) <= 0) {
            a();
            vha vha = (vha) k56.invoke();
            if (vha != null) {
                b = new kpa(dj1, vha);
            }
        }
    }
}
