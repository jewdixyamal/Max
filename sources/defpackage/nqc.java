package defpackage;

import java.util.Iterator;

/* renamed from: nqc  reason: default package */
public final class nqc extends qqc implements Iterator {
    public oqc a;
    public oqc b;
    public final /* synthetic */ int c;

    public nqc(oqc oqc, oqc oqc2, int i) {
        this.c = i;
        this.a = oqc2;
        this.b = oqc;
    }

    public final void a(oqc oqc) {
        oqc oqc2 = null;
        if (this.a == oqc && oqc == this.b) {
            this.b = null;
            this.a = null;
        }
        oqc oqc3 = this.a;
        if (oqc3 == oqc) {
            this.a = b(oqc3);
        }
        oqc oqc4 = this.b;
        if (oqc4 == oqc) {
            oqc oqc5 = this.a;
            if (!(oqc4 == oqc5 || oqc5 == null)) {
                oqc2 = c(oqc4);
            }
            this.b = oqc2;
        }
    }

    public final oqc b(oqc oqc) {
        switch (this.c) {
            case 0:
                return oqc.o;
            default:
                return oqc.c;
        }
    }

    public final oqc c(oqc oqc) {
        switch (this.c) {
            case 0:
                return oqc.c;
            default:
                return oqc.o;
        }
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final Object next() {
        oqc oqc = this.b;
        oqc oqc2 = this.a;
        this.b = (oqc == oqc2 || oqc2 == null) ? null : c(oqc);
        return oqc;
    }
}
