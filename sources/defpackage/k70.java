package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: k70  reason: default package */
public final class k70 implements tk6 {
    public final Object X;
    public long a;
    public long b;
    public long c;
    public final Object o;

    public k70(je7 je7, long j, long j2, long j3, Set set) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = set;
        this.X = je7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f1 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.ArrayList r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            if (r2 > r3) goto L_0x0115
            int r4 = r20.size()
            if (r2 >= r4) goto L_0x0115
            int r4 = r20.size()
            if (r3 < r4) goto L_0x0018
            goto L_0x0115
        L_0x0018:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = r3
        L_0x0023:
            r7 = 1
            if (r6 < r2) goto L_0x0103
            java.lang.Object r8 = r1.get(r6)
            es1 r8 = (defpackage.es1) r8
            int r9 = r5.size()
            if (r9 != 0) goto L_0x0037
            r5.add(r8)
            goto L_0x00c3
        L_0x0037:
            java.lang.Object r9 = defpackage.wg0.f(r5, r7)
            es1 r9 = (defpackage.es1) r9
            es8 r11 = r8.c
            cu8 r11 = r11.a
            l10 r11 = r11.d()
            boolean r11 = r11.b()
            long r12 = r0.c
            es8 r14 = r8.c
            if (r11 == 0) goto L_0x0059
            cu8 r11 = r14.a
            long r10 = r11.Y
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0059
            r10 = r7
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            es8 r11 = r9.c
            cu8 r11 = r11.a
            l10 r11 = r11.d()
            boolean r11 = r11.b()
            es8 r15 = r9.c
            if (r11 == 0) goto L_0x0078
            cu8 r11 = r15.a
            r17 = r8
            long r7 = r11.Y
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x007a
            r8 = r17
            r7 = 1
            goto L_0x007d
        L_0x0078:
            r17 = r8
        L_0x007a:
            r8 = r17
            r7 = 0
        L_0x007d:
            uj3 r11 = r8.b
            if (r11 == 0) goto L_0x0092
            uj3 r12 = r9.b
            if (r12 == 0) goto L_0x0092
            long r17 = r11.n()
            long r11 = r12.n()
            int r11 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x0092
            goto L_0x00a2
        L_0x0092:
            e52 r11 = r8.a
            if (r11 == 0) goto L_0x00c6
            e52 r9 = r9.a
            if (r9 == 0) goto L_0x00c6
            long r11 = r11.a
            long r1 = r9.a
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00c6
        L_0x00a2:
            cu8 r1 = r14.a
            long r1 = r1.o
            cu8 r9 = r15.a
            long r11 = r9.o
            long r1 = r1 - r11
            long r11 = r0.a
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x00c6
            int r1 = r5.size()
            long r1 = (long) r1
            long r11 = r0.b
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x00c6
            if (r10 == r7) goto L_0x00bf
            goto L_0x00c6
        L_0x00bf:
            r1 = 0
            r5.add(r1, r8)
        L_0x00c3:
            r16 = 0
            goto L_0x00c8
        L_0x00c6:
            r16 = 1
        L_0x00c8:
            if (r16 != 0) goto L_0x00cc
            if (r6 != 0) goto L_0x00fb
        L_0x00cc:
            r1 = 0
            java.lang.Object r2 = r5.get(r1)
            es1 r2 = (defpackage.es1) r2
            r4.add(r1, r2)
            int r1 = r5.size()
            r7 = 1
            if (r1 <= r7) goto L_0x00ec
            java.util.ArrayList r1 = new java.util.ArrayList
            int r9 = r5.size()
            java.util.List r7 = r5.subList(r7, r9)
            r1.<init>(r7)
            r2.e = r1
        L_0x00ec:
            r5.clear()
            if (r6 != 0) goto L_0x00f8
            if (r16 == 0) goto L_0x00f8
            r1 = 0
            r4.add(r1, r8)
            goto L_0x00fb
        L_0x00f8:
            r5.add(r8)
        L_0x00fb:
            int r6 = r6 + -1
            r1 = r20
            r2 = r21
            goto L_0x0023
        L_0x0103:
            r1 = r7
            int r0 = r3 + 1
            r1 = r20
            r2 = r21
            java.util.List r0 = r1.subList(r2, r0)
            r0.clear()
            r1.addAll(r2, r4)
            return
        L_0x0115:
            java.lang.String r0 = "merge: wrong index: start: "
            java.lang.String r4 = " end: "
            java.lang.String r5 = " size: "
            java.lang.StringBuilder r0 = defpackage.wg0.j(r0, r2, r4, r3, r5)
            int r1 = r20.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "k70"
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k70.a(java.util.ArrayList, int, int):void");
    }

    public sk6 i() {
        ae2 ae2 = new ae2(this, (Continuation) null);
        hz4 hz4 = hz4.a;
        e52 e52 = (e52) j47.f0(hz4, ae2);
        return new be2((x82) j47.f0(hz4, new ce2(this, e52, (Continuation) null)), e52, this);
    }

    public k70(long j) {
        this.o = new ArrayList();
        this.X = new ArrayList();
        Collections.emptyList();
        this.c = j;
        this.a = 14400000;
        this.b = (long) 10;
    }

    public k70(AudioTrack audioTrack) {
        this.o = audioTrack;
        this.X = new AudioTimestamp();
    }
}
