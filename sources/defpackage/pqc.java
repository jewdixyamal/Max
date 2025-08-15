package defpackage;

import java.util.Iterator;

/* renamed from: pqc  reason: default package */
public final class pqc extends qqc implements Iterator {
    public oqc a;
    public boolean b = true;
    public final /* synthetic */ rqc c;

    public pqc(rqc rqc) {
        this.c = rqc;
    }

    public final void a(oqc oqc) {
        oqc oqc2 = this.a;
        if (oqc == oqc2) {
            oqc oqc3 = oqc2.o;
            this.a = oqc3;
            this.b = oqc3 == null;
        }
    }

    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        oqc oqc = this.a;
        return (oqc == null || oqc.c == null) ? false : true;
    }

    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            oqc oqc = this.a;
            this.a = oqc != null ? oqc.c : null;
        }
        return this.a;
    }
}
