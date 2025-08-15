package defpackage;

/* renamed from: la1  reason: default package */
public final class la1 {
    public final String a;
    public final j1e b;
    public final j1e c;
    public final boolean d;
    public final i95 e;
    public final m31 f;
    public final boolean g;
    public final fqa h;
    public final ak1 i;
    public final yj1 j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final gg1 p;
    public final m38 q;
    public final m38 r;
    public final boolean s;
    public final boolean t;

    public la1(String str, j1e j1e, j1e j1e2, boolean z, i95 i95, m31 m31, boolean z2, fqa fqa, ak1 ak1, yj1 yj1, String str2, boolean z3, boolean z4, boolean z5, boolean z6, gg1 gg1, m38 m38, m38 m382, boolean z7, boolean z8) {
        this.a = str;
        this.b = j1e;
        this.c = j1e2;
        this.d = z;
        this.e = i95;
        this.f = m31;
        this.g = z2;
        this.h = fqa;
        this.i = ak1;
        this.j = yj1;
        this.k = str2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = gg1;
        this.q = m38;
        this.r = m382;
        this.s = z7;
        this.t = z8;
    }

    public static la1 a(la1 la1, j1e j1e, i95 i95, m31 m31, boolean z, m38 m38, m38 m382, boolean z2, int i2) {
        m38 m383;
        gg1 gg1;
        boolean z3;
        boolean z4;
        la1 la12 = la1;
        String str = la12.a;
        j1e j1e2 = la12.b;
        j1e j1e3 = (i2 & 4) != 0 ? la12.c : j1e;
        boolean z5 = la12.d;
        i95 i952 = (i2 & 16) != 0 ? la12.e : i95;
        m31 m312 = (i2 & 32) != 0 ? la12.f : m31;
        boolean z6 = (i2 & 64) != 0 ? la12.g : z;
        fqa fqa = la12.h;
        ak1 ak1 = la12.i;
        yj1 yj1 = la12.j;
        String str2 = la12.k;
        boolean z7 = la12.l;
        boolean z8 = la12.m;
        boolean z9 = la12.n;
        boolean z10 = la12.o;
        gg1 gg12 = la12.p;
        if ((i2 & 65536) != 0) {
            gg1 = gg12;
            m383 = la12.q;
        } else {
            gg1 = gg12;
            m383 = m38;
        }
        m38 m384 = (i2 & 131072) != 0 ? la12.r : m382;
        boolean z11 = la12.s;
        if ((i2 & 524288) != 0) {
            z4 = z11;
            z3 = la12.t;
        } else {
            z4 = z11;
            z3 = z2;
        }
        la1.getClass();
        return new la1(str, j1e2, j1e3, z5, i952, m312, z6, fqa, ak1, yj1, str2, z7, z8, z9, z10, gg1, m383, m384, z4, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la1)) {
            return false;
        }
        la1 la1 = (la1) obj;
        return tpa.f(this.a, la1.a) && tpa.f(this.b, la1.b) && tpa.f(this.c, la1.c) && this.d == la1.d && tpa.f(this.e, la1.e) && tpa.f(this.f, la1.f) && this.g == la1.g && tpa.f(this.h, la1.h) && tpa.f(this.i, la1.i) && tpa.f(this.j, la1.j) && tpa.f(this.k, la1.k) && this.l == la1.l && this.m == la1.m && this.n == la1.n && this.o == la1.o && tpa.f(this.p, la1.p) && this.q == la1.q && this.r == la1.r && this.s == la1.s && this.t == la1.t;
    }

    public final int hashCode() {
        int i2 = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        j1e j1e = this.b;
        int hashCode2 = (hashCode + (j1e == null ? 0 : j1e.hashCode())) * 31;
        j1e j1e2 = this.c;
        int hashCode3 = (this.e.hashCode() + ms2.d((hashCode2 + (j1e2 == null ? 0 : j1e2.hashCode())) * 31, 31, this.d)) * 31;
        m31 m31 = this.f;
        int d2 = ms2.d((hashCode3 + (m31 == null ? 0 : m31.hashCode())) * 31, 31, this.g);
        fqa fqa = this.h;
        int hashCode4 = (this.j.hashCode() + ((this.i.hashCode() + ((d2 + (fqa == null ? 0 : fqa.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.k;
        int d3 = ms2.d(ms2.d(ms2.d(ms2.d((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        gg1 gg1 = this.p;
        if (gg1 != null) {
            i2 = gg1.hashCode();
        }
        return Boolean.hashCode(this.t) + ms2.d((this.r.hashCode() + ((this.q.hashCode() + ((d3 + i2) * 31)) * 31)) * 31, 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallInfoState(conversationId=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", recallTarget=");
        sb.append(this.c);
        sb.append(", isIncoming=");
        sb.append(this.d);
        sb.append(", callState=");
        sb.append(this.e);
        sb.append(", chatInfo=");
        sb.append(this.f);
        sb.append(", isGroupCall=");
        sb.append(this.g);
        sb.append(", me=");
        sb.append(this.h);
        sb.append(", screenSharingState=");
        sb.append(this.i);
        sb.append(", recordSharingState=");
        sb.append(this.j);
        sb.append(", joinLink=");
        sb.append(this.k);
        sb.append(", hasOpponentsOnce=");
        sb.append(this.l);
        sb.append(", isConnectedOnce=");
        sb.append(this.m);
        sb.append(", isMeCallAdmin=");
        sb.append(this.n);
        sb.append(", isInCallMeOnly=");
        sb.append(this.o);
        sb.append(", primarySpeaker=");
        sb.append(this.p);
        sb.append(", isVideoEnabled=");
        sb.append(this.q);
        sb.append(", isMicrophoneEnabled=");
        sb.append(this.r);
        sb.append(", isCallUnavailable=");
        sb.append(this.s);
        sb.append(", hasAnyCameraEnabled=");
        return au1.j(sb, this.t, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ la1() {
        /*
            r21 = this;
            d95 r5 = defpackage.d95.b
            ak1 r9 = defpackage.ak1.g
            yj1 r10 = defpackage.yj1.g
            m38 r18 = defpackage.m38.X
            r20 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 1
            r16 = 0
            r19 = 0
            r0 = r21
            r17 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la1.<init>():void");
    }
}
