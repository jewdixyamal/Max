package defpackage;

import android.util.SparseIntArray;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: bg7  reason: default package */
public final class bg7 {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public bg7() {
        jyc jyc = jyc.a;
        f5a d2 = jyc.d();
        jp jpVar = ((p7b) jyc.q()).c;
        je7 je7 = iyc.a;
        khe d3 = jyc.getAccessor().d(q33.class);
        je7 je72 = iyc.e;
        khe d4 = jyc.getAccessor().d(blb.class);
        khe d5 = jyc.getAccessor().d(t23.class);
        khe khe = new khe(new m57(10));
        khe khe2 = new khe(new m57(11));
        je7 je73 = iyc.a;
        this.b = d2;
        this.c = jpVar;
        this.d = d3;
        this.e = je72;
        this.f = d4;
        this.a = 6;
        this.g = d5;
        this.h = khe;
        this.i = khe2;
        this.j = je73;
    }

    public static void b(int i2, k56 k56) {
        long nanoTime = System.nanoTime();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "LibraryUpgradeHelper", wg0.g(i2, "Upgrade to ", " started"), (Throwable) null);
        }
        k56.invoke();
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            us7 us7 = us7.X;
            int i3 = ft4.o;
            String j2 = ft4.j(z7.S(System.nanoTime() - nanoTime, kt4.NANOSECONDS));
            ir62.d(us7, "LibraryUpgradeHelper", "Upgrade to " + i2 + " complete. It takes " + j2, (Throwable) null);
        }
    }

    public void a() {
        kxc kxc = (kxc) ((hp) this.c);
        boolean contains = kxc.g.contains("app.library.version");
        f5a f5a = (f5a) this.b;
        int i2 = this.a;
        if (!contains) {
            if (f5a.d()) {
                kxc.k(5, "app.library.version");
            } else {
                kxc.k(i2, "app.library.version");
            }
        }
        int i3 = kxc.g.getInt("app.library.version", 6);
        if (i3 == i2) {
            hm9.m("LibraryUpgradeHelper", "upgrade not needed", new Object[0]);
            return;
        }
        if (f5a.d()) {
            if (i3 < 1) {
                b(1, new xf7(this, 0));
            }
            if (i3 <= 1 && i2 > 1) {
                b(2, new xf7(this, 1));
            }
            if (i3 <= 3 && i2 > 3) {
                b(4, new xf7(this, 2));
            }
            if (i3 <= 4 && i2 > 4) {
                b(5, new xf7(this, 3));
            }
            if (i3 <= 5 && i2 > 5) {
                b(6, new xf7(this, 4));
            }
        }
        kxc.k(i2, "app.library.version");
    }

    public bg7(h7b h7b) {
        int i2;
        f46.I();
        h7b.getClass();
        this.b = n84.a();
        this.c = rq9.o();
        int i3 = xa4.a;
        int i4 = i3 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i5 = 131072; i5 <= 4194304; i5 *= 2) {
            sparseIntArray.put(i5, i3);
        }
        this.d = new n5b(4194304, i4, sparseIntArray, xa4.a);
        this.e = qq9.j();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i6 = min < 16777216 ? 3145728 : min < 33554432 ? 6291456 : 12582912;
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min2 < 16777216) {
            i2 = min2 / 2;
        } else {
            i2 = (min2 / 4) * 3;
        }
        this.f = new n5b(i6, i2, sparseIntArray2, -1);
        this.g = rq9.o();
        n5b n5b = (n5b) h7b.b;
        if (n5b == null) {
            SparseIntArray sparseIntArray3 = new SparseIntArray();
            sparseIntArray3.put(16384, 5);
            n5b = new n5b(81920, 1048576, sparseIntArray3, -1);
        }
        this.h = n5b;
        this.i = rq9.o();
        String str = (String) h7b.c;
        this.j = str == null ? "legacy" : str;
        this.a = 4194304;
        f46.I();
    }
}
