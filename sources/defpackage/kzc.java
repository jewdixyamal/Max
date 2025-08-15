package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: kzc  reason: default package */
public final class kzc implements Serializable, Comparable {
    public final uj3 X;
    public final fs8 Y;
    public final long Z;
    public final int a;
    public final String b;
    public final List c;
    public final e52 o;
    public final vpb s0;

    public kzc(int i, String str, List list, e52 e52, uj3 uj3, fs8 fs8, long j, vpb vpb) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.o = e52;
        this.X = uj3;
        this.Y = fs8;
        this.Z = j;
        this.s0 = vpb;
    }

    public final int compareTo(Object obj) {
        kzc kzc = (kzc) obj;
        if (kzc == null) {
            return 0;
        }
        e52 e52 = this.o;
        e52 e522 = kzc.o;
        return (e52 == null || e522 == null) ? (e52 == null || e522 != null) ? 0 : -1 : Long.compare(e522.m(), e52.m());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResult{type=");
        sb.append(z7b.l(this.a));
        sb.append(", feedback='");
        sb.append(this.b);
        sb.append("', highlights=");
        sb.append(this.c.size());
        sb.append(", chat=");
        sb.append(this.o);
        sb.append(", contact=");
        sb.append(this.X);
        sb.append(", message=");
        sb.append(this.Y);
        sb.append(", chatId=");
        return z7b.i(sb, this.Z, '}');
    }
}
