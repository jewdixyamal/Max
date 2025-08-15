package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.coroutines.Continuation;

/* renamed from: o23  reason: default package */
public final class o23 implements y3b, b66 {
    public static final fs4 Y = new fs4(17);
    public Object X;
    public final Object a;
    public final Object b;
    public Object c;
    public Object o;

    public o23(m56 m56, lf0 lf0, a66 a66, ztc ztc, m56 m562) {
        this.a = m56;
        this.b = lf0;
        this.c = a66;
        this.o = ztc;
        this.X = m562;
    }

    public static o23 f(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        o23 o23 = new o23(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) o23.o)) {
            try {
                ((ArrayDeque) o23.o).clear();
                String string = ((SharedPreferences) o23.a).getString((String) o23.b, "");
                if (!TextUtils.isEmpty(string)) {
                    if (string.contains((String) o23.c)) {
                        String[] split = string.split((String) o23.c, -1);
                        int length = split.length;
                        for (String str : split) {
                            if (!TextUtils.isEmpty(str)) {
                                ((ArrayDeque) o23.o).add(str);
                            }
                        }
                    }
                }
            } finally {
            }
        }
        return o23;
    }

    public static void g(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    public static int h(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public void a() {
        ((y3b) this.c).a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.a
            m56 r2 = (defpackage.m56) r2
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x001c
            iz9 r0 = defpackage.qy9.g(r1)
            goto L_0x00ae
        L_0x001c:
            java.lang.Object r2 = r0.b
            lf0 r2 = (defpackage.lf0) r2
            int r3 = r2.c
            r4 = 1
            int r3 = r3 + r4
            r2.c = r3
            r5 = 3
            r6 = 0
            if (r3 <= r5) goto L_0x002d
        L_0x002b:
            r8 = r6
            goto L_0x0087
        L_0x002d:
            s85 r5 = r2.a
            long r8 = r5.a
            float r8 = (float) r8
            float r9 = r5.c
            double r9 = (double) r9
            float r3 = (float) r3
            r11 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r11
            double r12 = (double) r3
            double r9 = java.lang.Math.pow(r9, r12)
            float r3 = (float) r9
            float r8 = r8 * r3
            long r9 = r5.b
            float r3 = (float) r9
            float r8 = java.lang.Math.min(r8, r3)
            long r8 = (long) r8
            float r5 = r5.d
            r10 = 0
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x0050
            goto L_0x006d
        L_0x0050:
            float r8 = (float) r8
            float r5 = r5 * r8
            float r9 = r8 - r5
            float r9 = java.lang.Math.max(r9, r11)
            long r9 = (long) r9
            float r5 = r5 + r8
            float r3 = java.lang.Math.min(r5, r3)
            long r11 = (long) r3
            double r13 = java.lang.Math.random()
            long r11 = r11 - r9
            r15 = 1
            long r11 = r11 + r15
            double r11 = (double) r11
            double r13 = r13 * r11
            int r3 = (int) r13
            long r11 = (long) r3
            long r8 = r9 + r11
        L_0x006d:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0072
            goto L_0x002b
        L_0x0072:
            if (r3 < 0) goto L_0x00b5
            long r10 = r2.d
            long r10 = r10 + r8
            r2.d = r10
            long r12 = r2.b
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0081
            r3 = r4
            goto L_0x0082
        L_0x0081:
            r3 = 0
        L_0x0082:
            if (r3 != r4) goto L_0x0085
            goto L_0x002b
        L_0x0085:
            if (r3 != 0) goto L_0x00af
        L_0x0087:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00a3
            int r2 = r2.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r0.c
            a66 r3 = (defpackage.a66) r3
            r3.invoke(r1, r2)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r0 = r0.o
            ztc r0 = (defpackage.ztc) r0
            d2a r0 = defpackage.qy9.u(r8, r1, r0)
            goto L_0x00ae
        L_0x00a3:
            java.lang.Object r0 = r0.X
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r1)
            iz9 r0 = defpackage.qy9.g(r1)
        L_0x00ae:
            return r0
        L_0x00af:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Interval is invalid. Must be greater than 0."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o23.apply(java.lang.Object):java.lang.Object");
    }

    public void b() {
        ((y3b) this.c).b();
    }

    public void c(d3b d3b) {
        ((y3b) this.c).c(d3b);
    }

    public c64 d(Long l, boolean z) {
        return ((y3b) this.c).d(l, z);
    }

    public void e(ax1 ax1, ax1 ax12, iee iee, iee iee2, Map.Entry entry) {
        iee iee3 = (iee) entry.getValue();
        yb0 yb0 = new yb0(iee.g.a, ((da0) entry.getKey()).a.d, iee.c ? ax1 : null, ((da0) entry.getKey()).a.f, ((da0) entry.getKey()).a.g);
        yb0 yb02 = new yb0(iee2.g.a, ((da0) entry.getKey()).b.d, iee2.c ? ax12 : null, ((da0) entry.getKey()).b.f, ((da0) entry.getKey()).b.g);
        int i = ((da0) entry.getKey()).a.c;
        iee3.getClass();
        kq0.e();
        iee3.b();
        c54.p("Consumer can only be linked once.", !iee3.j);
        iee3.j = true;
        hee hee = iee3.l;
        kq0.a(kq0.K(hee.c(), new gee(iee3, hee, i, yb0, yb02), ju0.D()), new y7g(this, iee3, false, 15), ju0.D());
    }

    public boolean i(float[] fArr) {
        npa[] npaArr = (npa[]) this.o;
        if (npaArr != null && npaArr.length > 0) {
            int length = npaArr.length;
            int i = 0;
            while (i < length) {
                npaArr[i].getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public o23(Context context, a4c a4c, wte wte) {
        this.a = context;
        this.b = a4c;
        this.c = wte;
        this.X = new an(4, this);
    }

    public o23(je7 je7, je7 je72, je7 je73, Context context) {
        this.a = context;
        this.b = o23.class.getName();
        this.c = je7;
        this.o = je72;
        this.X = je73;
    }

    public o23(Context context, je7 je7, je7 je72, je7 je73) {
        this.a = context;
        this.b = new khe(new dr(je72, je73, 6));
        this.c = je7;
        this.o = je72;
        this.X = je73;
    }

    public o23(kke kke, t50 t50, ch9 ch9, sx3 sx3, nif nif, je7 je7, je7 je72, je7 je73, boolean z) {
        mn5 mn5;
        mn5 mn52;
        sx3 sx32 = sx3;
        e60 e60 = new e60(kke, t50, ch9, sx32);
        this.a = e60;
        mif mif = z ? new mif(sx3, je7, je72, je73, kke, nif) : null;
        this.b = mif;
        this.c = e60;
        mn5 mn53 = lz4.a;
        this.o = od2.X(new zn5(new ap8(new zn5(od2.N(e60.Y, (mif == null || (mn52 = mif.Y) == null) ? mn53 : mn52), new r3b(this, (Continuation) null)), this, 6), new t3b(this, (Continuation) null), 5), sx32, wld.a, za9.a);
        if (!(mif == null || (mn5 = mif.Z) == null)) {
            mn53 = mn5;
        }
        this.X = od2.X(od2.N(e60.Z, mn53), sx32, wld.b, Float.valueOf(0.0f));
    }

    public o23(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.o = new ArrayDeque();
        this.a = sharedPreferences;
        this.b = "topic_operation_queue";
        this.c = ",";
        this.X = scheduledThreadPoolExecutor;
    }

    public o23(int[] iArr, int i, npa[] npaArr) {
        f63 f63;
        int[] iArr2 = iArr;
        int i2 = i;
        this.X = new float[3];
        this.o = npaArr;
        int[] iArr3 = new int[32768];
        this.b = iArr3;
        int i3 = 0;
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            int i5 = iArr2[i4];
            int h = h(Color.blue(i5), 8, 5) | (h(Color.red(i5), 8, 5) << 10) | (h(Color.green(i5), 8, 5) << 5);
            iArr2[i4] = h;
            iArr3[h] = iArr3[h] + 1;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr3[i7] > 0) {
                int rgb = Color.rgb(h((i7 >> 10) & 31, 5, 8), h((i7 >> 5) & 31, 5, 8), h(i7 & 31, 5, 8));
                float[] fArr = (float[]) this.X;
                ThreadLocal threadLocal = s63.a;
                s63.a(Color.red(rgb), Color.green(rgb), Color.blue(rgb), fArr);
                if (i(fArr)) {
                    iArr3[i7] = 0;
                }
            }
            if (iArr3[i7] > 0) {
                i6++;
            }
        }
        int[] iArr4 = new int[i6];
        this.a = iArr4;
        int i8 = 0;
        for (int i9 = 0; i9 < 32768; i9++) {
            if (iArr3[i9] > 0) {
                iArr4[i8] = i9;
                i8++;
            }
        }
        if (i6 <= i2) {
            this.c = new ArrayList();
            while (i3 < i6) {
                int i10 = iArr4[i3];
                ((ArrayList) this.c).add(new opa(Color.rgb(h((i10 >> 10) & 31, 5, 8), h((i10 >> 5) & 31, 5, 8), h(i10 & 31, 5, 8)), iArr3[i10]));
                i3++;
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i2, Y);
        priorityQueue.offer(new f63(this, 0, ((int[]) this.a).length - 1));
        while (priorityQueue.size() < i2 && (f63 = (f63) priorityQueue.poll()) != null) {
            int i11 = f63.b;
            int i12 = f63.a;
            if ((i11 + 1) - i12 <= 1) {
                break;
            } else if ((i11 + 1) - i12 > 1) {
                int i13 = f63.e - f63.d;
                int i14 = f63.g - f63.f;
                int i15 = f63.i - f63.h;
                int i16 = (i13 < i14 || i13 < i15) ? (i14 < i13 || i14 < i15) ? -1 : -2 : -3;
                o23 o23 = f63.j;
                int[] iArr5 = (int[]) o23.a;
                g(i16, i12, i11, iArr5);
                Arrays.sort(iArr5, i12, f63.b + 1);
                g(i16, i12, f63.b, iArr5);
                int i17 = f63.c / 2;
                int i18 = i3;
                int i19 = i12;
                while (true) {
                    int i20 = f63.b;
                    if (i19 > i20) {
                        break;
                    }
                    i18 += ((int[]) o23.b)[iArr5[i19]];
                    if (i18 >= i17) {
                        i12 = Math.min(i20 - 1, i19);
                        break;
                    }
                    i19++;
                }
                f63 f632 = new f63(o23, i12 + 1, f63.b);
                f63.b = i12;
                f63.a();
                priorityQueue.offer(f632);
                priorityQueue.offer(f63);
                i3 = 0;
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            f63 f633 = (f63) it.next();
            o23 o232 = f633.j;
            int[] iArr6 = (int[]) o232.a;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            for (int i25 = f633.a; i25 <= f633.b; i25++) {
                int i26 = iArr6[i25];
                int i27 = ((int[]) o232.b)[i26];
                i22 += i27;
                i21 = (((i26 >> 10) & 31) * i27) + i21;
                i23 = (((i26 >> 5) & 31) * i27) + i23;
                i24 += i27 * (i26 & 31);
            }
            float f = (float) i22;
            opa opa = new opa(Color.rgb(h(Math.round(((float) i21) / f), 5, 8), h(Math.round(((float) i23) / f), 5, 8), h(Math.round(((float) i24) / f), 5, 8)), i22);
            if (!i(opa.b())) {
                arrayList.add(opa);
            }
        }
        this.c = arrayList;
    }

    public o23(ax1 ax1, ax1 ax12, lee lee) {
        this.b = ax1;
        this.c = ax12;
        this.a = lee;
    }
}
