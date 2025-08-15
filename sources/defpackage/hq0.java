package defpackage;

import java.util.List;

/* renamed from: hq0  reason: default package */
public final class hq0 extends gle {
    public final qzd X;
    public final List c;
    public final wm3 o;

    public hq0(List list, wm3 wm3, qzd qzd) {
        this.c = list;
        this.o = wm3;
        this.X = qzd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq0)) {
            return false;
        }
        hq0 hq0 = (hq0) obj;
        return tpa.f(this.c, hq0.c) && tpa.f(this.o, hq0.o) && tpa.f(this.X, hq0.X);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        int i = 0;
        wm3 wm3 = this.o;
        int hashCode2 = (hashCode + (wm3 == null ? 0 : wm3.hashCode())) * 31;
        qzd qzd = this.X;
        if (qzd != null) {
            i = qzd.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Response(botCommands=" + this.c + ", contact=" + this.o + ", startMessage=" + this.X + ")";
    }
}
