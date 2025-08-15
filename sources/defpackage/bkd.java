package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bkd  reason: default package */
public final class bkd extends ffe implements a66 {
    public Object X;
    public int Y;
    public final /* synthetic */ ckd Z;
    public final /* synthetic */ CharSequence s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bkd(ckd ckd, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Z = ckd;
        this.s0 = charSequence;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bkd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bkd(this.Z, this.s0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: nz4} */
    /* JADX WARNING: type inference failed for: r7v9, types: [f9d, w8d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v3, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v5, types: [b20, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 1
            tx3 r2 = defpackage.tx3.a
            int r3 = r0.Y
            java.lang.CharSequence r4 = r0.s0
            r5 = 0
            ckd r6 = r0.Z
            if (r3 == 0) goto L_0x0023
            if (r3 != r1) goto L_0x001b
            java.lang.Object r0 = r0.X
            java.util.List r0 = (java.util.List) r0
            defpackage.od2.a0(r19)
            r3 = r0
            r0 = r19
            goto L_0x003f
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            defpackage.od2.a0(r19)
            je7 r3 = r6.f
            java.lang.Object r3 = r3.getValue()
            dc6 r3 = (defpackage.dc6) r3
            java.util.List r3 = r3.a(r5, r4)
            r0.X = r3
            r0.Y = r1
            x3c r7 = r6.c
            java.lang.Object r0 = r7.f(r0)
            if (r0 != r2) goto L_0x003f
            return r2
        L_0x003f:
            java.util.Set r0 = (java.util.Set) r0
            je7 r2 = r6.e
            java.lang.Object r2 = r2.getValue()
            nkd r2 = (defpackage.nkd) r2
            java.util.List r0 = defpackage.x53.D0(r0)
            if (r4 != 0) goto L_0x0051
            java.lang.String r4 = ""
        L_0x0051:
            java.lang.String r4 = r4.toString()
            r2.getClass()
            java.lang.String r7 = "nkd"
            java.lang.String r8 = "share"
            defpackage.hm9.m(r7, r8, new java.lang.Object[0])
            ru.ok.tamtam.android.util.share.ShareData r6 = r6.a
            if (r6 != 0) goto L_0x0065
            goto L_0x02a2
        L_0x0065:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r6.type
            nz4 r16 = defpackage.nz4.a
            if (r9 != 0) goto L_0x008c
            java.lang.String r9 = r6.text
            boolean r9 = defpackage.oag.t(r9)
            if (r9 != 0) goto L_0x008c
            java.lang.String r9 = r6.text
            java.lang.String r13 = r9.trim()
            i9d r9 = new i9d
            r11 = 0
            r14 = 1
            r10 = r9
            r15 = r16
            r10.<init>(r11, r13, r14, r15)
            r8.add(r9)
        L_0x008c:
            java.util.List<android.net.Uri> r9 = r6.images
            if (r9 == 0) goto L_0x00c7
            boolean r9 = r6.isSingleMedia()
            if (r9 == 0) goto L_0x00a2
            java.util.List<android.net.Uri> r9 = r6.images
            java.lang.String r10 = r6.text
            java.util.ArrayList r9 = r2.a(r1, r10, r9)
            r8.addAll(r9)
            goto L_0x00c7
        L_0x00a2:
            java.lang.String r9 = r6.text
            boolean r9 = defpackage.oag.t(r9)
            if (r9 != 0) goto L_0x00be
            java.lang.String r9 = r6.text
            java.lang.String r13 = r9.trim()
            i9d r9 = new i9d
            r11 = 0
            r14 = 1
            r10 = r9
            r15 = r16
            r10.<init>(r11, r13, r14, r15)
            r8.add(r9)
        L_0x00be:
            java.util.List<android.net.Uri> r9 = r6.images
            java.util.ArrayList r9 = r2.a(r1, r5, r9)
            r8.addAll(r9)
        L_0x00c7:
            java.util.List<android.net.Uri> r9 = r6.videos
            if (r9 == 0) goto L_0x00db
            boolean r10 = r6.isSingleMedia()
            r15 = 3
            if (r10 == 0) goto L_0x00de
            java.lang.String r10 = r6.text
            java.util.ArrayList r9 = r2.a(r15, r10, r9)
            r8.addAll(r9)
        L_0x00db:
            r18 = r7
            goto L_0x010c
        L_0x00de:
            java.lang.String r10 = r6.text
            boolean r10 = defpackage.oag.t(r10)
            if (r10 != 0) goto L_0x0102
            java.lang.String r10 = r6.text
            java.lang.String r13 = r10.trim()
            i9d r14 = new i9d
            r11 = 0
            r17 = 1
            r10 = r14
            r1 = r14
            r14 = r17
            r18 = r7
            r7 = r15
            r15 = r16
            r10.<init>(r11, r13, r14, r15)
            r8.add(r1)
            goto L_0x0105
        L_0x0102:
            r18 = r7
            r7 = r15
        L_0x0105:
            java.util.ArrayList r1 = r2.a(r7, r5, r9)
            r8.addAll(r1)
        L_0x010c:
            java.util.List<android.net.Uri> r1 = r6.files
            if (r1 == 0) goto L_0x0136
            java.lang.String r1 = r6.text
            boolean r1 = defpackage.oag.t(r1)
            if (r1 != 0) goto L_0x012c
            java.lang.String r1 = r6.text
            java.lang.String r13 = r1.trim()
            i9d r1 = new i9d
            r11 = 0
            r14 = 1
            r10 = r1
            r15 = r16
            r10.<init>(r11, r13, r14, r15)
            r8.add(r1)
        L_0x012c:
            java.util.List<android.net.Uri> r1 = r6.files
            r7 = 7
            java.util.ArrayList r1 = r2.a(r7, r5, r1)
            r8.addAll(r1)
        L_0x0136:
            java.util.List<android.net.Uri> r1 = r6.shares
            r9 = 0
            if (r1 == 0) goto L_0x019a
            java.lang.String r7 = r6.text
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r1.size()
            r11.<init>(r12)
            java.util.Iterator r1 = r1.iterator()
        L_0x014b:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0197
            java.lang.Object r12 = r1.next()
            android.net.Uri r12 = (android.net.Uri) r12
            if (r12 == 0) goto L_0x015e
            java.lang.String r12 = java.lang.String.valueOf(r12)
            goto L_0x015f
        L_0x015e:
            r12 = r5
        L_0x015f:
            boolean r13 = defpackage.oag.t(r12)
            if (r13 != 0) goto L_0x014b
            int r13 = defpackage.l20.A
            j10 r13 = new j10
            r13.<init>()
            g20 r14 = defpackage.g20.Z
            r13.a = r14
            int r14 = defpackage.c20.i
            b20 r14 = new b20
            r14.<init>()
            r14.b = r12
            c20 r15 = new c20
            r15.<init>(r14)
            r13.g = r15
            l20 r13 = r13.a()
            boolean r14 = defpackage.oag.t(r7)
            if (r14 != 0) goto L_0x018b
            r12 = r7
        L_0x018b:
            i9d r14 = new i9d
            r14.<init>(r9, r12, r13)
            r12 = 1
            r14.n = r12
            r11.add(r14)
            goto L_0x014b
        L_0x0197:
            r8.addAll(r11)
        L_0x019a:
            java.lang.String r1 = r6.vcard
            boolean r1 = defpackage.oag.t(r1)
            if (r1 != 0) goto L_0x01bd
            java.lang.String r1 = r6.vcard
            boolean r7 = defpackage.oag.t(r1)
            if (r7 != 0) goto L_0x01b6
            w8d r7 = new w8d
            r7.<init>(r9)
            r7.l = r1
            java.util.List r1 = java.util.Collections.singletonList(r7)
            goto L_0x01ba
        L_0x01b6:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x01ba:
            r8.addAll(r1)
        L_0x01bd:
            r1 = 0
            if (r4 == 0) goto L_0x01e2
            java.lang.String r12 = r4.trim()
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L_0x01e2
            boolean r7 = defpackage.oag.t(r12)
            if (r7 != 0) goto L_0x01e2
            i9d r7 = new i9d
            if (r3 != 0) goto L_0x01d7
            r14 = r16
            goto L_0x01d8
        L_0x01d7:
            r14 = r3
        L_0x01d8:
            r10 = 0
            r13 = 1
            r9 = r7
            r9.<init>(r10, r12, r13, r14)
            r8.add(r1, r7)
        L_0x01e2:
            int r3 = r8.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r7 = r0.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r7}
            java.lang.String r7 = "share: queue size = %d; chats count = %d"
            r9 = r18
            defpackage.hm9.m(r9, r7, r3)
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x023f
            java.util.Iterator r1 = r0.iterator()
        L_0x0207:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0223
            java.lang.Object r3 = r1.next()
            java.lang.Long r3 = (java.lang.Long) r3
            n5d r5 = new n5d
            r3.getClass()
            java.lang.String r3 = "file.local.unknown.error"
            r5.<init>(r3)
            av0 r3 = r2.b
            r3.c(r5)
            goto L_0x0207
        L_0x0223:
            ru.ok.tamtam.util.HandledException r1 = new ru.ok.tamtam.util.HandledException
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0, r6}
            java.lang.String r3 = "Try to share empty queue. Description = %s chats size = %d, shareData = %s"
            r1.<init>(r3, r0)
            o45 r0 = r2.d
            cba r0 = (defpackage.cba) r0
            r2 = 1
            r0.c(r1, r2)
            goto L_0x02a2
        L_0x023f:
            lq9 r3 = r2.c
            r3.getClass()
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            int r4 = r8.size()
            r3.<init>(r4)
            java.util.Iterator r4 = r8.iterator()
        L_0x0251:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0265
            java.lang.Object r6 = r4.next()
            f9d r6 = (defpackage.f9d) r6
            g9d r6 = r6.a()
            r3.add(r6)
            goto L_0x0251
        L_0x0265:
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = "lq9"
            java.lang.String r7 = "tasks size = %d"
            defpackage.hm9.m(r6, r7, r4)
        L_0x0278:
            int r4 = r0.size()
            if (r1 >= r4) goto L_0x02a2
            java.lang.Object r4 = r0.get(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r6 = r4.longValue()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>(r3)
            h8d r8 = new h8d
            r9 = 2
            r8.<init>(r6, r4, r9)
            r8.h = r5
            h9d r4 = new h9d
            r4.<init>(r8)
            s8g r6 = r2.e
            r6.a(r4)
            r4 = 1
            int r1 = r1 + r4
            goto L_0x0278
        L_0x02a2:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkd.o(java.lang.Object):java.lang.Object");
    }
}
