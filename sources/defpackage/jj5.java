package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: jj5  reason: default package */
public final class jj5 extends q1 {
    public final /* synthetic */ c6d X;
    public final /* synthetic */ int c = 0;
    public final ArrayDeque o;

    public jj5(lj5 lj5) {
        this.X = lj5;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.o = arrayDeque;
        if (lj5.a.isDirectory()) {
            arrayDeque.push(b(lj5.a));
        } else if (lj5.a.isFile()) {
            arrayDeque.push(new kj5(lj5.a));
        } else {
            this.a = 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r2 == r1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0.size() < r6) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r0.add(c(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r2 == r1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r3.b.invoke(r2) == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r0.size() < r6) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r0.push(c(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r0 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r7.b = r0;
        r7.a = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r7.a = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r0 = r7.o;
        r1 = (defpackage.kj5) r0.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r1 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r2 = r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r0.pop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r7.o;
        r1 = (defpackage.u2f) r0.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (r2.equals(r1.a) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r2.isDirectory() == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        r1 = r0.size();
        ((defpackage.lj5) r7.X).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r1 < Integer.MAX_VALUE) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        r0.push(b(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009c, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        if (r0 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        r7.b = r0;
        r7.a = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        r7.a = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r2 = r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0.pop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = (defpackage.v2f) r7.X;
        r4 = r3.c;
        r6 = r3.g;
        r1 = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r4 != 3) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.c
            switch(r0) {
                case 0: goto L_0x005f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.ArrayDeque r0 = r7.o
            java.lang.Object r1 = r0.peek()
            u2f r1 = (defpackage.u2f) r1
            if (r1 != 0) goto L_0x0011
            r0 = 0
            goto L_0x0053
        L_0x0011:
            java.lang.Object r2 = r1.a()
            if (r2 != 0) goto L_0x001b
            r0.pop()
            goto L_0x0005
        L_0x001b:
            c6d r3 = r7.X
            v2f r3 = (defpackage.v2f) r3
            int r4 = r3.c
            r5 = 3
            int r6 = r3.g
            java.lang.Object r1 = r1.a
            if (r4 != r5) goto L_0x003a
            if (r2 == r1) goto L_0x0038
            int r1 = r0.size()
            if (r1 < r6) goto L_0x0031
            goto L_0x0038
        L_0x0031:
            p2f r1 = r7.c(r2)
            r0.add(r1)
        L_0x0038:
            r0 = r2
            goto L_0x0053
        L_0x003a:
            if (r2 == r1) goto L_0x0038
            m56 r1 = r3.b
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 == 0) goto L_0x0038
            int r1 = r0.size()
            if (r1 < r6) goto L_0x004b
            goto L_0x0038
        L_0x004b:
            p2f r1 = r7.c(r2)
            r0.push(r1)
            goto L_0x0005
        L_0x0053:
            if (r0 == 0) goto L_0x005b
            r7.b = r0
            r0 = 1
            r7.a = r0
            goto L_0x005e
        L_0x005b:
            r0 = 2
            r7.a = r0
        L_0x005e:
            return
        L_0x005f:
            java.util.ArrayDeque r0 = r7.o
            java.lang.Object r1 = r0.peek()
            kj5 r1 = (defpackage.kj5) r1
            if (r1 != 0) goto L_0x006b
            r0 = 0
            goto L_0x009d
        L_0x006b:
            java.io.File r2 = r1.a()
            if (r2 != 0) goto L_0x0075
            r0.pop()
            goto L_0x005f
        L_0x0075:
            java.io.File r1 = r1.a
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x009c
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L_0x009c
            int r1 = r0.size()
            c6d r3 = r7.X
            lj5 r3 = (defpackage.lj5) r3
            r3.getClass()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < r3) goto L_0x0094
            goto L_0x009c
        L_0x0094:
            fj5 r1 = r7.b(r2)
            r0.push(r1)
            goto L_0x005f
        L_0x009c:
            r0 = r2
        L_0x009d:
            if (r0 == 0) goto L_0x00a5
            r7.b = r0
            r0 = 1
            r7.a = r0
            goto L_0x00a8
        L_0x00a5:
            r0 = 2
            r7.a = r0
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj5.a():void");
    }

    public fj5 b(File file) {
        int s = au1.s(((lj5) this.X).b);
        if (s == 0) {
            return new ij5(this, file);
        }
        if (s == 1) {
            return new gj5(this, file);
        }
        throw new NoWhenBranchMatchedException();
    }

    public p2f c(Object obj) {
        int s = au1.s(((v2f) this.X).c);
        if (s == 0) {
            return new t2f(this, obj);
        }
        if (s == 1) {
            return new q2f(this, obj);
        }
        if (s == 2) {
            return new r2f(this, obj);
        }
        throw new NoWhenBranchMatchedException();
    }

    public jj5(v2f v2f) {
        this.X = v2f;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.o = arrayDeque;
        m56 m56 = v2f.b;
        Object obj = v2f.a;
        if (m56.invoke(obj) != null) {
            arrayDeque.push(c(obj));
            if (v2f.c == 3) {
                arrayDeque.push(new s2f(this, obj));
                return;
            }
            return;
        }
        arrayDeque.push(new s2f(this, obj));
    }
}
