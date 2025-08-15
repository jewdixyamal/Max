package defpackage;

import java.util.ArrayList;

/* renamed from: ji0  reason: default package */
public abstract class ji0 implements r24 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public z24 o;

    public ji0(boolean z) {
        this.a = z;
    }

    public final void N(y0f y0f) {
        y0f.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(y0f)) {
            arrayList.add(y0f);
            this.c++;
        }
    }

    public final void b(int i) {
        z24 z24 = this.o;
        int i2 = maf.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((h84) ((y0f) this.b.get(i3))).e(z24, this.a, i);
        }
    }

    public final void c() {
        z24 z24 = this.o;
        int i = maf.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((h84) ((y0f) this.b.get(i2))).f(z24, this.a);
        }
        this.o = null;
    }

    public final void d() {
        for (int i = 0; i < this.c; i++) {
            ((y0f) this.b.get(i)).getClass();
        }
    }

    public final void f(z24 z24) {
        this.o = z24;
        for (int i = 0; i < this.c; i++) {
            ((h84) ((y0f) this.b.get(i))).g(z24, this.a);
        }
    }
}
