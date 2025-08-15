package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: pdb  reason: default package */
public final class pdb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final odb g;
    public final odb h;
    public final odb i;
    public final odb j;
    public final odb k;
    public final odb l;
    public final odb m;

    public pdb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, odb odb, odb odb2, odb odb3, odb odb4, odb odb5, odb odb6, odb odb7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = odb;
        this.h = odb2;
        this.i = odb3;
        this.j = odb4;
        this.k = odb5;
        this.l = odb6;
        this.m = odb7;
    }

    public static pdb a(pdb pdb, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, odb odb, odb odb2, odb odb3, odb odb4, odb odb5, odb odb6, odb odb7, int i2) {
        pdb pdb2 = pdb;
        int i3 = i2;
        return new pdb((i3 & 1) != 0 ? pdb2.a : z, (i3 & 2) != 0 ? pdb2.b : z2, (i3 & 4) != 0 ? pdb2.c : z3, (i3 & 8) != 0 ? pdb2.d : z4, (i3 & 16) != 0 ? pdb2.e : z5, (i3 & 32) != 0 ? pdb2.f : z6, (i3 & 64) != 0 ? pdb2.g : odb, (i3 & 128) != 0 ? pdb2.h : odb2, (i3 & 256) != 0 ? pdb2.i : odb3, (i3 & 512) != 0 ? pdb2.j : odb4, (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? pdb2.k : odb5, (i3 & 2048) != 0 ? pdb2.l : odb6, (i3 & 4096) != 0 ? pdb2.m : odb7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.pdb) r5;
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
            boolean r1 = r5 instanceof defpackage.pdb
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            pdb r5 = (defpackage.pdb) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L_0x0036
            return r2
        L_0x0036:
            odb r1 = r4.g
            odb r3 = r5.g
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0041
            return r2
        L_0x0041:
            odb r1 = r4.h
            odb r3 = r5.h
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x004c
            return r2
        L_0x004c:
            odb r1 = r4.i
            odb r3 = r5.i
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0057
            return r2
        L_0x0057:
            odb r1 = r4.j
            odb r3 = r5.j
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0062
            return r2
        L_0x0062:
            odb r1 = r4.k
            odb r3 = r5.k
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x006d
            return r2
        L_0x006d:
            odb r1 = r4.l
            odb r3 = r5.l
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0078
            return r2
        L_0x0078:
            odb r4 = r4.m
            odb r5 = r5.m
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0083
            return r2
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        int hashCode = this.h.hashCode();
        int hashCode2 = this.i.hashCode();
        int hashCode3 = this.j.hashCode();
        int hashCode4 = this.k.hashCode();
        int hashCode5 = this.l.hashCode();
        return this.m.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.g.hashCode() + d2) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileEditAdminPermissionsModel(isSuperAdmin=" + this.a + ", editSendDeleteMessagesEnabled=" + this.b + ", pinMessagesEnabled=" + this.c + ", changeChatInfoEnabled=" + this.d + ", changeMembersEnabled=" + this.e + ", editLinkEnabled=" + this.f + ", sendMessagePermState=" + this.g + ", editMessagePermState=" + this.h + ", deleteMessagePermState=" + this.i + ", pinMessagePermState=" + this.j + ", changeChatInfoPermState=" + this.k + ", controlMembersPermState=" + this.l + ", controlAdminsPermState=" + this.m + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ pdb(boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, defpackage.odb r24, defpackage.odb r25, defpackage.odb r26, defpackage.odb r27, defpackage.odb r28, defpackage.odb r29, defpackage.odb r30, int r31) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r18
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r19
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r20
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r21
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r22
        L_0x002b:
            r1 = r0 & 64
            r2 = 1
            if (r1 == 0) goto L_0x0037
            odb r1 = new odb
            r1.<init>(r5, r2)
            r10 = r1
            goto L_0x0039
        L_0x0037:
            r10 = r24
        L_0x0039:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0044
            odb r1 = new odb
            r1.<init>(r5, r2)
            r11 = r1
            goto L_0x0046
        L_0x0044:
            r11 = r25
        L_0x0046:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0051
            odb r1 = new odb
            r1.<init>(r5, r2)
            r12 = r1
            goto L_0x0053
        L_0x0051:
            r12 = r26
        L_0x0053:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x005e
            odb r1 = new odb
            r1.<init>(r6, r2)
            r13 = r1
            goto L_0x0060
        L_0x005e:
            r13 = r27
        L_0x0060:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x006b
            odb r1 = new odb
            r1.<init>(r7, r2)
            r14 = r1
            goto L_0x006d
        L_0x006b:
            r14 = r28
        L_0x006d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0078
            odb r1 = new odb
            r1.<init>(r8, r2)
            r15 = r1
            goto L_0x007a
        L_0x0078:
            r15 = r29
        L_0x007a:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0086
            odb r0 = new odb
            r0.<init>(r4, r2)
            r16 = r0
            goto L_0x0088
        L_0x0086:
            r16 = r30
        L_0x0088:
            r3 = r17
            r9 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdb.<init>(boolean, boolean, boolean, boolean, boolean, boolean, odb, odb, odb, odb, odb, odb, odb, int):void");
    }
}
