package defpackage;

import java.util.Iterator;

/* renamed from: dtd  reason: default package */
public final class dtd implements c6d {
    public final /* synthetic */ c6d a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d = false;

    public dtd(at atVar, int i, int i2) {
        this.a = atVar;
        this.b = i;
        this.c = i2;
    }

    public final Iterator iterator() {
        return np8.Q(this.a.iterator(), this.b, this.c, this.d);
    }
}
