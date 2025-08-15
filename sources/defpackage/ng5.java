package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ng5  reason: default package */
public final class ng5 {
    public final ye4 a = new ye4(3);
    public final ue5 b;
    public final p82 c;
    public final au8 d;
    public final y8f e;
    public final py8 f;
    public final wef g;
    public final pg5 h;
    public final og5 i;
    public final mg5 j;

    public ng5(ue5 ue5, wa4 wa4, p82 p82, au8 au8, y8f y8f, py8 py8, wef wef, pg5 pg5, og5 og5, mg5 mg5) {
        this.b = ue5;
        this.c = p82;
        this.d = au8;
        this.e = y8f;
        this.f = py8;
        this.g = wef;
        this.h = pg5;
        this.i = og5;
        this.j = mg5;
    }

    public final nw4 a(va8 va8) {
        gx0 gx0 = gx0.a;
        pg5 pg5 = this.h;
        List b2 = b(pg5.a(gx0), (gx0) null, va8);
        if (pg5.j == null) {
            Context context = ((kk5) pg5.a).c;
            pg5.j = Arrays.asList(new File[]{context.getExternalCacheDir(), context.getFilesDir()});
        }
        List<File> list = pg5.j;
        if (list != null && !list.isEmpty()) {
            for (File b3 : list) {
                b2.addAll(b(b3, (gx0) null, va8));
            }
        }
        Collections.sort(b2, this.a);
        return new nw4(b2, this.i, pg5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ab A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List b(java.io.File r13, defpackage.gx0 r14, defpackage.va8 r15) {
        /*
            r12 = this;
            boolean r0 = r13.isDirectory()
            if (r0 != 0) goto L_0x000b
            java.util.List r12 = java.util.Collections.emptyList()
            return r12
        L_0x000b:
            java.io.File[] r13 = r13.listFiles()
            if (r13 == 0) goto L_0x01b0
            int r0 = r13.length
            if (r0 != 0) goto L_0x0016
            goto L_0x01b0
        L_0x0016:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.length
            r0.<init>(r1)
            int r1 = r13.length
            r2 = 0
            r3 = r2
        L_0x001f:
            if (r3 >= r1) goto L_0x01af
            r4 = r13[r3]
            gx0 r5 = defpackage.gx0.Y
            if (r14 == 0) goto L_0x002a
            r6 = r14
            goto L_0x0161
        L_0x002a:
            pg5 r6 = r12.h
            r6.getClass()
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.d
            zi5 r9 = r6.a
            if (r8 != 0) goto L_0x0042
            r8 = r9
            kk5 r8 = (defpackage.kk5) r8
            java.io.File r8 = r8.m()
            r6.d = r8
        L_0x0042:
            java.io.File r8 = r6.d
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x0052
            gx0 r6 = defpackage.gx0.b
            goto L_0x0161
        L_0x0052:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.e
            if (r8 != 0) goto L_0x006c
            r8 = r9
            kk5 r8 = (defpackage.kk5) r8
            r8.getClass()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "audioCache"
            java.io.File r8 = defpackage.kk5.g(r8, r10)
            r6.e = r8
        L_0x006c:
            java.io.File r8 = r6.e
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x007c
            gx0 r6 = defpackage.gx0.c
            goto L_0x0161
        L_0x007c:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.f
            if (r8 != 0) goto L_0x0096
            r8 = r9
            kk5 r8 = (defpackage.kk5) r8
            r8.getClass()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "stickerCache"
            java.io.File r8 = defpackage.kk5.g(r8, r10)
            r6.f = r8
        L_0x0096:
            java.io.File r8 = r6.f
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00a6
            gx0 r6 = defpackage.gx0.X
            goto L_0x0161
        L_0x00a6:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.g
            if (r8 != 0) goto L_0x00c0
            r8 = r9
            kk5 r8 = (defpackage.kk5) r8
            r8.getClass()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "gifCache"
            java.io.File r8 = defpackage.kk5.g(r8, r10)
            r6.g = r8
        L_0x00c0:
            java.io.File r8 = r6.g
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00d0
            gx0 r6 = defpackage.gx0.o
            goto L_0x0161
        L_0x00d0:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.c
            if (r8 != 0) goto L_0x00ea
            r8 = r9
            kk5 r8 = (defpackage.kk5) r8
            r8.getClass()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "upload"
            java.io.File r8 = defpackage.kk5.g(r8, r10)
            r6.c = r8
        L_0x00ea:
            java.io.File r8 = r6.c
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r10 = r7.startsWith(r8)
            if (r10 == 0) goto L_0x010e
            java.lang.String r10 = java.io.File.separator
            int r11 = r8.length()
            boolean r10 = r7.startsWith(r10, r11)
            if (r10 != 0) goto L_0x010c
            int r7 = r7.length()
            int r8 = r8.length()
            if (r7 != r8) goto L_0x010e
        L_0x010c:
            r6 = r5
            goto L_0x0161
        L_0x010e:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.h
            if (r8 != 0) goto L_0x0128
            r8 = r9
            kk5 r8 = (defpackage.kk5) r8
            r8.getClass()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "exo_files_cache"
            java.io.File r8 = defpackage.kk5.g(r8, r10)
            r6.h = r8
        L_0x0128:
            java.io.File r8 = r6.h
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x0137
            gx0 r6 = defpackage.gx0.Z
            goto L_0x0161
        L_0x0137:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.i
            if (r8 != 0) goto L_0x0150
            kk5 r9 = (defpackage.kk5) r9
            r9.getClass()
            java.lang.String r8 = r9.b()
            java.lang.String r9 = "videoCache"
            java.io.File r8 = defpackage.kk5.g(r8, r9)
            r6.i = r8
        L_0x0150:
            java.io.File r6 = r6.i
            java.lang.String r6 = r6.getAbsolutePath()
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L_0x015f
            gx0 r6 = defpackage.gx0.s0
            goto L_0x0161
        L_0x015f:
            gx0 r6 = defpackage.gx0.t0
        L_0x0161:
            boolean r7 = r4.isDirectory()
            if (r7 == 0) goto L_0x016f
            java.util.List r4 = r12.b(r4, r6, r15)
            r0.addAll(r4)
            goto L_0x01ab
        L_0x016f:
            if (r6 != r5) goto L_0x017c
            java.lang.Object r5 = r15.b
            x8f r5 = (defpackage.x8f) r5
            if (r5 == 0) goto L_0x01a0
            boolean r5 = r5.b(r4)
            goto L_0x01a1
        L_0x017c:
            java.lang.Object r5 = r15.c
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x01a0
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x01a0
            java.util.Iterator r5 = r5.iterator()
        L_0x018c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x01a0
            java.lang.Object r7 = r5.next()
            x8f r7 = (defpackage.x8f) r7
            boolean r7 = r7.b(r4)
            if (r7 != 0) goto L_0x018c
            r5 = r2
            goto L_0x01a1
        L_0x01a0:
            r5 = 1
        L_0x01a1:
            if (r5 == 0) goto L_0x01ab
            pw0 r5 = new pw0
            r5.<init>(r4, r6)
            r0.add(r5)
        L_0x01ab:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x01af:
            return r0
        L_0x01b0:
            java.util.List r12 = java.util.Collections.emptyList()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng5.b(java.io.File, gx0, va8):java.util.List");
    }
}
