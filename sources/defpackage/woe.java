package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: woe  reason: default package */
public final class woe implements xn0 {
    public static final char[] m = new char[0];
    public final /* synthetic */ int a = 1;
    public boolean b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public woe(String str, re6 re6, te teVar, u26 u26, boolean z) {
        this.h = re6;
        this.i = teVar;
        this.j = u26;
        this.b = z;
        this.c = str == null ? String.valueOf(hashCode()) : str;
        this.d = re6.s0();
        this.e = re6.o0();
        int c2 = (int) ote.c(TimeUnit.SECONDS.toMillis(1) / ((long) (((ue) re6.b).a / re6.x())), 1);
        this.f = c2;
        this.g = c2;
        this.l = new v26(this);
    }

    public char[] a(int i2) {
        mt0 mt0 = (mt0) this.h;
        return mt0 != null ? mt0.a(2, i2) : new char[Math.max(i2, 500)];
    }

    public jt b(int i2, int i3) {
        boolean z = this.b;
        int i4 = this.e;
        int i5 = this.d;
        if (!z) {
            return new jt(i5, i4, 2);
        }
        if (i2 < i5 || i3 < i4) {
            double d2 = ((double) i5) / ((double) i4);
            if (i3 > i2) {
                if (i3 > i4) {
                    i3 = i4;
                }
                i5 = (int) (((double) i3) * d2);
                i4 = i3;
            } else {
                if (i2 > i5) {
                    i2 = i5;
                }
                i4 = (int) (((double) i2) / d2);
                i5 = i2;
            }
        }
        return new jt(i5, i4, 2);
    }

    public void c() {
        this.b = false;
        ((ArrayList) this.l).clear();
        this.f = 0;
        this.g = 0;
    }

