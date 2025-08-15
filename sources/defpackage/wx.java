package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: wx  reason: default package */
public class wx extends oue {
    public static final long h;
    public static final long i;
    public static wx j;
    public boolean e;
    public wx f;
    public long g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [wx, java.lang.Object] */
    public final void i() {
        wx wxVar;
        if (!this.e) {
            long j2 = this.c;
            boolean z = this.a;
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 != 0 || z) {
                this.e = true;
                synchronized (wx.class) {
                    try {
                        if (j == null) {
                            j = new Object();
                            tx txVar = new tx("Okio Watchdog");
                            txVar.setDaemon(true);
                            txVar.start();
                        }
                        long nanoTime = System.nanoTime();
                        if (i2 != 0 && z) {
                            this.g = Math.min(j2, c() - nanoTime) + nanoTime;
                        } else if (i2 != 0) {
                            this.g = j2 + nanoTime;
                        } else if (z) {
                            this.g = c();
                        } else {
                            throw new AssertionError();
                        }
                        long j3 = this.g - nanoTime;
                        wx wxVar2 = j;
                        while (true) {
                            wxVar = wxVar2.f;
                            if (wxVar == null) {
                                break;
                            } else if (j3 < wxVar.g - nanoTime) {
                                break;
                            } else {
                                wxVar2 = wxVar;
                            }
                        }
                        this.f = wxVar;
                        wxVar2.f = this;
                        if (wxVar2 == j) {
                            wx.class.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean j() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        synchronized (wx.class) {
            wx wxVar = j;
            while (wxVar != null) {
                wx wxVar2 = wxVar.f;
                if (wxVar2 == this) {
                    wxVar.f = this.f;
                    this.f = null;
                    return false;
                }
                wxVar = wxVar2;
            }
            return true;
        }
    }

    public IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void l() {
    }
}
