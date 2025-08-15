package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* renamed from: hlc  reason: default package */
public final class hlc {
    public final Context a;
    public final Class b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public Executor g;
    public Executor h;
    public wde i;
    public boolean j;
    public final int k = 1;
    public boolean l = true;
    public boolean m;
    public final long n = -1;
    public final sy4 o = new sy4(26);
    public final LinkedHashSet p = new LinkedHashSet();
    public HashSet q;

    public hlc(Context context, String str, Class cls) {
        this.a = context;
        this.b = cls;
        this.c = str;
    }

    public final void a(da9... da9Arr) {
        if (this.q == null) {
            this.q = new HashSet();
        }
        for (da9 da9 : da9Arr) {
            this.q.add(Integer.valueOf(da9.a));
            this.q.add(Integer.valueOf(da9.b));
        }
        this.o.k((da9[]) Arrays.copyOf(da9Arr, da9Arr.length));
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b0 A[LOOP:6: B:100:0x027c->B:114:0x02b0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ilc b() {
        /*
            r20 = this;
            r0 = r20
            java.util.concurrent.Executor r1 = r0.g
            if (r1 != 0) goto L_0x0011
            java.util.concurrent.Executor r2 = r0.h
            if (r2 != 0) goto L_0x0011
            cs r1 = defpackage.ds.f
            r0.h = r1
            r0.g = r1
            goto L_0x0020
        L_0x0011:
            if (r1 == 0) goto L_0x001a
            java.util.concurrent.Executor r2 = r0.h
            if (r2 != 0) goto L_0x001a
            r0.h = r1
            goto L_0x0020
        L_0x001a:
            if (r1 != 0) goto L_0x0020
            java.util.concurrent.Executor r1 = r0.h
            r0.g = r1
        L_0x0020:
            java.util.HashSet r1 = r0.q
            java.util.LinkedHashSet r14 = r0.p
            r15 = 1
            if (r1 == 0) goto L_0x0057
            java.util.Iterator r1 = r1.iterator()
        L_0x002b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r14.contains(r3)
            r3 = r3 ^ r15
            if (r3 == 0) goto L_0x0047
            goto L_0x002b
        L_0x0047:
            java.lang.String r0 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
            java.lang.String r0 = defpackage.zr6.h(r2, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0057:
            wde r1 = r0.i
            if (r1 != 0) goto L_0x0062
            o84 r1 = new o84
            r2 = 11
            r1.<init>((int) r2)
        L_0x0062:
            r5 = r1
            long r1 = r0.n
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r2 = "Required value was null."
            if (r1 <= 0) goto L_0x0087
            java.lang.String r0 = r0.c
            if (r0 == 0) goto L_0x007b
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x007b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot create auto-closing database for an in-memory database."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0087:
            d34 r1 = new d34
            java.util.ArrayList r7 = r0.d
            boolean r8 = r0.j
            int r3 = r0.k
            if (r3 == 0) goto L_0x037e
            android.content.Context r4 = r0.a
            if (r3 == r15) goto L_0x0097
        L_0x0095:
            r9 = r3
            goto L_0x00b1
        L_0x0097:
            java.lang.String r3 = "activity"
            java.lang.Object r3 = r4.getSystemService(r3)
            boolean r6 = r3 instanceof android.app.ActivityManager
            if (r6 == 0) goto L_0x00a4
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            goto L_0x00a5
        L_0x00a4:
            r3 = 0
        L_0x00a5:
            if (r3 == 0) goto L_0x00af
            boolean r3 = r3.isLowRamDevice()
            if (r3 != 0) goto L_0x00af
            r9 = 3
            goto L_0x00b1
        L_0x00af:
            r3 = 2
            goto L_0x0095
        L_0x00b1:
            java.util.concurrent.Executor r10 = r0.g
            if (r10 == 0) goto L_0x0374
            java.util.concurrent.Executor r11 = r0.h
            if (r11 == 0) goto L_0x036a
            boolean r6 = r0.l
            boolean r3 = r0.m
            java.util.ArrayList r2 = r0.e
            java.util.ArrayList r15 = r0.f
            java.lang.String r12 = r0.c
            sy4 r13 = r0.o
            r18 = r2
            r2 = r1
            r19 = r3
            r3 = r4
            r4 = r12
            r12 = r6
            r6 = r13
            r13 = 3
            r17 = r1
            r1 = 0
            r13 = r19
            r16 = r15
            r1 = 1
            r15 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Class r0 = r0.b
            java.lang.Package r2 = r0.getPackage()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = r0.getCanonicalName()
            int r4 = r2.length()
            if (r4 != 0) goto L_0x00f1
            goto L_0x00fa
        L_0x00f1:
            int r4 = r2.length()
            int r4 = r4 + r1
            java.lang.String r3 = r3.substring(r4)
        L_0x00fa:
            r4 = 46
            r5 = 95
            java.lang.String r3 = r3.replace(r4, r5)
            java.lang.String r5 = "_Impl"
            java.lang.String r3 = r3.concat(r5)
            int r5 = r2.length()     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
            if (r5 != 0) goto L_0x0110
            r2 = r3
            goto L_0x0122
        L_0x0110:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
            r5.<init>()     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
            r5.append(r2)     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
            r5.append(r4)     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
            r5.append(r3)     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
            java.lang.String r2 = r5.toString()     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
        L_0x0122:
            java.lang.ClassLoader r4 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
            java.lang.Class r2 = java.lang.Class.forName(r2, r1, r4)     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
            r4 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
            java.lang.Object r0 = r2.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x0345, IllegalAccessException -> 0x032d, InstantiationException -> 0x0315 }
            ilc r0 = (defpackage.ilc) r0
            r2 = r17
            xde r3 = r0.f(r2)
            r0.d = r3
            java.util.Set r3 = r0.i()
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x014a:
            boolean r5 = r3.hasNext()
            java.util.LinkedHashMap r6 = r0.h
            r7 = -1
            java.util.List r8 = r2.n
            if (r5 == 0) goto L_0x01a7
            java.lang.Object r5 = r3.next()
            java.lang.Class r5 = (java.lang.Class) r5
            int r9 = r8.size()
            int r9 = r9 + r7
            if (r9 < 0) goto L_0x017c
        L_0x0162:
            int r10 = r9 + -1
            java.lang.Object r11 = r8.get(r9)
            java.lang.Class r11 = r11.getClass()
            boolean r11 = r5.isAssignableFrom(r11)
            if (r11 == 0) goto L_0x0177
            r4.set(r9)
            r7 = r9
            goto L_0x017c
        L_0x0177:
            if (r10 >= 0) goto L_0x017a
            goto L_0x017c
        L_0x017a:
            r9 = r10
            goto L_0x0162
        L_0x017c:
            if (r7 < 0) goto L_0x0186
            java.lang.Object r7 = r8.get(r7)
            r6.put(r5, r7)
            goto L_0x014a
        L_0x0186:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A required auto migration spec ("
            r0.<init>(r1)
            java.lang.String r1 = r5.getCanonicalName()
            r0.append(r1)
            java.lang.String r1 = ") is missing in the database configuration."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01a7:
            int r3 = r8.size()
            int r3 = r3 + r7
            if (r3 < 0) goto L_0x01c7
        L_0x01ae:
            int r5 = r3 + -1
            boolean r3 = r4.get(r3)
            if (r3 == 0) goto L_0x01bb
            if (r5 >= 0) goto L_0x01b9
            goto L_0x01c7
        L_0x01b9:
            r3 = r5
            goto L_0x01ae
        L_0x01bb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c7:
            java.util.List r3 = r0.g()
            java.util.Iterator r3 = r3.iterator()
        L_0x01cf:
            boolean r4 = r3.hasNext()
            r15 = 0
            if (r4 == 0) goto L_0x0210
            java.lang.Object r4 = r3.next()
            da9 r4 = (defpackage.da9) r4
            int r5 = r4.a
            sy4 r6 = r2.d
            java.lang.Object r8 = r6.b
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r9 = r8.containsKey(r9)
            if (r9 == 0) goto L_0x0206
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r8.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x01fc
            oz4 r5 = defpackage.oz4.a
        L_0x01fc:
            int r8 = r4.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r15 = r5.containsKey(r8)
        L_0x0206:
            if (r15 != 0) goto L_0x01cf
            da9[] r4 = new defpackage.da9[]{r4}
            r6.k(r4)
            goto L_0x01cf
        L_0x0210:
            java.lang.Class<dqc> r3 = defpackage.dqc.class
            xde r4 = r0.h()
            java.lang.Object r3 = defpackage.ilc.s(r3, r4)
            dqc r3 = (defpackage.dqc) r3
            java.lang.Class<v80> r3 = defpackage.v80.class
            xde r4 = r0.h()
            java.lang.Object r3 = defpackage.ilc.s(r3, r4)
            v80 r3 = (defpackage.v80) r3
            int r3 = r2.g
            r4 = 3
            if (r3 != r4) goto L_0x022f
            r3 = r1
            goto L_0x0230
        L_0x022f:
            r3 = r15
        L_0x0230:
            xde r4 = r0.h()
            r4.setWriteAheadLoggingEnabled(r3)
            java.util.List r3 = r2.e
            r0.g = r3
            java.util.concurrent.Executor r3 = r2.h
            r0.b = r3
            qm r3 = new qm
            java.util.concurrent.Executor r4 = r2.i
            r5 = 2
            r3.<init>(r4, r5)
            r0.c = r3
            boolean r3 = r2.f
            r0.f = r3
            java.util.Map r3 = r0.j()
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x025e:
            boolean r5 = r3.hasNext()
            java.util.List r6 = r2.m
            if (r5 == 0) goto L_0x02e3
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r8 = r5.getKey()
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x027c:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x025e
            java.lang.Object r9 = r5.next()
            java.lang.Class r9 = (java.lang.Class) r9
            int r10 = r6.size()
            int r10 = r10 + r7
            if (r10 < 0) goto L_0x02a8
        L_0x028f:
            int r11 = r10 + -1
            java.lang.Object r12 = r6.get(r10)
            java.lang.Class r12 = r12.getClass()
            boolean r12 = r9.isAssignableFrom(r12)
            if (r12 == 0) goto L_0x02a3
            r4.set(r10)
            goto L_0x02a9
        L_0x02a3:
            if (r11 >= 0) goto L_0x02a6
            goto L_0x02a8
        L_0x02a6:
            r10 = r11
            goto L_0x028f
        L_0x02a8:
            r10 = r7
        L_0x02a9:
            if (r10 < 0) goto L_0x02ad
            r11 = r1
            goto L_0x02ae
        L_0x02ad:
            r11 = r15
        L_0x02ae:
            if (r11 == 0) goto L_0x02ba
            java.util.LinkedHashMap r11 = r0.l
            java.lang.Object r10 = r6.get(r10)
            r11.put(r9, r10)
            goto L_0x027c
        L_0x02ba:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A required type converter ("
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ") for "
            r0.append(r1)
            java.lang.String r1 = r8.getCanonicalName()
            r0.append(r1)
            java.lang.String r1 = " is missing in the database configuration."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02e3:
            int r1 = r6.size()
            int r1 = r1 + r7
            if (r1 < 0) goto L_0x0314
        L_0x02ea:
            int r2 = r1 + -1
            boolean r3 = r4.get(r1)
            if (r3 == 0) goto L_0x02f7
            if (r2 >= 0) goto L_0x02f5
            goto L_0x0314
        L_0x02f5:
            r1 = r2
            goto L_0x02ea
        L_0x02f7:
            java.lang.Object r0 = r6.get(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected type converter "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0314:
            return r0
        L_0x0315:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to create an instance of "
            r2.<init>(r3)
            java.lang.String r0 = r0.getCanonicalName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x032d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot access the constructor "
            r2.<init>(r3)
            java.lang.String r0 = r0.getCanonicalName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0345:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot find implementation for "
            r2.<init>(r4)
            java.lang.String r0 = r0.getCanonicalName()
            r2.append(r0)
            java.lang.String r0 = ". "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " does not exist"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x036a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0374:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x037e:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hlc.b():ilc");
    }
}
