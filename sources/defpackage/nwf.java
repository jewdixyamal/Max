package defpackage;

/* renamed from: nwf  reason: default package */
public final class nwf extends w97 {
    public final String c;
    public final String d;

    public nwf(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwf)) {
            return false;
        }
        nwf nwf = (nwf) obj;
        return tpa.f(this.c, nwf.c) && tpa.f(this.d, nwf.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadFile(url=");
        sb.append(this.c);
        sb.append(", fileName=");
        return zr6.l(sb, this.d, ")");
    }
}