    public char[] d() {
        int i2;
        char[] cArr = (char[]) this.k;
        if (cArr == null) {
            String str = this.c;
            if (str != null) {
                cArr = str.toCharArray();
            } else {
                int i3 = this.d;
                char[] cArr2 = m;
                if (i3 >= 0) {
                    int i4 = this.e;
                    if (i4 >= 1) {
                        cArr = i3 == 0 ? Arrays.copyOf((char[]) this.i, i4) : Arrays.copyOfRange((char[]) this.i, i3, i4 + i3);
                    }
                } else {
                    int t = t();
                    if (t >= 1) {
                        cArr = new char[t];
                        ArrayList arrayList = (ArrayList) this.l;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i2 = 0;
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr3 = (char[]) ((ArrayList) this.l).get(i5);
                                int length = cArr3.length;
                                System.arraycopy(cArr3, 0, cArr, i2, length);
                                i2 += length;
                            }
                        } else {
                            i2 = 0;
                        }
                        System.arraycopy((char[]) this.j, 0, cArr, i2, this.g);
                    }
                }
                cArr = cArr2;
            }
            this.k = cArr;
        }
        return cArr;
    }

    public BigDecimal e() {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = (char[]) this.k;
        if (cArr3 != null) {
            return cy9.a(cArr3, 0, cArr3.length);
        }
        int i2 = this.d;
        if (i2 >= 0 && (cArr2 = (char[]) this.i) != null) {
            return cy9.a(cArr2, i2, this.e);
        }
        if (this.f == 0 && (cArr = (char[]) this.j) != null) {
            return cy9.a(cArr, 0, this.g);
        }
        char[] d2 = d();
        String str = cy9.a;
        return cy9.a(d2, 0, d2.length);
    }

    public int f(boolean z) {
        char[] cArr;
        int i2 = this.d;
        return (i2 < 0 || (cArr = (char[]) this.i) == null) ? z ? -cy9.b((char[]) this.j, 1, this.g - 1) : cy9.b((char[]) this.j, 0, this.g) : z ? -cy9.b(cArr, i2 + 1, this.e - 1) : cy9.b(cArr, i2, this.e);
    }

    public String g() {
        if (this.c == null) {
            char[] cArr = (char[]) this.k;
            if (cArr != null) {
                this.c = new String(cArr);
            } else {
                int i2 = this.d;
                String str = "";
                if (i2 >= 0) {
                    int i3 = this.e;
                    if (i3 < 1) {
                        this.c = str;
                        return str;
                    }
                    this.c = new String((char[]) this.i, i2, i3);
                } else {
                    int i4 = this.f;
                    int i5 = this.g;
                    if (i4 == 0) {
                        if (i5 != 0) {
                            str = new String((char[]) this.j, 0, i5);
                        }
                        this.c = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i4 + i5);
                        ArrayList arrayList = (ArrayList) this.l;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                char[] cArr2 = (char[]) ((ArrayList) this.l).get(i6);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append((char[]) this.j, 0, this.g);
                        this.c = sb.toString();
                    }
                }
            }
        }
        return this.c;
    }

    public void h() {
        q();
        k();
    }

    public void i(l84 l84, wn0 wn0, vf vfVar, int i2, k56 k56) {
    }

    public o43 j(int i2, int i3, int i4) {
        y26 y26;
        jt b2 = b(i3, i4);
        ht0 q = q();
        if (q != null) {
            int i5 = b2.b;
            int i6 = b2.c;
            Integer num = (Integer) q.k.get(Integer.valueOf(i2));
            if (num != null) {
                int intValue = num.intValue();
                q.j = intValue;
                gt0 gt0 = (gt0) q.f.get(num);
                if (gt0 == null || gt0.b || !gt0.a.m0()) {
                    gt0 = null;
                }
                if (gt0 != null) {
                    fm5 fm5 = q.i;
                    int i7 = q.g;
                    int a2 = fm5.a(q.e + i7);
                    if (i7 >= a2 ? !((i7 > intValue || intValue > fm5.b) && (intValue < 0 || intValue > a2)) : !(i7 > intValue || intValue > a2)) {
                        q.e(i5, i6);
                    }
                    y26 = new y26(1, gt0.a.m());
                } else {
                    q.e(i5, i6);
                    y26 = q.c(intValue);
                }
            } else {
                y26 = q.c(i2);
            }
        } else {
            y26 = null;
        }
        if (y26 != null) {
            AtomicInteger atomicInteger = yf.a;
            v26 v26 = (v26) this.l;
            ConcurrentHashMap concurrentHashMap = yf.d;
            if (!concurrentHashMap.contains(v26)) {
                concurrentHashMap.put(v26, Integer.valueOf((int) (((float) v26.a) * 0.2f)));
            }
            int s = au1.s(y26.a);
            if (s == 0) {
                yf.a.incrementAndGet();
            } else if (s == 1) {
                yf.b.incrementAndGet();
            } else if (s == 2) {
                yf.c.incrementAndGet();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (y26 != null) {
            return y26.b;
        }
        return null;
    }

    public void k() {
        ht0 q = q();
        if (q != null) {
            ConcurrentHashMap concurrentHashMap = u26.d;
            u26.d.put(this.c, new a6f(q, new Date()));
        }
        this.k = null;
    }

    public void l(int i2, int i3) {
        if (i2 > 0 && i3 > 0 && this.d > 0 && this.e > 0) {
            jt b2 = b(i2, i3);
            ht0 q = q();
            if (q != null) {
                int i4 = b2.b;
                q.e(i4, i4);
            }
        }
    }

    public char[] m() {
        this.d = -1;
        this.g = 0;
        this.e = 0;
        this.i = null;
        this.c = null;
        this.k = null;
        if (this.b) {
            c();
        }
        char[] cArr = (char[]) this.j;
        if (cArr != null) {
            return cArr;
        }
        char[] a2 = a(0);
        this.j = a2;
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r0 > 65536) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.l
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x000d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.l = r0
        L_0x000d:
            java.lang.Object r0 = r3.j
            char[] r0 = (char[]) r0
            r1 = 1
            r3.b = r1
            java.lang.Object r1 = r3.l
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            int r1 = r3.f
            int r2 = r0.length
            int r1 = r1 + r2
            r3.f = r1
            r1 = 0
            r3.g = r1
            int r0 = r0.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L_0x002e
        L_0x002c:
            r0 = r1
            goto L_0x0033
        L_0x002e:
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 <= r1) goto L_0x0033
            goto L_0x002c
        L_0x0033:
            char[] r0 = new char[r0]
            r3.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.woe.n():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r0 > 65536) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] o() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.l
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x000d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.l = r0
        L_0x000d:
            r0 = 1
            r2.b = r0
            java.lang.Object r0 = r2.l
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r2.j
            char[] r1 = (char[]) r1
            r0.add(r1)
            java.lang.Object r0 = r2.j
            char[] r0 = (char[]) r0
            int r0 = r0.length
            int r1 = r2.f
            int r1 = r1 + r0
            r2.f = r1
            r1 = 0
            r2.g = r1
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L_0x0031
        L_0x002f:
            r0 = r1
            goto L_0x0036
        L_0x0031:
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 <= r1) goto L_0x0036
            goto L_0x002f
        L_0x0036:
            char[] r0 = new char[r0]
            r2.j = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.woe.o():char[]");
    }

    public char[] p() {
        if (this.d >= 0) {
            u(1);
        } else {
            char[] cArr = (char[]) this.j;
            if (cArr == null) {
                this.j = a(0);
            } else if (this.g >= cArr.length) {
                n();
            }
        }
        return (char[]) this.j;
    }

    public ht0 q() {
        ht0 ht0;
        if (((ht0) this.k) == null) {
            u26 u26 = (u26) this.j;
            String str = this.c;
            te teVar = (te) this.i;
            gg ggVar = (gg) this.h;
            u26.getClass();
            ConcurrentHashMap concurrentHashMap = u26.d;
            synchronized (concurrentHashMap) {
                a6f a6f = (a6f) concurrentHashMap.get(str);
                if (a6f != null) {
                    concurrentHashMap.remove(str);
                    ht0 = a6f.a;
                } else {
                    ht0 = new ht0(u26.a, teVar, new fm5(u26.b, 6), ggVar, u26.c);
                }
            }
            this.k = ht0;
        }
        return (ht0) this.k;
    }

    public char[] r() {
        if (this.d >= 0) {
            return (char[]) this.i;
        }
        char[] cArr = (char[]) this.k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.c;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.k = charArray;
            return charArray;
        } else if (this.b) {
            return d();
        } else {
            char[] cArr2 = (char[]) this.j;
            return cArr2 == null ? m : cArr2;
        }
    }

    public void s(char[] cArr, int i2, int i3) {
        this.c = null;
        this.k = null;
        this.i = cArr;
        this.d = i2;
        this.e = i3;
        if (this.b) {
            c();
        }
    }

    public int t() {
        if (this.d >= 0) {
            return this.e;
        }
        char[] cArr = (char[]) this.k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.c;
        return str != null ? str.length() : this.f + this.g;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return g();
            default:
                return super.toString();
        }
    }

    public void u(int i2) {
        int i3 = this.e;
        this.e = 0;
        char[] cArr = (char[]) this.i;
        this.i = null;
        int i4 = this.d;
        this.d = -1;
        int i5 = i2 + i3;
        char[] cArr2 = (char[]) this.j;
        if (cArr2 == null || i5 > cArr2.length) {
            this.j = a(i5);
        }
        if (i3 > 0) {
            System.arraycopy(cArr, i4, (char[]) this.j, 0, i3);
        }
        this.f = 0;
        this.g = i3;
    }

    public woe(mt0 mt0) {
        this.h = mt0;
    }
}
