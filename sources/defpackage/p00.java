package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: p00  reason: default package */
public final /* synthetic */ class p00 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p00(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        List list;
        lr9 lr9 = (lr9) ((s7d) ((wle) this.b).i.getValue()).k.getValue();
        lr9.getClass();
        mr9 mr9 = (mr9) this.c;
        int i = mr9.X;
        if (i == 5) {
            hm9.m("lr9", "Handle FAVORITE_STICKER_SET update", new Object[0]);
            lr9.a(mr9);
            sc5 sc5 = (sc5) lr9.a.get();
            long j = mr9.c;
            List list2 = mr9.o;
            yt ytVar = mr9.Y;
            int i2 = mr9.Z;
            sc5.getClass();
            hm9.m("sc5", "onNotifAssetsUpdate: id=%d, updateType=%s, position=%d", Long.valueOf(j), ytVar.a, Integer.valueOf(i2));
            int ordinal = ytVar.ordinal();
            je7 je7 = sc5.o;
            hc3 hc3 = sc5.t0;
            if (ordinal == 1) {
                za3 k = new qa3(sc5.b(), 2, new c10(j, 14)).k((ztc) je7.getValue());
                iq1 iq1 = new iq1(new lc5(sc5, j, 1), 0, new mc5(j, 0));
                k.i(iq1);
                hc3.a(iq1);
            } else if (ordinal == 2) {
                hc3 hc32 = hc3;
                if (nd7.D(list2)) {
                    list2 = Collections.singletonList(Long.valueOf(j));
                }
                za3 k2 = new qa3(sc5.b(), 2, new z72(10, list2)).k((ztc) je7.getValue());
                iq1 iq12 = new iq1(new jc5(sc5, list2, 0), 0, new ic5(0, list2));
                k2.i(iq12);
                hc32.a(iq12);
            } else if (ordinal == 3) {
                za3 k3 = new qa3(sc5.b(), 2, new fc5(i2, 1, j)).k((ztc) je7.getValue());
                iq1 iq13 = new iq1(new e74((Object) sc5, j, i2, 1), 0, new rc5(i2, 0, j));
                k3.i(iq13);
                hc3.a(iq13);
            } else if (ordinal == 4) {
                hm9.m("sc5", "onNotifUpdated: id=%d", Long.valueOf(j));
                drd m = new ib3(new uqd(sc5.b(), new ta4(26), 0), new sa3(3, ((a4e) sc5.b.getValue()).d(Collections.singletonList(Long.valueOf(j))))).m((ztc) je7.getValue());
                iq1 iq14 = new iq1(new kc5(sc5, 0), 2, new lc5(sc5, j, 0));
                m.k(iq14);
                hc3.a(iq14);
            } else if (ordinal != 5) {
                hm9.p("sc5", "onNotifAssetsUpdate: unknown asset type", (Throwable) null);
            } else {
                hm9.m("sc5", "onListUpdated: ids=%s", list2);
                za3 k4 = new qa3(sc5.b(), 2, new z72(11, list2)).k((ztc) sc5.c.getValue());
                iq1 iq15 = new iq1(new jc5(sc5, list2, 1), 0, new ic5(1, list2));
                k4.i(iq15);
                hc3.a(iq15);
            }
        } else if (i == 4) {
            hm9.m("lr9", "Handle FAVORITE_STICKER update", new Object[0]);
            lr9.a(mr9);
            md5 md5 = (md5) lr9.b.get();
            long j2 = mr9.c;
            List list3 = mr9.o;
            yt ytVar2 = mr9.Y;
            int i3 = mr9.Z;
            md5.getClass();
            hm9.m("md5", "onNotifAssetsUpdate: id=%d, ids=%s, updateType=%s, position=%d", Long.valueOf(j2), list3, ytVar2.a, Integer.valueOf(i3));
            int ordinal2 = ytVar2.ordinal();
            hc3 hc33 = md5.h;
            rm4 rm4 = md5.c;
            rm4 rm42 = md5.a;
            if (ordinal2 == 1) {
                za3 k5 = new qa3(((hc5) rm42.get()).a(), 2, new bc5(0, j2, true)).k((ztc) rm4.get());
                iq1 iq16 = new iq1(new jd5(md5, j2, 0), 0, new mc5(j2, 4));
                k5.i(iq16);
                hc33.a(iq16);
            } else if (ordinal2 == 2) {
                if (nd7.D(list3)) {
                    list3 = Collections.singletonList(Long.valueOf(j2));
                }
                za3 k6 = new qa3(((hc5) rm42.get()).a(), 2, new z72(8, list3)).k((ztc) rm4.get());
                iq1 iq17 = new iq1(new id5(md5, list3, 0), 0, new ic5(5, list3));
                k6.i(iq17);
                hc33.a(iq17);
            } else if (ordinal2 == 3) {
                za3 k7 = new qa3(((hc5) rm42.get()).a(), 2, new fc5(i3, 0, j2)).k((ztc) rm4.get());
                iq1 iq18 = new iq1(new e74((Object) md5, j2, i3, 2), 0, new rc5(i3, 1, j2));
                k7.i(iq18);
                hc33.a(iq18);
            } else if (ordinal2 == 4) {
                hm9.m("md5", "onNotifUpdated: id=%d", Long.valueOf(j2));
                drd m2 = new ib3(new uqd(((hc5) rm42.get()).a(), new ta4(24), 0), new sa3(3, new q1a(2, new yc5(md5, j2, 1)))).m((ztc) rm4.get());
                iq1 iq19 = new iq1(new kd5(md5, 0), 2, new jd5(md5, j2, 1));
                m2.k(iq19);
                hc33.a(iq19);
            } else if (ordinal2 != 5) {
                hm9.p("md5", "onNotifAssetsUpdate: unknown asset type", (Throwable) null);
            } else {
                hm9.m("md5", "onListUpdated: ids=%s", list3);
                za3 k8 = new qa3(((hc5) rm42.get()).a(), 2, new z72(6, list3)).k((ztc) rm4.get());
                iq1 iq110 = new iq1(new id5(md5, list3, 1), 0, new ic5(4, list3));
                k8.i(iq110);
                hc33.a(iq110);
            }
        } else if (i == 3) {
            hm9.m("lr9", "Handle STICKER_SET update", new Object[0]);
            if (mr9.Y == yt.UPDATED) {
                ((pk) lr9.d.get()).c(3, Collections.singletonList(Long.valueOf(mr9.c)));
                return;
            }
            Locale locale = Locale.ENGLISH;
            hm9.p("lr9", "Unhandled sticker set update type: " + mr9, (Throwable) null);
        } else if (i == 6) {
            hm9.m("lr9", "Handle RECENT update", new Object[0]);
            x9c x9c = (x9c) lr9.e.get();
            ArrayList arrayList = mr9.t0;
            List list4 = mr9.u0;
            yt ytVar3 = mr9.Y;
            List list5 = nz4.a;
            if (arrayList == null) {
                x9c.getClass();
                list = list5;
            } else {
                list = iz7.p(arrayList, (vxc) x9c.e.getValue());
            }
            if (list4 != null) {
                list5 = iz7.k(list4);
            }
            ArrayList arrayList2 = new ArrayList(list);
            arrayList2.addAll(list5);
            if (!arrayList2.isEmpty()) {
                Collections.reverse(arrayList2);
                int ordinal3 = ytVar3.ordinal();
                msf msf = x9c.f;
                je7 je72 = x9c.c;
                if (ordinal3 == 1) {
                    p9c b2 = x9c.b();
                    za3 k9 = new qa3(b2.a.n(), 2, new o9c(b2, arrayList2, 2)).k((ztc) je72.getValue());
                    iq1 iq111 = new iq1(huc.t0, 0, new fa4(5));
                    k9.i(iq111);
                    msf.a(iq111);
                } else if (ordinal3 != 2) {
                    hm9.q("x9c", "Unhandled notif assets update: %s", ytVar3);
                } else {
                    za3 k10 = (list.isEmpty() ? wa3.a : new qa3(x9c.b().c(list), 0, new sa3(1, new u9c(x9c, list, 0)))).k((ztc) je72.getValue());
                    iq1 iq112 = new iq1(crd.t0, 0, new fa4(6));
                    k10.i(iq112);
                    msf.a(iq112);
                }
            }
        } else {
            Locale locale2 = Locale.ENGLISH;
            hm9.p("lr9", "Unhandled notif assets update: " + mr9, (Throwable) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v114, types: [eq1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v128, types: [eq1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x08f7, code lost:
        r2 = r2.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            r1 = 100
            r2 = 3
            r4 = 0
            r7 = 0
            int r8 = r0.a
            switch(r8) {
                case 0: goto L_0x0b53;
                case 1: goto L_0x0b2f;
                case 2: goto L_0x0b23;
                case 3: goto L_0x0af1;
                case 4: goto L_0x0ac1;
                case 5: goto L_0x0aab;
                case 6: goto L_0x0a9d;
                case 7: goto L_0x0a7c;
                case 8: goto L_0x0a67;
                case 9: goto L_0x0a59;
                case 10: goto L_0x09d0;
                case 11: goto L_0x09b1;
                case 12: goto L_0x0999;
                case 13: goto L_0x08d0;
                case 14: goto L_0x088e;
                case 15: goto L_0x083c;
                case 16: goto L_0x07c6;
                case 17: goto L_0x07a7;
                case 18: goto L_0x0751;
                case 19: goto L_0x06f1;
                case 20: goto L_0x058b;
                case 21: goto L_0x04de;
                case 22: goto L_0x03da;
                case 23: goto L_0x036f;
                case 24: goto L_0x031a;
                case 25: goto L_0x0224;
                case 26: goto L_0x0053;
                case 27: goto L_0x0025;
                case 28: goto L_0x0021;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.m
            java.lang.Object r1 = r1.getValue()
            w7b r1 = (defpackage.w7b) r1
            java.lang.Object r0 = r0.c
            xs9 r0 = (defpackage.xs9) r0
            r1.j(r0)
            return
        L_0x0021:
            r19.a()
            return
        L_0x0025:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            m7b r2 = r1.a
            p7b r2 = (defpackage.p7b) r2
            t33 r2 = r2.a
            boolean r2 = r2.G()
            if (r2 == 0) goto L_0x0036
            goto L_0x0052
        L_0x0036:
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            js9 r1 = (defpackage.js9) r1
            r1.getClass()
            mg4 r2 = defpackage.mg4.REGULAR
            java.lang.Object r0 = r0.c
            hs9 r0 = (defpackage.hs9) r0
            r1.a(r0, r2)
        L_0x0052:
            return
        L_0x0053:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.f
            java.lang.Object r1 = r1.getValue()
            t20 r1 = (defpackage.t20) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            nr9 r0 = (defpackage.nr9) r0
            long r8 = r0.c
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            java.lang.String r8 = "t20"
            if (r2 != 0) goto L_0x008a
            long r9 = r0.o
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x008a
            long r9 = r0.X
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            java.lang.String r0 = "onNotifAttach bad response, empty videoId/audioId skipped"
            defpackage.hm9.p(r8, r0, r7)
            goto L_0x0223
        L_0x008a:
            rm4 r2 = r1.a
            java.lang.Object r9 = r2.get()
            au8 r9 = (defpackage.au8) r9
            long r10 = r0.c
            long r12 = r0.o
            long r14 = r0.X
            r9.getClass()
            oz7 r16 = defpackage.iu8.b
            java.util.ArrayList r9 = r9.s()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00aa:
            boolean r17 = r9.hasNext()
            if (r17 == 0) goto L_0x010b
            java.lang.Object r17 = r9.next()
            r6 = r17
            cu8 r6 = (defpackage.cu8) r6
            boolean r17 = r6.n()
            if (r17 == 0) goto L_0x00ff
            k8g r4 = r6.z0
            java.lang.Object r4 = r4.a
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00c8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r5 = r4.next()
            l20 r5 = (defpackage.l20) r5
            i10 r7 = r5.e
            r18 = r1
            r19 = r2
            if (r7 == 0) goto L_0x00e2
            long r1 = r7.a
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x00f6
        L_0x00e2:
            k20 r1 = r5.d
            if (r1 == 0) goto L_0x00ec
            long r1 = r1.a
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x00f6
        L_0x00ec:
            s10 r1 = r5.j
            if (r1 == 0) goto L_0x00f9
            long r1 = r1.a
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x00f9
        L_0x00f6:
            r3.add(r6)
        L_0x00f9:
            r2 = r19
            r1 = r18
            r7 = 0
            goto L_0x00c8
        L_0x00ff:
            r18 = r1
            r19 = r2
            r2 = r19
            r1 = r18
            r4 = 0
            r7 = 0
            goto L_0x00aa
        L_0x010b:
            r18 = r1
            r19 = r2
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x011d
            java.lang.String r0 = "onNotifAttach: failed to find message by videoId/audioId/fileId, skipped"
            r1 = 0
            defpackage.hm9.p(r8, r0, r1)
            goto L_0x0223
        L_0x011d:
            java.lang.String r1 = r0.Y
            boolean r1 = defpackage.oag.t(r1)
            r2 = r18
            av0 r4 = r2.b
            if (r1 != 0) goto L_0x0158
            java.lang.String r0 = "onNotifAttach: got error, mark message with ERROR status"
            defpackage.hm9.m(r8, r0, new java.lang.Object[0])
            java.util.Iterator r0 = r3.iterator()
        L_0x0132:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0218
            java.lang.Object r1 = r0.next()
            cu8 r1 = (defpackage.cu8) r1
            java.lang.Object r3 = r19.get()
            au8 r3 = (defpackage.au8) r3
            iu8 r5 = defpackage.iu8.ERROR
            r3.x(r1, r5)
            l6f r3 = new l6f
            r11 = 0
            long r7 = r1.t0
            long r9 = r1.b
            r6 = r3
            r6.<init>(r7, r9, r11)
            r4.c(r3)
            goto L_0x0132
        L_0x0158:
            java.lang.String r1 = "onNotifAttach: updateStatusesForMessages"
            defpackage.hm9.m(r8, r1, new java.lang.Object[0])
            java.util.Iterator r1 = r3.iterator()
        L_0x0161:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0218
            java.lang.Object r3 = r1.next()
            cu8 r3 = (defpackage.cu8) r3
            k8g r5 = r3.z0
            java.lang.Object r5 = r5.a
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0177:
            boolean r6 = r5.hasNext()
            long r10 = r3.b
            if (r6 == 0) goto L_0x020a
            java.lang.Object r6 = r5.next()
            l20 r6 = (defpackage.l20) r6
            z10 r7 = r6.x
            z10 r8 = defpackage.z10.c
            if (r7 != r8) goto L_0x018c
            goto L_0x0177
        L_0x018c:
            long r12 = r0.c
            r14 = 0
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x01a6
            boolean r7 = r6.a()
            if (r7 == 0) goto L_0x01a6
            i10 r7 = r6.e
            long r12 = r7.a
            long r14 = r0.c
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x01a6
            r7 = 1
            goto L_0x01a7
        L_0x01a6:
            r7 = 0
        L_0x01a7:
            long r12 = r0.o
            r14 = 0
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x01c1
            boolean r9 = r6.i()
            if (r9 == 0) goto L_0x01c1
            k20 r9 = r6.d
            long r12 = r9.a
            long r14 = r0.o
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 != 0) goto L_0x01c1
            r9 = 1
            goto L_0x01c2
        L_0x01c1:
            r9 = 0
        L_0x01c2:
            long r12 = r0.X
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x01dc
            boolean r12 = r6.c()
            if (r12 == 0) goto L_0x01dc
            s10 r12 = r6.j
            long r12 = r12.a
            long r14 = r0.X
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x01dc
            r12 = 1
            goto L_0x01dd
        L_0x01dc:
            r12 = 0
        L_0x01dd:
            java.lang.String r13 = r6.r
            if (r7 != 0) goto L_0x0205
            if (r9 != 0) goto L_0x0205
            if (r12 == 0) goto L_0x01e6
            goto L_0x0205
        L_0x01e6:
            z10 r7 = defpackage.z10.b
            z10 r8 = r6.x
            if (r8 != r7) goto L_0x0177
            boolean r7 = r6.i()
            if (r7 != 0) goto L_0x01fe
            boolean r7 = r6.c()
            if (r7 != 0) goto L_0x01fe
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x0177
        L_0x01fe:
            z10 r6 = defpackage.z10.a
            r2.d(r10, r13, r6)
            goto L_0x0177
        L_0x0205:
            r2.d(r10, r13, r8)
            goto L_0x0177
        L_0x020a:
            l6f r5 = new l6f
            r12 = 0
            long r8 = r3.t0
            r7 = r5
            r7.<init>(r8, r10, r12)
            r4.c(r5)
            goto L_0x0161
        L_0x0218:
            rm4 r0 = r2.c
            java.lang.Object r0 = r0.get()
            s8g r0 = (defpackage.s8g) r0
            defpackage.r9d.y(r0)
        L_0x0223:
            return
        L_0x0224:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.b
            java.lang.Object r1 = r1.getValue()
            fs9 r1 = (defpackage.fs9) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotifMark, response = "
            r2.<init>(r3)
            java.lang.Object r0 = r0.c
            es9 r0 = (defpackage.es9) r0
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "fs9"
            defpackage.hm9.m(r3, r2, new java.lang.Object[0])
            je7 r2 = r1.e
            java.lang.Object r4 = r2.getValue()
            p82 r4 = (defpackage.p82) r4
            long r5 = r0.c
            e52 r4 = r4.z(r5)
            if (r4 == 0) goto L_0x030c
            java.lang.Object r5 = r2.getValue()
            r6 = r5
            p82 r6 = (defpackage.p82) r6
            long r11 = r0.X
            int r13 = r0.Y
            long r7 = r4.a
            long r9 = r0.o
            r14 = 1
            r6.p0(r7, r9, r11, r13, r14)
            je7 r5 = r1.b
            java.lang.Object r5 = r5.getValue()
            s8g r5 = (defpackage.s8g) r5
            s9d r6 = new s9d
            long r7 = r4.a
            r6.<init>(r7)
            r5.a(r6)
            m7b r5 = r1.c
            p7b r5 = (defpackage.p7b) r5
            t33 r5 = r5.a
            long r5 = r5.t()
            long r9 = r0.o
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            av0 r6 = r1.d
            if (r5 != 0) goto L_0x0303
            java.lang.String r5 = "onNotifMark, already read from another device or WEB"
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]
            defpackage.hm9.H(r3, r5, r10)
            je7 r3 = r1.f
            java.lang.Object r5 = r3.getValue()
            cea r5 = (defpackage.cea) r5
            k92 r9 = r4.b
            long r10 = r9.a
            r5.f(r10)
            boolean r4 = r4.e0()
            if (r4 == 0) goto L_0x02d5
            java.lang.Object r2 = r2.getValue()
            p82 r2 = (defpackage.p82) r2
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            mg4 r5 = defpackage.mg4.REGULAR
            r2.getClass()
            f5 r10 = new f5
            r11 = 15
            r10.<init>((java.lang.Object) r2, (java.lang.Object) r5, (java.lang.Object) r4, (int) r11)
            java.lang.String r4 = "syncMessages"
            r2.f0(r4, r10)
        L_0x02d5:
            je7 r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            pk r1 = (defpackage.pk) r1
            k4a r1 = (defpackage.k4a) r1
            long r4 = r9.a
            r1.j(r4)
            vz2 r1 = new vz2
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r7 = 0
            r1.<init>(r2, r7)
            r6.c(r1)
            int r0 = r0.Y
            if (r0 > 0) goto L_0x0319
            java.lang.Object r0 = r3.getValue()
            cea r0 = (defpackage.cea) r0
            r0.a(r4)
            goto L_0x0319
        L_0x0303:
            p72 r0 = new p72
            r0.<init>(r7)
            r6.c(r0)
            goto L_0x0319
        L_0x030c:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r1 = "onNotifMark chat not found"
            r2 = 0
            defpackage.hm9.k0(r3, r2, r1, r0)
        L_0x0319:
            return
        L_0x031a:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            qr9 r1 = (defpackage.qr9) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotifCallbackAnswer: "
            r2.<init>(r3)
            java.lang.Object r0 = r0.c
            pr9 r0 = (defpackage.pr9) r0
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = defpackage.qr9.d
            defpackage.hm9.m(r3, r2, new java.lang.Object[0])
            bc7[] r2 = defpackage.qr9.c
            r3 = 0
            r2 = r2[r3]
            rm4 r2 = r1.b
            java.lang.Object r2 = r2.get()
            p82 r2 = (defpackage.p82) r2
            long r3 = r0.o
            e52 r2 = r2.z(r3)
            if (r2 == 0) goto L_0x0360
            long r2 = r2.a
            goto L_0x0362
        L_0x0360:
            r2 = -1
        L_0x0362:
            hq1 r4 = new hq1
            java.lang.String r0 = r0.c
            r4.<init>(r2, r0)
            av0 r0 = r1.a
            r0.c(r4)
            return
        L_0x036f:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            java.lang.Object r0 = r0.c
            ys9 r0 = (defpackage.ys9) r0
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            zs9 r1 = (defpackage.zs9) r1
            java.lang.Class<zs9> r2 = defpackage.zs9.class
            java.lang.String r2 = r2.getName()
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x0392
            goto L_0x03b1
        L_0x0392:
            r1.getClass()
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x03b1
            us7 r4 = defpackage.us7.X
            nab r5 = r0.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "onNotifProfile: response = "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = 0
            r3.d(r4, r2, r5, r6)
        L_0x03b1:
            je7 r2 = r1.a
            java.lang.Object r2 = r2.getValue()
            blb r2 = (defpackage.blb) r2
            nab r3 = r0.c
            r2.b(r3)
            nab r0 = r0.c
            wm3 r0 = r0.a
            if (r0 == 0) goto L_0x03d9
            long r2 = r0.a
            je7 r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            r47 r0 = (defpackage.r47) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.a(r1)
        L_0x03d9:
            return
        L_0x03da:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.h
            java.lang.Object r1 = r1.getValue()
            mq3 r1 = (defpackage.mq3) r1
            r1.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onNotifContactSort: "
            r3.<init>(r4)
            java.lang.Object r0 = r0.c
            wr9 r0 = (defpackage.wr9) r0
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "mq3"
            defpackage.hm9.m(r4, r3, new java.lang.Object[0])
            java.util.ArrayList r3 = r0.c
            java.util.ArrayList r5 = r0.X
            if (r5 == 0) goto L_0x040b
            int r5 = r5.size()
            goto L_0x040c
        L_0x040b:
            r5 = 0
        L_0x040c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            if (r3 == 0) goto L_0x0417
            int r6 = r3.size()
            goto L_0x0418
        L_0x0417:
            r6 = 0
        L_0x0418:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            java.lang.String r6 = "onNotifContactSort, ids count = %d, phones count = $d"
            defpackage.hm9.m(r4, r6, r5)
            je7 r5 = r1.b
            je7 r6 = r1.a
            je7 r7 = r1.c
            if (r3 == 0) goto L_0x0481
            eq1 r0 = new eq1
            r0.<init>()
            r1.e = r0
            java.lang.Object r0 = r7.getValue()
            zi5 r0 = (defpackage.zi5) r0
            kk5 r0 = (defpackage.kk5) r0
            r0.getClass()
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r0.b()
            java.lang.String r3 = "phonesSort"
            r2.<init>(r0, r3)
            eq1 r0 = r1.e
            boolean r0 = defpackage.pag.K(r2, r0)
            if (r0 == 0) goto L_0x046a
            java.lang.Object r0 = r6.getValue()
            m7b r0 = (defpackage.m7b) r0
            p7b r0 = (defpackage.p7b) r0
            t33 r0 = r0.a
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "user.phonesSortLastSync"
            r0.l(r2, r1)
            goto L_0x0470
        L_0x046a:
            java.lang.String r0 = "Failed to store phones sort"
            r1 = 0
            defpackage.hm9.p(r4, r0, r1)
        L_0x0470:
            java.lang.Object r0 = r5.getValue()
            av0 r0 = (defpackage.av0) r0
            su r1 = new su
            r2 = 10
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x04dd
        L_0x0481:
            java.util.ArrayList r0 = r0.X
            if (r0 == 0) goto L_0x04d7
            eq1 r0 = new eq1
            r0.<init>()
            r1.d = r0
            java.lang.Object r0 = r7.getValue()
            zi5 r0 = (defpackage.zi5) r0
            kk5 r0 = (defpackage.kk5) r0
            r0.getClass()
            java.io.File r3 = new java.io.File
            java.lang.String r0 = r0.b()
            java.lang.String r7 = "contactSort"
            r3.<init>(r0, r7)
            eq1 r0 = r1.d
            boolean r0 = defpackage.pag.K(r3, r0)
            if (r0 == 0) goto L_0x04c2
            java.lang.Object r0 = r6.getValue()
            m7b r0 = (defpackage.m7b) r0
            p7b r0 = (defpackage.p7b) r0
            t33 r0 = r0.a
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "user.contactSortLastSync"
            r0.l(r3, r1)
            goto L_0x04c8
        L_0x04c2:
            java.lang.String r0 = "Failed to store contact sort"
            r1 = 0
            defpackage.hm9.p(r4, r0, r1)
        L_0x04c8:
            java.lang.Object r0 = r5.getValue()
            av0 r0 = (defpackage.av0) r0
            su r1 = new su
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x04dd
        L_0x04d7:
            java.lang.String r0 = "Wrong notif contact sort data"
            r1 = 0
            defpackage.hm9.p(r4, r0, r1)
        L_0x04dd:
            return
        L_0x04de:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            java.lang.Object r0 = r0.c
            at9 r0 = (defpackage.at9) r0
            je7 r1 = r1.f
            java.lang.Object r1 = r1.getValue()
            mz6 r1 = (defpackage.mz6) r1
            java.lang.String r2 = "onNotif, chat.id = "
            monitor-enter(r1)
            long r3 = r0.o     // Catch:{ all -> 0x0555 }
            rm4 r5 = r1.b     // Catch:{ all -> 0x0555 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0555 }
            m7b r5 = (defpackage.m7b) r5     // Catch:{ all -> 0x0555 }
            p7b r5 = (defpackage.p7b) r5     // Catch:{ all -> 0x0555 }
            t33 r5 = r5.a     // Catch:{ all -> 0x0555 }
            long r5 = r5.t()     // Catch:{ all -> 0x0555 }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x050a
            monitor-exit(r1)
            goto L_0x0588
        L_0x050a:
            rm4 r3 = r1.g     // Catch:{ all -> 0x0555 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0555 }
            xb9 r3 = (defpackage.xb9) r3     // Catch:{ all -> 0x0555 }
            r3.r(r0)     // Catch:{ all -> 0x0555 }
            rm4 r3 = r1.h     // Catch:{ all -> 0x0555 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0555 }
            p82 r3 = (defpackage.p82) r3     // Catch:{ all -> 0x0555 }
            long r4 = r0.c     // Catch:{ all -> 0x0555 }
            e52 r9 = r3.z(r4)     // Catch:{ all -> 0x0555 }
            if (r9 == 0) goto L_0x0587
            java.lang.String r3 = "mz6"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0555 }
            r4.<init>(r2)     // Catch:{ all -> 0x0555 }
            long r5 = r9.a     // Catch:{ all -> 0x0555 }
            r4.append(r5)     // Catch:{ all -> 0x0555 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0555 }
            defpackage.hm9.m(r3, r2, new java.lang.Object[0])     // Catch:{ all -> 0x0555 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0555 }
            long r4 = r9.a     // Catch:{ all -> 0x0555 }
            java.util.Map r4 = r1.a(r4)     // Catch:{ all -> 0x0555 }
            if (r4 != 0) goto L_0x0557
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0555 }
            r4.<init>()     // Catch:{ all -> 0x0555 }
            long r5 = r9.a     // Catch:{ all -> 0x0555 }
            java.util.concurrent.ConcurrentHashMap r7 = r1.k     // Catch:{ all -> 0x0555 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0555 }
            r7.put(r5, r4)     // Catch:{ all -> 0x0555 }
            goto L_0x0557
        L_0x0555:
            r0 = move-exception
            goto L_0x0589
        L_0x0557:
            long r5 = r0.o     // Catch:{ all -> 0x0555 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0555 }
            kr9 r6 = new kr9     // Catch:{ all -> 0x0555 }
            b10 r7 = r0.X     // Catch:{ all -> 0x0555 }
            r6.<init>(r2, r7)     // Catch:{ all -> 0x0555 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0555 }
            long r4 = r9.a     // Catch:{ all -> 0x0555 }
            long r6 = r0.o     // Catch:{ all -> 0x0555 }
            rm4 r0 = r1.f     // Catch:{ all -> 0x0555 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0555 }
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0     // Catch:{ all -> 0x0555 }
            u05 r10 = new u05     // Catch:{ all -> 0x0555 }
            r3 = 1
            r2 = r10
            r8 = r1
            r2.<init>(r3, r4, r6, r8)     // Catch:{ all -> 0x0555 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0555 }
            r3 = 6000(0x1770, double:2.9644E-320)
            r0.schedule(r10, r3, r2)     // Catch:{ all -> 0x0555 }
            long r2 = r9.a     // Catch:{ all -> 0x0555 }
            r1.b(r2)     // Catch:{ all -> 0x0555 }
        L_0x0587:
            monitor-exit(r1)
        L_0x0588:
            return
        L_0x0589:
            monitor-exit(r1)     // Catch:{ all -> 0x0555 }
            throw r0
        L_0x058b:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.e
            java.lang.Object r1 = r1.getValue()
            sr9 r1 = (defpackage.sr9) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            rr9 r0 = (defpackage.rr9) r0
            f52 r2 = r0.c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onNotifChat, chat = "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = " created  = "
            r3.append(r4)
            long r4 = r2.X
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = defpackage.nu0.G(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "sr9"
            defpackage.hm9.m(r4, r3, new java.lang.Object[0])
            rm4 r3 = r1.e     // Catch:{ TamErrorException -> 0x05d8 }
            java.lang.Object r3 = r3.get()     // Catch:{ TamErrorException -> 0x05d8 }
            xb9 r3 = (defpackage.xb9) r3     // Catch:{ TamErrorException -> 0x05d8 }
            r3.k(r2)     // Catch:{ TamErrorException -> 0x05d8 }
        L_0x05d8:
            rm4 r3 = r1.a
            java.lang.Object r5 = r3.get()
            p82 r5 = (defpackage.p82) r5
            long r6 = r2.a
            e52 r5 = r5.z(r6)
            long r6 = r2.X
            if (r5 == 0) goto L_0x060e
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x060e
            k92 r8 = r5.b
            long r9 = r8.f
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x060e
            java.lang.String r0 = "New chat created "
            java.lang.String r1 = " < old chat created "
            java.lang.StringBuilder r0 = defpackage.au1.k(r6, r0, r1)
            long r1 = r8.f
            java.lang.String r3 = ". Ignore this notif chat"
            java.lang.String r0 = defpackage.zr6.k(r0, r1, r3)
            r1 = 0
            defpackage.hm9.p(r4, r0, r1)
            goto L_0x06f0
        L_0x060e:
            java.lang.String r4 = "REMOVED"
            if (r5 == 0) goto L_0x0629
            f52 r8 = r0.c
            java.lang.String r8 = r8.b
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0629
            java.lang.Object r8 = r3.get()
            p82 r8 = (defpackage.p82) r8
            java.util.List r9 = java.util.Collections.singletonList(r2)
            r8.c0(r9)
        L_0x0629:
            int r8 = r2.w0
            if (r5 == 0) goto L_0x0659
            k92 r9 = r5.b
            long r9 = r9.f
            r11 = 1
            long r9 = r9 + r11
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x0659
            fs8 r9 = r2.t0
            if (r9 != 0) goto L_0x0659
            if (r8 != 0) goto L_0x0659
            f52 r9 = r0.c
            java.lang.String r9 = r9.b
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L_0x0659
            java.lang.Object r1 = r3.get()
            p82 r1 = (defpackage.p82) r1
            f52 r0 = r0.c
            long r2 = r0.v0
            long r4 = r5.a
            r1.o(r4, r2)
            goto L_0x06f0
        L_0x0659:
            if (r5 == 0) goto L_0x0666
            k92 r9 = r5.b
            long r9 = r9.f
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0666
            r16 = 1
            goto L_0x0668
        L_0x0666:
            r16 = 0
        L_0x0668:
            java.lang.Object r3 = r3.get()
            p82 r3 = (defpackage.p82) r3
            java.util.List r2 = java.util.Collections.singletonList(r2)
            gi9 r2 = r3.c0(r2)
            boolean r3 = r2.i()
            if (r3 != 0) goto L_0x0693
            if (r16 == 0) goto L_0x0693
            r9 = 0
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0693
            rm4 r3 = r1.d
            java.lang.Object r3 = r3.get()
            u23 r3 = (defpackage.u23) r3
            long r9 = r2.g()
            r3.a(r9, r6)
        L_0x0693:
            if (r8 <= 0) goto L_0x06aa
            boolean r3 = r2.i()
            if (r3 != 0) goto L_0x06aa
            rm4 r3 = r1.b
            java.lang.Object r3 = r3.get()
            cea r3 = (defpackage.cea) r3
            long r6 = r2.g()
            r3.d(r6)
        L_0x06aa:
            rm4 r3 = r1.f
            java.lang.Object r3 = r3.get()
            ta2 r3 = (defpackage.ta2) r3
            f52 r6 = r0.c
            long r6 = r6.a
            zb2 r3 = (defpackage.zb2) r3
            vxd r6 = r3.H0
            r7 = 0
            if (r6 == 0) goto L_0x06c0
            r6.cancel((java.util.concurrent.CancellationException) r7)
        L_0x06c0:
            yb2 r6 = new yb2
            r6.<init>(r3, r7)
            lx3 r8 = r3.Y
            r9 = 2
            kotlinx.coroutines.internal.ContextScope r10 = r3.Z
            vxd r6 = defpackage.j47.T(r10, r8, r7, r6, r9)
            r3.H0 = r6
            vz2 r3 = new vz2
            r3.<init>(r2)
            av0 r1 = r1.c
            r1.c(r3)
            if (r5 == 0) goto L_0x06f0
            f52 r0 = r0.c
            java.lang.String r0 = r0.b
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x06f0
            xfc r0 = new xfc
            long r2 = r5.a
            r0.<init>(r2)
            r1.c(r0)
        L_0x06f0:
            return
        L_0x06f1:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.l
            java.lang.Object r1 = r1.getValue()
            as9 r1 = (defpackage.as9) r1
            m7b r2 = r1.a()
            p7b r2 = (defpackage.p7b) r2
            t33 r2 = r2.a
            java.lang.Object r0 = r0.c
            zr9 r0 = (defpackage.zr9) r0
            long r3 = r0.X
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "user.draftsLastSync"
            r2.l(r4, r3)
            m7b r2 = r1.a()
            p7b r2 = (defpackage.p7b) r2
            z7d r2 = r2.b
            boolean r2 = r2.u()
            if (r2 != 0) goto L_0x0732
            java.lang.String r0 = defpackage.as9.e
            java.lang.String r1 = "onDraftDiscard: Drafts sync disabled"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            goto L_0x0750
        L_0x0732:
            bc7[] r2 = defpackage.as9.d
            r3 = 1
            r2 = r2[r3]
            rm4 r1 = r1.b
            java.lang.Object r1 = r1.get()
            rk4 r1 = (defpackage.rk4) r1
            long r2 = r0.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r0.o
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r0.X
            r1.a(r4, r2, r3)
        L_0x0750:
            return
        L_0x0751:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.h
            java.lang.Object r1 = r1.getValue()
            rs9 r1 = (defpackage.rs9) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotifMsgDelete: "
            r2.<init>(r3)
            java.lang.Object r0 = r0.c
            qs9 r0 = (defpackage.qs9) r0
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "rs9"
            defpackage.hm9.k(r3, r2)
            f52 r2 = r0.c
            if (r2 != 0) goto L_0x0784
            goto L_0x07a6
        L_0x0784:
            rm4 r3 = r1.b
            java.lang.Object r4 = r3.get()
            p82 r4 = (defpackage.p82) r4
            java.util.List r5 = java.util.Collections.singletonList(r2)
            r4.c0(r5)
            java.lang.Object r3 = r3.get()
            p82 r3 = (defpackage.p82) r3
            long r4 = r2.a
            e52 r2 = r3.z(r4)
            mg4 r3 = defpackage.mg4.REGULAR
            java.util.Set r0 = r0.o
            r1.b(r2, r0, r3)
        L_0x07a6:
            return
        L_0x07a7:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            java.lang.Object r0 = r0.c
            tr9 r0 = (defpackage.tr9) r0
            le3 r0 = r0.c
            je7 r1 = r1.d
            java.lang.Object r1 = r1.getValue()
            ur9 r1 = (defpackage.ur9) r1
            r2 = 0
            r1.b(r0, r2)
            return
        L_0x07c6:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            java.lang.Object r0 = r0.c
            vr9 r0 = (defpackage.vr9) r0
            r1.getClass()
            wm3 r2 = r0.c
            if (r2 == 0) goto L_0x083b
            je7 r2 = r1.e
            java.lang.Object r2 = r2.getValue()
            el3 r2 = (defpackage.el3) r2
            r2.getClass()
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x07e5
            goto L_0x0804
        L_0x07e5:
            boolean r4 = r3.c()
            if (r4 != 0) goto L_0x07ec
            goto L_0x0804
        L_0x07ec:
            us7 r4 = defpackage.us7.X
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onNotifContact, response = "
            r5.<init>(r6)
            wm3 r6 = r0.c
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ContactController"
            r7 = 0
            r3.d(r4, r6, r5, r7)
        L_0x0804:
            wm3 r3 = r0.c
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r2.u(r3)
            rm4 r2 = r2.l
            java.lang.Object r2 = r2.get()
            ike r2 = (defpackage.ike) r2
            wm3 r3 = r0.c
            long r3 = r3.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r2.f(r3)
            je7 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            r47 r1 = (defpackage.r47) r1
            wm3 r0 = r0.c
            long r2 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.a(r0)
        L_0x083b:
            return
        L_0x083c:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.j
            java.lang.Object r1 = r1.getValue()
            ds9 r1 = (defpackage.ds9) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            cs9 r0 = (defpackage.cs9) r0
            fr7 r2 = r0.X
            er7 r3 = r2.a
            int r4 = defpackage.ep3.e
            qy r4 = new qy
            r4.<init>((defpackage.er7) r3)
            long r5 = r0.c
            r4.b = r5
            long r2 = r2.b
            r4.c = r2
            java.lang.String r0 = r0.o
            r4.o = r0
            java.lang.Object r0 = r4.X
            er7 r0 = (defpackage.er7) r0
            if (r0 != 0) goto L_0x0878
            er7 r0 = defpackage.er7.Z
            r4.X = r0
        L_0x0878:
            ep3 r0 = new ep3
            r0.<init>(r4)
            bc7[] r0 = defpackage.ds9.b
            r2 = 0
            r0 = r0[r2]
            rm4 r0 = r1.a
            java.lang.Object r0 = r0.get()
            cn7 r0 = (defpackage.cn7) r0
            r0.getClass()
            return
        L_0x088e:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.n
            java.lang.Object r1 = r1.getValue()
            ps9 r1 = (defpackage.ps9) r1
            r1.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "got "
            r3.<init>(r6)
            java.lang.Object r0 = r0.c
            r6 = r0
            ks9 r6 = (defpackage.ks9) r6
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "ps9"
            defpackage.hm9.m(r3, r0, new java.lang.Object[0])
            ns9 r0 = new ns9
            r8 = 0
            r3 = r0
            r7 = r1
            r3.<init>(r4, r6, r7, r8)
            kotlinx.coroutines.internal.ContextScope r1 = r1.g
            r3 = 0
            defpackage.j47.T(r1, r3, r3, r0, r2)
            return
        L_0x08d0:
            java.lang.Object r1 = r0.b
            wle r1 = (defpackage.wle) r1
            je7 r1 = r1.i
            java.lang.Object r1 = r1.getValue()
            s7d r1 = (defpackage.s7d) r1
            je7 r1 = r1.m
            java.lang.Object r1 = r1.getValue()
            vs9 r1 = (defpackage.vs9) r1
            je7 r2 = r1.b
            java.lang.Object r2 = r2.getValue()
            y7d r2 = (defpackage.y7d) r2
            r2.getClass()
            java.lang.Object r0 = r0.c
            ws9 r0 = (defpackage.ws9) r0
            fx8 r2 = r0.X
            if (r2 == 0) goto L_0x0904
            java.util.List r2 = r2.a
            if (r2 == 0) goto L_0x0904
            int r2 = r2.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            goto L_0x0905
        L_0x0904:
            r7 = 0
        L_0x0905:
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r3 = "reactions, onNotifYouReacted, counters Count = %s"
            java.lang.String r4 = "vs9"
            defpackage.hm9.m(r4, r3, r2)
            je7 r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            lx8 r1 = (defpackage.lx8) r1
            long r2 = r0.c
            long r4 = r0.o
            fx8 r0 = r0.X
            je7 r6 = r1.d
            java.lang.Object r6 = r6.getValue()
            jx8 r6 = (defpackage.jx8) r6
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            java.util.Map r0 = java.util.Collections.singletonMap(r7, r0)
            java.util.LinkedHashMap r0 = r6.c(r0)
            je7 r6 = r1.b
            java.lang.Object r6 = r6.getValue()
            iy2 r6 = (defpackage.iy2) r6
            jz2 r6 = (defpackage.jz2) r6
            w7c r2 = r6.n(r2)
            j0e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            e52 r2 = (defpackage.e52) r2
            if (r2 != 0) goto L_0x094b
            goto L_0x0998
        L_0x094b:
            au8 r3 = r1.b()
            long r6 = r2.a
            cu8 r2 = r3.j(r6, r4)
            if (r2 != 0) goto L_0x0958
            goto L_0x0998
        L_0x0958:
            vx8 r3 = defpackage.vx8.DELETED
            vx8 r8 = r2.v0
            if (r8 != r3) goto L_0x095f
            goto L_0x0998
        L_0x095f:
            au8 r3 = r1.b()
            r3.h(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r0.get(r3)
            ix8 r3 = (defpackage.ix8) r3
            ix8 r8 = r2.S0
            java.util.Set r3 = defpackage.lx8.a(r8, r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r0 = r0.get(r4)
            ix8 r0 = (defpackage.ix8) r0
            boolean r0 = defpackage.tpa.f(r0, r8)
            r4 = 1
            r0 = r0 ^ r4
            java.lang.Object[] r4 = new java.lang.Object[]{r3}
            java.lang.String r5 = "lx8"
            java.lang.String r8 = "reactions, NOTIF_YOU_REACTED, reactionsDiff = %s"
            defpackage.hm9.m(r5, r8, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r1.d(r4, r2, r3, r0)
        L_0x0998:
            return
        L_0x0999:
            java.lang.Object r1 = r0.b
            o2e r1 = (defpackage.o2e) r1
            rm4 r1 = r1.c
            java.lang.Object r1 = r1.get()
            c34 r1 = (defpackage.c34) r1
            k24 r1 = (defpackage.k24) r1
            imc r1 = r1.h
            java.lang.Object r0 = r0.c
            java.util.List r0 = (java.util.List) r0
            r1.T(r0)
            return
        L_0x09b1:
            java.lang.Object r1 = r0.b
            o2e r1 = (defpackage.o2e) r1
            rm4 r2 = r1.c
            java.lang.Object r2 = r2.get()
            c34 r2 = (defpackage.c34) r2
            k24 r2 = (defpackage.k24) r2
            imc r2 = r2.h
            java.lang.Object r0 = r0.c
            d2e r0 = (defpackage.d2e) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2.T(r0)
            r1.f()
            return
        L_0x09d0:
            java.lang.Object r1 = r0.b
            s8d r1 = (defpackage.s8d) r1
            eoe r2 = r1.r()
            long r3 = r1.b
            r2.d(r3)
            au8 r2 = r1.n()
            long r3 = r1.c
            cu8 r2 = r2.q(r3)
            if (r2 == 0) goto L_0x0a58
            vx8 r5 = defpackage.vx8.DELETED
            vx8 r6 = r2.v0
            if (r6 != r5) goto L_0x09f0
            goto L_0x0a58
        L_0x09f0:
            g20 r5 = defpackage.g20.x0
            l20 r5 = r2.a(r5)
            if (r5 == 0) goto L_0x0a27
            au8 r3 = r1.n()
            bqc r4 = new bqc
            java.lang.Object r0 = r0.c
            er7 r0 = (defpackage.er7) r0
            r6 = 7
            r4.<init>(r6, r0)
            long r6 = r2.b
            java.lang.String r0 = r5.r
            r3.v(r6, r0, r4)
            s8g r0 = r1.u()
            defpackage.r9d.y(r0)
            av0 r0 = r1.t()
            l6f r9 = new l6f
            long r6 = r1.c
            r8 = 0
            long r4 = r2.t0
            r3 = r9
            r3.<init>(r4, r6, r8)
            r0.c(r9)
            goto L_0x0a58
        L_0x0a27:
            java.lang.String r0 = r1.X
            java.lang.String r5 = "onSuccess: WTF, no location attach in message"
            r6 = 0
            defpackage.hm9.p(r0, r5, r6)
            au8 r0 = r1.n()
            r0.getClass()
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.util.List r5 = java.util.Collections.singletonList(r5)
            long r6 = r2.t0
            r0.c(r6, r5)
            av0 r0 = r1.t()
            re9 r1 = new re9
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r3 = 0
            r1.<init>(r6, r2, r3)
            r0.c(r1)
        L_0x0a58:
            return
        L_0x0a59:
            java.lang.Object r1 = r0.b
            ilc r1 = (defpackage.ilc) r1
            v47 r1 = r1.e
            java.lang.Object r0 = r0.c
            s47 r0 = (defpackage.s47) r0
            r1.c(r0)
            return
        L_0x0a67:
            java.lang.Object r1 = r0.b
            k9c r1 = (defpackage.k9c) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            e52 r0 = (defpackage.e52) r0
            long r2 = r0.a
            p82 r0 = r1.a
            r4 = 0
            r0.i0(r2, r4)
            return
        L_0x0a7c:
            java.lang.Object r1 = r0.b
            k9c r1 = (defpackage.k9c) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            uj3 r0 = (defpackage.uj3) r0
            long r2 = r0.n()
            el3 r0 = r1.b
            r0.getClass()
            c10 r1 = new c10
            r4 = 11
            r5 = 0
            r1.<init>(r5, r4)
            r0.c(r2, r1)
            return
        L_0x0a9d:
            java.lang.Object r1 = r0.b
            k29 r1 = (defpackage.k29) r1
            java.util.concurrent.ConcurrentHashMap r1 = r1.g
            java.lang.Object r0 = r0.c
            e29 r0 = (defpackage.e29) r0
            r1.remove(r0)
            return
        L_0x0aab:
            java.lang.Object r1 = r0.b
            rs8 r1 = (defpackage.rs8) r1
            ts8 r2 = r1.e
            qqd r2 = r2.O0
            l20 r1 = r1.c
            x10 r1 = r1.b
            long r3 = r1.s0
            java.lang.Object r0 = r0.c
            ru6 r0 = (defpackage.ru6) r0
            r2.u(r0, r3)
            return
        L_0x0ac1:
            java.lang.Object r2 = r0.b
            md5 r2 = (defpackage.md5) r2
            r2.getClass()
            java.lang.Object r0 = r0.c
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            rm4 r0 = r2.f
            java.lang.Object r0 = r0.get()
            y7d r0 = (defpackage.y7d) r0
            qyc r0 = (defpackage.qyc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f70maxfavoritestickers
            long r5 = (long) r1
            long r0 = r0.q(r2, r5)
            int r0 = (int) r0
            long r0 = (long) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0aeb
            return
        L_0x0aeb:
            ru.ok.tamtam.stickers.favorite.FavoriteStickersController$MaxFavoriteStickersException r0 = new ru.ok.tamtam.stickers.favorite.FavoriteStickersController$MaxFavoriteStickersException
            r0.<init>()
            throw r0
        L_0x0af1:
            java.lang.Object r2 = r0.b
            sc5 r2 = (defpackage.sc5) r2
            r2.getClass()
            java.lang.Object r0 = r0.c
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            je7 r0 = r2.X
            java.lang.Object r0 = r0.getValue()
            zle r0 = (defpackage.zle) r0
            y7d r0 = r0.b
            qyc r0 = (defpackage.qyc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f69maxfavoritestickersets
            long r5 = (long) r1
            long r0 = r0.q(r2, r5)
            int r0 = (int) r0
            long r0 = (long) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0b1d
            return
        L_0x0b1d:
            ru.ok.tamtam.stickersets.favorite.FavoriteStickerSetController$MaxFavoriteStickerSetsException r0 = new ru.ok.tamtam.stickersets.favorite.FavoriteStickerSetController$MaxFavoriteStickerSetsException
            r0.<init>()
            throw r0
        L_0x0b23:
            java.lang.Object r1 = r0.b
            ru.ok.android.externcalls.sdk.id.ExternalIdsResolver r1 = (ru.ok.android.externcalls.sdk.id.ExternalIdsResolver) r1
            java.lang.Object r0 = r0.c
            java.util.List r0 = (java.util.List) r0
            r1.lambda$resolveIds$0(r0)
            return
        L_0x0b2f:
            java.lang.Object r1 = r0.b
            bd4 r1 = (defpackage.bd4) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            mpb r0 = (defpackage.mpb) r0
            eh3 r1 = r0.f
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "bd4"
            java.lang.String r3 = "close socket for host: %s"
            defpackage.hm9.m(r2, r3, r1)
            java.net.Socket r0 = r0.d
            if (r0 == 0) goto L_0x0b52
            r0.close()     // Catch:{ Exception -> 0x0b52 }
        L_0x0b52:
            return
        L_0x0b53:
            java.lang.Object r1 = r0.b
            ru.ok.messages.media.attaches.AttachPhotoView r1 = (ru.ok.messages.media.attaches.AttachPhotoView) r1
            qqd r2 = r1.T0
            l20 r1 = r1.L0
            x10 r1 = r1.b
            long r3 = r1.s0
            java.lang.Object r0 = r0.c
            ru6 r0 = (defpackage.ru6) r0
            r2.u(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p00.run():void");
    }
}
