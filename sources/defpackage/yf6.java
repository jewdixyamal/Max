package defpackage;

import android.view.View;

/* renamed from: yf6  reason: default package */
public final class yf6 extends cg6 {
    public int d;

    public final int a(hg6 hg6, View view, ote ote, int i, boolean z) {
        return Math.max(0, super.a(hg6, view, ote, i, z));
    }

    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    public final void c() {
        super.c();
        this.d = Integer.MIN_VALUE;
    }

    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }
}
