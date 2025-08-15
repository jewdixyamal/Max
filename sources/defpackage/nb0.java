package defpackage;

import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nb0  reason: default package */
public final class nb0 implements AutoCloseable {
    public final AtomicReference X;
    public final AtomicBoolean Y;
    public final cd6 Z;
    public final ey1 a;
    public final AtomicBoolean b;
    public final AtomicReference c;
    public final AtomicReference o;
    public final hi5 s0;
    public final Executor t0;
    public final tj3 u0;
    public final boolean v0;
    public final boolean w0;
    public final long x0;

    public nb0(hi5 hi5, Executor executor, tj3 tj3, boolean z, boolean z2, long j) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new ey1(9, new h43()) : new ey1(9, new Object());
        this.b = new AtomicBoolean(false);
        this.c = new AtomicReference((Object) null);
        this.o = new AtomicReference((Object) null);
        this.X = new AtomicReference(new al9(20));
        this.Y = new AtomicBoolean(false);
        this.Z = new cd6(Boolean.FALSE);
        if (hi5 != null) {
            this.s0 = hi5;
            this.t0 = executor;
            this.u0 = tj3;
            this.v0 = z;
            this.w0 = z2;
            this.x0 = j;
            return;
        }
        throw new NullPointerException("Null getOutputOptions");
    }

    public final void a(Uri uri) {
        if (this.b.get()) {
            d((tj3) this.X.getAndSet((Object) null), uri);
        }
    }

    public final void close() {
        a(Uri.EMPTY);
    }

    public final void d(tj3 tj3, Uri uri) {
        if (tj3 != null) {
            ((i43) this.a.b).close();
            tj3.accept(uri);
            return;
        }
        throw new AssertionError("Recording " + this + " has already been finalized");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        nb0 nb0 = (nb0) obj;
        if (this.s0.equals(nb0.s0)) {
            Executor executor = nb0.t0;
            Executor executor2 = this.t0;
            if (executor2 != null ? executor2.equals(executor) : executor == null) {
                tj3 tj3 = nb0.u0;
                tj3 tj32 = this.u0;
                if (tj32 != null ? tj32.equals(tj3) : tj3 == null) {
                    if (this.v0 == nb0.v0 && this.w0 == nb0.w0 && this.x0 == nb0.x0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void finalize() {
        try {
            ((i43) this.a.b).a();
            tj3 tj3 = (tj3) this.X.getAndSet((Object) null);
            if (tj3 != null) {
                d(tj3, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(Context context) {
        if (!this.b.getAndSet(true)) {
            ((i43) this.a.b).b("finalizeRecording");
            this.c.set(new vcc(this.s0));
            if (this.v0) {
                int i = Build.VERSION.SDK_INT;
                AtomicReference atomicReference = this.o;
                if (i >= 31) {
                    atomicReference.set(new wcc(this, context));
                } else {
                    atomicReference.set(new xcc(this));
                }
            }
        } else {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
    }

    public final int hashCode() {
        int hashCode = (this.s0.b.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        Executor executor = this.t0;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        tj3 tj3 = this.u0;
        if (tj3 != null) {
            i = tj3.hashCode();
        }
        int i2 = 1237;
        int i3 = (((hashCode2 ^ i) * 1000003) ^ (this.v0 ? 1231 : 1237)) * 1000003;
        if (this.w0) {
            i2 = 1231;
        }
        long j = this.x0;
        return ((int) ((j >>> 32) ^ j)) ^ ((i3 ^ i2) * 1000003);
    }

    public final MediaMuxer m(int i, cy1 cy1) {
        if (this.b.get()) {
            vcc vcc = (vcc) this.c.getAndSet((Object) null);
            if (vcc != null) {
                try {
                    return vcc.a(i, cy1);
                } catch (RuntimeException e) {
                    throw new IOException("Failed to create MediaMuxer by " + e, e);
                }
            } else {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
        } else {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
    }

    public final void n(xkf xkf) {
        int i;
        hi5 hi5 = xkf.a;
        hi5 hi52 = this.s0;
        if (Objects.equals(hi5, hi52)) {
            "Sending VideoRecordEvent ".concat(xkf.getClass().getSimpleName());
            boolean z = xkf instanceof skf;
            if (z && (i = ((skf) xkf).b) != 0) {
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown(");
                        sb.append(i);
                        sb.append(")");
                        break;
                }
            }
            boolean z2 = xkf instanceof vkf;
            cd6 cd6 = this.Z;
            if (z2 || (xkf instanceof ukf)) {
                cd6.v(Boolean.TRUE);
            } else if ((xkf instanceof tkf) || z) {
                cd6.v(Boolean.FALSE);
            }
            Executor executor = this.t0;
            if (executor != null && this.u0 != null) {
                try {
                    executor.execute(new do9(this, 28, xkf));
                } catch (RejectedExecutionException unused) {
                }
            }
        } else {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + hi5 + ", Expected: " + hi52 + "]");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.s0);
        sb.append(", getCallbackExecutor=");
        sb.append(this.t0);
        sb.append(", getEventListener=");
        sb.append(this.u0);
        sb.append(", hasAudioEnabled=");
        sb.append(this.v0);
        sb.append(", isPersistent=");
        sb.append(this.w0);
        sb.append(", getRecordingId=");
        return zr6.k(sb, this.x0, "}");
    }
}
