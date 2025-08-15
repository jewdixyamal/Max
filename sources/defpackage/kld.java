package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: kld  reason: default package */
public class kld extends o3 implements si9, vy1, y66 {
    public final int X;
    public final int Y;
    public final int Z;
    public Object[] s0;
    public long t0;
    public long u0;
    public int v0;
    public int w0;

    public kld(int i, int i2, int i3) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0090 A[EDGE_INSN: B:52:0x0090->B:38:0x0090 ?: BREAK  , SYNTHETIC] */
    public static void o(defpackage.kld r8, defpackage.on5 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.jld
            if (r0 == 0) goto L_0x0013
            r0 = r10
            jld r0 = (defpackage.jld) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            jld r0 = new jld
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L_0x005e
            r8 = 1
            if (r2 == r8) goto L_0x004f
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            x77 r8 = r0.Z
            mld r9 = r0.Y
            on5 r2 = r0.X
            kld r5 = r0.o
            defpackage.od2.a0(r10)     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x0074
        L_0x0038:
            r8 = move-exception
            goto L_0x00b2
        L_0x003b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0043:
            x77 r8 = r0.Z
            mld r9 = r0.Y
            on5 r2 = r0.X
            kld r5 = r0.o
            defpackage.od2.a0(r10)     // Catch:{ all -> 0x0038 }
            goto L_0x0077
        L_0x004f:
            mld r9 = r0.Y
            on5 r8 = r0.X
            kld r2 = r0.o
            defpackage.od2.a0(r10)     // Catch:{ all -> 0x005b }
            r10 = r8
            r8 = r2
            goto L_0x006a
        L_0x005b:
            r8 = move-exception
            r5 = r2
            goto L_0x00b2
        L_0x005e:
            defpackage.od2.a0(r10)
            p3 r10 = r8.h()
            mld r10 = (defpackage.mld) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x006a:
            lx3 r2 = r0.b     // Catch:{ all -> 0x00af }
            c32 r5 = defpackage.c32.X     // Catch:{ all -> 0x00af }
            jx3 r2 = r2.get(r5)     // Catch:{ all -> 0x00af }
            x77 r2 = (defpackage.x77) r2     // Catch:{ all -> 0x00af }
        L_0x0074:
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0077:
            java.lang.Object r10 = r5.w(r9)     // Catch:{ all -> 0x0038 }
            kotlinx.coroutines.internal.Symbol r6 = defpackage.lld.a     // Catch:{ all -> 0x0038 }
            if (r10 != r6) goto L_0x0090
            r0.o = r5     // Catch:{ all -> 0x0038 }
            r0.X = r2     // Catch:{ all -> 0x0038 }
            r0.Y = r9     // Catch:{ all -> 0x0038 }
            r0.Z = r8     // Catch:{ all -> 0x0038 }
            r0.u0 = r4     // Catch:{ all -> 0x0038 }
            java.lang.Object r10 = r5.m(r9, r0)     // Catch:{ all -> 0x0038 }
            if (r10 != r1) goto L_0x0077
            return
        L_0x0090:
            if (r8 == 0) goto L_0x009e
            boolean r6 = r8.isActive()     // Catch:{ all -> 0x0038 }
            if (r6 == 0) goto L_0x0099
            goto L_0x009e
        L_0x0099:
            java.util.concurrent.CancellationException r8 = r8.getCancellationException()     // Catch:{ all -> 0x0038 }
            throw r8     // Catch:{ all -> 0x0038 }
        L_0x009e:
            r0.o = r5     // Catch:{ all -> 0x0038 }
            r0.X = r2     // Catch:{ all -> 0x0038 }
            r0.Y = r9     // Catch:{ all -> 0x0038 }
            r0.Z = r8     // Catch:{ all -> 0x0038 }
            r0.u0 = r3     // Catch:{ all -> 0x0038 }
            java.lang.Object r10 = r2.a(r10, r0)     // Catch:{ all -> 0x0038 }
            if (r10 != r1) goto L_0x0034
            return
        L_0x00af:
            r10 = move-exception
            r5 = r8
            r8 = r10
        L_0x00b2:
            r5.l(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kld.o(kld, on5, kotlin.coroutines.Continuation):void");
    }

    public final Object a(Object obj, Continuation continuation) {
        hld hld;
        Continuation[] continuationArr;
        if (g(obj)) {
            return e5f.a;
        }
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        Continuation[] continuationArr2 = ft.a;
        synchronized (this) {
            try {
                if (u(obj)) {
                    sy1.resumeWith(e5f.a);
                    continuationArr = r(continuationArr2);
                    hld = null;
                } else {
                    hld hld2 = new hld(this, ((long) (this.v0 + this.w0)) + s(), obj, sy1);
                    q(hld2);
                    this.w0++;
                    if (this.Y == 0) {
                        continuationArr2 = r(continuationArr2);
                    }
                    continuationArr = continuationArr2;
                    hld = hld2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hld != null) {
            nu0.w(sy1, new hy1(2, hld));
        }
        for (Continuation continuation2 : continuationArr) {
            if (continuation2 != null) {
                continuation2.resumeWith(e5f.a);
            }
        }
        Object m = sy1.m();
        tx3 tx3 = tx3.a;
        if (m != tx3) {
            m = e5f.a;
        }
        return m == tx3 ? m : e5f.a;
    }

    public final List b() {
        synchronized (this) {
            int s = (int) ((s() + ((long) this.v0)) - this.t0);
            if (s == 0) {
                nz4 nz4 = nz4.a;
                return nz4;
            }
            ArrayList arrayList = new ArrayList(s);
            Object[] objArr = this.s0;
            for (int i = 0; i < s; i++) {
                arrayList.add(lld.c(objArr, this.t0 + ((long) i)));
            }
            return arrayList;
        }
    }

    public final Object d(on5 on5, Continuation continuation) {
        o(this, on5, continuation);
        return tx3.a;
    }

    public final mn5 e(lx3 lx3, int i, int i2) {
        return lld.e(this, lx3, i, i2);
    }

    public final void f() {
        synchronized (this) {
            x(s() + ((long) this.v0), this.u0, s() + ((long) this.v0), s() + ((long) this.v0) + ((long) this.w0));
        }
    }

    public final boolean g(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArr = ft.a;
        synchronized (this) {
            if (u(obj)) {
                continuationArr = r(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                continuation.resumeWith(e5f.a);
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [p3, mld, java.lang.Object] */
    public final p3 j() {
        ? obj = new Object();
        obj.a = -1;
        return obj;
    }

    public final p3[] k() {
        return new mld[2];
    }

    public final Object m(mld mld, jld jld) {
        sy1 sy1 = new sy1(1, v3c.u(jld));
        sy1.n();
        synchronized (this) {
            if (v(mld) < 0) {
                mld.b = sy1;
            } else {
                sy1.resumeWith(e5f.a);
            }
        }
        Object m = sy1.m();
        return m == tx3.a ? m : e5f.a;
    }

    public final void n() {
        if (this.Y != 0 || this.w0 > 1) {
            Object[] objArr = this.s0;
            while (this.w0 > 0 && lld.c(objArr, (s() + ((long) (this.v0 + this.w0))) - 1) == lld.a) {
                this.w0--;
                lld.d(objArr, s() + ((long) (this.v0 + this.w0)), (Object) null);
            }
        }
    }

    public final void p() {
        p3[] p3VarArr;
        lld.d(this.s0, s(), (Object) null);
        this.v0--;
        long s = s() + 1;
        if (this.t0 < s) {
            this.t0 = s;
        }
        if (this.u0 < s) {
            if (!(this.b == 0 || (p3VarArr = this.a) == null)) {
                for (p3 p3Var : p3VarArr) {
                    if (p3Var != null) {
                        mld mld = (mld) p3Var;
                        long j = mld.a;
                        if (j >= 0 && j < s) {
                            mld.a = s;
                        }
                    }
                }
            }
            this.u0 = s;
        }
    }

    public final void q(Object obj) {
        int i = this.v0 + this.w0;
        Object[] objArr = this.s0;
        if (objArr == null) {
            objArr = t(0, 2, (Object[]) null);
        } else if (i >= objArr.length) {
            objArr = t(i, objArr.length * 2, objArr);
        }
        lld.d(objArr, s() + ((long) i), obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r4 = (defpackage.mld) r4;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.coroutines.Continuation[], code=java.lang.Object[], for r11v0, types: [kotlin.coroutines.Continuation[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.Continuation[] r(java.lang.Object[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.b
            if (r1 == 0) goto L_0x003e
            p3[] r1 = r10.a
            if (r1 == 0) goto L_0x003e
            int r2 = r1.length
            r3 = 0
        L_0x000b:
            if (r3 >= r2) goto L_0x003e
            r4 = r1[r3]
            if (r4 == 0) goto L_0x003b
            mld r4 = (defpackage.mld) r4
            sy1 r5 = r4.b
            if (r5 != 0) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            long r6 = r10.v(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x003b
            int r6 = r11.length
            if (r0 < r6) goto L_0x0030
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
        L_0x0030:
            r6 = r11
            kotlin.coroutines.Continuation[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.b = r0
            r0 = r7
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x003e:
            kotlin.coroutines.Continuation[] r11 = (kotlin.coroutines.Continuation[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kld.r(kotlin.coroutines.Continuation[]):kotlin.coroutines.Continuation[]");
    }

    public final long s() {
        return Math.min(this.u0, this.t0);
    }

    public final Object[] t(int i, int i2, Object[] objArr) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.s0 = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long s = s();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + s;
                lld.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean u(Object obj) {
        int i = this.b;
        int i2 = this.X;
        if (i == 0) {
            if (i2 != 0) {
                q(obj);
                int i3 = this.v0 + 1;
                this.v0 = i3;
                if (i3 > i2) {
                    p();
                }
                this.u0 = s() + ((long) this.v0);
            }
            return true;
        }
        int i4 = this.v0;
        int i5 = this.Y;
        if (i4 >= i5 && this.u0 <= this.t0) {
            int i6 = ild.$EnumSwitchMapping$0[au1.s(this.Z)];
            if (i6 == 1) {
                return false;
            }
            if (i6 == 2) {
                return true;
            }
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        q(obj);
        int i7 = this.v0 + 1;
        this.v0 = i7;
        if (i7 > i5) {
            p();
        }
        long s = s() + ((long) this.v0);
        long j = this.t0;
        if (((int) (s - j)) > i2) {
            x(1 + j, this.u0, s() + ((long) this.v0), s() + ((long) this.v0) + ((long) this.w0));
        }
        return true;
    }

    public final long v(mld mld) {
        long j = mld.a;
        if (j < s() + ((long) this.v0)) {
            return j;
        }
        if (this.Y <= 0 && j <= s() && this.w0 != 0) {
            return j;
        }
        return -1;
    }

    public final Object w(mld mld) {
        Object obj;
        Continuation[] continuationArr = ft.a;
        synchronized (this) {
            try {
                long v = v(mld);
                if (v < 0) {
                    obj = lld.a;
                } else {
                    long j = mld.a;
                    Object c = lld.c(this.s0, v);
                    if (c instanceof hld) {
                        c = ((hld) c).c;
                    }
                    mld.a = v + 1;
                    Object obj2 = c;
                    continuationArr = y(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                continuation.resumeWith(e5f.a);
            }
        }
        return obj;
    }

    public final void x(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long s = s(); s < min; s++) {
            lld.d(this.s0, s, (Object) null);
        }
        this.t0 = j;
        this.u0 = j2;
        this.v0 = (int) (j3 - min);
        this.w0 = (int) (j4 - j3);
    }

    public final Continuation[] y(long j) {
        long j2;
        long j3;
        Continuation[] continuationArr;
        long j4;
        p3[] p3VarArr;
        int i = (j > this.u0 ? 1 : (j == this.u0 ? 0 : -1));
        Continuation[] continuationArr2 = ft.a;
        if (i > 0) {
            return continuationArr2;
        }
        long s = s();
        long j5 = ((long) this.v0) + s;
        int i2 = this.Y;
        if (i2 == 0 && this.w0 > 0) {
            j5++;
        }
        if (!(this.b == 0 || (p3VarArr = this.a) == null)) {
            for (p3 p3Var : p3VarArr) {
                if (p3Var != null) {
                    long j6 = ((mld) p3Var).a;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.u0) {
            return continuationArr2;
        }
        long s2 = s() + ((long) this.v0);
        int min = this.b > 0 ? Math.min(this.w0, i2 - ((int) (s2 - j5))) : this.w0;
        long j7 = ((long) this.w0) + s2;
        if (min > 0) {
            Continuation[] continuationArr3 = new Continuation[min];
            Object[] objArr = this.s0;
            long j8 = s2;
            int i3 = 0;
            while (true) {
                if (s2 >= j7) {
                    j3 = j5;
                    j2 = j7;
                    break;
                }
                Object c = lld.c(objArr, s2);
                j3 = j5;
                Symbol symbol = lld.a;
                if (c != symbol) {
                    hld hld = (hld) c;
                    int i4 = i3 + 1;
                    j2 = j7;
                    continuationArr3[i3] = hld.o;
                    lld.d(objArr, s2, symbol);
                    lld.d(objArr, j8, hld.c);
                    j4 = 1;
                    j8++;
                    if (i4 >= min) {
                        break;
                    }
                    i3 = i4;
                } else {
                    j2 = j7;
                    j4 = 1;
                }
                s2 += j4;
                j5 = j3;
                j7 = j2;
            }
            continuationArr = continuationArr3;
            s2 = j8;
        } else {
            j3 = j5;
            j2 = j7;
            continuationArr = continuationArr2;
        }
        int i5 = (int) (s2 - s);
        long j9 = this.b == 0 ? s2 : j3;
        long max = Math.max(this.t0, s2 - ((long) Math.min(this.X, i5)));
        if (i2 == 0 && max < j2 && tpa.f(lld.c(this.s0, max), lld.a)) {
            s2++;
            max++;
        }
        x(max, j9, s2, j2);
        n();
        return (continuationArr.length == 0) ^ true ? r(continuationArr) : continuationArr;
    }
}
