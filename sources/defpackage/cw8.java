package defpackage;

import android.text.Layout;

/* renamed from: cw8  reason: default package */
public final class cw8 {
    public final long a;
    public final long b;
    public final Layout c;
    public final zv8 d;
    public final vv8 e;
    public final boolean f;

    public cw8(long j, long j2, Layout layout, zv8 zv8, vv8 vv8, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = layout;
        this.d = zv8;
        this.e = vv8;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw8)) {
            return false;
        }
        cw8 cw8 = (cw8) obj;
        return this.a == cw8.a && this.b == cw8.b && tpa.f(this.c, cw8.c) && tpa.f(this.d, cw8.d) && tpa.f(this.e, cw8.e) && this.f == cw8.f;
    }

    public final int hashCode() {
        int m = h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        Layout layout = this.c;
        int hashCode = (m + (layout == null ? 0 : layout.hashCode())) * 31;
        zv8 zv8 = this.d;
        int hashCode2 = (hashCode + (zv8 == null ? 0 : zv8.hashCode())) * 31;
        vv8 vv8 = this.e;
        if (vv8 != null) {
            i = vv8.hashCode();
        }
        return Boolean.hashCode(this.f) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageLink(messageId=");
        sb.append(this.a);
        sb.append(", messageLinkId=");
        sb.append(this.b);
        sb.append(", senderLayout=");
        sb.append(this.c);
        sb.append(", replyModel=");
        sb.append(this.d);
        sb.append(", forwardModel=");
        sb.append(this.e);
        sb.append(", isFloating=");
        return au1.j(sb, this.f, ")");
    }
}
