package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import one.me.messages.list.loader.MessageModel;

/* renamed from: m9a  reason: default package */
public final class m9a {
    public final String a = m9a.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public m9a(khe khe, khe khe2, je7 je7, je7 je72) {
        this.b = khe;
        this.c = khe2;
        this.d = je7;
        this.e = je72;
    }

    public static boolean d(zy7 zy7, MessageModel messageModel, u6b u6b) {
        if (messageModel.E0 == iu8.ERROR) {
            return true;
        }
        tz tzVar = messageModel.u0;
        if (tzVar.c || tzVar.b) {
            return true;
        }
        CharSequence b2 = u6b.b(zy7.a);
        return (b2 == null || b2.length() == 0) ^ true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.az7 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.j9a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            j9a r0 = (defpackage.j9a) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            j9a r0 = new j9a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            zy7 r4 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0065
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.od2.a0(r6)
            zy7 r5 = (defpackage.zy7) r5
            one.me.messages.list.loader.MessageModel r6 = r5.b()
            ow8 r6 = r6.H0
            ow8 r2 = defpackage.ow8.d
            boolean r6 = defpackage.tpa.f(r6, r2)
            if (r6 != 0) goto L_0x004b
            one.me.messages.list.loader.MessageModel r4 = r5.b()
            ow8 r4 = r4.H0
            return r4
        L_0x004b:
            je7 r4 = r4.e
            java.lang.Object r4 = r4.getValue()
            ds3 r4 = (defpackage.ds3) r4
            one.me.messages.list.loader.MessageModel r6 = r5.b()
            r0.o = r5
            r0.Z = r3
            long r2 = r6.C0
            java.lang.Comparable r6 = r4.b(r2, r0)
            if (r6 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r4 = r5
        L_0x0065:
            uj3 r6 = (defpackage.uj3) r6
            one.me.messages.list.loader.MessageModel r4 = r4.b()
            r5 = 0
            if (r6 == 0) goto L_0x0073
            java.lang.CharSequence r0 = r6.m()
            goto L_0x0074
        L_0x0073:
            r0 = r5
        L_0x0074:
            if (r6 == 0) goto L_0x007c
            kk0 r5 = defpackage.kk0.b
            java.lang.String r5 = r6.p(r5)
        L_0x007c:
            ow8 r6 = new ow8
            long r1 = r4.C0
            r6.<init>(r1, r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9a.a(az7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.zy7 r7, int r8, int r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.k9a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            k9a r0 = (defpackage.k9a) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            k9a r0 = new k9a
            r0.<init>(r6, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r10 = r0.Y
            az7 r7 = r0.X
            m9a r6 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x009c
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            defpackage.od2.a0(r11)
            e52 r11 = r7.a
            boolean r11 = r11.M()
            r2 = 0
            if (r11 == 0) goto L_0x0043
            goto L_0x00c4
        L_0x0043:
            e52 r11 = r7.a
            boolean r4 = r11.I()
            if (r4 == 0) goto L_0x0067
            boolean r4 = defpackage.ry8.d(r9)
            if (r4 != 0) goto L_0x0067
            boolean r7 = r11.X()
            je7 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            v5d r6 = (defpackage.v5d) r6
            java.lang.String r8 = r11.q()
            r9 = 4
            android.text.Layout r2 = defpackage.v5d.b(r6, r8, r7, r9)
            goto L_0x00c4
        L_0x0067:
            boolean r11 = defpackage.ns0.b(r8)
            if (r11 == 0) goto L_0x00c4
            boolean r11 = defpackage.ns0.c(r8)
            if (r11 != 0) goto L_0x0079
            boolean r8 = defpackage.ns0.a(r8)
            if (r8 == 0) goto L_0x00c4
        L_0x0079:
            boolean r8 = defpackage.ry8.d(r9)
            if (r8 != 0) goto L_0x00c4
            je7 r8 = r6.e
            java.lang.Object r8 = r8.getValue()
            ds3 r8 = (defpackage.ds3) r8
            one.me.messages.list.loader.MessageModel r9 = r7.b()
            r0.o = r6
            r0.X = r7
            r0.Y = r10
            r0.t0 = r3
            long r4 = r9.C0
            java.lang.Comparable r11 = r8.b(r4, r0)
            if (r11 != r1) goto L_0x009c
            return r1
        L_0x009c:
            uj3 r11 = (defpackage.uj3) r11
            r8 = 0
            if (r11 == 0) goto L_0x00a8
            boolean r9 = r11.u()
            if (r9 != r3) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r3 = r8
        L_0x00a9:
            je7 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            v5d r6 = (defpackage.v5d) r6
            zy7 r7 = (defpackage.zy7) r7
            u6b r7 = r7.b
            ida r8 = r7.a
            int r8 = r8.g()
            r7.c(r8)
            java.lang.CharSequence r7 = r7.h
            android.text.Layout r2 = r6.a(r10, r7, r3)
        L_0x00c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9a.b(zy7, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean c(zy7 zy7, MessageModel messageModel, MessageModel messageModel2) {
        if (messageModel2 == null || messageModel2.y0 != null || messageModel2.z0 != null) {
            return false;
        }
        int i = (messageModel.c > 0 ? 1 : (messageModel.c == 0 ? 0 : -1));
        long j = messageModel2.c;
        if ((i < 0 && j > 0) || (i > 0 && j < 0)) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = ((t6b) this.d.getValue()).c;
        long j2 = messageModel2.a;
        u6b u6b = (u6b) concurrentHashMap.get(Long.valueOf(j2));
        if (u6b == null) {
            hm9.m0(this.a, ey8.i(j2, "PreProcessedData for message=MessageModel(", ") is null"), new Object[0]);
            return false;
        }
        u6b u6b2 = zy7.b;
        u6b2.d();
        n34 n34 = u6b2.n;
        u6b.d();
        return !(ay7.A(n34, u6b.n) ^ true) && messageModel.C0 == messageModel2.C0 && !d(zy7, messageModel, zy7.b) && !d(zy7, messageModel2, u6b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0377 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.zy7 r20, kotlin.coroutines.Continuation r21) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r0 = r21
            boolean r1 = r0 instanceof defpackage.l9a
            if (r1 == 0) goto L_0x001a
            r1 = r0
            l9a r1 = (defpackage.l9a) r1
            int r2 = r1.w0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.w0 = r2
        L_0x0018:
            r8 = r1
            goto L_0x0020
        L_0x001a:
            l9a r1 = new l9a
            r1.<init>(r6, r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r8.u0
            tx3 r9 = defpackage.tx3.a
            int r1 = r8.w0
            r2 = 1
            r12 = 2
            if (r1 == 0) goto L_0x005b
            if (r1 == r2) goto L_0x0043
            if (r1 != r12) goto L_0x003b
            java.lang.Object r1 = r8.X
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.lang.Object r2 = r8.o
            one.me.messages.list.loader.MessageModel r2 = (one.me.messages.list.loader.MessageModel) r2
            defpackage.od2.a0(r0)
            goto L_0x03c4
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            int r1 = r8.t0
            one.me.messages.list.loader.MessageModel r2 = r8.s0
            one.me.messages.list.loader.MessageModel r3 = r8.Z
            one.me.messages.list.loader.MessageModel r4 = r8.Y
            java.lang.Object r5 = r8.X
            az7 r5 = (defpackage.az7) r5
            java.lang.Object r6 = r8.o
            m9a r6 = (defpackage.m9a) r6
            defpackage.od2.a0(r0)
            r10 = r1
            r1 = r3
            r14 = r4
            goto L_0x037b
        L_0x005b:
            defpackage.od2.a0(r0)
            one.me.messages.list.loader.MessageModel r0 = r20.b()
            i9a r1 = new i9a
            r3 = 0
            r1.<init>(r6, r7, r3)
            r3 = 3
            je7 r1 = defpackage.tu0.r(r3, r1)
            i9a r4 = new i9a
            r5 = 1
            r4.<init>(r6, r7, r5)
            je7 r3 = defpackage.tu0.r(r3, r4)
            e52 r4 = r7.a
            boolean r5 = r4.I()
            r13 = 0
            if (r5 == 0) goto L_0x0085
            r0 = 201326592(0xc000000, float:9.8607613E-32)
        L_0x0082:
            r10 = r0
            goto L_0x0153
        L_0x0085:
            java.util.List r5 = r20.c()
            int r5 = r5.size()
            boolean r0 = r0.D0
            r14 = 134217728(0x8000000, float:3.85186E-34)
            if (r5 > r2) goto L_0x009b
            if (r0 == 0) goto L_0x0098
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0099
        L_0x0098:
            r0 = r13
        L_0x0099:
            r0 = r0 | r14
            goto L_0x0082
        L_0x009b:
            int r5 = r7.c
            r15 = 268435456(0x10000000, float:2.5243549E-29)
            if (r5 != 0) goto L_0x00ca
            java.util.List r1 = r20.c()
            java.lang.Object r1 = r1.get(r13)
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.util.List r3 = r20.c()
            java.lang.Object r3 = r3.get(r2)
            one.me.messages.list.loader.MessageModel r3 = (one.me.messages.list.loader.MessageModel) r3
            boolean r1 = r6.c(r7, r1, r3)
            if (r1 == 0) goto L_0x00c3
            if (r0 == 0) goto L_0x00c0
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00c1
        L_0x00c0:
            r0 = r13
        L_0x00c1:
            r0 = r0 | r15
            goto L_0x0082
        L_0x00c3:
            if (r0 == 0) goto L_0x00c8
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0099
        L_0x00c8:
            r0 = r13
            goto L_0x0099
        L_0x00ca:
            java.util.List r16 = r20.c()
            int r10 = defpackage.y53.L(r16)
            r16 = 1073741824(0x40000000, float:2.0)
            if (r5 != r10) goto L_0x0101
            java.util.List r1 = r20.c()
            java.lang.Object r1 = r1.get(r5)
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.util.List r3 = r20.c()
            int r5 = r5 - r2
            java.lang.Object r3 = r3.get(r5)
            one.me.messages.list.loader.MessageModel r3 = (one.me.messages.list.loader.MessageModel) r3
            boolean r1 = r6.c(r7, r1, r3)
            if (r1 == 0) goto L_0x00fa
            if (r0 == 0) goto L_0x00f6
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00f7
        L_0x00f6:
            r0 = r13
        L_0x00f7:
            r0 = r0 | r16
            goto L_0x0082
        L_0x00fa:
            if (r0 == 0) goto L_0x00ff
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0099
        L_0x00ff:
            r0 = r13
            goto L_0x0099
        L_0x0101:
            java.lang.Object r5 = r1.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0122
            java.lang.Object r5 = r3.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0122
            if (r0 == 0) goto L_0x011f
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0099
        L_0x011f:
            r0 = r13
            goto L_0x0099
        L_0x0122:
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0135
            if (r0 == 0) goto L_0x0133
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00c1
        L_0x0133:
            r0 = r13
            goto L_0x00c1
        L_0x0135:
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x014c
            if (r0 == 0) goto L_0x0146
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0147
        L_0x0146:
            r0 = r13
        L_0x0147:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 | r1
            goto L_0x0082
        L_0x014c:
            if (r0 == 0) goto L_0x0151
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00f7
        L_0x0151:
            r0 = r13
            goto L_0x00f7
        L_0x0153:
            one.me.messages.list.loader.MessageModel r14 = r20.b()
            one.me.messages.list.loader.MessageModel r0 = r20.b()
            tz r0 = r0.u0
            o00 r0 = r0.d
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            pw8 r1 = r1.y0
            if (r1 == 0) goto L_0x0169
            r1 = r2
            goto L_0x016a
        L_0x0169:
            r1 = r13
        L_0x016a:
            r3 = 4
            u6b r5 = r7.b
            if (r1 == 0) goto L_0x0172
            r0 = r13
            goto L_0x0291
        L_0x0172:
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            tc9 r1 = r1.z0
            if (r1 == 0) goto L_0x017e
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0291
        L_0x017e:
            java.lang.CharSequence r1 = r5.b(r4)
            if (r1 == 0) goto L_0x018d
            int r1 = r1.length()
            if (r1 != 0) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r1 = r13
            goto L_0x018e
        L_0x018d:
            r1 = r2
        L_0x018e:
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x01a6
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            tz r1 = r1.u0
            o00 r1 = r1.d
            if (r1 == 0) goto L_0x019d
            r1 = r2
            goto L_0x019e
        L_0x019d:
            r1 = r13
        L_0x019e:
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x01a6
            r0 = 4096(0x1000, float:5.74E-42)
        L_0x01a3:
            r0 = r0 | r10
            goto L_0x0291
        L_0x01a6:
            boolean r1 = r0 instanceof defpackage.y01
            if (r1 == 0) goto L_0x01ad
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x01a3
        L_0x01ad:
            boolean r1 = r0 instanceof defpackage.oa6
            if (r1 == 0) goto L_0x01b4
            r0 = 64
            goto L_0x01a3
        L_0x01b4:
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x01d4
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            tz r1 = r1.u0
            o00 r1 = r1.d
            if (r1 == 0) goto L_0x01cc
            r1 = r2
            goto L_0x01cd
        L_0x01cc:
            r1 = r13
        L_0x01cd:
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x01d4
            r0 = r2 | r10
            goto L_0x0291
        L_0x01d4:
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            tz r1 = r1.u0
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x01fc
            boolean r1 = r0 instanceof defpackage.vqd
            if (r1 == 0) goto L_0x01fc
            r0 = r12 | r10
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x029b
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            by8 r1 = r1.w0
            if (r1 == 0) goto L_0x029b
            r0 = r10 | 3
            goto L_0x029b
        L_0x01fc:
            boolean r1 = r0 instanceof defpackage.bsd
            if (r1 == 0) goto L_0x021a
            r0 = r3 | r10
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x029b
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            by8 r1 = r1.w0
            if (r1 == 0) goto L_0x029b
            r0 = r10 | 5
            goto L_0x029b
        L_0x021a:
            boolean r1 = r0 instanceof defpackage.f53
            if (r1 == 0) goto L_0x0238
            r0 = 8192(0x2000, float:1.14794E-41)
            r0 = r0 | r10
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x029b
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            by8 r1 = r1.w0
            if (r1 == 0) goto L_0x029b
            r0 = r10 | 8193(0x2001, float:1.1481E-41)
            goto L_0x029b
        L_0x0238:
            boolean r1 = r0 instanceof defpackage.v2e
            if (r1 == 0) goto L_0x0265
            v2e r0 = (defpackage.v2e) r0
            z2e r1 = r0.a
            java.lang.String r1 = r1.Y
            if (r1 == 0) goto L_0x0250
            int r1 = r1.length()
            if (r1 != 0) goto L_0x024b
            goto L_0x0250
        L_0x024b:
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x01a3
        L_0x0250:
            z2e r0 = r0.a
            java.lang.String r0 = r0.X
            if (r0 == 0) goto L_0x0261
            int r0 = r0.length()
            if (r0 != 0) goto L_0x025d
            goto L_0x0261
        L_0x025d:
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01a3
        L_0x0261:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x01a3
        L_0x0265:
            boolean r1 = r0 instanceof defpackage.bk3
            if (r1 == 0) goto L_0x026d
            r0 = 16
            goto L_0x01a3
        L_0x026d:
            boolean r1 = r0 instanceof defpackage.tjd
            if (r1 == 0) goto L_0x0275
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x01a3
        L_0x0275:
            boolean r1 = r0 instanceof defpackage.k50
            if (r1 == 0) goto L_0x027d
            r0 = 8
            goto L_0x01a3
        L_0x027d:
            boolean r1 = r0 instanceof defpackage.zf5
            if (r1 == 0) goto L_0x0285
            r0 = 32
            goto L_0x01a3
        L_0x0285:
            boolean r0 = r0 instanceof defpackage.wgf
            if (r0 == 0) goto L_0x028d
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x01a3
        L_0x028d:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x01a3
        L_0x0291:
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            cw8 r1 = r1.x0
            if (r1 == 0) goto L_0x029b
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L_0x029b:
            r14.I0 = r0
            one.me.messages.list.loader.MessageModel r1 = r20.b()
            boolean r15 = r4.C()
            long r11 = r1.C0
            if (r15 != 0) goto L_0x02ab
        L_0x02a9:
            r1 = 0
            goto L_0x02c2
        L_0x02ab:
            boolean r1 = r4.E(r11)
            if (r1 != 0) goto L_0x02b2
            goto L_0x02a9
        L_0x02b2:
            k92 r1 = r4.b
            java.util.Map r1 = r1.R
            java.lang.Long r15 = java.lang.Long.valueOf(r11)
            java.lang.Object r1 = r1.get(r15)
            t82 r1 = (defpackage.t82) r1
            java.lang.String r1 = r1.d
        L_0x02c2:
            int r15 = r14.A0
            if (r15 == r2) goto L_0x0340
            one.me.messages.list.loader.MessageModel r15 = r20.b()
            boolean r15 = r15.D0
            if (r15 == 0) goto L_0x0340
            r17 = 0
            int r15 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r15 == 0) goto L_0x0340
            boolean r15 = r4.I()
            if (r15 != 0) goto L_0x0340
            boolean r15 = defpackage.ns0.b(r10)
            if (r15 == 0) goto L_0x0340
            boolean r15 = defpackage.ns0.c(r10)
            if (r15 != 0) goto L_0x02ec
            boolean r15 = defpackage.ns0.a(r10)
            if (r15 == 0) goto L_0x0340
        L_0x02ec:
            boolean r0 = defpackage.ry8.d(r0)
            if (r0 == 0) goto L_0x02f3
            goto L_0x0340
        L_0x02f3:
            r0 = 6
            je7 r15 = r6.c
            if (r1 == 0) goto L_0x030a
            boolean r17 = defpackage.w9e.C0(r1)
            if (r17 == 0) goto L_0x02ff
            goto L_0x030a
        L_0x02ff:
            java.lang.Object r4 = r15.getValue()
            v5d r4 = (defpackage.v5d) r4
            android.text.Layout r0 = defpackage.v5d.b(r4, r1, r13, r0)
            goto L_0x0341
        L_0x030a:
            boolean r1 = r4.Y(r11)
            if (r1 == 0) goto L_0x0325
            java.lang.Object r1 = r15.getValue()
            v5d r1 = (defpackage.v5d) r1
            ida r4 = r5.a
            android.content.Context r4 = r4.a
            int r5 = defpackage.yea.q2
            java.lang.String r4 = r4.getString(r5)
            android.text.Layout r0 = defpackage.v5d.b(r1, r4, r13, r0)
            goto L_0x0341
        L_0x0325:
            boolean r1 = r4.E(r11)
            if (r1 == 0) goto L_0x0340
            java.lang.Object r1 = r15.getValue()
            v5d r1 = (defpackage.v5d) r1
            ida r4 = r5.a
            android.content.Context r4 = r4.a
            int r5 = defpackage.yea.c2
            java.lang.String r4 = r4.getString(r5)
            android.text.Layout r0 = defpackage.v5d.b(r1, r4, r13, r0)
            goto L_0x0341
        L_0x0340:
            r0 = 0
        L_0x0341:
            if (r0 == 0) goto L_0x0358
            int r1 = r0.getWidth()
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r1 = defpackage.rh4.c(r3, r4, r1)
            r4 = r1
            goto L_0x0359
        L_0x0358:
            r4 = r13
        L_0x0359:
            r14.G0 = r0
            int r3 = r14.I0
            r8.o = r6
            r8.X = r7
            r8.Y = r14
            r8.Z = r14
            r8.s0 = r14
            r8.t0 = r10
            r8.w0 = r2
            r0 = r19
            r1 = r20
            r2 = r10
            r5 = r8
            java.lang.Object r0 = r0.b(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x0378
            return r9
        L_0x0378:
            r5 = r7
            r1 = r14
            r2 = r1
        L_0x037b:
            android.text.Layout r0 = (android.text.Layout) r0
            r2.F0 = r0
            r8.o = r14
            r8.X = r1
            r0 = 0
            r8.Y = r0
            r8.Z = r0
            r8.s0 = r0
            r2 = 2
            r8.w0 = r2
            r6.getClass()
            r2 = r5
            zy7 r2 = (defpackage.zy7) r2
            e52 r3 = r2.a
            boolean r3 = r3.M()
            if (r3 != 0) goto L_0x03be
            e52 r2 = r2.a
            boolean r2 = r2.I()
            if (r2 != 0) goto L_0x03be
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r10
            if (r2 != 0) goto L_0x03a9
            goto L_0x03be
        L_0x03a9:
            boolean r0 = defpackage.ns0.a(r10)
            if (r0 != 0) goto L_0x03b9
            boolean r0 = defpackage.ns0.c(r10)
            if (r0 == 0) goto L_0x03b6
            goto L_0x03b9
        L_0x03b6:
            ow8 r11 = defpackage.ow8.d
            goto L_0x03bf
        L_0x03b9:
            java.lang.Object r0 = r6.a(r5, r8)
            goto L_0x03c0
        L_0x03be:
            r11 = r0
        L_0x03bf:
            r0 = r11
        L_0x03c0:
            if (r0 != r9) goto L_0x03c3
            return r9
        L_0x03c3:
            r2 = r14
        L_0x03c4:
            ow8 r0 = (defpackage.ow8) r0
            r1.H0 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9a.e(zy7, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
