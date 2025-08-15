package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: q0e  reason: default package */
public final class q0e extends o3 implements ti9, vy1, y66 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(q0e.class, Object.class, "_state$volatile");
    public int X;
    private volatile /* synthetic */ Object _state$volatile;

    public q0e(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a(Object obj, Continuation continuation) {
        setValue(obj);
        return e5f.a;
    }

    public final List b() {
        return Collections.singletonList(getValue());
    }

    public final boolean c(Object obj, Object obj2) {
        if (obj == null) {
            obj = ay9.a;
        }
        if (obj2 == null) {
            obj2 = ay9.a;
        }
        return m(obj, obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081 A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099 A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae A[Catch:{ all -> 0x0038 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00af A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bd A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.on5 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.p0e
            if (r0 == 0) goto L_0x0013
            r0 = r15
            p0e r0 = (defpackage.p0e) r0
            int r1 = r0.v0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v0 = r1
            goto L_0x0018
        L_0x0013:
            p0e r0 = new p0e
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.t0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.v0
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r6) goto L_0x0052
            if (r2 == r5) goto L_0x0043
            if (r2 != r4) goto L_0x003b
            java.lang.Object r13 = r0.s0
            x77 r14 = r0.Z
            s0e r2 = r0.Y
            on5 r7 = r0.X
            q0e r8 = r0.o
            defpackage.od2.a0(r15)     // Catch:{ all -> 0x0038 }
            goto L_0x0079
        L_0x0038:
            r13 = move-exception
            goto L_0x00f3
        L_0x003b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0043:
            java.lang.Object r13 = r0.s0
            x77 r14 = r0.Z
            s0e r2 = r0.Y
            on5 r7 = r0.X
            q0e r8 = r0.o
            defpackage.od2.a0(r15)     // Catch:{ all -> 0x0038 }
            goto L_0x00b0
        L_0x0052:
            s0e r2 = r0.Y
            on5 r14 = r0.X
            q0e r13 = r0.o
            defpackage.od2.a0(r15)     // Catch:{ all -> 0x005c }
            goto L_0x006b
        L_0x005c:
            r14 = move-exception
            r8 = r13
            r13 = r14
            goto L_0x00f3
        L_0x0061:
            defpackage.od2.a0(r15)
            p3 r15 = r13.h()
            s0e r15 = (defpackage.s0e) r15
            r2 = r15
        L_0x006b:
            lx3 r15 = r0.b     // Catch:{ all -> 0x005c }
            c32 r7 = defpackage.c32.X     // Catch:{ all -> 0x005c }
            jx3 r15 = r15.get(r7)     // Catch:{ all -> 0x005c }
            x77 r15 = (defpackage.x77) r15     // Catch:{ all -> 0x005c }
            r8 = r13
            r7 = r14
            r14 = r15
            r13 = r3
        L_0x0079:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r15 = Y     // Catch:{ all -> 0x0038 }
            java.lang.Object r15 = r15.get(r8)     // Catch:{ all -> 0x0038 }
            if (r14 == 0) goto L_0x008d
            boolean r9 = r14.isActive()     // Catch:{ all -> 0x0038 }
            if (r9 == 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            java.util.concurrent.CancellationException r13 = r14.getCancellationException()     // Catch:{ all -> 0x0038 }
            throw r13     // Catch:{ all -> 0x0038 }
        L_0x008d:
            if (r13 == 0) goto L_0x0095
            boolean r9 = r13.equals(r15)     // Catch:{ all -> 0x0038 }
            if (r9 != 0) goto L_0x00b0
        L_0x0095:
            kotlinx.coroutines.internal.Symbol r13 = defpackage.ay9.a     // Catch:{ all -> 0x0038 }
            if (r15 != r13) goto L_0x009b
            r13 = r3
            goto L_0x009c
        L_0x009b:
            r13 = r15
        L_0x009c:
            r0.o = r8     // Catch:{ all -> 0x0038 }
            r0.X = r7     // Catch:{ all -> 0x0038 }
            r0.Y = r2     // Catch:{ all -> 0x0038 }
            r0.Z = r14     // Catch:{ all -> 0x0038 }
            r0.s0 = r15     // Catch:{ all -> 0x0038 }
            r0.v0 = r5     // Catch:{ all -> 0x0038 }
            java.lang.Object r13 = r7.a(r13, r0)     // Catch:{ all -> 0x0038 }
            if (r13 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r13 = r15
        L_0x00b0:
            java.util.concurrent.atomic.AtomicReference r15 = r2.a     // Catch:{ all -> 0x0038 }
            kotlinx.coroutines.internal.Symbol r9 = defpackage.r0e.a     // Catch:{ all -> 0x0038 }
            java.lang.Object r15 = r15.getAndSet(r9)     // Catch:{ all -> 0x0038 }
            kotlinx.coroutines.internal.Symbol r10 = defpackage.r0e.b     // Catch:{ all -> 0x0038 }
            if (r15 != r10) goto L_0x00bd
            goto L_0x0079
        L_0x00bd:
            r0.o = r8     // Catch:{ all -> 0x0038 }
            r0.X = r7     // Catch:{ all -> 0x0038 }
            r0.Y = r2     // Catch:{ all -> 0x0038 }
            r0.Z = r14     // Catch:{ all -> 0x0038 }
            r0.s0 = r13     // Catch:{ all -> 0x0038 }
            r0.v0 = r4     // Catch:{ all -> 0x0038 }
            sy1 r15 = new sy1     // Catch:{ all -> 0x0038 }
            kotlin.coroutines.Continuation r10 = defpackage.v3c.u(r0)     // Catch:{ all -> 0x0038 }
            r15.<init>(r6, r10)     // Catch:{ all -> 0x0038 }
            r15.n()     // Catch:{ all -> 0x0038 }
            java.util.concurrent.atomic.AtomicReference r10 = r2.a     // Catch:{ all -> 0x0038 }
        L_0x00d7:
            boolean r11 = r10.compareAndSet(r9, r15)     // Catch:{ all -> 0x0038 }
            e5f r12 = defpackage.e5f.a     // Catch:{ all -> 0x0038 }
            if (r11 == 0) goto L_0x00e0
            goto L_0x00e9
        L_0x00e0:
            java.lang.Object r11 = r10.get()     // Catch:{ all -> 0x0038 }
            if (r11 == r9) goto L_0x00d7
            r15.resumeWith(r12)     // Catch:{ all -> 0x0038 }
        L_0x00e9:
            java.lang.Object r15 = r15.m()     // Catch:{ all -> 0x0038 }
            if (r15 != r1) goto L_0x00f0
            r12 = r15
        L_0x00f0:
            if (r12 != r1) goto L_0x0079
            return r1
        L_0x00f3:
            r8.l(r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0e.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final mn5 e(lx3 lx3, int i, int i2) {
        Symbol symbol = r0e.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? lld.e(this, lx3, i, i2) : this;
    }

    public final void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final boolean g(Object obj) {
        setValue(obj);
        return true;
    }

    public final Object getValue() {
        Symbol symbol = ay9.a;
        Object obj = Y.get(this);
        if (obj == symbol) {
            return null;
        }
        return obj;
    }

    public final p3 j() {
        return new s0e();
    }

    public final p3[] k() {
        return new s0e[2];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        r11 = (defpackage.s0e[]) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r11 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        r0 = r11.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        if (r3 >= r0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        r4 = r11[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r4 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0039, code lost:
        r4 = r4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        r5 = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        if (r5 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0042, code lost:
        r6 = defpackage.r0e.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        if (r5 != r6) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
        r7 = defpackage.r0e.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0049, code lost:
        if (r5 != r7) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        if (r4.compareAndSet(r5, r6) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0056, code lost:
        if (r4.get() == r5) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005d, code lost:
        if (r4.compareAndSet(r5, r7) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005f, code lost:
        ((defpackage.sy1) r5).resumeWith(defpackage.e5f.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006b, code lost:
        if (r4.get() == r5) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006e, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0071, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r11 = r9.X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0074, code lost:
        if (r11 != r10) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0076, code lost:
        r9.X = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0079, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r10 = r9.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007f, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0080, code lost:
        r8 = r11;
        r11 = r10;
        r10 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Y     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r10 == 0) goto L_0x0015
            boolean r10 = defpackage.tpa.f(r1, r10)     // Catch:{ all -> 0x0012 }
            if (r10 != 0) goto L_0x0015
            monitor-exit(r9)
            return r2
        L_0x0012:
            r10 = move-exception
            goto L_0x008c
        L_0x0015:
            boolean r10 = defpackage.tpa.f(r1, r11)     // Catch:{ all -> 0x0012 }
            r1 = 1
            if (r10 == 0) goto L_0x001e
            monitor-exit(r9)
            return r1
        L_0x001e:
            r0.set(r9, r11)     // Catch:{ all -> 0x0012 }
            int r10 = r9.X     // Catch:{ all -> 0x0012 }
            r11 = r10 & 1
            if (r11 != 0) goto L_0x0086
            int r10 = r10 + r1
            r9.X = r10     // Catch:{ all -> 0x0012 }
            p3[] r11 = r9.a     // Catch:{ all -> 0x0012 }
            monitor-exit(r9)
        L_0x002d:
            s0e[] r11 = (defpackage.s0e[]) r11
            if (r11 == 0) goto L_0x0071
            int r0 = r11.length
            r3 = r2
        L_0x0033:
            if (r3 >= r0) goto L_0x0071
            r4 = r11[r3]
            if (r4 == 0) goto L_0x006e
            java.util.concurrent.atomic.AtomicReference r4 = r4.a
        L_0x003b:
            java.lang.Object r5 = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(r4)
            if (r5 != 0) goto L_0x0042
            goto L_0x006e
        L_0x0042:
            kotlinx.coroutines.internal.Symbol r6 = defpackage.r0e.b
            if (r5 != r6) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            kotlinx.coroutines.internal.Symbol r7 = defpackage.r0e.a
            if (r5 != r7) goto L_0x0059
        L_0x004b:
            boolean r7 = r4.compareAndSet(r5, r6)
            if (r7 == 0) goto L_0x0052
            goto L_0x006e
        L_0x0052:
            java.lang.Object r7 = r4.get()
            if (r7 == r5) goto L_0x004b
            goto L_0x003b
        L_0x0059:
            boolean r6 = r4.compareAndSet(r5, r7)
            if (r6 == 0) goto L_0x0067
            sy1 r5 = (defpackage.sy1) r5
            e5f r4 = defpackage.e5f.a
            r5.resumeWith(r4)
            goto L_0x006e
        L_0x0067:
            java.lang.Object r6 = r4.get()
            if (r6 == r5) goto L_0x0059
            goto L_0x003b
        L_0x006e:
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0071:
            monitor-enter(r9)
            int r11 = r9.X     // Catch:{ all -> 0x007b }
            if (r11 != r10) goto L_0x007d
            int r10 = r10 + r1
            r9.X = r10     // Catch:{ all -> 0x007b }
            monitor-exit(r9)
            return r1
        L_0x007b:
            r10 = move-exception
            goto L_0x0084
        L_0x007d:
            p3[] r10 = r9.a     // Catch:{ all -> 0x007b }
            monitor-exit(r9)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x002d
        L_0x0084:
            monitor-exit(r9)
            throw r10
        L_0x0086:
            int r10 = r10 + 2
            r9.X = r10     // Catch:{ all -> 0x0012 }
            monitor-exit(r9)
            return r1
        L_0x008c:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0e.m(java.lang.Object, java.lang.Object):boolean");
    }

    public final void setValue(Object obj) {
        if (obj == null) {
            obj = ay9.a;
        }
        m((Object) null, obj);
    }
}
