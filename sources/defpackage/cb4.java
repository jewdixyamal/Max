package defpackage;

import java.util.ArrayList;

/* renamed from: cb4  reason: default package */
public final class cb4 implements am6 {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public mbe b;
    public boolean c;

    public static void a(ArrayList arrayList, int i) {
        if (s5c.H(i, 0, 7, d) != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: f26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: pbe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: pbe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: mc4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: d28} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: gbe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: f26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: f26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: f26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: f26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: f26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: f26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: f26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: f26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: f26} */
    /* JADX WARNING: type inference failed for: r10v10, types: [vp0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.xu0 b(int r8, defpackage.qy5 r9, boolean r10, java.util.ArrayList r11, defpackage.yze r12) {
        /*
            r7 = this;
            java.lang.String r0 = r9.m
            boolean r1 = defpackage.ia9.j(r0)
            if (r1 == 0) goto L_0x001b
            boolean r10 = r7.c
            if (r10 != 0) goto L_0x000e
            r7 = 0
            return r7
        L_0x000e:
            gbe r10 = new gbe
            mbe r11 = r7.b
            obe r11 = r11.e(r9)
            r10.<init>(r11, r9)
            goto L_0x0091
        L_0x001b:
            r1 = 1
            if (r0 != 0) goto L_0x001f
            goto L_0x0050
        L_0x001f:
            java.lang.String r2 = "video/webm"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "audio/webm"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "application/webm"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "video/x-matroska"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "audio/x-matroska"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "application/x-matroska"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0050
            goto L_0x0085
        L_0x0050:
            java.lang.String r2 = "image/jpeg"
            boolean r2 = java.util.Objects.equals(r0, r2)
            if (r2 == 0) goto L_0x005e
            mc4 r10 = new mc4
            r10.<init>((int) r1)
            goto L_0x0091
        L_0x005e:
            java.lang.String r1 = "image/png"
            boolean r1 = java.util.Objects.equals(r0, r1)
            if (r1 == 0) goto L_0x006d
            vp0 r10 = new vp0
            r11 = 1
            r10.<init>(r11)
            goto L_0x0091
        L_0x006d:
            if (r10 == 0) goto L_0x0071
            r10 = 4
            goto L_0x0072
        L_0x0071:
            r10 = 0
        L_0x0072:
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x0078
            r10 = r10 | 32
        L_0x0078:
            r3 = r10
            f26 r10 = new f26
            mbe r2 = r7.b
            r4 = 0
            r1 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0091
        L_0x0085:
            boolean r10 = r7.c
            if (r10 != 0) goto L_0x008a
            r1 = 3
        L_0x008a:
            d28 r10 = new d28
            mbe r11 = r7.b
            r10.<init>(r1, r11)
        L_0x0091:
            boolean r11 = r7.c
            if (r11 == 0) goto L_0x00b3
            boolean r11 = defpackage.ia9.j(r0)
            if (r11 != 0) goto L_0x00b3
            la5 r11 = r10.m()
            boolean r11 = r11 instanceof defpackage.f26
            if (r11 != 0) goto L_0x00b3
            la5 r11 = r10.m()
            boolean r11 = r11 instanceof defpackage.d28
            if (r11 != 0) goto L_0x00b3
            pbe r11 = new pbe
            mbe r7 = r7.b
            r11.<init>(r10, r7)
            r10 = r11
        L_0x00b3:
            xu0 r7 = new xu0
            r7.<init>(r10, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb4.b(int, qy5, boolean, java.util.ArrayList, yze):xu0");
    }

    public qy5 c(qy5 qy5) {
        String str;
        if (!this.c || !this.b.a(qy5)) {
            return qy5;
        }
        ny5 a = qy5.a();
        a.m = ia9.l("application/x-media3-cues");
        a.G = this.b.l(qy5);
        StringBuilder sb = new StringBuilder();
        sb.append(qy5.n);
        String str2 = qy5.j;
        if (str2 != null) {
            str = " " + str2;
        } else {
            str = "";
        }
        sb.append(str);
        a.i = sb.toString();
        a.r = Long.MAX_VALUE;
        return a.a();
    }
}
