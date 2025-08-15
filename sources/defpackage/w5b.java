package defpackage;

import android.view.View;

/* renamed from: w5b  reason: default package */
public final class w5b {
    public final z5b a;
    public int b;

    public w5b(z5b z5b) {
        this.a = z5b;
    }

    public final void a(int i) {
        View d;
        z5b z5b = this.a;
        if (z5b != null && (d = z5b.d()) != null) {
            int e = ote.e(i - z5b.c(), 0, Integer.MAX_VALUE);
            this.b = e;
            d.offsetTopAndBottom(e - this.b);
        }
    }
}
