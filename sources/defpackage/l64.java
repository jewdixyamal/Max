package defpackage;

import android.os.Bundle;

/* renamed from: l64  reason: default package */
public final class l64 {
    public final String a;
    public final e64 b;
    public final Bundle c;
    public final int d;
    public final j64 e;
    public final k64 f;

    public l64(String str, e64 e64, Bundle bundle, int i, j64 j64, k64 k64) {
        this.a = str;
        this.b = e64;
        this.c = bundle;
        this.d = i;
        this.e = j64;
        this.f = k64;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l64)) {
            return false;
        }
        l64 l64 = (l64) obj;
        return tpa.f(this.a, l64.a) && tpa.f(this.b, l64.b) && tpa.f(this.c, l64.c) && this.d == l64.d && tpa.f(this.e, l64.e) && tpa.f(this.f, l64.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int g = ey8.g(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        return this.f.hashCode() + ((this.e.hashCode() + g) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeepLinkScreen(name=");
        sb.append(this.a);
        sb.append(", route=");
        sb.append(this.b);
        sb.append(", deepLinkBundle=");
        sb.append("DeepLinkBundle(bundle=" + this.c + ")");
        sb.append(", mode=");
        int i = this.d;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "ACTIVITY" : "FRAGMENT" : "DEFAULT");
        sb.append(", animations=");
        sb.append(this.e);
        sb.append(", screenFactory=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l64(java.lang.String r8, defpackage.e64 r9, android.os.Bundle r10, int r11, defpackage.j64 r12, defpackage.k64 r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0005
            r11 = 1
        L_0x0005:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto L_0x000f
            j64 r12 = new j64
            r12.<init>()
        L_0x000f:
            r5 = r12
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l64.<init>(java.lang.String, e64, android.os.Bundle, int, j64, k64, int):void");
    }
}
