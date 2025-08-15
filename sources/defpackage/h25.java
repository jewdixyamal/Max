package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: h25  reason: default package */
public final class h25 implements Runnable {
    public static final String c = a14.O("EnqueueRunnable");
    public final g7g a;
    public final imc b;

    public h25(g7g g7g, imc imc) {
        this.a = g7g;
        this.b = imc;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x016b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.g7g r25) {
        /*
            r0 = r25
            r25.getClass()
            java.util.HashSet r1 = defpackage.g7g.N(r25)
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            long r3 = java.lang.System.currentTimeMillis()
            s7g r5 = r0.l
            androidx.work.impl.WorkDatabase r6 = r5.c
            if (r1 == 0) goto L_0x0021
            int r8 = r1.length
            if (r8 <= 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = r2
        L_0x0022:
            m7g r9 = defpackage.m7g.c
            m7g r10 = defpackage.m7g.Y
            m7g r11 = defpackage.m7g.o
            if (r8 == 0) goto L_0x0072
            int r12 = r1.length
            r13 = r2
            r15 = r13
            r16 = r15
            r14 = 1
        L_0x0030:
            if (r13 >= r12) goto L_0x0076
            r2 = r1[r13]
            i8g r7 = r6.y()
            h8g r7 = r7.l(r2)
            if (r7 != 0) goto L_0x005e
            a14 r1 = defpackage.a14.u()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Prerequisite "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " doesn't exist; not enqueuing"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = c
            r1.q(r3, r2)
        L_0x005a:
            r1 = 1
            r2 = 0
            goto L_0x02b6
        L_0x005e:
            m7g r2 = r7.b
            if (r2 != r9) goto L_0x0064
            r7 = 1
            goto L_0x0065
        L_0x0064:
            r7 = 0
        L_0x0065:
            r14 = r14 & r7
            if (r2 != r11) goto L_0x006b
            r16 = 1
            goto L_0x006e
        L_0x006b:
            if (r2 != r10) goto L_0x006e
            r15 = 1
        L_0x006e:
            int r13 = r13 + 1
            r2 = 0
            goto L_0x0030
        L_0x0072:
            r14 = 1
            r15 = 0
            r16 = 0
        L_0x0076:
            java.lang.String r2 = r0.m
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            r12 = 1
            r7 = r7 ^ r12
            m7g r12 = defpackage.m7g.a
            if (r7 == 0) goto L_0x01c0
            if (r8 != 0) goto L_0x01c0
            i8g r13 = r6.y()
            java.util.ArrayList r13 = r13.m(r2)
            boolean r17 = r13.isEmpty()
            if (r17 != 0) goto L_0x01c0
            r17 = r8
            h65 r8 = defpackage.h65.c
            r18 = r14
            h65 r14 = defpackage.h65.o
            r19 = r15
            h65 r15 = r0.n
            if (r15 == r8) goto L_0x00f3
            if (r15 != r14) goto L_0x00a3
            goto L_0x00f3
        L_0x00a3:
            h65 r8 = defpackage.h65.b
            if (r15 != r8) goto L_0x00c0
            java.util.Iterator r8 = r13.iterator()
        L_0x00ab:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c0
            java.lang.Object r9 = r8.next()
            f8g r9 = (defpackage.f8g) r9
            m7g r9 = r9.b
            if (r9 == r12) goto L_0x005a
            m7g r14 = defpackage.m7g.b
            if (r9 != r14) goto L_0x00ab
            goto L_0x005a
        L_0x00c0:
            my1 r8 = new my1
            r9 = 0
            r8.<init>(r5, r2, r9)
            r8.run()
            i8g r5 = r6.y()
            java.util.Iterator r8 = r13.iterator()
        L_0x00d1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e3
            java.lang.Object r9 = r8.next()
            f8g r9 = (defpackage.f8g) r9
            java.lang.String r9 = r9.a
            r5.e(r9)
            goto L_0x00d1
        L_0x00e3:
            r23 = r3
            r21 = r7
            r22 = r12
            r8 = r17
            r14 = r18
            r15 = r19
            r3 = 1
            r12 = 0
            goto L_0x01d4
        L_0x00f3:
            ph4 r5 = r6.t()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0100:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x017b
            java.lang.Object r17 = r13.next()
            r20 = r13
            r13 = r17
            f8g r13 = (defpackage.f8g) r13
            r21 = r7
            java.lang.String r7 = r13.a
            r5.getClass()
            r22 = r12
            java.lang.String r12 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r23 = r3
            r3 = 1
            xlc r4 = defpackage.xlc.a(r3, r12)
            if (r7 != 0) goto L_0x0128
            r4.W(r3)
            goto L_0x012b
        L_0x0128:
            r4.f(r3, r7)
        L_0x012b:
            java.lang.Object r3 = r5.a
            ilc r3 = (defpackage.ilc) r3
            r3.b()
            r7 = 0
            android.database.Cursor r3 = r3.o(r4, r7)
            boolean r7 = r3.moveToFirst()     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x0148
            r12 = 0
            int r7 = r3.getInt(r12)     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x0149
            r7 = 1
            goto L_0x014a
        L_0x0146:
            r0 = move-exception
            goto L_0x0174
        L_0x0148:
            r12 = 0
        L_0x0149:
            r7 = r12
        L_0x014a:
            r3.close()
            r4.n()
            if (r7 != 0) goto L_0x016b
            m7g r3 = r13.b
            if (r3 != r9) goto L_0x0158
            r4 = 1
            goto L_0x0159
        L_0x0158:
            r4 = r12
        L_0x0159:
            r4 = r18 & r4
            if (r3 != r11) goto L_0x0160
            r16 = 1
            goto L_0x0164
        L_0x0160:
            if (r3 != r10) goto L_0x0164
            r19 = 1
        L_0x0164:
            java.lang.String r3 = r13.a
            r8.add(r3)
            r18 = r4
        L_0x016b:
            r13 = r20
            r7 = r21
            r12 = r22
            r3 = r23
            goto L_0x0100
        L_0x0174:
            r3.close()
            r4.n()
            throw r0
        L_0x017b:
            r23 = r3
            r21 = r7
            r22 = r12
            r12 = 0
            if (r15 != r14) goto L_0x01ae
            if (r19 != 0) goto L_0x0188
            if (r16 == 0) goto L_0x01ae
        L_0x0188:
            i8g r3 = r6.y()
            java.util.ArrayList r4 = r3.m(r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x0194:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a6
            java.lang.Object r5 = r4.next()
            f8g r5 = (defpackage.f8g) r5
            java.lang.String r5 = r5.a
            r3.e(r5)
            goto L_0x0194
        L_0x01a6:
            java.util.List r8 = java.util.Collections.emptyList()
            r15 = r12
            r16 = r15
            goto L_0x01b0
        L_0x01ae:
            r15 = r19
        L_0x01b0:
            java.lang.Object[] r1 = r8.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x01bb
            r8 = 1
            goto L_0x01bc
        L_0x01bb:
            r8 = r12
        L_0x01bc:
            r3 = r12
            r14 = r18
            goto L_0x01d4
        L_0x01c0:
            r23 = r3
            r21 = r7
            r17 = r8
            r22 = r12
            r18 = r14
            r19 = r15
            r12 = 0
            r3 = r12
            r8 = r17
            r14 = r18
            r15 = r19
        L_0x01d4:
            java.util.List r4 = r0.o
            java.util.Iterator r4 = r4.iterator()
        L_0x01da:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b1
            java.lang.Object r5 = r4.next()
            androidx.work.WorkRequest r5 = (androidx.work.WorkRequest) r5
            h8g r7 = r5.getWorkSpec()
            if (r8 == 0) goto L_0x01ff
            if (r14 != 0) goto L_0x01ff
            if (r16 == 0) goto L_0x01f5
            r7.b = r11
        L_0x01f2:
            r12 = r23
            goto L_0x0203
        L_0x01f5:
            if (r15 == 0) goto L_0x01fa
            r7.b = r10
            goto L_0x01f2
        L_0x01fa:
            m7g r9 = defpackage.m7g.X
            r7.b = r9
            goto L_0x01f2
        L_0x01ff:
            r12 = r23
            r7.n = r12
        L_0x0203:
            m7g r9 = r7.b
            r17 = r3
            r3 = r22
            if (r9 != r3) goto L_0x020d
            r17 = 1
        L_0x020d:
            i8g r9 = r6.y()
            r22 = r3
            java.lang.Object r3 = r9.a
            ilc r3 = (defpackage.ilc) r3
            r3.b()
            r3.c()
            java.lang.Object r9 = r9.b     // Catch:{ all -> 0x02ac }
            x7g r9 = (defpackage.x7g) r9     // Catch:{ all -> 0x02ac }
            r9.C(r7)     // Catch:{ all -> 0x02ac }
            r3.r()     // Catch:{ all -> 0x02ac }
            r3.l()
            if (r8 == 0) goto L_0x0266
            int r3 = r1.length
            r9 = 0
        L_0x022e:
            if (r9 >= r3) goto L_0x0266
            r7 = r1[r9]
            r18 = r1
            mh4 r1 = new mh4
            r19 = r3
            java.lang.String r3 = r5.getStringId()
            r1.<init>(r3, r7)
            ph4 r3 = r6.t()
            java.lang.Object r7 = r3.a
            ilc r7 = (defpackage.ilc) r7
            r7.b()
            r7.c()
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x0261 }
            sh r3 = (defpackage.sh) r3     // Catch:{ all -> 0x0261 }
            r3.C(r1)     // Catch:{ all -> 0x0261 }
            r7.r()     // Catch:{ all -> 0x0261 }
            r7.l()
            int r9 = r9 + 1
            r1 = r18
            r3 = r19
            goto L_0x022e
        L_0x0261:
            r0 = move-exception
            r7.l()
            throw r0
        L_0x0266:
            r18 = r1
            k8g r1 = r6.z()
            java.lang.String r3 = r5.getStringId()
            java.util.Set r7 = r5.getTags()
            r1.v(r3, r7)
            if (r21 == 0) goto L_0x02a3
            y7g r1 = r6.w()
            w7g r3 = new w7g
            java.lang.String r5 = r5.getStringId()
            r3.<init>(r2, r5)
            java.lang.Object r5 = r1.b
            ilc r5 = (defpackage.ilc) r5
            r5.b()
            r5.c()
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x029e }
            x7g r1 = (defpackage.x7g) r1     // Catch:{ all -> 0x029e }
            r1.C(r3)     // Catch:{ all -> 0x029e }
            r5.r()     // Catch:{ all -> 0x029e }
            r5.l()
            goto L_0x02a3
        L_0x029e:
            r0 = move-exception
            r5.l()
            throw r0
        L_0x02a3:
            r23 = r12
            r3 = r17
            r1 = r18
            r12 = 0
            goto L_0x01da
        L_0x02ac:
            r0 = move-exception
            r3.l()
            throw r0
        L_0x02b1:
            r17 = r3
            r2 = r17
            r1 = 1
        L_0x02b6:
            r0.r = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h25.a(g7g):boolean");
    }

    public final void run() {
        boolean z;
        WorkDatabase workDatabase;
        imc imc = this.b;
        g7g g7g = this.a;
        try {
            g7g.getClass();
            s7g s7g = g7g.l;
            HashSet hashSet = new HashSet();
            hashSet.addAll(g7g.p);
            HashSet N = g7g.N(g7g);
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (N.contains((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    hashSet.removeAll(g7g.p);
                    z = false;
                    break;
                }
            }
            if (!z) {
                workDatabase = s7g.c;
                workDatabase.c();
                boolean a2 = a(g7g);
                workDatabase.r();
                workDatabase.l();
                if (a2) {
                    woa.a(s7g.a, RescheduleReceiver.class, true);
                    nuc.a(s7g.b, s7g.c, s7g.e);
                }
                imc.V(pma.Q);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + g7g + ")");
        } catch (Throwable th) {
            imc.V(new mma(th));
        }
    }
}
