package defpackage;

import android.graphics.drawable.Animatable;

/* renamed from: bv6  reason: default package */
public final class bv6 extends ii0 {
    public final cv6 b;
    public long c = -1;

    public bv6(t44 t44) {
        this.b = t44;
    }

    public final void a(String str, ru6 ru6, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        cv6 cv6 = this.b;
        if (cv6 != null) {
            t44 t44 = (t44) cv6;
            t44.D0 = currentTimeMillis - this.c;
            t44.invalidateSelf();
        }
    }

    public final void e(Object obj, String str) {
        this.c = System.currentTimeMillis();
    }
}
