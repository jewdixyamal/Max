package defpackage;

import java.util.ArrayList;

/* renamed from: jy6  reason: default package */
public final /* synthetic */ class jy6 implements m56 {
    public final /* synthetic */ sx3 X;
    public final /* synthetic */ fz6 Y;
    public final /* synthetic */ zme Z;
    public final /* synthetic */ u76 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ jy6(u76 u76, ArrayList arrayList, ArrayList arrayList2, boolean z, sx3 sx3, fz6 fz6, zme zme) {
        this.a = u76;
        this.b = arrayList;
        this.c = arrayList2;
        this.o = z;
        this.X = sx3;
        this.Y = fz6;
        this.Z = zme;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r9 != -1) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            android.database.Cursor r1 = (android.database.Cursor) r1
            u76 r2 = r0.a
            java.lang.String r3 = r2.f()
            int r3 = r1.getColumnIndex(r3)
            r4 = -1
            if (r3 != r4) goto L_0x0015
            goto L_0x011d
        L_0x0015:
            java.lang.String r5 = r2.c()
            int r5 = r1.getColumnIndex(r5)
            if (r5 != r4) goto L_0x0021
            goto L_0x011d
        L_0x0021:
            java.lang.String r6 = r2.g()
            int r6 = r1.getColumnIndex(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 0
            if (r6 == r4) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r7 = r8
        L_0x0032:
            java.lang.String r6 = r2.d()
            int r6 = r1.getColumnIndex(r6)
            if (r6 != r4) goto L_0x003e
            goto L_0x011d
        L_0x003e:
            java.lang.String r9 = r2.h()
            if (r9 == 0) goto L_0x004f
            int r9 = r1.getColumnIndex(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            if (r9 == r4) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r10 = r8
        L_0x0050:
            java.lang.String r9 = r2.e()
            if (r9 == 0) goto L_0x0061
            int r9 = r1.getColumnIndex(r9)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            if (r9 == r4) goto L_0x0061
            r8 = r11
        L_0x0061:
            boolean r4 = r1.moveToNext()
            if (r4 == 0) goto L_0x011d
            fz6 r4 = r0.Y
            zme r9 = r0.Z
            boolean r11 = r0.o
            sx3 r12 = r0.X
            boolean r4 = defpackage.oy6.s(r12, r4, r9, r11)
            if (r4 == 0) goto L_0x011d
            long r12 = r1.getLong(r3)
            android.net.Uri r4 = defpackage.c37.p(r1, r5)
            if (r4 != 0) goto L_0x0087
            android.net.Uri r4 = r2.i()
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r4, r12)
        L_0x0087:
            r21 = r4
            long r17 = r1.getLong(r6)
            if (r10 == 0) goto L_0x0098
            int r9 = r10.intValue()
            int r9 = r1.getInt(r9)
            goto L_0x0099
        L_0x0098:
            r9 = 0
        L_0x0099:
            java.lang.String r11 = "image/jpeg"
            if (r7 != 0) goto L_0x009f
        L_0x009d:
            r15 = r11
            goto L_0x00ac
        L_0x009f:
            int r14 = r7.intValue()
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x00aa
            goto L_0x009d
        L_0x00aa:
            r11 = r14
            goto L_0x009d
        L_0x00ac:
            r11 = 11
            int[] r11 = defpackage.au1.v(r11)
            int r14 = r11.length
            r4 = 0
        L_0x00b4:
            if (r4 >= r14) goto L_0x00cc
            r16 = r11[r4]
            r23 = r2
            java.lang.String r2 = defpackage.ey8.f(r16)
            boolean r2 = r2.equalsIgnoreCase(r15)
            if (r2 == 0) goto L_0x00c7
            r4 = r16
            goto L_0x00cf
        L_0x00c7:
            int r4 = r4 + 1
            r2 = r23
            goto L_0x00b4
        L_0x00cc:
            r23 = r2
            r4 = 0
        L_0x00cf:
            r2 = 1
            if (r4 != 0) goto L_0x00d3
            r4 = r2
        L_0x00d3:
            int r4 = defpackage.au1.s(r4)
            r14 = 4
            switch(r4) {
                case 1: goto L_0x00e1;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00db;
                case 4: goto L_0x00df;
                case 5: goto L_0x00e1;
                case 6: goto L_0x00e1;
                case 7: goto L_0x00dd;
                case 8: goto L_0x00dd;
                default: goto L_0x00db;
            }
        L_0x00db:
            r4 = r2
            goto L_0x00e2
        L_0x00dd:
            r4 = r14
            goto L_0x00e2
        L_0x00df:
            r4 = 3
            goto L_0x00e2
        L_0x00e1:
            r4 = 2
        L_0x00e2:
            if (r4 == r2) goto L_0x0119
            if (r8 == 0) goto L_0x00ef
            int r2 = r8.intValue()
            long r19 = r1.getLong(r2)
            goto L_0x00f1
        L_0x00ef:
            r19 = 0
        L_0x00f1:
            zp7 r2 = new zp7
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Long r20 = java.lang.Long.valueOf(r19)
            r22 = 896(0x380, float:1.256E-42)
            r16 = -1
            r11 = r2
            r25 = r1
            r1 = r14
            r14 = r21
            r19 = r9
            r11.<init>(r12, r14, r15, r16, r17, r19, r20, r21, r22)
            if (r4 != r1) goto L_0x0112
            java.util.ArrayList r1 = r0.b
            r1.add(r2)
            goto L_0x0117
        L_0x0112:
            java.util.ArrayList r1 = r0.c
            r1.add(r2)
        L_0x0117:
            r1 = r25
        L_0x0119:
            r2 = r23
            goto L_0x0061
        L_0x011d:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy6.invoke(java.lang.Object):java.lang.Object");
    }
}
