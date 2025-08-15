package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bdc  reason: default package */
public final class bdc implements kdf {
    public final sqb b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, adb] */
    /* JADX WARNING: type inference failed for: r6v6, types: [kad] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bdc(int r6, defpackage.yw1 r7) {
        /*
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.d = r0
            r0 = 1
            if (r6 == 0) goto L_0x0019
            if (r6 != r0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r1 = 0
            goto L_0x001a
        L_0x0019:
            r1 = r0
        L_0x001a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Not a supported video capabilities source: "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            defpackage.c54.j(r2, r1)
            e15 r1 = r7.o()
            bj6 r2 = defpackage.xi4.a
            djb r3 = new djb
            r3.<init>((defpackage.yw1) r7, (defpackage.e15) r1, (defpackage.bj6) r2)
            if (r6 != r0) goto L_0x0053
            kad r6 = new kad
            mb0 r0 = defpackage.mb0.d
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = defpackage.mb0.l
            r0.<init>(r1)
            eu4 r1 = defpackage.eu4.d
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r4 = 34
            java.util.List r4 = r7.q(r4)
            r6.<init>((defpackage.djb) r3, (java.util.ArrayList) r0, (java.util.Set) r1, (java.util.List) r4)
            r3 = r6
        L_0x0053:
            adb r6 = new adb
            r6.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.c = r0
            r6.a = r3
            r6.b = r2
            java.util.Set r0 = r7.a()
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0094
            java.lang.Object r1 = r0.next()
            eu4 r1 = (defpackage.eu4) r1
            int r3 = r1.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x006b
            r3 = 10
            int r1 = r1.b
            if (r1 != r3) goto L_0x006b
            pl8 r0 = new pl8
            r0.<init>((defpackage.adb) r6)
            r6 = r0
        L_0x0094:
            sqb r0 = new sqb
            r0.<init>(r7, r6, r2)
            r5.b = r0
            java.util.Set r6 = r7.a()
            java.util.Iterator r6 = r6.iterator()
        L_0x00a3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r6.next()
            eu4 r0 = (defpackage.eu4) r0
            pl8 r1 = new pl8
            sqb r2 = r5.b
            r1.<init>((defpackage.e15) r2, (defpackage.eu4) r0)
            fz1 r2 = new fz1
            r2.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.LinkedHashMap r3 = r2.a
            java.util.Set r3 = r3.keySet()
            r1.<init>(r3)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00a3
            java.util.HashMap r1 = r5.c
            r1.put(r0, r2)
            goto L_0x00a3
        L_0x00d2:
            r7.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdc.<init>(int, yw1):void");
    }

    public final nc0 a(Size size, eu4 eu4) {
        fz1 d2 = d(eu4);
        if (d2 == null) {
            return null;
        }
        return d2.a(size);
    }

    public final nc0 b(mb0 mb0, eu4 eu4) {
        fz1 d2 = d(eu4);
        if (d2 == null) {
            return null;
        }
        return d2.b(mb0);
    }

    public final ArrayList c(eu4 eu4) {
        fz1 d2 = d(eu4);
        return d2 == null ? new ArrayList() : new ArrayList(d2.a.keySet());
    }

    public final fz1 d(eu4 eu4) {
        boolean z;
        Object obj;
        boolean b2 = eu4.b();
        HashMap hashMap = this.c;
        if (b2) {
            return (fz1) hashMap.get(eu4);
        }
        HashMap hashMap2 = this.d;
        if (hashMap2.containsKey(eu4)) {
            return (fz1) hashMap2.get(eu4);
        }
        Set keySet = hashMap.keySet();
        fz1 fz1 = null;
        if (eu4.b()) {
            z = keySet.contains(eu4);
        } else {
            Iterator it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                eu4 eu42 = (eu4) obj;
                c54.p("Fully specified range is not actually fully specified.", eu42.b());
                int i = eu4.b;
                if (i == 0 || i == eu42.b) {
                    c54.p("Fully specified range is not actually fully specified.", eu42.b());
                    int i2 = eu4.a;
                    if (i2 != 0) {
                        int i3 = eu42.a;
                        if ((i2 == 2 && i3 != 1) || i2 == i3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = obj != null;
        }
        if (z) {
            fz1 = new fz1(new pl8((e15) this.b, eu4));
        }
        hashMap2.put(eu4, fz1);
        return fz1;
    }
}
