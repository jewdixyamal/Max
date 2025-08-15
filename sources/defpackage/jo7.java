package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Rational;
import android.util.Size;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;

/* renamed from: jo7  reason: default package */
public final class jo7 implements ko7, ed6, fd6, qj3, f1d, CapturerObserver, ifg {
    public static final b11 X = new b11(-9223372036854775807L, 2, 4, false);
    public static final b11 Y = new b11(-9223372036854775807L, 3, 4, false);
    public static volatile jo7 Z;
    public static final b11 o = new b11(-9223372036854775807L, 0, 4, false);
    public static final Object s0 = new Object();
    public Object a;
    public Object b;
    public Object c;

    public jo7(vd8 vd8, a aVar, FrameLayout frameLayout) {
        this.c = vd8;
        this.a = aVar;
        this.b = frameLayout;
    }

    public static b11 e(long j, boolean z) {
        return new b11(j, z ? 1 : 0, 4, false);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [jo7, java.lang.Object] */
    public static jo7 i(Context context) {
        if (Z == null) {
            synchronized (s0) {
                try {
                    if (Z == null) {
                        ? obj = new Object();
                        obj.c = context.getApplicationContext();
                        obj.b = new HashSet();
                        obj.a = new HashMap();
                        Z = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Z;
    }

    public static ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(lt.a);
        arrayList2.add(lt.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (lt.a(size, (Rational) it2.next(), msd.c)) {
                            break;
                        }
                    } else {
                        arrayList2.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational l(int i, boolean z) {
        if (i == 0) {
            return z ? lt.a : lt.b;
        }
        if (i != 1) {
            return null;
        }
        return z ? lt.c : lt.d;
    }

    public static HashMap m(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = j(arrayList).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (lt.a(size, rational, msd.c)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void t(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void u(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public synchronized void B(hd6 hd6, long j) {
        ((l0f) this.b).Q(hd6, j);
    }

    public void a() {
        eo7 eo7 = (eo7) this.b;
        np8.g(eo7);
        eo7.a(false);
    }

    public void accept(Object obj) {
        hm9.p(gn4.i, "MsgGetCmd failed", (Throwable) obj);
        ((gn4) this.a).c((e52) this.b, (n7d) this.c);
    }

    public void b(tue tue, pa5 pa5, l3f l3f) {
        this.b = tue;
        l3f.a();
        l3f.b();
        yze B = pa5.B(l3f.e, 5);
        this.c = B;
        B.e((qy5) this.a);
    }

    public void c() {
        IOException iOException;
        IOException iOException2 = (IOException) this.c;
        if (iOException2 == null) {
            eo7 eo7 = (eo7) this.b;
            if (eo7 != null && (iOException = eo7.o) != null && eo7.X > eo7.b) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public void d(wpa wpa) {
        long d;
        long j;
        fm9.l((tue) this.b);
        int i = oaf.a;
        tue tue = (tue) this.b;
        synchronized (tue) {
            try {
                long j2 = tue.c;
                d = j2 != -9223372036854775807L ? j2 + tue.b : tue.d();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        tue tue2 = (tue) this.b;
        synchronized (tue2) {
            j = tue2.b;
        }
        if (d != -9223372036854775807L && j != -9223372036854775807L) {
            qy5 qy5 = (qy5) this.a;
            if (j != qy5.s) {
                ny5 a2 = qy5.a();
                a2.r = j;
                qy5 qy52 = new qy5(a2);
                this.a = qy52;
                ((yze) this.c).e(qy52);
            }
            int a3 = wpa.a();
            ((yze) this.c).b(wpa, a3, 0);
            ((yze) this.c).a(d, 1, a3, 0, (wze) null);
        }
    }

    public void f(Bundle bundle) {
        HashSet hashSet;
        String string = ((Context) this.c).getString(e2c.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = (HashSet) this.b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (x07.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    g((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object g(Class cls, HashSet hashSet) {
        Object obj;
        if (hye.a()) {
            try {
                Trace.beginSection(c37.F(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = (HashMap) this.a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                x07 x07 = (x07) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a2 = x07.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            g(cls2, hashSet);
                        }
                    }
                }
                obj = x07.b((Context) this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    public synchronized void h() {
        ((l0f) this.b).h();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.util.Size} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        if (defpackage.msd.a(r3) < (r4.getHeight() * r4.getWidth())) goto L_0x00b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList k(defpackage.o9f r13) {
        /*
            r12 = this;
            r0 = r13
            ev6 r0 = (defpackage.ev6) r0
            aa0 r1 = defpackage.ev6.K
            r2 = 0
            java.lang.Object r1 = r0.f(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0014
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            goto L_0x0015
        L_0x0014:
            r3 = r2
        L_0x0015:
            if (r3 == 0) goto L_0x0018
            return r3
        L_0x0018:
            aa0 r1 = defpackage.ev6.J
            java.lang.Object r1 = r0.f(r1, r2)
            kic r1 = (defpackage.kic) r1
            aa0 r3 = defpackage.ev6.I
            java.lang.Object r3 = r0.f(r3, r2)
            java.util.List r3 = (java.util.List) r3
            int r4 = r13.getInputFormat()
            if (r3 == 0) goto L_0x004d
            java.util.Iterator r3 = r3.iterator()
        L_0x0032:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r3.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r6 = r5.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != r4) goto L_0x0032
            java.lang.Object r3 = r5.second
            android.util.Size[] r3 = (android.util.Size[]) r3
            goto L_0x004e
        L_0x004d:
            r3 = r2
        L_0x004e:
            if (r3 != 0) goto L_0x0052
            r3 = r2
            goto L_0x0056
        L_0x0052:
            java.util.List r3 = java.util.Arrays.asList(r3)
        L_0x0056:
            java.lang.Object r5 = r12.a
            yw1 r5 = (defpackage.yw1) r5
            if (r3 != 0) goto L_0x0060
            java.util.List r3 = r5.q(r4)
        L_0x0060:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            x93 r3 = new x93
            r6 = 1
            r3.<init>(r6)
            java.util.Collections.sort(r4, r3)
            r4.isEmpty()
            r3 = 0
            if (r1 != 0) goto L_0x0211
            java.lang.Object r12 = r12.c
            yd9 r12 = (defpackage.yd9) r12
            r12.getClass()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0083
            goto L_0x01ec
        L_0x0083:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            x93 r1 = new x93
            r1.<init>(r6)
            java.util.Collections.sort(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ev6 r13 = (defpackage.ev6) r13
            aa0 r4 = defpackage.ev6.H
            java.lang.Object r4 = r13.f(r4, r2)
            android.util.Size r4 = (android.util.Size) r4
            java.lang.Object r3 = r0.get(r3)
            android.util.Size r3 = (android.util.Size) r3
            if (r4 == 0) goto L_0x00b6
            int r5 = defpackage.msd.a(r3)
            int r7 = r4.getWidth()
            int r8 = r4.getHeight()
            int r8 = r8 * r7
            if (r5 >= r8) goto L_0x00b7
        L_0x00b6:
            r4 = r3
        L_0x00b7:
            android.util.Size r3 = r12.a(r13)
            android.util.Size r5 = defpackage.msd.c
            int r7 = defpackage.msd.a(r5)
            int r8 = defpackage.msd.a(r4)
            if (r8 >= r7) goto L_0x00ca
            android.util.Size r5 = defpackage.msd.a
            goto L_0x00d8
        L_0x00ca:
            if (r3 == 0) goto L_0x00d8
            int r8 = r3.getWidth()
            int r9 = r3.getHeight()
            int r9 = r9 * r8
            if (r9 >= r7) goto L_0x00d8
            r5 = r3
        L_0x00d8:
            java.util.Iterator r7 = r0.iterator()
        L_0x00dc:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0110
            java.lang.Object r8 = r7.next()
            android.util.Size r8 = (android.util.Size) r8
            int r9 = defpackage.msd.a(r8)
            int r10 = r4.getWidth()
            int r11 = r4.getHeight()
            int r11 = r11 * r10
            if (r9 > r11) goto L_0x00dc
            int r9 = r8.getWidth()
            int r10 = r8.getHeight()
            int r10 = r10 * r9
            int r9 = defpackage.msd.a(r5)
            if (r10 < r9) goto L_0x00dc
            boolean r9 = r1.contains(r8)
            if (r9 != 0) goto L_0x00dc
            r1.add(r8)
            goto L_0x00dc
        L_0x0110:
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L_0x01ed
            aa0 r0 = defpackage.ev6.B
            boolean r4 = r13.o(r0)
            if (r4 == 0) goto L_0x012f
            java.lang.Object r0 = r13.h(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r4 = r12.c
            android.util.Rational r0 = l(r0, r4)
            goto L_0x0163
        L_0x012f:
            android.util.Size r0 = r12.a(r13)
            if (r0 == 0) goto L_0x0162
            java.util.ArrayList r4 = j(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x013d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0153
            java.lang.Object r5 = r4.next()
            android.util.Rational r5 = (android.util.Rational) r5
            android.util.Size r7 = defpackage.msd.c
            boolean r7 = defpackage.lt.a(r0, r5, r7)
            if (r7 == 0) goto L_0x013d
            r0 = r5
            goto L_0x0163
        L_0x0153:
            android.util.Rational r4 = new android.util.Rational
            int r5 = r0.getWidth()
            int r0 = r0.getHeight()
            r4.<init>(r5, r0)
            r0 = r4
            goto L_0x0163
        L_0x0162:
            r0 = r2
        L_0x0163:
            if (r3 != 0) goto L_0x016e
            aa0 r3 = defpackage.ev6.G
            java.lang.Object r13 = r13.f(r3, r2)
            r3 = r13
            android.util.Size r3 = (android.util.Size) r3
        L_0x016e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            if (r0 != 0) goto L_0x0183
            r4.addAll(r1)
            if (r3 == 0) goto L_0x01ec
            t(r4, r3, r6)
            goto L_0x01ec
        L_0x0183:
            java.util.HashMap r13 = m(r1)
            if (r3 == 0) goto L_0x01a7
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0191:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01a7
            java.lang.Object r2 = r1.next()
            android.util.Rational r2 = (android.util.Rational) r2
            java.lang.Object r2 = r13.get(r2)
            java.util.List r2 = (java.util.List) r2
            t(r2, r3, r6)
            goto L_0x0191
        L_0x01a7:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r13.keySet()
            r1.<init>(r2)
            kt r2 = new kt
            java.io.Serializable r12 = r12.o
            android.util.Rational r12 = (android.util.Rational) r12
            r2.<init>((android.util.Rational) r0, (android.util.Rational) r12)
            java.util.Collections.sort(r1, r2)
            java.util.Iterator r12 = r1.iterator()
        L_0x01c0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r0 = r12.next()
            android.util.Rational r0 = (android.util.Rational) r0
            java.lang.Object r0 = r13.get(r0)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01d6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c0
            java.lang.Object r1 = r0.next()
            android.util.Size r1 = (android.util.Size) r1
            boolean r2 = r4.contains(r1)
            if (r2 != 0) goto L_0x01d6
            r4.add(r1)
            goto L_0x01d6
        L_0x01ec:
            return r4
        L_0x01ed:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = "
            r13.<init>(r1)
            r13.append(r5)
            java.lang.String r1 = "\nmaxSize = "
            r13.append(r1)
            r13.append(r4)
            java.lang.String r1 = "\ninitial size list: "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0211:
            r7 = r13
            ev6 r7 = (defpackage.ev6) r7
            aa0 r8 = defpackage.ev6.H
            java.lang.Object r2 = r7.f(r8, r2)
            android.util.Size r2 = (android.util.Size) r2
            r0.f0(r3)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            aa0 r8 = defpackage.o9f.n0
            java.lang.Object r7 = r13.f(r8, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x024f
            int r13 = r13.getInputFormat()
            int r1 = r1.c
            if (r1 != r6) goto L_0x024f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r4)
            java.util.List r13 = r5.k(r13)
            r1.addAll(r13)
            x93 r13 = new x93
            r13.<init>(r6)
            java.util.Collections.sort(r1, r13)
            r4 = r1
        L_0x024f:
            aa0 r13 = defpackage.ev6.J
            java.lang.Object r13 = r0.h(r13)
            kic r13 = (defpackage.kic) r13
            fm5 r0 = r13.a
            java.util.HashMap r1 = m(r4)
            java.lang.Object r12 = r12.b
            android.util.Rational r12 = (android.util.Rational) r12
            if (r12 == 0) goto L_0x026d
            int r4 = r12.getNumerator()
            int r5 = r12.getDenominator()
            if (r4 < r5) goto L_0x026f
        L_0x026d:
            r4 = r6
            goto L_0x0270
        L_0x026f:
            r4 = r3
        L_0x0270:
            int r0 = r0.b
            android.util.Rational r0 = l(r0, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.Set r5 = r1.keySet()
            r4.<init>(r5)
            kt r5 = new kt
            r5.<init>((android.util.Rational) r0, (android.util.Rational) r12)
            java.util.Collections.sort(r4, r5)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Iterator r0 = r4.iterator()
        L_0x0290:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02a6
            java.lang.Object r4 = r0.next()
            android.util.Rational r4 = (android.util.Rational) r4
            java.lang.Object r5 = r1.get(r4)
            java.util.List r5 = (java.util.List) r5
            r12.put(r4, r5)
            goto L_0x0290
        L_0x02a6:
            if (r2 == 0) goto L_0x02f3
            android.util.Size r0 = defpackage.msd.a
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            int r1 = r1 * r0
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02bb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02f3
            java.lang.Object r2 = r0.next()
            android.util.Rational r2 = (android.util.Rational) r2
            java.lang.Object r2 = r12.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r2.iterator()
        L_0x02d6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02ec
            java.lang.Object r7 = r5.next()
            android.util.Size r7 = (android.util.Size) r7
            int r8 = defpackage.msd.a(r7)
            if (r8 > r1) goto L_0x02d6
            r4.add(r7)
            goto L_0x02d6
        L_0x02ec:
            r2.clear()
            r2.addAll(r4)
            goto L_0x02bb
        L_0x02f3:
            lic r13 = r13.b
            if (r13 != 0) goto L_0x02f8
            goto L_0x0351
        L_0x02f8:
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0300:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0351
            java.lang.Object r1 = r0.next()
            android.util.Rational r1 = (android.util.Rational) r1
            java.lang.Object r1 = r12.get(r1)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0319
            goto L_0x0300
        L_0x0319:
            lic r2 = defpackage.lic.c
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x0322
            goto L_0x0300
        L_0x0322:
            int r2 = r13.b
            android.util.Size r4 = r13.a
            if (r2 == 0) goto L_0x0344
            if (r2 == r6) goto L_0x0340
            r5 = 2
            if (r2 == r5) goto L_0x033c
            r5 = 3
            if (r2 == r5) goto L_0x0338
            r5 = 4
            if (r2 == r5) goto L_0x0334
            goto L_0x0300
        L_0x0334:
            u(r1, r4, r3)
            goto L_0x0300
        L_0x0338:
            u(r1, r4, r6)
            goto L_0x0300
        L_0x033c:
            t(r1, r4, r3)
            goto L_0x0300
        L_0x0340:
            t(r1, r4, r6)
            goto L_0x0300
        L_0x0344:
            boolean r2 = r1.contains(r4)
            r1.clear()
            if (r2 == 0) goto L_0x0300
            r1.add(r4)
            goto L_0x0300
        L_0x0351:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L_0x035e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0384
            java.lang.Object r0 = r12.next()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x036e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x035e
            java.lang.Object r1 = r0.next()
            android.util.Size r1 = (android.util.Size) r1
            boolean r2 = r13.contains(r1)
            if (r2 != 0) goto L_0x036e
            r13.add(r1)
            goto L_0x036e
        L_0x0384:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo7.k(o9f):java.util.ArrayList");
    }

    public boolean n() {
        return ((IOException) this.c) != null;
    }

    public boolean o() {
        return ((eo7) this.b) != null;
    }

    public void onCapturerStarted(boolean z) {
        if (z) {
            ((py0) ((u5e) this.b).a).V0.log("OKRTCCall", "Screen capture has started, fast=true");
        }
    }

    public void onCapturerStopped() {
        ((u5e) this.b).b(true);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        if (videoFrame != null) {
            ((dnc) this.a).getClass();
        } else {
            videoFrame = null;
        }
        CapturerObserver capturerObserver = (CapturerObserver) this.c;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    public void p(ho7 ho7) {
        eo7 eo7 = (eo7) this.b;
        if (eo7 != null) {
            eo7.a(true);
        }
        ExecutorService executorService = (ExecutorService) this.a;
        if (ho7 != null) {
            executorService.execute(new q57(5, ho7));
        }
        executorService.shutdown();
    }

    public synchronized void q() {
        ((l0f) this.b).S();
    }

    public Object r() {
        Object r = ((ifg) this.a).r();
        cgg cgg = (cgg) ((ifg) this.b).r();
        Context context = (Context) ((zig) ((ifg) this.c)).a.b;
        if (context != null) {
            return new fig((fkg) r, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public void s(hd6 hd6) {
        ((nx0) this.c).v(new i12(this, 0, hd6));
    }

    public synchronized void v() {
        ((l0f) this.b).v();
        gd6 gd6 = (gd6) this.a;
        Objects.requireNonNull(gd6);
        ((nx0) this.c).v(new j12(gd6, 0));
    }

    public long w(fo7 fo7, co7 co7, int i) {
        Looper myLooper = Looper.myLooper();
        np8.g(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        eo7 eo7 = new eo7(this, myLooper, fo7, co7, i, elapsedRealtime, 0);
        np8.f(((eo7) this.b) == null);
        this.b = eo7;
        eo7.o = null;
        ((ExecutorService) this.a).execute(eo7);
        return elapsedRealtime;
    }

    public /* synthetic */ jo7(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public jo7(va8 va8, gd6 gd6, gd6 gd62, nx0 nx0) {
        this.a = gd6;
        this.b = new l0f(va8, gd62, nx0);
        this.c = nx0;
    }

    public jo7(yw1 yw1, Size size) {
        Rational rational;
        this.a = yw1;
        yw1.b();
        yw1.g();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List q = yw1.q(256);
            if (q.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(q, new x93(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.b = rational;
        this.c = new yd9(yw1, rational);
    }

    public jo7(String str, int i) {
        switch (i) {
            case 10:
                ny5 ny5 = new ny5();
                ny5.m = ia9.l(str);
                this.a = new qy5(ny5);
                return;
            default:
                String concat = str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:");
                int i2 = maf.a;
                this.a = Executors.newSingleThreadExecutor(new pd3(1, concat));
                return;
        }
    }
}
