package defpackage;

/* renamed from: w9f  reason: default package */
public final class w9f implements ol7 {
    public final long X;
    public final at5 a;
    public final v9f b;
    public final jqe c;
    public final int o;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w9f(defpackage.at5 r1, defpackage.v9f r2, defpackage.jqe r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            int r3 = r2.ordinal()
            r0.o = r3
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.a
            if (r1 == 0) goto L_0x001a
            int r1 = r1.hashCode()
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            int r2 = r2.hashCode()
            int r2 = r2 * 33
            int r2 = r2 + r1
            long r1 = (long) r2
            r0.X = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9f.<init>(at5, v9f, jqe):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9f)) {
            return false;
        }
        w9f w9f = (w9f) obj;
        return tpa.f(this.a, w9f.a) && this.b == w9f.b && tpa.f(this.c, w9f.c);
    }

    public final long getItemId() {
        return this.X;
    }

    public final boolean h(ol7 ol7) {
        if (!(ol7 instanceof w9f)) {
            return false;
        }
        String str = null;
        at5 at5 = this.a;
        String str2 = at5 != null ? at5.a : null;
        at5 at52 = ((w9f) ol7).a;
        if (at52 != null) {
            str = at52.a;
        }
        return tpa.f(str2, str);
    }

    public final int hashCode() {
        at5 at5 = this.a;
        int hashCode = at5 == null ? 0 : at5.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        return "UserFolderListItem(folder=" + this.a + ", type=" + this.b + ", processedTitle=" + this.c + ")";
    }
}
