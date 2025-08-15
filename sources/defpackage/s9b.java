package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: s9b  reason: default package */
public final class s9b {
    public final Context a;
    public final je7 b;
    public final av0 c;
    public final je7 d;

    public s9b(Context context, je7 je7, av0 av0, je7 je72) {
        this.a = context;
        this.b = je7;
        this.c = av0;
        this.d = je72;
    }

    public final boolean a(it3 it3) {
        qyc qyc = (qyc) ((y7d) this.d.getValue());
        qyc.getClass();
        return it3.b <= ((long) ((int) qyc.q(PmsKey.f48imagesize, (long) 40000000)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: lpa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: j50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: vgf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: aqd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: it3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: it3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: lpa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: it3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: lpa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: lpa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: fif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: fif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: fif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: fif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: lpa} */
    /* JADX WARNING: type inference failed for: r2v2, types: [w10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v6, types: [w10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v11, types: [h10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v8, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v14, types: [r10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v15, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v19, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.lpa b(defpackage.o2 r27, boolean r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = 1
            boolean r4 = r1 instanceof defpackage.k00
            if (r4 == 0) goto L_0x0014
            r0 = r1
            k00 r0 = (defpackage.k00) r0
            l20 r0 = r0.c
            lpa r2 = new lpa
            r2.<init>(r1, r0)
            return r2
        L_0x0014:
            boolean r4 = r1 instanceof defpackage.y95
            r4 = r4 ^ r3
            r6 = 0
            java.lang.String r7 = "s9b"
            r8 = 7
            r9 = 11
            r10 = 3
            je7 r11 = r0.b
            if (r4 == 0) goto L_0x02a6
            java.lang.String r4 = r27.a()
            boolean r12 = defpackage.oag.t(r4)
            if (r12 == 0) goto L_0x0033
            java.lang.String r12 = "uri string is empty or null"
            defpackage.hm9.p(r7, r12, r6)
            r12 = r6
            goto L_0x003f
        L_0x0033:
            java.lang.Object r12 = r11.getValue()
            af8 r12 = (defpackage.af8) r12
            cj0 r12 = (defpackage.cj0) r12
            it3 r12 = r12.c(r4)
        L_0x003f:
            av0 r13 = r0.c
            int r14 = r1.a
            if (r12 != 0) goto L_0x0055
            n5d r0 = new n5d
            java.lang.String r4 = "file.local.get.content.uri"
            r0.<init>(r4)
            r13.c(r0)
            r2 = r6
            r12 = r2
            r17 = r11
            goto L_0x018f
        L_0x0055:
            r15 = 0
            long r5 = r12.b
            int r15 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x0170
            je7 r15 = r0.d
            if (r14 != r3) goto L_0x0068
            boolean r5 = r0.a(r12)
        L_0x0065:
            r17 = r11
            goto L_0x00b0
        L_0x0068:
            if (r14 == r10) goto L_0x006c
            if (r14 != r9) goto L_0x006f
        L_0x006c:
            r17 = r11
            goto L_0x00af
        L_0x006f:
            if (r28 == 0) goto L_0x008e
            boolean r16 = r12.a()
            if (r16 != 0) goto L_0x007d
            boolean r16 = r12.b()
            if (r16 == 0) goto L_0x008e
        L_0x007d:
            boolean r5 = r12.a()
            if (r5 == 0) goto L_0x008c
            boolean r5 = r0.a(r12)
            if (r5 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r5 = 0
            goto L_0x0065
        L_0x008c:
            r5 = r3
            goto L_0x0065
        L_0x008e:
            java.lang.Object r16 = r15.getValue()
            y7d r16 = (defpackage.y7d) r16
            r2 = r16
            qyc r2 = (defpackage.qyc) r2
            r2.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f43fileuploadmaxsize
            r17 = r11
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r9 = r2.q(r9, r10)
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r5 = 0
            goto L_0x00b0
        L_0x00af:
            r5 = r3
        L_0x00b0:
            if (r5 != 0) goto L_0x00d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentUriParams not valid, file is bigger than max upload size: "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r2 = 0
            defpackage.hm9.p(r7, r0, r2)
            n5d r0 = new n5d
            java.lang.String r2 = "file.local.max.size.reached"
            r0.<init>(r2)
            r13.c(r0)
        L_0x00ce:
            r2 = 0
            r12 = 0
            goto L_0x018f
        L_0x00d2:
            java.lang.String r2 = r12.c
            boolean r5 = defpackage.oag.t(r2)
            if (r5 == 0) goto L_0x00dd
            if (r14 == r8) goto L_0x0120
            goto L_0x0122
        L_0x00dd:
            java.lang.Object r5 = r15.getValue()
            y7d r5 = (defpackage.y7d) r5
            qyc r5 = (defpackage.qyc) r5
            r5.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f44fileuploadunsupportedtypes
            java.lang.String r9 = "exe"
            java.util.List r9 = java.util.Collections.singletonList(r9)
            java.util.List r5 = r5.t(r6, r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x00f8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0122
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r9 = r2.toLowerCase()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "."
            r10.<init>(r11)
            java.lang.String r6 = r6.toLowerCase()
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            boolean r6 = r9.endsWith(r6)
            if (r6 == 0) goto L_0x00f8
        L_0x0120:
            r2 = 0
            goto L_0x0123
        L_0x0122:
            r2 = r3
        L_0x0123:
            if (r2 != 0) goto L_0x0143
            n5d r0 = new n5d
            java.lang.String r2 = "file.local.unsupported.media.type"
            r0.<init>(r2)
            r13.c(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentUriParams not valid, unsupported media type: "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r2 = 0
            defpackage.hm9.p(r7, r0, r2)
        L_0x0141:
            r12 = r2
            goto L_0x018f
        L_0x0143:
            r2 = 0
            android.net.Uri r5 = android.net.Uri.parse(r4)
            android.content.Context r0 = r0.a
            boolean r0 = defpackage.tfg.x(r5, r0, r2)
            if (r0 == 0) goto L_0x016e
            java.lang.String[] r0 = defpackage.zi5.a
            r2 = 0
        L_0x0153:
            r5 = 9
            if (r2 >= r5) goto L_0x0163
            r5 = r0[r2]
            boolean r5 = r4.contains(r5)
            if (r5 == 0) goto L_0x0161
            r0 = r3
            goto L_0x0164
        L_0x0161:
            int r2 = r2 + r3
            goto L_0x0153
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = "try to share private file"
            r2 = 0
            defpackage.hm9.p(r7, r0, r2)
            goto L_0x00ce
        L_0x016e:
            r2 = 0
            goto L_0x018f
        L_0x0170:
            r17 = r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentUriParams not valid, file is empty: "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r2 = 0
            defpackage.hm9.p(r7, r0, r2)
            n5d r0 = new n5d
            java.lang.String r4 = "file.local.max.zero.size"
            r0.<init>(r4)
            r13.c(r0)
            goto L_0x0141
        L_0x018f:
            if (r12 != 0) goto L_0x0192
            return r2
        L_0x0192:
            java.lang.String r0 = r12.e
            boolean r2 = defpackage.oag.t(r0)
            if (r2 != 0) goto L_0x019b
            goto L_0x019f
        L_0x019b:
            java.lang.String r0 = r27.a()
        L_0x019f:
            java.lang.String r2 = r12.c
            if (r14 == r3) goto L_0x01bd
            r4 = 3
            if (r14 == r4) goto L_0x01bd
            r4 = 11
            if (r14 == r4) goto L_0x01bd
            if (r14 != r8) goto L_0x01bb
            if (r28 == 0) goto L_0x01bb
            boolean r4 = r12.a()
            if (r4 != 0) goto L_0x01bd
            boolean r4 = r12.b()
            if (r4 == 0) goto L_0x01bb
            goto L_0x01bd
        L_0x01bb:
            r9 = 0
            goto L_0x020d
        L_0x01bd:
            java.lang.Object r4 = r17.getValue()
            af8 r4 = (defpackage.af8) r4
            cj0 r4 = (defpackage.cj0) r4
            r4.getClass()
            android.net.Uri r5 = android.net.Uri.parse(r0)
            yx4 r6 = r4.d
            android.content.Context r9 = r4.a
            java.lang.String r5 = defpackage.tfg.r(r9, r5, r6)
            boolean r6 = defpackage.pag.l(r5)
            if (r6 == 0) goto L_0x01dd
            r0 = r5
            r9 = 0
            goto L_0x0201
        L_0x01dd:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "process: failed to get path from uri: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "cj0"
            r9 = 0
            defpackage.hm9.p(r6, r5, r9)
            java.lang.String r0 = r4.a(r0, r2)
            boolean r4 = defpackage.pag.l(r0)
            if (r4 != 0) goto L_0x0201
            java.lang.String r0 = "process: failed to get path with copy"
            defpackage.hm9.p(r6, r0, r9)
            r0 = r9
        L_0x0201:
            if (r0 != 0) goto L_0x020d
            n5d r4 = new n5d
            java.lang.String r5 = "file.local.create.uri.copy"
            r4.<init>(r5)
            r13.c(r4)
        L_0x020d:
            if (r14 != r8) goto L_0x0233
            boolean r1 = r12.a()
            boolean r4 = r12.b()
            if (r28 == 0) goto L_0x022a
            if (r1 != 0) goto L_0x021d
            if (r4 == 0) goto L_0x022a
        L_0x021d:
            if (r1 == 0) goto L_0x0221
            r1 = r3
            goto L_0x0222
        L_0x0221:
            r1 = 3
        L_0x0222:
            aqd r2 = new aqd
            r2.<init>(r1, r0)
        L_0x0227:
            r1 = r2
            goto L_0x02a4
        L_0x022a:
            ci5 r1 = new ci5
            long r4 = r12.b
            r1.<init>(r4, r0, r2)
            goto L_0x02a4
        L_0x0233:
            java.lang.String r2 = r27.a()
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x02a4
            if (r14 == r3) goto L_0x029f
            r2 = 2
            if (r14 == r2) goto L_0x0293
            r2 = 3
            if (r14 == r2) goto L_0x027b
            r2 = 11
            if (r14 == r2) goto L_0x024a
            goto L_0x02a4
        L_0x024a:
            boolean r4 = r1 instanceof defpackage.vgf
            if (r4 == 0) goto L_0x025b
            vgf r1 = (defpackage.vgf) r1
            vgf r4 = new vgf
            ref r5 = r1.c
            java.lang.String r1 = r1.o
            r4.<init>(r2, r0, r5, r1)
            r1 = r4
            goto L_0x02a4
        L_0x025b:
            fif r1 = (defpackage.fif) r1
            fif r2 = new fif
            int r4 = r1.o
            long r5 = r1.X
            int r10 = r1.c
            java.lang.String r11 = r1.Y
            h7b r1 = r1.Z
            r18 = r2
            r19 = r0
            r20 = r10
            r21 = r4
            r22 = r5
            r24 = r11
            r25 = r1
            r18.<init>(r19, r20, r21, r22, r24, r25)
            goto L_0x0227
        L_0x027b:
            boolean r2 = r1 instanceof defpackage.vgf
            if (r2 == 0) goto L_0x028c
            vgf r1 = (defpackage.vgf) r1
            vgf r2 = new vgf
            ref r4 = r1.c
            java.lang.String r1 = r1.o
            r5 = 3
            r2.<init>(r5, r0, r4, r1)
            goto L_0x0227
        L_0x028c:
            r5 = 3
            aqd r1 = new aqd
            r1.<init>(r5, r0)
            goto L_0x02a4
        L_0x0293:
            j50 r1 = (defpackage.j50) r1
            j50 r2 = new j50
            long r4 = r1.c
            byte[] r1 = r1.o
            r2.<init>(r0, r4, r1)
            goto L_0x0227
        L_0x029f:
            aqd r1 = new aqd
            r1.<init>(r3, r0)
        L_0x02a4:
            r2 = r12
            goto L_0x02aa
        L_0x02a6:
            r9 = r6
            r17 = r11
            r2 = r9
        L_0x02aa:
            int r0 = r1.a
            d20 r4 = defpackage.d20.X
            if (r0 == r3) goto L_0x03fe
            r5 = 2
            if (r0 == r5) goto L_0x03d2
            g20 r2 = defpackage.g20.o
            r5 = 3
            if (r0 == r5) goto L_0x033b
            if (r0 == r8) goto L_0x030f
            r3 = 10
            if (r0 == r3) goto L_0x0309
            r3 = 11
            if (r0 != r3) goto L_0x02f7
            r0 = r1
            fif r0 = (defpackage.fif) r0
            h20 r3 = new h20
            r3.<init>()
            long r5 = r0.X
            r3.b = r5
            int r5 = r0.c
            r3.d = r5
            int r5 = r0.o
            r3.e = r5
            r5 = 2
            r3.q = r5
            java.lang.String r5 = r0.Y
            r3.c = r5
            k20 r5 = new k20
            r5.<init>(r3)
            j10 r3 = new j10
            r3.<init>()
            r3.d = r5
            r3.a = r2
            r3.i = r4
            java.lang.String r0 = r0.b
            r3.m = r0
            l20 r0 = r3.a()
            goto L_0x04cf
        L_0x02f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r3 = "Unknown media type %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = java.lang.String.format(r2, r3, r1)
            r0.<init>(r1)
            throw r0
        L_0x0309:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L_0x030f:
            r0 = r1
            ci5 r0 = (defpackage.ci5) r0
            r10 r2 = new r10
            r2.<init>()
            long r5 = r0.c
            r2.b = r5
            java.lang.String r3 = r0.o
            r2.c = r3
            s10 r3 = new s10
            r3.<init>(r2)
            j10 r2 = new j10
            r2.<init>()
            java.lang.String r0 = r0.b
            r2.m = r0
            r2.r = r3
            g20 r0 = defpackage.g20.u0
            r2.a = r0
            r2.i = r4
            l20 r0 = r2.a()
            goto L_0x04cf
        L_0x033b:
            java.lang.String r0 = r1.a()
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = "getVideoAttach: retrieve params started"
            defpackage.hm9.m(r7, r8, new java.lang.Object[0])
            java.lang.Object r8 = r17.getValue()
            af8 r8 = (defpackage.af8) r8
            cj0 r8 = (defpackage.cj0) r8
            xjf r8 = r8.d(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "getVideoAttach: retrieve params finished "
            r10.<init>(r11)
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r5
            r10.append(r11)
            java.lang.String r5 = r10.toString()
            defpackage.hm9.m(r7, r5, new java.lang.Object[0])
            boolean r5 = r1 instanceof defpackage.vgf
            long r6 = r8.d
            java.lang.String r10 = r8.a
            if (r5 == 0) goto L_0x03a4
            r5 = r1
            vgf r5 = (defpackage.vgf) r5
            ref r11 = r5.c
            if (r11 == 0) goto L_0x03a4
            int r9 = defpackage.j20.e
            i20 r9 = new i20
            r12 = 0
            r9.<init>(r12)
            float r12 = r11.b
            r9.b = r12
            float r12 = r11.c
            r9.c = r12
            mqb r12 = r11.a
            r9.a = r12
            boolean r11 = r11.d
            r9.d = r11
            j20 r11 = new j20
            r11.<init>(r9)
            float r6 = (float) r6
            float r7 = r11.b
            float r9 = r11.a
            float r7 = r7 - r9
            float r7 = r7 * r6
            long r6 = (long) r7
            java.lang.String r5 = r5.o
            if (r5 == 0) goto L_0x03a5
            r10 = r5
            goto L_0x03a5
        L_0x03a4:
            r11 = r9
        L_0x03a5:
            h20 r5 = new h20
            r5.<init>()
            r5.b = r6
            r5.q = r3
            int r3 = r8.b
            r5.d = r3
            int r3 = r8.c
            r5.e = r3
            r5.c = r10
            r5.k = r11
            k20 r3 = new k20
            r3.<init>(r5)
            j10 r5 = new j10
            r5.<init>()
            r5.d = r3
            r5.a = r2
            r5.i = r4
            r5.m = r0
            l20 r0 = r5.a()
            goto L_0x04cf
        L_0x03d2:
            r0 = r1
            j50 r0 = (defpackage.j50) r0
            h10 r2 = new h10
            r2.<init>()
            long r5 = r0.c
            r2.c = r5
            byte[] r3 = r0.o
            r2.d = r3
            i10 r3 = new i10
            r3.<init>(r2)
            j10 r2 = new j10
            r2.<init>()
            r2.e = r3
            g20 r3 = defpackage.g20.X
            r2.a = r3
            r2.i = r4
            java.lang.String r0 = r0.b
            r2.m = r0
            l20 r0 = r2.a()
            goto L_0x04cf
        L_0x03fe:
            r12 = 0
            boolean r0 = r1 instanceof defpackage.y95
            r0 = r0 ^ r3
            g20 r5 = defpackage.g20.c
            if (r0 == 0) goto L_0x0497
            java.lang.Object r0 = r17.getValue()
            af8 r0 = (defpackage.af8) r0
            java.lang.String r6 = r1.a()
            cj0 r0 = (defpackage.cj0) r0
            r0.getClass()
            android.graphics.Point r0 = defpackage.j47.E(r6, r3)
            int r6 = r0.x
            int r0 = r0.y
            java.lang.Object r7 = r17.getValue()
            af8 r7 = (defpackage.af8) r7
            cj0 r7 = (defpackage.cj0) r7
            r7.getClass()
            android.graphics.Point r8 = new android.graphics.Point
            r8.<init>(r6, r0)
            y7d r0 = r7.c
            qyc r0 = (defpackage.qyc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f49imagewidth
            r7 = 1920(0x780, float:2.69E-42)
            long r9 = (long) r7
            long r6 = r0.q(r6, r9)
            int r6 = (int) r6
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f46imageheight
            long r9 = r0.q(r7, r9)
            int r0 = (int) r9
            int r0 = defpackage.j47.I(r8, r6, r0)
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = r8.x
            int r7 = r7 / r0
            int r8 = r8.y
            int r8 = r8 / r0
            r6.<init>(r7, r8)
            int r0 = r6.x
            int r6 = r6.y
            java.lang.String r7 = r2.d
            boolean r7 = defpackage.oag.t(r7)
            if (r7 != 0) goto L_0x0470
            java.lang.String r2 = r2.d
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r7 = "gif"
            boolean r2 = r2.endsWith(r7)
            if (r2 == 0) goto L_0x0470
            r2 = r3
            goto L_0x0471
        L_0x0470:
            r2 = r12
        L_0x0471:
            w10 r3 = new w10
            r3.<init>()
            r3.c = r0
            r3.d = r6
            r3.e = r2
            x10 r0 = new x10
            r0.<init>(r3)
            j10 r2 = new j10
            r2.<init>()
            r2.b = r0
            r2.a = r5
            r2.i = r4
            java.lang.String r0 = r1.a()
            r2.m = r0
            l20 r0 = r2.a()
            goto L_0x04cf
        L_0x0497:
            r0 = r1
            y95 r0 = (defpackage.y95) r0
            w10 r2 = new w10
            r2.<init>()
            int r4 = r0.c
            r2.c = r4
            int r4 = r0.o
            r2.d = r4
            r2.e = r3
            java.lang.String r3 = r0.b
            r2.i = r3
            java.lang.String r3 = r0.Y
            r2.j = r3
            java.lang.String r3 = r0.Z
            r2.b = r3
            x10 r3 = new x10
            r3.<init>(r2)
            j10 r2 = new j10
            r2.<init>()
            r2.b = r3
            r2.a = r5
            d20 r3 = defpackage.d20.c
            r2.i = r3
            java.lang.String r0 = r0.X
            r2.m = r0
            l20 r0 = r2.a()
        L_0x04cf:
            lpa r2 = new lpa
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9b.b(o2, boolean):lpa");
    }
}
