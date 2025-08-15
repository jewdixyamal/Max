package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: eo7  reason: default package */
public final class eo7 extends Handler implements Runnable {
    public int X;
    public Thread Y;
    public boolean Z;
    public final /* synthetic */ int a;
    public final int b;
    public final long c;
    public IOException o;
    public volatile boolean s0;
    public final Object t0;
    public Object u0;
    public final /* synthetic */ Object v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo7(Object obj, Looper looper, Object obj2, Object obj3, int i, long j, int i2) {
        super(looper);
        this.a = i2;
        this.v0 = obj;
        this.t0 = obj2;
        this.u0 = obj3;
        this.b = i;
        this.c = j;
    }

    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                this.s0 = z;
                this.o = null;
                if (!hasMessages(0)) {
                    synchronized (this) {
                        try {
                            this.Z = true;
                            ((fo7) this.t0).a();
                            Thread thread = this.Y;
                            if (thread != null) {
                                thread.interrupt();
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                } else {
                    this.Z = true;
                    removeMessages(0);
                    if (!z) {
                        sendEmptyMessage(1);
                    }
                }
                if (z) {
                    ((jo7) this.v0).b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    co7 co7 = (co7) this.u0;
                    co7.getClass();
                    co7.o((fo7) this.t0, elapsedRealtime, elapsedRealtime - this.c, true);
                    this.u0 = null;
                    return;
                }
                return;
            default:
                this.s0 = z;
                this.o = null;
                if (!hasMessages(1)) {
                    synchronized (this) {
                        try {
                            this.Z = true;
                            ((go7) this.t0).a();
                            Thread thread2 = this.Y;
                            if (thread2 != null) {
                                thread2.interrupt();
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                                break;
                            }
                        }
                    }
                } else {
                    this.Z = true;
                    removeMessages(1);
                    if (!z) {
                        sendEmptyMessage(2);
                    }
                }
                if (z) {
                    ((vq7) this.v0).c = null;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    do7 do7 = (do7) this.u0;
                    do7.getClass();
                    do7.m((go7) this.t0, elapsedRealtime2, elapsedRealtime2 - this.c, true);
                    this.u0 = null;
                    return;
                }
                return;
        }
    }

    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (!this.s0) {
                    int i = message.what;
                    if (i == 0) {
                        this.o = null;
                        jo7 jo7 = (jo7) this.v0;
                        eo7 eo7 = (eo7) jo7.b;
                        eo7.getClass();
                        ((ExecutorService) jo7.a).execute(eo7);
                        return;
                    } else if (i != 3) {
                        ((jo7) this.v0).b = null;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j = elapsedRealtime - this.c;
                        co7 co7 = (co7) this.u0;
                        co7.getClass();
                        if (this.Z) {
                            co7.o((fo7) this.t0, elapsedRealtime, j, false);
                            return;
                        }
                        int i2 = message.what;
                        boolean z = true;
                        if (i2 == 1) {
                            try {
                                co7.y((fo7) this.t0, elapsedRealtime, j);
                                return;
                            } catch (RuntimeException e) {
                                fm9.c("Unexpected exception handling load completed", e);
                                ((jo7) this.v0).c = new Loader$UnexpectedLoaderException(e);
                                return;
                            }
                        } else if (i2 == 2) {
                            IOException iOException = (IOException) message.obj;
                            this.o = iOException;
                            int i3 = this.X + 1;
                            this.X = i3;
                            b11 z2 = co7.z((fo7) this.t0, elapsedRealtime, j, iOException, i3);
                            int i4 = z2.b;
                            if (i4 == 3) {
                                ((jo7) this.v0).c = this.o;
                                return;
                            } else if (i4 != 2) {
                                if (i4 == 1) {
                                    this.X = 1;
                                }
                                long j2 = z2.c;
                                if (j2 == -9223372036854775807L) {
                                    j2 = (long) Math.min((this.X - 1) * 1000, 5000);
                                }
                                jo7 jo72 = (jo7) this.v0;
                                if (((eo7) jo72.b) != null) {
                                    z = false;
                                }
                                np8.f(z);
                                jo72.b = this;
                                if (j2 > 0) {
                                    sendEmptyMessageDelayed(0, j2);
                                    return;
                                }
                                this.o = null;
                                ((ExecutorService) jo72.a).execute(this);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        throw ((Error) message.obj);
                    }
                } else {
                    return;
                }
            default:
                if (!this.s0) {
                    int i5 = message.what;
                    if (i5 == 1) {
                        this.o = null;
                        vq7 vq7 = (vq7) this.v0;
                        eo7 eo72 = (eo7) vq7.c;
                        eo72.getClass();
                        ((ExecutorService) vq7.b).execute(eo72);
                        return;
                    } else if (i5 != 4) {
                        ((vq7) this.v0).c = null;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        long j3 = elapsedRealtime2 - this.c;
                        do7 do7 = (do7) this.u0;
                        do7.getClass();
                        if (this.Z) {
                            do7.m((go7) this.t0, elapsedRealtime2, j3, false);
                            return;
                        }
                        int i6 = message.what;
                        if (i6 == 2) {
                            try {
                                do7.v((go7) this.t0, elapsedRealtime2, j3);
                                return;
                            } catch (RuntimeException e2) {
                                z04.v("Unexpected exception handling load completed", e2);
                                ((vq7) this.v0).o = new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e2);
                                return;
                            }
                        } else if (i6 == 3) {
                            IOException iOException2 = (IOException) message.obj;
                            this.o = iOException2;
                            int i7 = this.X + 1;
                            this.X = i7;
                            b11 C = do7.C((go7) this.t0, elapsedRealtime2, j3, iOException2, i7);
                            int i8 = C.b;
                            if (i8 == 3) {
                                ((vq7) this.v0).o = this.o;
                                return;
                            } else if (i8 != 2) {
                                if (i8 == 1) {
                                    this.X = 1;
                                }
                                long j4 = C.c;
                                if (j4 == -9223372036854775807L) {
                                    j4 = (long) Math.min((this.X - 1) * 1000, 5000);
                                }
                                vq7 vq72 = (vq7) this.v0;
                                fm9.k(((eo7) vq72.c) == null);
                                vq72.c = this;
                                if (j4 > 0) {
                                    sendEmptyMessageDelayed(1, j4);
                                    return;
                                }
                                this.o = null;
                                ((ExecutorService) vq72.b).execute(this);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        throw ((Error) message.obj);
                    }
                } else {
                    return;
                }
        }
    }

    public final void run() {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                try {
                    synchronized (this) {
                        z = !this.Z;
                        this.Y = Thread.currentThread();
                    }
                    if (z) {
                        String simpleName = ((fo7) this.t0).getClass().getSimpleName();
                        j47.k(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                        ((fo7) this.t0).load();
                        j47.A();
                    }
                    synchronized (this) {
                        this.Y = null;
                        Thread.interrupted();
                    }
                    if (!this.s0) {
                        sendEmptyMessage(1);
                        return;
                    }
                    return;
                } catch (IOException e) {
                    if (!this.s0) {
                        obtainMessage(2, e).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    if (!this.s0) {
                        fm9.c("Unexpected exception loading stream", e2);
                        obtainMessage(2, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
                        return;
                    }
                    return;
                } catch (OutOfMemoryError e3) {
                    if (!this.s0) {
                        fm9.c("OutOfMemory error loading stream", e3);
                        obtainMessage(2, new Loader$UnexpectedLoaderException(e3)).sendToTarget();
                        return;
                    }
                    return;
                } catch (Error e4) {
                    if (!this.s0) {
                        fm9.c("Unexpected error loading stream", e4);
                        obtainMessage(3, e4).sendToTarget();
                    }
                    throw e4;
                } catch (Throwable th) {
                    j47.A();
                    throw th;
                }
            default:
                try {
                    synchronized (this) {
                        z2 = !this.Z;
                        this.Y = Thread.currentThread();
                    }
                    if (z2) {
                        Trace.beginSection("load:".concat(((go7) this.t0).getClass().getSimpleName()));
                        ((go7) this.t0).load();
                        Trace.endSection();
                    }
                    synchronized (this) {
                        this.Y = null;
                        Thread.interrupted();
                    }
                    if (!this.s0) {
                        sendEmptyMessage(2);
                        return;
                    }
                    return;
                } catch (IOException e5) {
                    if (!this.s0) {
                        obtainMessage(3, e5).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    if (!this.s0) {
                        z04.v("Unexpected exception loading stream", e6);
                        obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e6)).sendToTarget();
                        return;
                    }
                    return;
                } catch (OutOfMemoryError e7) {
                    if (!this.s0) {
                        z04.v("OutOfMemory error loading stream", e7);
                        obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e7)).sendToTarget();
                        return;
                    }
                    return;
                } catch (Error e8) {
                    if (!this.s0) {
                        z04.v("Unexpected error loading stream", e8);
                        obtainMessage(4, e8).sendToTarget();
                    }
                    throw e8;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
        }
    }
}
