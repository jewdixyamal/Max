package defpackage;

import java.util.Comparator;

/* renamed from: fs4  reason: default package */
public final class fs4 implements Comparator {
    public static final fs4 X = new fs4(3);
    public static final fs4 Y = new fs4(4);
    public static final /* synthetic */ fs4 Z = new fs4(5);
    public static final fs4 b = new fs4(0);
    public static final fs4 c = new fs4(1);
    public static final fs4 o = new fs4(2);
    public final /* synthetic */ int a;

    public /* synthetic */ fs4(int i) {
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (r6 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r6 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015b, code lost:
        if (defpackage.tpa.m(r4, r5) < 0) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015e, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016d, code lost:
        if (r6 < r7) goto L_0x015f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = -1
            r2 = 1
            r3 = 0
            int r6 = r6.a
            switch(r6) {
                case 0: goto L_0x026d;
                case 1: goto L_0x0260;
                case 2: goto L_0x0253;
                case 3: goto L_0x0246;
                case 4: goto L_0x0223;
                case 5: goto L_0x0216;
                case 6: goto L_0x020c;
                case 7: goto L_0x0209;
                case 8: goto L_0x01fc;
                case 9: goto L_0x01ef;
                case 10: goto L_0x01da;
                case 11: goto L_0x01c5;
                case 12: goto L_0x01b0;
                case 13: goto L_0x019b;
                case 14: goto L_0x0186;
                case 15: goto L_0x0171;
                case 16: goto L_0x013a;
                case 17: goto L_0x012c;
                case 18: goto L_0x011f;
                case 19: goto L_0x0104;
                case 20: goto L_0x00da;
                case 21: goto L_0x00c5;
                case 22: goto L_0x00b4;
                case 23: goto L_0x009b;
                case 24: goto L_0x0091;
                case 25: goto L_0x007c;
                case 26: goto L_0x0048;
                case 27: goto L_0x002f;
                case 28: goto L_0x0016;
                default: goto L_0x0009;
            }
        L_0x0009:
            o9e r7 = (defpackage.o9e) r7
            java.lang.String r6 = r7.a
            o9e r8 = (defpackage.o9e) r8
            java.lang.String r7 = r8.a
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x0016:
            es8 r7 = (defpackage.es8) r7
            long r6 = r7.k()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            es8 r8 = (defpackage.es8) r8
            long r7 = r8.k()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x002f:
            es8 r7 = (defpackage.es8) r7
            long r6 = r7.k()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            es8 r8 = (defpackage.es8) r8
            long r7 = r8.k()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x0048:
            ba6 r7 = (defpackage.ba6) r7
            ba6 r8 = (defpackage.ba6) r8
            androidx.recyclerview.widget.RecyclerView r6 = r7.d
            if (r6 != 0) goto L_0x0052
            r0 = r2
            goto L_0x0053
        L_0x0052:
            r0 = r3
        L_0x0053:
            androidx.recyclerview.widget.RecyclerView r4 = r8.d
            if (r4 != 0) goto L_0x0059
            r4 = r2
            goto L_0x005a
        L_0x0059:
            r4 = r3
        L_0x005a:
            if (r0 == r4) goto L_0x0061
            if (r6 != 0) goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            r3 = r1
            goto L_0x007b
        L_0x0061:
            boolean r6 = r7.a
            boolean r0 = r8.a
            if (r6 == r0) goto L_0x006a
            if (r6 == 0) goto L_0x005e
            goto L_0x005f
        L_0x006a:
            int r6 = r8.b
            int r0 = r7.b
            int r6 = r6 - r0
            if (r6 == 0) goto L_0x0073
        L_0x0071:
            r3 = r6
            goto L_0x007b
        L_0x0073:
            int r6 = r7.c
            int r7 = r8.c
            int r6 = r6 - r7
            if (r6 == 0) goto L_0x007b
            goto L_0x0071
        L_0x007b:
            return r3
        L_0x007c:
            gl4 r8 = (defpackage.gl4) r8
            long r0 = r8.a
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            gl4 r7 = (defpackage.gl4) r7
            long r7 = r7.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x0091:
            vj4 r7 = (defpackage.vj4) r7
            vj4 r8 = (defpackage.vj4) r8
            int r6 = r7.a
            int r7 = r8.a
            int r6 = r6 - r7
            return r6
        L_0x009b:
            l94 r7 = (defpackage.l94) r7
            l94 r8 = (defpackage.l94) r8
            long r6 = r7.a()
            long r4 = r8.a()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00b2
            r1 = r3
            goto L_0x00b3
        L_0x00b2:
            r1 = r2
        L_0x00b3:
            return r1
        L_0x00b4:
            java.lang.Thread r7 = (java.lang.Thread) r7
            java.lang.String r6 = r7.getName()
            java.lang.Thread r8 = (java.lang.Thread) r8
            java.lang.String r7 = r8.getName()
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x00c5:
            qy3 r7 = (defpackage.qy3) r7
            long r6 = r7.a
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            qy3 r8 = (defpackage.qy3) r8
            long r7 = r8.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x00da:
            java.lang.Thread r7 = (java.lang.Thread) r7
            java.lang.Thread r8 = (java.lang.Thread) r8
            if (r7 == 0) goto L_0x00e5
            java.lang.String r6 = r7.getName()
            goto L_0x00e6
        L_0x00e5:
            r6 = r0
        L_0x00e6:
            java.lang.String r3 = "main"
            boolean r6 = defpackage.tpa.f(r6, r3)
            if (r6 == 0) goto L_0x00ef
            goto L_0x0103
        L_0x00ef:
            if (r8 == 0) goto L_0x00f5
            java.lang.String r0 = r8.getName()
        L_0x00f5:
            boolean r6 = defpackage.tpa.f(r0, r3)
            if (r6 == 0) goto L_0x00fd
            r1 = r2
            goto L_0x0103
        L_0x00fd:
            yw2 r6 = defpackage.sy4.o
            int r1 = r6.compare(r7, r8)
        L_0x0103:
            return r1
        L_0x0104:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r6 = defpackage.zmf.a
            float r6 = defpackage.omf.m(r7)
            float r7 = defpackage.omf.m(r8)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x0117
            goto L_0x011e
        L_0x0117:
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x011d
            r1 = r2
            goto L_0x011e
        L_0x011d:
            r1 = r3
        L_0x011e:
            return r1
        L_0x011f:
            pua r7 = (defpackage.pua) r7
            java.lang.String r6 = r7.b
            pua r8 = (defpackage.pua) r8
            java.lang.String r7 = r8.b
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x012c:
            f63 r7 = (defpackage.f63) r7
            f63 r8 = (defpackage.f63) r8
            int r6 = r8.b()
            int r7 = r7.b()
            int r6 = r6 - r7
            return r6
        L_0x013a:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            int r6 = r7.length()
            int r0 = r8.length()
            int r6 = java.lang.Math.min(r6, r0)
            r0 = 4
        L_0x014b:
            if (r0 >= r6) goto L_0x0163
            char r4 = r7.charAt(r0)
            char r5 = r8.charAt(r0)
            if (r4 == r5) goto L_0x0161
            int r6 = defpackage.tpa.m(r4, r5)
            if (r6 >= 0) goto L_0x015e
            goto L_0x015f
        L_0x015e:
            r1 = r2
        L_0x015f:
            r3 = r1
            goto L_0x0170
        L_0x0161:
            int r0 = r0 + r2
            goto L_0x014b
        L_0x0163:
            int r6 = r7.length()
            int r7 = r8.length()
            if (r6 == r7) goto L_0x0170
            if (r6 >= r7) goto L_0x015e
            goto L_0x015f
        L_0x0170:
            return r3
        L_0x0171:
            nn3 r8 = (defpackage.nn3) r8
            boolean r6 = r8.s0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            nn3 r7 = (defpackage.nn3) r7
            boolean r7 = r7.s0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x0186:
            nl2 r8 = (defpackage.nl2) r8
            long r0 = r8.v0
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            nl2 r7 = (defpackage.nl2) r7
            long r7 = r7.v0
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x019b:
            rw8 r7 = (defpackage.rw8) r7
            long r6 = r7.i
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            rw8 r8 = (defpackage.rw8) r8
            long r7 = r8.i
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x01b0:
            ve1 r7 = (defpackage.ve1) r7
            boolean r6 = r7.X
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            ve1 r8 = (defpackage.ve1) r8
            boolean r7 = r8.X
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x01c5:
            ve1 r7 = (defpackage.ve1) r7
            boolean r6 = r7.o
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            ve1 r8 = (defpackage.ve1) r8
            boolean r7 = r8.o
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x01da:
            u51 r8 = (defpackage.u51) r8
            long r0 = r8.a
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            u51 r7 = (defpackage.u51) r7
            long r7 = r7.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x01ef:
            uo0 r7 = (defpackage.uo0) r7
            uo0 r8 = (defpackage.uo0) r8
            int r6 = r7.a
            int r7 = r8.a
            int r6 = java.lang.Integer.compare(r6, r7)
            return r6
        L_0x01fc:
            dl r7 = (defpackage.dl) r7
            java.lang.String r6 = r7.a
            dl r8 = (defpackage.dl) r8
            java.lang.String r7 = r8.a
            int r6 = defpackage.xfg.f(r6, r7)
            return r6
        L_0x0209:
            xh r7 = (defpackage.xh) r7
            throw r0
        L_0x020c:
            int[] r7 = (int[]) r7
            int[] r8 = (int[]) r8
            r6 = r7[r3]
            r7 = r8[r3]
            int r6 = r6 - r7
            return r6
        L_0x0216:
            com.google.android.gms.common.api.Scope r7 = (com.google.android.gms.common.api.Scope) r7
            com.google.android.gms.common.api.Scope r8 = (com.google.android.gms.common.api.Scope) r8
            java.lang.String r6 = r7.b
            java.lang.String r7 = r8.b
            int r6 = r6.compareTo(r7)
            return r6
        L_0x0223:
            jn8 r7 = (defpackage.jn8) r7
            jn8 r8 = (defpackage.jn8) r8
            boolean r6 = r7.u0
            boolean r0 = r8.u0
            if (r6 == r0) goto L_0x0232
            int r6 = java.lang.Boolean.compare(r0, r6)
            goto L_0x0245
        L_0x0232:
            boolean r6 = r7.t0
            boolean r0 = r8.t0
            if (r6 == r0) goto L_0x023d
            int r6 = java.lang.Boolean.compare(r0, r6)
            goto L_0x0245
        L_0x023d:
            long r0 = r8.Y
            long r6 = r7.Y
            int r6 = defpackage.tpa.n(r0, r6)
        L_0x0245:
            return r6
        L_0x0246:
            dh8 r7 = (defpackage.dh8) r7
            dh8 r8 = (defpackage.dh8) r8
            java.lang.String r6 = r7.d
            java.lang.String r7 = r8.d
            int r6 = r6.compareToIgnoreCase(r7)
            return r6
        L_0x0253:
            dh8 r7 = (defpackage.dh8) r7
            dh8 r8 = (defpackage.dh8) r8
            java.lang.String r6 = r7.d
            java.lang.String r7 = r8.d
            int r6 = r6.compareToIgnoreCase(r7)
            return r6
        L_0x0260:
            dh8 r7 = (defpackage.dh8) r7
            dh8 r8 = (defpackage.dh8) r8
            java.lang.String r6 = r7.d
            java.lang.String r7 = r8.d
            int r6 = r6.compareToIgnoreCase(r7)
            return r6
        L_0x026d:
            ls4 r7 = (defpackage.ls4) r7
            ls4 r8 = (defpackage.ls4) r8
            java.lang.String r6 = r7.a
            java.lang.String r0 = r8.a
            int r6 = r6.compareTo(r0)
            if (r6 == 0) goto L_0x027d
        L_0x027b:
            r3 = r6
            goto L_0x0288
        L_0x027d:
            java.lang.String r6 = r7.b
            java.lang.String r7 = r8.b
            int r6 = r6.compareTo(r7)
            if (r6 == 0) goto L_0x0288
            goto L_0x027b
        L_0x0288:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs4.compare(java.lang.Object, java.lang.Object):int");
    }
}
