package defpackage;

import java.util.List;

/* renamed from: xe5  reason: default package */
public final class xe5 implements vt {
    public Object X;
    public Object Y;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public xe5(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.o = je74;
        this.X = je75;
        this.Y = je76;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016e, code lost:
        if (r3.equals("bmp") == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.xt B(defpackage.lv4 r9, android.os.Looper r10, defpackage.wt r11, defpackage.md3 r12) {
        /*
            r8 = this;
            r0 = 18
            r1 = 6
            r2 = 1
            tb8 r3 = r9.a
            ib8 r3 = r3.b
            java.lang.Object r4 = r8.a
            android.content.Context r4 = (android.content.Context) r4
            if (r3 != 0) goto L_0x0010
            goto L_0x01b0
        L_0x0010:
            java.lang.String r5 = r3.b
            if (r5 != 0) goto L_0x01a7
            android.net.Uri r3 = r3.a
            java.lang.String r6 = r3.getScheme()
            java.lang.String r7 = "content"
            boolean r6 = java.util.Objects.equals(r6, r7)
            if (r6 == 0) goto L_0x002c
            android.content.ContentResolver r2 = r4.getContentResolver()
            java.lang.String r5 = r2.getType(r3)
            goto L_0x01a7
        L_0x002c:
            java.lang.String r3 = r3.getPath()
            if (r3 != 0) goto L_0x0034
            goto L_0x01b0
        L_0x0034:
            java.lang.String r6 = "."
            int r6 = r3.lastIndexOf(r6)
            if (r6 < 0) goto L_0x01a7
            int r7 = r3.length()
            int r7 = r7 - r2
            if (r6 >= r7) goto L_0x01a7
            int r6 = r6 + r2
            java.lang.String r3 = r3.substring(r6)
            java.lang.String r3 = defpackage.lz7.T(r3)
            r3.getClass()
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 96870: goto L_0x0172;
                case 97669: goto L_0x0168;
                case 98723: goto L_0x015c;
                case 99453: goto L_0x0150;
                case 102340: goto L_0x0144;
                case 104085: goto L_0x0138;
                case 104430: goto L_0x012c;
                case 105133: goto L_0x0120;
                case 105223: goto L_0x0113;
                case 105439: goto L_0x0105;
                case 105441: goto L_0x00f7;
                case 111145: goto L_0x00e9;
                case 112680: goto L_0x00db;
                case 114276: goto L_0x00ce;
                case 114833: goto L_0x00c1;
                case 3006482: goto L_0x00b4;
                case 3198679: goto L_0x00a7;
                case 3198682: goto L_0x009a;
                case 3259225: goto L_0x008e;
                case 3268712: goto L_0x0081;
                case 3542678: goto L_0x0074;
                case 3559925: goto L_0x0067;
                case 3645340: goto L_0x005a;
                default: goto L_0x0057;
            }
        L_0x0057:
            r2 = r5
            goto L_0x017d
        L_0x005a:
            java.lang.String r2 = "webp"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0063
            goto L_0x0057
        L_0x0063:
            r2 = 22
            goto L_0x017d
        L_0x0067:
            java.lang.String r2 = "tiff"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0070
            goto L_0x0057
        L_0x0070:
            r2 = 21
            goto L_0x017d
        L_0x0074:
            java.lang.String r2 = "svgz"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x007d
            goto L_0x0057
        L_0x007d:
            r2 = 20
            goto L_0x017d
        L_0x0081:
            java.lang.String r2 = "jpeg"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x008a
            goto L_0x0057
        L_0x008a:
            r2 = 19
            goto L_0x017d
        L_0x008e:
            java.lang.String r2 = "jfif"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0097
            goto L_0x0057
        L_0x0097:
            r2 = r0
            goto L_0x017d
        L_0x009a:
            java.lang.String r2 = "heif"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00a3
            goto L_0x0057
        L_0x00a3:
            r2 = 17
            goto L_0x017d
        L_0x00a7:
            java.lang.String r2 = "heic"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00b0
            goto L_0x0057
        L_0x00b0:
            r2 = 16
            goto L_0x017d
        L_0x00b4:
            java.lang.String r2 = "avif"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00bd
            goto L_0x0057
        L_0x00bd:
            r2 = 15
            goto L_0x017d
        L_0x00c1:
            java.lang.String r2 = "tif"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00ca
            goto L_0x0057
        L_0x00ca:
            r2 = 14
            goto L_0x017d
        L_0x00ce:
            java.lang.String r2 = "svg"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00d7
            goto L_0x0057
        L_0x00d7:
            r2 = 13
            goto L_0x017d
        L_0x00db:
            java.lang.String r2 = "raw"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00e5
            goto L_0x0057
        L_0x00e5:
            r2 = 12
            goto L_0x017d
        L_0x00e9:
            java.lang.String r2 = "png"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00f3
            goto L_0x0057
        L_0x00f3:
            r2 = 11
            goto L_0x017d
        L_0x00f7:
            java.lang.String r2 = "jpg"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0101
            goto L_0x0057
        L_0x0101:
            r2 = 10
            goto L_0x017d
        L_0x0105:
            java.lang.String r2 = "jpe"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x010f
            goto L_0x0057
        L_0x010f:
            r2 = 9
            goto L_0x017d
        L_0x0113:
            java.lang.String r2 = "jif"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x011d
            goto L_0x0057
        L_0x011d:
            r2 = 8
            goto L_0x017d
        L_0x0120:
            java.lang.String r2 = "jfi"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x012a
            goto L_0x0057
        L_0x012a:
            r2 = 7
            goto L_0x017d
        L_0x012c:
            java.lang.String r2 = "k25"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0136
            goto L_0x0057
        L_0x0136:
            r2 = r1
            goto L_0x017d
        L_0x0138:
            java.lang.String r2 = "ico"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0142
            goto L_0x0057
        L_0x0142:
            r2 = 5
            goto L_0x017d
        L_0x0144:
            java.lang.String r2 = "gif"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x014e
            goto L_0x0057
        L_0x014e:
            r2 = 4
            goto L_0x017d
        L_0x0150:
            java.lang.String r2 = "dib"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x015a
            goto L_0x0057
        L_0x015a:
            r2 = 3
            goto L_0x017d
        L_0x015c:
            java.lang.String r2 = "cr2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0166
            goto L_0x0057
        L_0x0166:
            r2 = 2
            goto L_0x017d
        L_0x0168:
            java.lang.String r6 = "bmp"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x017d
            goto L_0x0057
        L_0x0172:
            java.lang.String r2 = "arw"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x017c
            goto L_0x0057
        L_0x017c:
            r2 = 0
        L_0x017d:
            switch(r2) {
                case 0: goto L_0x01a4;
                case 1: goto L_0x01a1;
                case 2: goto L_0x01a4;
                case 3: goto L_0x01a1;
                case 4: goto L_0x019e;
                case 5: goto L_0x019b;
                case 6: goto L_0x01a4;
                case 7: goto L_0x0198;
                case 8: goto L_0x0198;
                case 9: goto L_0x0198;
                case 10: goto L_0x0198;
                case 11: goto L_0x0195;
                case 12: goto L_0x01a4;
                case 13: goto L_0x0192;
                case 14: goto L_0x018f;
                case 15: goto L_0x018c;
                case 16: goto L_0x0189;
                case 17: goto L_0x0186;
                case 18: goto L_0x0198;
                case 19: goto L_0x0198;
                case 20: goto L_0x0192;
                case 21: goto L_0x018f;
                case 22: goto L_0x0183;
                default: goto L_0x0180;
            }
        L_0x0180:
            r2 = 0
        L_0x0181:
            r5 = r2
            goto L_0x01a7
        L_0x0183:
            java.lang.String r2 = "image/webp"
            goto L_0x0181
        L_0x0186:
            java.lang.String r2 = "image/heif"
            goto L_0x0181
        L_0x0189:
            java.lang.String r2 = "image/heic"
            goto L_0x0181
        L_0x018c:
            java.lang.String r2 = "image/avif"
            goto L_0x0181
        L_0x018f:
            java.lang.String r2 = "image/tiff"
            goto L_0x0181
        L_0x0192:
            java.lang.String r2 = "image/svg+xml"
            goto L_0x0181
        L_0x0195:
            java.lang.String r2 = "image/png"
            goto L_0x0181
        L_0x0198:
            java.lang.String r2 = "image/jpeg"
            goto L_0x0181
        L_0x019b:
            java.lang.String r2 = "image/x-icon"
            goto L_0x0181
        L_0x019e:
            java.lang.String r2 = "image/gif"
            goto L_0x0181
        L_0x01a1:
            java.lang.String r2 = "image/bmp"
            goto L_0x0181
        L_0x01a4:
            java.lang.String r2 = "image/raw"
            goto L_0x0181
        L_0x01a7:
            if (r5 != 0) goto L_0x01aa
            goto L_0x01b0
        L_0x01aa:
            boolean r2 = defpackage.ia9.i(r5)
            if (r2 != 0) goto L_0x01d0
        L_0x01b0:
            java.lang.Object r0 = r8.Y
            glc r0 = (defpackage.glc) r0
            if (r0 != 0) goto L_0x01c7
            glc r0 = new glc
            java.lang.Object r2 = r8.c
            she r2 = (defpackage.she) r2
            java.lang.Object r3 = r8.b
            u43 r3 = (defpackage.u43) r3
            pkg r3 = (defpackage.pkg) r3
            r0.<init>(r4, r3, r2, r1)
            r8.Y = r0
        L_0x01c7:
            java.lang.Object r8 = r8.Y
            glc r8 = (defpackage.glc) r8
            xt r8 = r8.B(r9, r10, r11, r12)
            return r8
        L_0x01d0:
            java.lang.Object r1 = r8.o
            v24 r1 = (defpackage.v24) r1
            r1.getClass()
            boolean r2 = defpackage.oaf.K(r5)
            java.lang.String r3 = "Image format not supported by given bitmapLoader"
            defpackage.fm9.j(r3, r2)
            java.lang.Object r2 = r8.X
            rxd r2 = (defpackage.rxd) r2
            if (r2 != 0) goto L_0x01ed
            rxd r2 = new rxd
            r2.<init>(r0, r1)
            r8.X = r2
        L_0x01ed:
            java.lang.Object r8 = r8.X
            rxd r8 = (defpackage.rxd) r8
            xt r8 = r8.B(r9, r10, r11, r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe5.B(lv4, android.os.Looper, wt, md3):xt");
    }

    public rb0 a() {
        String str = ((xf4) this.a) == null ? " surface" : "";
        if (((List) this.b) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.o) == null) {
            str = au1.g(str, " mirrorMode");
        }
        if (((Integer) this.X) == null) {
            str = au1.g(str, " surfaceGroupId");
        }
        if (((eu4) this.Y) == null) {
            str = au1.g(str, " dynamicRange");
        }
        if (str.isEmpty()) {
            return new rb0((xf4) this.a, (List) this.b, (String) this.c, ((Integer) this.o).intValue(), ((Integer) this.X).intValue(), (eu4) this.Y);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARNING: type inference failed for: r13v22, types: [java.lang.Object, mec] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x017f A[LOOP:0: B:27:0x0179->B:29:0x017f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.we5
            if (r0 == 0) goto L_0x0013
            r0 = r13
            we5 r0 = (defpackage.we5) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            we5 r0 = new we5
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r1 = r0.Z
            mec r12 = r0.Y
            mec r3 = r0.X
            xe5 r0 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x008f
        L_0x002f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0037:
            defpackage.od2.a0(r13)
            mec r13 = new mec
            r13.<init>()
            java.lang.Object r2 = r12.Y
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            android.content.Context r2 = (android.content.Context) r2
            int r4 = defpackage.dpc.b
            java.lang.String r2 = r2.getString(r4)
            java.lang.Object r4 = r12.b
            je7 r4 = (defpackage.je7) r4
            java.lang.Object r4 = r4.getValue()
            f5a r4 = (defpackage.f5a) r4
            boolean r4 = r4.d()
            if (r4 == 0) goto L_0x00b8
            java.lang.Object r2 = r12.o
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            q33 r2 = (defpackage.q33) r2
            hyc r2 = (defpackage.hyc) r2
            long r4 = r2.t()
            java.lang.Object r2 = r12.c
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            ds3 r2 = (defpackage.ds3) r2
            r0.o = r12
            r0.X = r13
            r0.Y = r13
            r0.Z = r4
            r0.u0 = r3
            java.lang.Comparable r0 = r2.b(r4, r0)
            if (r0 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r3 = r13
            r1 = r4
            r13 = r0
            r0 = r12
            r12 = r3
        L_0x008f:
            r12.a = r13
            java.lang.Object r12 = r0.Y
            je7 r12 = (defpackage.je7) r12
            java.lang.Object r12 = r12.getValue()
            android.content.Context r12 = (android.content.Context) r12
            int r13 = defpackage.dpc.c
            java.lang.Object r4 = r3.a
            uj3 r4 = (defpackage.uj3) r4
            if (r4 == 0) goto L_0x00a8
            java.lang.String r4 = r4.d()
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5}
            java.lang.String r2 = r12.getString(r13, r1)
            r12 = r0
            r13 = r3
        L_0x00b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n\n--\n"
            r0.<init>(r1)
            java.lang.Object r1 = r13.a
            uj3 r1 = (defpackage.uj3) r1
            if (r1 == 0) goto L_0x00f1
            java.lang.Object r1 = r12.Y
            je7 r1 = (defpackage.je7) r1
            java.lang.Object r1 = r1.getValue()
            android.content.Context r1 = (android.content.Context) r1
            int r3 = defpackage.dpc.d
            java.lang.Object r4 = r13.a
            uj3 r4 = (defpackage.uj3) r4
            java.lang.String r4 = r4.d()
            java.lang.Object r13 = r13.a
            uj3 r13 = (defpackage.uj3) r13
            long r5 = r13.n()
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r5)
            java.lang.Object[] r13 = new java.lang.Object[]{r4, r13}
            java.lang.String r13 = r1.getString(r3, r13)
            r0.append(r13)
        L_0x00f1:
            java.lang.Object r13 = r12.a
            je7 r13 = (defpackage.je7) r13
            java.lang.Object r13 = r13.getValue()
            ri4 r13 = (defpackage.ri4) r13
            t9f r13 = r13.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r13.b
            r1.append(r3)
            java.lang.String r3 = "("
            r1.append(r3)
            int r3 = r13.c
            java.lang.String r4 = ")"
            java.lang.String r1 = defpackage.zr6.j(r1, r3, r4)
            kpa r3 = new kpa
            java.lang.String r4 = "locale"
            java.lang.String r5 = r13.f
            r3.<init>(r4, r5)
            kpa r4 = new kpa
            java.lang.String r5 = "appVersion"
            r4.<init>(r5, r1)
            kpa r5 = new kpa
            java.lang.String r1 = "screen"
            java.lang.String r6 = r13.i
            r5.<init>(r1, r6)
            kpa r6 = new kpa
            java.lang.String r1 = "deviceName"
            java.lang.String r7 = r13.h
            r6.<init>(r1, r7)
            kpa r7 = new kpa
            java.lang.String r1 = "deviceType"
            java.lang.String r8 = r13.a
            r7.<init>(r1, r8)
            kpa r8 = new kpa
            java.lang.String r1 = "osVersion"
            java.lang.String r9 = r13.e
            r8.<init>(r1, r9)
            kpa r9 = new kpa
            java.util.TimeZone r1 = r13.k
            java.lang.String r1 = r1.getID()
            java.lang.String r10 = "timezone"
            r9.<init>(r10, r1)
            kpa r10 = new kpa
            java.lang.String r1 = "deviceLocale"
            java.lang.String r11 = r13.g
            r10.<init>(r1, r11)
            kpa r11 = new kpa
            int r13 = r13.j
            java.lang.String r13 = defpackage.z7b.a(r13)
            java.lang.String r1 = "pushDeviceType"
            r11.<init>(r1, r13)
            kpa[] r13 = new defpackage.kpa[]{r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r13 = defpackage.y53.M(r13)
            java.util.Iterator r13 = r13.iterator()
        L_0x0179:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x01a6
            java.lang.Object r1 = r13.next()
            kpa r1 = (defpackage.kpa) r1
            java.lang.Object r3 = r1.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ": "
            r4.append(r3)
            java.lang.Object r1 = r1.b
            r4.append(r1)
            java.lang.String r1 = "\n"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            goto L_0x0179
        L_0x01a6:
            java.lang.String r13 = r0.toString()
            java.lang.Object r12 = r12.X
            je7 r12 = (defpackage.je7) r12
            java.lang.Object r12 = r12.getValue()
            y7d r12 = (defpackage.y7d) r12
            qyc r12 = (defpackage.qyc) r12
            r12.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f122supportemail
            java.lang.String r1 = "support@max.ru"
            java.lang.String r12 = r12.s(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "mailto:"
            r0.<init>(r1)
            r0.append(r12)
            int r12 = r2.length()
            java.lang.String r1 = "utf-8"
            if (r12 <= 0) goto L_0x01e2
            java.lang.String r12 = "?subject="
            r0.append(r12)
            java.lang.String r12 = android.net.Uri.encode(r2, r1)
            r0.append(r12)
            java.lang.String r12 = "&"
            goto L_0x01e4
        L_0x01e2:
            java.lang.String r12 = "?"
        L_0x01e4:
            int r2 = r13.length()
            if (r2 <= 0) goto L_0x01f9
            r0.append(r12)
            java.lang.String r12 = "body="
            r0.append(r12)
            java.lang.String r12 = android.net.Uri.encode(r13, r1)
            r0.append(r12)
        L_0x01f9:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe5.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void c() {
        ((lh4) this.b).a = -1;
        ((lh4) this.c).a = -1;
        ((lh4) this.o).a = -1;
        ((lh4) this.X).a = -1;
    }
}
