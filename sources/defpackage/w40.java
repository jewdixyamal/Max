package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: w40  reason: default package */
public final class w40 implements sf6 {
    public final j60 a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final ConcurrentLinkedQueue d;
    public final AtomicLong e;
    public adb f;
    public p54 g;
    public h60 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;

    public w40(j60 j60, lv4 lv4, qy5 qy5) {
        j60 j602 = new j60(qy5);
        boolean z = false;
        fm9.e(j602, (j602.c == -1 || j602.a == -1 || j602.b == -1) ? false : true);
        this.b = new ConcurrentLinkedQueue();
        ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i2 = 0; i2 < 10; i2++) {
            p54 p54 = new p54(2);
            p54.X = order;
            this.b.add(p54);
        }
        this.c = new ConcurrentLinkedQueue();
        this.d = new ConcurrentLinkedQueue();
        this.f = new adb(j602);
        h60 k2 = k(lv4, qy5, j602, j60);
        this.h = k2;
        k2.b();
        j60 j603 = this.h.d;
        this.a = j603;
        fm9.e(j603, j603.c == 2 ? true : z);
        this.e = new AtomicLong(-9223372036854775807L);
        this.l = -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ww6, pw6] */
    public static h60 k(lv4 lv4, qy5 qy5, j60 j60, j60 j602) {
        int i2;
        f99 f99;
        ? pw6 = new pw6(4);
        if (!(!lv4.d || qy5 == null || (f99 = qy5.k) == null)) {
            pw6.a(new qvd(new xjc(f99)));
        }
        pw6.e(lv4.g.a);
        int i3 = j602.a;
        if (i3 != -1) {
            vud vud = new vud();
            vud.b = i3;
            pw6.a(vud);
        }
        int i4 = j602.b;
        if (i4 == 1 || i4 == 2) {
            e42 e42 = new e42();
            f42 a2 = f42.a(1, i4);
            SparseArray sparseArray = e42.i;
            sparseArray.put(a2.a, a2);
            f42 a3 = f42.a(2, i4);
            sparseArray.put(a3.a, a3);
            pw6.a(e42);
        }
        h60 h60 = new h60(pw6.j());
        j60 a4 = h60.a(j60);
        if ((i3 == -1 || i3 == a4.a) && ((i4 == -1 || i4 == a4.b) && ((i2 = j602.c) == -1 || i2 == a4.c))) {
            return h60;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Audio can not be modified to match downstream format", j60);
    }

    public final void b(lv4 lv4, long j2, qy5 qy5, boolean z) {
        boolean z2 = false;
        if (qy5 == null) {
            if (j2 != -9223372036854775807L) {
                z2 = true;
            }
            fm9.j("Could not generate silent audio because duration is unknown.", z2);
        } else {
            fm9.k(ia9.h(qy5.n));
            j60 j60 = new j60(qy5);
            if (!(j60.c == -1 || j60.a == -1 || j60.b == -1)) {
                z2 = true;
            }
            fm9.j(j60, z2);
        }
        this.d.add(new v40(lv4, j2, qy5, z));
    }

    public final p54 d() {
        if (!this.d.isEmpty()) {
            return null;
        }
        return (p54) this.b.peek();
    }

    public final boolean f() {
        fm9.k(this.d.isEmpty());
        p54 p54 = (p54) this.b.remove();
        this.c.add(p54);
        this.e.compareAndSet(-9223372036854775807L, p54.Z);
        return true;
    }

    public final void i() {
        adb adb = this.f;
        long j2 = this.l;
        long j3 = this.m;
        j60 j60 = (j60) adb.a;
        long Y = j2 - oaf.Y(j60.a, j3 / ((long) j60.d));
        j60 j602 = (j60) adb.a;
        ((AtomicLong) adb.c).addAndGet(((long) j602.d) * oaf.a0(Y, (long) j602.a, 1000000, RoundingMode.CEILING));
        this.n = true;
        if (this.o) {
            this.k = true;
        }
    }

    public final void j(p54 p54) {
        p54.v();
        p54.Z = 0;
        this.b.add(p54);
    }

    public final ByteBuffer l() {
        ByteBuffer byteBuffer;
        j60 j60;
        boolean z = this.i;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
        if (!z) {
            byteBuffer = m60.a;
        } else {
            boolean f2 = this.h.f();
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.c;
            if (f2) {
                while (true) {
                    if (this.f.s()) {
                        ByteBuffer l2 = this.f.l();
                        this.h.i(l2);
                        if (l2.hasRemaining()) {
                            break;
                        } else if (!this.f.s()) {
                            this.h.h();
                            break;
                        }
                    } else {
                        p54 p54 = (p54) concurrentLinkedQueue2.peek();
                        if (p54 == null) {
                            if (!concurrentLinkedQueue.isEmpty()) {
                                if (!n()) {
                                    this.h.h();
                                    break;
                                }
                                i();
                            } else {
                                break;
                            }
                        } else if (p54.f(4)) {
                            if (!n()) {
                                this.h.h();
                                this.j = true;
                                j((p54) concurrentLinkedQueue2.remove());
                                break;
                            }
                            i();
                            j((p54) concurrentLinkedQueue2.remove());
                        } else {
                            ByteBuffer byteBuffer2 = p54.X;
                            byteBuffer2.getClass();
                            this.h.i(byteBuffer2);
                            this.m += ((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining());
                            if (byteBuffer2.hasRemaining()) {
                                break;
                            }
                            j((p54) concurrentLinkedQueue2.remove());
                        }
                    }
                }
                byteBuffer = this.h.d();
            } else if (this.f.s()) {
                byteBuffer = this.f.l();
            } else {
                p54 p542 = this.g;
                if (p542 != null) {
                    byteBuffer = p542.X;
                    fm9.l(byteBuffer);
                    if (!byteBuffer.hasRemaining()) {
                        p54 p543 = this.g;
                        fm9.l(p543);
                        j(p543);
                        this.g = null;
                    }
                }
                p54 p544 = (p54) concurrentLinkedQueue2.poll();
                if (p544 == null) {
                    if (!concurrentLinkedQueue.isEmpty() && n()) {
                        i();
                    }
                    byteBuffer = m60.a;
                } else {
                    ByteBuffer byteBuffer3 = p544.X;
                    this.j = p544.f(4);
                    if (byteBuffer3 == null || !byteBuffer3.hasRemaining() || this.j) {
                        j(p544);
                        if (this.j && n()) {
                            i();
                        }
                        byteBuffer = m60.a;
                    } else {
                        this.g = p544;
                        this.m += (long) byteBuffer3.remaining();
                        byteBuffer = byteBuffer3;
                    }
                }
            }
        }
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        if (!m() && !concurrentLinkedQueue.isEmpty()) {
            v40 v40 = (v40) concurrentLinkedQueue.poll();
            fm9.l(v40);
            this.m = 0;
            this.o = v40.d;
            this.n = false;
            lv4 lv4 = v40.a;
            long j2 = v40.b;
            qy5 qy5 = v40.c;
            if (qy5 != null) {
                this.l = j2;
                j60 = new j60(qy5);
                this.f = new adb(j60);
            } else {
                if (lv4.g.a.isEmpty()) {
                    this.l = lv4.b(j2);
                } else {
                    this.l = j2;
                }
                this.e.compareAndSet(-9223372036854775807L, 0);
                i();
                j60 = (j60) this.f.a;
            }
            if (this.i) {
                this.h = k(lv4, qy5, j60, this.a);
            }
            this.h.b();
            this.j = false;
            this.i = true;
        }
        return m60.a;
    }

    public final boolean m() {
        ByteBuffer byteBuffer;
        if (!this.i) {
            return false;
        }
        p54 p54 = this.g;
        if ((p54 == null || (byteBuffer = p54.X) == null || !byteBuffer.hasRemaining()) && !this.f.s() && this.c.isEmpty()) {
            return this.h.f() && !this.h.e();
        }
        return true;
    }

    public final boolean n() {
        if (!this.n) {
            long j2 = this.l;
            if (j2 != -9223372036854775807L) {
                long j3 = this.m;
                j60 j60 = (j60) this.f.a;
                if (j2 - oaf.Y(j60.a, j3 / ((long) j60.d)) > 2000) {
                    return true;
                }
            }
        }
        return false;
    }
}
