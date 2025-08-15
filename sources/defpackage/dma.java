package defpackage;

import android.os.Parcelable;

/* renamed from: dma  reason: default package */
public final class dma extends wm9 {
    public final Parcelable b;
    public final String c;

    public dma(xw8 xw8, String str) {
        super(e5f.a);
        this.b = xw8;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dma)) {
            return false;
        }
        dma dma = (dma) obj;
        return tpa.f(this.b, dma.b) && tpa.f(this.c, dma.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenImageLegacy(message=" + this.b + ", attachLocalId=" + this.c + ")";
    }
}
