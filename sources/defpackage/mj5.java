package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: mj5  reason: default package */
public final class mj5 extends gle {
    public List c;

    public mj5(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [nj5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.gy8 r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r2 = 1
            r19.getClass()
            java.lang.String r3 = "info"
            r4 = r19
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0015
            r18.z()
            goto L_0x0091
        L_0x0015:
            int r3 = defpackage.lz7.G(r18)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r0.c = r4
            r4 = 0
        L_0x0021:
            if (r4 >= r3) goto L_0x0091
            java.util.List r5 = r0.c
            int r6 = defpackage.lz7.N(r18)
            r7 = 0
            if (r6 != 0) goto L_0x0030
            r1 = r18
            goto L_0x008c
        L_0x0030:
            r8 = 0
            r10 = r7
            r12 = r8
            r11 = 0
        L_0x0035:
            if (r11 >= r6) goto L_0x0084
            java.lang.String r14 = r18.z0()
            r14.getClass()
            r15 = -1
            int r16 = r14.hashCode()
            switch(r16) {
                case -1274507337: goto L_0x005d;
                case 116079: goto L_0x0052;
                case 110541305: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0067
        L_0x0047:
            java.lang.String r1 = "token"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x0050
            goto L_0x0067
        L_0x0050:
            r15 = 2
            goto L_0x0067
        L_0x0052:
            java.lang.String r1 = "url"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x005b
            goto L_0x0067
        L_0x005b:
            r15 = r2
            goto L_0x0067
        L_0x005d:
            java.lang.String r1 = "fileId"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r15 = 0
        L_0x0067:
            switch(r15) {
                case 0: goto L_0x007c;
                case 1: goto L_0x0076;
                case 2: goto L_0x0070;
                default: goto L_0x006a;
            }
        L_0x006a:
            r18.z()
        L_0x006d:
            r1 = r18
            goto L_0x0082
        L_0x0070:
            java.lang.String r1 = defpackage.lz7.P(r18)
            r7 = r1
            goto L_0x006d
        L_0x0076:
            java.lang.String r1 = defpackage.lz7.P(r18)
            r10 = r1
            goto L_0x006d
        L_0x007c:
            r1 = r18
            long r12 = defpackage.lz7.M(r1, r8)
        L_0x0082:
            int r11 = r11 + r2
            goto L_0x0035
        L_0x0084:
            r1 = r18
            nj5 r6 = new nj5
            r6.<init>(r12, r7, r10)
            r7 = r6
        L_0x008c:
            r5.add(r7)
            int r4 = r4 + r2
            goto L_0x0021
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj5.b(gy8, java.lang.String):void");
    }

    public final String toString() {
        List list = this.c;
        return "{info=" + list + "}";
    }
}
