package defpackage;

import android.util.Range;
import android.util.Size;

/* renamed from: cff  reason: default package */
public final class cff implements mde {
    public static final Size Z = new Size(1280, 720);
    public static final Range s0 = new Range(1, 60);
    public final eu4 X;
    public final Range Y;
    public final String a;
    public final bue b;
    public final mc0 c;
    public final Size o;

    public cff(String str, bue bue, mc0 mc0, Size size, eu4 eu4, Range range) {
        this.a = str;
        this.b = bue;
        this.c = mc0;
        this.o = size;
        this.X = eu4;
        this.Y = range;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        r0 = (java.lang.Integer) r4.get(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r13 = this;
            android.util.Range r0 = defpackage.see.p
            android.util.Range r1 = r13.Y
            boolean r2 = java.util.Objects.equals(r1, r0)
            if (r2 != 0) goto L_0x001d
            java.lang.Comparable r2 = r1.getUpper()
            java.lang.Integer r2 = (java.lang.Integer) r2
            android.util.Range r3 = s0
            java.lang.Comparable r2 = r3.clamp(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x001f
        L_0x001d:
            r2 = 30
        L_0x001f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = "<UNSPECIFIED>"
        L_0x002c:
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r1}
            java.lang.String r1 = "Default resolved frame rate: %dfps. [Expected operating range: %s]"
            java.lang.String.format(r1, r0)
            mc0 r0 = r13.c
            android.util.Range r12 = r0.c
            eu4 r0 = r13.X
            int r4 = r0.b
            android.util.Size r1 = r13.o
            int r8 = r1.getWidth()
            android.util.Size r3 = Z
            int r9 = r3.getWidth()
            int r10 = r1.getHeight()
            int r11 = r3.getHeight()
            r7 = 30
            r3 = 14000000(0xd59f80, float:1.9618179E-38)
            r5 = 8
            r6 = r2
            int r3 = defpackage.eef.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.HashMap r4 = defpackage.hu4.e
            java.lang.String r5 = r13.a
            java.lang.Object r4 = r4.get(r5)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L_0x0076
            java.lang.Object r0 = r4.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0076
            int r0 = r0.intValue()
            goto L_0x0077
        L_0x0076:
            r0 = -1
        L_0x0077:
            jc0 r4 = defpackage.eef.a(r0, r5)
            qp4 r6 = defpackage.ic0.d()
            if (r5 == 0) goto L_0x00ac
            r6.a = r5
            bue r13 = r13.b
            if (r13 == 0) goto L_0x00a4
            r6.c = r13
            r6.o = r1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r6.t0 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r6.Z = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r6.b = r13
            r6.Y = r4
            ic0 r13 = r6.b()
            return r13
        L_0x00a4:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "Null inputTimebase"
            r13.<init>(r0)
            throw r13
        L_0x00ac:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "Null mimeType"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cff.get():java.lang.Object");
    }
}
