package defpackage;

/* renamed from: vaa  reason: default package */
public final class vaa implements jp4 {
    public final String a = vaa.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public vaa(je7 je7, je7 je72, je7 je73) {
        this.b = je7;
        this.c = je72;
        this.d = je73;
    }

    public final uaa a(uaa uaa, Long l) {
        if (!(uaa instanceof uaa)) {
            return uaa;
        }
        return new uaa(uaa.a, uaa.b, uaa.c, uaa.d, l, uaa.f, uaa.g);
    }

    public final uaa b(long j, n7d n7d) {
        xd7 xd7;
        vaa vaa;
        Long l;
        cu8 j2;
        long j3 = j;
        n7d n7d2 = n7d;
        String str = n7d2.b;
        Long l2 = null;
        if (str == null || str.length() == 0) {
            vaa = this;
            xd7 = null;
        } else {
            xd7 xd72 = new xd7(str, iz7.u(n7d2.d));
            vaa = this;
            xd7 = xd72;
        }
        je7 je7 = vaa.c;
        Long l3 = n7d2.e;
        if (l3 != null) {
            cu8 j4 = ((au8) je7.getValue()).j(j3, l3.longValue());
            l = j4 != null ? Long.valueOf(j4.b) : null;
        } else {
            l = null;
        }
        Long l4 = n7d2.f;
        if (!(l4 == null || (j2 = ((au8) je7.getValue()).j(j3, l4.longValue())) == null)) {
            l2 = Long.valueOf(j2.b);
        }
        return new uaa(n7d2.a, xd7, l, l2, Long.valueOf(n7d2.g), true, 64);
    }

    public final uaa c(uaa uaa) {
        return uaa;
    }

    public final byte[] d(uaa uaa) {
        return gp4.b(uaa);
    }

    public final uaa e(byte[] bArr) {
        return gp4.a(bArr, (o45) this.b.getValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r4 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.n7d f(defpackage.uaa r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.uaa
            java.lang.String r1 = r10.a
            r2 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r10 = "toServerDraft: Wrong draft type"
            defpackage.hm9.p(r1, r10, r2)
            n7d r10 = new n7d
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        L_0x0019:
            boolean r0 = r11.d()
            if (r0 == 0) goto L_0x0031
            java.lang.String r10 = "toServerDraft: draft is empty"
            defpackage.hm9.p(r1, r10, r2)
            n7d r10 = new n7d
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        L_0x0031:
            xd7 r0 = r11.b
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = r0.a
            if (r3 == 0) goto L_0x0056
            je7 r4 = r10.d
            java.lang.Object r4 = r4.getValue()
            y7d r4 = (defpackage.y7d) r4
            qyc r4 = (defpackage.qyc) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.f71maxmsglength
            r6 = 4000(0xfa0, float:5.605E-42)
            long r6 = (long) r6
            long r4 = r4.q(r5, r6)
            int r4 = (int) r4
            java.lang.String r3 = defpackage.w9e.Y0(r4, r3)
            r5 = r3
            goto L_0x0057
        L_0x0056:
            r5 = r2
        L_0x0057:
            r3 = 0
            if (r0 == 0) goto L_0x0063
            java.lang.String r4 = r0.a
            if (r4 == 0) goto L_0x0063
            int r4 = r4.length()
            goto L_0x0064
        L_0x0063:
            r4 = r3
        L_0x0064:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r0 == 0) goto L_0x006e
            java.util.List r7 = r0.b
            goto L_0x006f
        L_0x006e:
            r7 = r2
        L_0x006f:
            if (r5 == 0) goto L_0x00c7
            if (r7 == 0) goto L_0x00c7
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x007a
            goto L_0x00c7
        L_0x007a:
            int r8 = r5.length()
            if (r8 != r4) goto L_0x0081
            goto L_0x00c7
        L_0x0081:
            java.util.Iterator r1 = r7.iterator()
        L_0x0085:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00cc
            java.lang.Object r7 = r1.next()
            nu8 r7 = (defpackage.nu8) r7
            int r8 = r7.d
            if (r8 <= r4) goto L_0x00a6
            int r8 = r8 - r4
            r9 = 55
            nu8 r7 = defpackage.nu8.a(r7, r8, r3, r9)
            nu8 r7 = r7.b()
            if (r7 == 0) goto L_0x0085
            r6.add(r7)
            goto L_0x0085
        L_0x00a6:
            int r9 = r7.e
            int r9 = r9 + r8
            if (r9 <= r4) goto L_0x00bd
            int r8 = r4 - r8
            r9 = 47
            nu8 r7 = defpackage.nu8.a(r7, r3, r8, r9)
            nu8 r7 = r7.b()
            if (r7 == 0) goto L_0x0085
            r6.add(r7)
            goto L_0x0085
        L_0x00bd:
            nu8 r7 = r7.b()
            if (r7 == 0) goto L_0x0085
            r6.add(r7)
            goto L_0x0085
        L_0x00c7:
            java.lang.String r3 = "Don't need validate elements"
            defpackage.hm9.m(r1, r3, new java.lang.Object[0])
        L_0x00cc:
            je7 r10 = r10.c
            java.lang.Long r1 = r11.c
            if (r1 == 0) goto L_0x00e9
            long r3 = r1.longValue()
            java.lang.Object r1 = r10.getValue()
            au8 r1 = (defpackage.au8) r1
            cu8 r1 = r1.q(r3)
            if (r1 == 0) goto L_0x00e9
            long r3 = r1.c
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x00ea
        L_0x00e9:
            r1 = r2
        L_0x00ea:
            java.lang.Long r11 = r11.d
            if (r11 == 0) goto L_0x0105
            long r3 = r11.longValue()
            java.lang.Object r10 = r10.getValue()
            au8 r10 = (defpackage.au8) r10
            cu8 r10 = r10.q(r3)
            if (r10 == 0) goto L_0x0105
            long r10 = r10.c
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L_0x0106
        L_0x0105:
            r10 = r2
        L_0x0106:
            boolean r11 = r6.isEmpty()
            if (r11 == 0) goto L_0x0111
            if (r0 == 0) goto L_0x0110
            java.util.List r2 = r0.b
        L_0x0110:
            r6 = r2
        L_0x0111:
            java.util.ArrayList r11 = defpackage.iz7.v(r6)
            if (r11 != 0) goto L_0x0119
            nz4 r11 = defpackage.nz4.a
        L_0x0119:
            r6 = r11
            r2 = 0
            if (r1 == 0) goto L_0x0123
            long r0 = r1.longValue()
            goto L_0x0124
        L_0x0123:
            r0 = r2
        L_0x0124:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            if (r10 == 0) goto L_0x012e
            long r2 = r10.longValue()
        L_0x012e:
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            n7d r10 = new n7d
            r9 = 69
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vaa.f(uaa):n7d");
    }
}
