package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: oa0  reason: default package */
public final class oa0 {
    public final String a;
    public final List b;

    public oa0(String str, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oa0)) {
            return false;
        }
        oa0 oa0 = (oa0) obj;
        return this.a.equals(oa0.a) && this.b.equals(oa0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.a);
        sb.append(", usedDates=");
        return au1.i(sb, this.b, "}");
    }
}
