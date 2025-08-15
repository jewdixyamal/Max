package defpackage;

/* renamed from: zq0  reason: default package */
public final class zq0 {
    public final m38 a;
    public final m38 b;
    public final m38 c;
    public final m38 d;
    public final a51 e;

    public zq0(m38 m38, m38 m382, m38 m383, m38 m384, a51 a51) {
        this.a = m38;
        this.b = m382;
        this.c = m383;
        this.d = m384;
        this.e = a51;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.zq0) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.zq0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            zq0 r5 = (defpackage.zq0) r5
            m38 r1 = r5.a
            m38 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            m38 r1 = r4.b
            m38 r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            m38 r1 = r4.c
            m38 r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            m38 r1 = r4.d
            m38 r3 = r5.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            a51 r4 = r4.e
            a51 r5 = r5.e
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0033
            return r2
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        return this.e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BottomPanelState(isMicrophoneEnabled=" + this.a + ", isVideoEnabled=" + this.b + ", isRaiseHandEnabled=" + this.c + ", isOpenChatEnabled=" + this.d + ", dynamicType=" + this.e + ")";
    }
}
