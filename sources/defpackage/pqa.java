package defpackage;

import java.util.Map;

/* renamed from: pqa  reason: default package */
public final class pqa {
    public final fqa a;
    public final Map b;
    public final Map c;
    public final gg1 d;
    public final gg1 e;
    public final Map f;
    public final Map g;
    public final boolean h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ pqa(defpackage.fqa r10) {
        /*
            r9 = this;
            oz4 r7 = defpackage.oz4.a
            r8 = 0
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r7
            r3 = r7
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqa.<init>(fqa):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r1.a.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.gg1 a() {
        /*
            r3 = this;
            java.util.Map r3 = r3.f
            java.util.Collection r0 = r3.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            r2 = r1
            fqa r2 = (defpackage.fqa) r2
            ig1 r2 = r2.a
            boolean r2 = r2.m()
            if (r2 == 0) goto L_0x000a
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            fqa r1 = (defpackage.fqa) r1
            if (r1 == 0) goto L_0x002e
            ig1 r0 = r1.a
            gg1 r0 = r0.getId()
            if (r0 == 0) goto L_0x002e
            goto L_0x0039
        L_0x002e:
            java.util.Set r3 = r3.keySet()
            java.lang.Object r3 = defpackage.x53.h0(r3)
            r0 = r3
            gg1 r0 = (defpackage.gg1) r0
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqa.a():gg1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqa)) {
            return false;
        }
        pqa pqa = (pqa) obj;
        return tpa.f(this.a, pqa.a) && tpa.f(this.b, pqa.b) && tpa.f(this.c, pqa.c) && tpa.f(this.d, pqa.d) && tpa.f(this.e, pqa.e) && tpa.f(this.f, pqa.f) && tpa.f(this.g, pqa.g) && this.h == pqa.h;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = 0;
        gg1 gg1 = this.d;
        int hashCode2 = (hashCode + (gg1 == null ? 0 : gg1.hashCode())) * 31;
        gg1 gg12 = this.e;
        if (gg12 != null) {
            i = gg12.hashCode();
        }
        int hashCode3 = this.f.hashCode();
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((hashCode3 + ((hashCode2 + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ParticipantsState(me=" + this.a + ", usersInCall=" + this.b + ", participants=" + this.c + ", primarySpeaker=" + this.d + ", opponentSpeaker=" + this.e + ", screenShareSpeakers=" + this.f + ", raisedHands=" + this.g + ", hasAnyEnabledCamera=" + this.h + ")";
    }

    public pqa(fqa fqa, Map map, Map map2, gg1 gg1, gg1 gg12, Map map3, Map map4, boolean z) {
        this.a = fqa;
        this.b = map;
        this.c = map2;
        this.d = gg1;
        this.e = gg12;
        this.f = map3;
        this.g = map4;
        this.h = z;
    }
}
