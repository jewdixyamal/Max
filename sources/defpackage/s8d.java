package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: s8d  reason: default package */
public final class s8d extends d8d implements hua, lr7 {
    public final String X = s8d.class.getName();
    public long Y;
    public sd7 Z;
    public final long b;
    public final long c;
    public final boolean o;

    public s8d(long j, long j2, boolean z) {
        this.b = j;
        this.c = j2;
        this.o = z;
    }

    public final void U0() {
        hm9.m(this.X, "onServiceNotAvailable, fail task", new Object[0]);
        l().c(this);
        cqc.a(new r8d(this, 0), ((jle) q()).a(), (f6) null, new ey1(27, this), (ztc) null);
        cqc.b(this.Z);
        y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = defpackage.vx8.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r3 = this;
            au8 r0 = r3.n()
            long r1 = r3.c
            cu8 r3 = r0.q(r1)
            if (r3 == 0) goto L_0x001b
            vx8 r0 = defpackage.vx8.DELETED
            vx8 r1 = r3.v0
            if (r1 == r0) goto L_0x001b
            boolean r3 = r3.z()
            if (r3 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 1
            return r3
        L_0x001b:
            r3 = 3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s8d.c():int");
    }

    public final void d() {
        hm9.m(this.X, "onMaxFailCount: remove task, mark message as error", new Object[0]);
        cqc.b(this.Z);
        cu8 q = n().q(this.c);
        if (q != null) {
            n().x(q, iu8.ERROR);
            l().c(this);
            r().d(this.b);
        }
    }

    public final byte[] f() {
        Tasks.LocationRequest locationRequest = new Tasks.LocationRequest();
        locationRequest.requestId = this.b;
        locationRequest.messageId = this.c;
        locationRequest.liveLocation = this.o;
        return qw8.toByteArray(locationRequest);
    }

    public final long getId() {
        return this.b;
    }

    public final iua getType() {
        return iua.TYPE_LOCATION_REQUEST;
    }

    public final int h() {
        return 1000000;
    }

    public final void p1(er7 er7) {
        int i;
        String str = this.X;
        hm9.m(str, "onLocation: %s", er7);
        if (this.o) {
            z(er7);
            return;
        }
        e8d e8d = this.a;
        if (e8d == null) {
            e8d = null;
        }
        ((ri4) e8d.d.getValue()).getClass();
        if (SystemClock.elapsedRealtime() - this.Y > ((long) 30000)) {
            hm9.m(str, "onLocation: accuracy timeout reached, use minRequiredAccuracy", new Object[0]);
            i = HttpStatus.SC_MULTIPLE_CHOICES;
        } else {
            i = 30;
        }
        float f = er7.o;
        if (f < ((float) i)) {
            z(er7);
        } else {
            hm9.m(str, "onLocation: accuracy %f is not enough, continue listening for location updates", Float.valueOf(f));
        }
    }

    public final void x() {
        hm9.m(this.X, "Process request location for message: " + this.c, new Object[0]);
        e8d e8d = this.a;
        if (e8d == null) {
            e8d = null;
        }
        ((ri4) e8d.d.getValue()).getClass();
        this.Y = SystemClock.elapsedRealtime();
        l().b(this);
        cqc.b(this.Z);
        if (!this.o) {
            long j = (long) 60000;
            r8d r8d = new r8d(this, 1);
            wd6 wd6 = new wd6(26, (Object) this);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ztc a = muc.a();
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(a, "scheduler is null");
            vz9 vz9 = vz9.a;
            kj6 kj6 = ft.e;
            sd7 sd7 = new sd7(new p4c(13), wd6, ft.d);
            Objects.requireNonNull(sd7, "observer is null");
            try {
                nz9 nz9 = new nz9(sd7, kj6, kj6, r8d);
                Objects.requireNonNull(nz9, "observer is null");
                vz9.a(new jz9(new y6d(nz9), j, timeUnit, a.a()));
                this.Z = sd7;
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                c37.B(th);
                j47.Z(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
    }

    public final void y() {
        String str = this.X;
        hm9.m(str, "Reach max timeout", new Object[0]);
        l().c(this);
        r().d(this.b);
        au8 n = n();
        long j = this.c;
        cu8 q = n.q(j);
        if (q != null && q.v0 != vx8.DELETED) {
            l20 a = q.a(g20.x0);
            long j2 = q.t0;
            if (a != null) {
                n().x(q, iu8.ERROR);
                n().u(q, a.r, d20.b);
                t().c(new l6f(q.t0, this.c, 0));
                p82 b2 = b();
                if (!b2.k.contains(Long.valueOf(j2))) {
                    m().d(q.t0, q.o, this.c);
                    return;
                }
                return;
            }
            hm9.p(str, "Reach max timeout: WTF, no location attach in message", (Throwable) null);
            au8 n2 = n();
            n2.getClass();
            n2.c(j2, Collections.singletonList(Long.valueOf(j)));
            t().c(new re9(j2, Collections.singletonList(Long.valueOf(j)), (mg4) null));
        }
    }

    public final void z(er7 er7) {
        hm9.m(this.X, "onSuccess: %s", er7);
        cqc.b(this.Z);
        l().c(this);
        w4d w4d = cqc.a;
        cqc.a(new p00(this, 10, er7), (ztc) w4d.b, (f6) null, new sy4(27, (Object) this), (ztc) null);
    }
}
