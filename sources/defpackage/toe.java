package defpackage;

import android.graphics.Typeface;

/* renamed from: toe  reason: default package */
public final class toe extends tu0 {
    public final /* synthetic */ ote n;
    public final /* synthetic */ voe o;

    public toe(voe voe, ote ote) {
        this.o = voe;
        this.n = ote;
    }

    public final void w(int i) {
        this.o.m = true;
        this.n.J(i);
    }

    public final void x(Typeface typeface) {
        voe voe = this.o;
        voe.n = Typeface.create(typeface, voe.c);
        voe.m = true;
        this.n.K(voe.n, false);
    }
}
