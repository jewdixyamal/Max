package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: jnb  reason: default package */
public final class jnb implements zo4 {
    public final Executor a;
    public final a34 b;
    public final ow0 c;
    public final ix0 d;
    public yo4 e;
    public volatile inb f;
    public volatile boolean g;

    public jnb(tb8 tb8, mw0 mw0, Executor executor) {
        executor.getClass();
        this.a = executor;
        ib8 ib8 = tb8.b;
        ib8.getClass();
        Map emptyMap = Collections.emptyMap();
        Uri uri = ib8.a;
        fm9.m(uri, "The uri must be set.");
        String str = ib8.f;
        a34 a34 = r2;
        a34 a342 = new a34(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, str, 4, (Object) null);
        this.b = a34;
        ow0 c2 = mw0.c();
        this.c = c2;
        this.d = new ix0(c2, a34, (byte[]) null, new yt8(22, (Object) this));
    }

    public final void a(yo4 yo4) {
        this.e = yo4;
        boolean z = false;
        while (!z) {
            try {
                if (this.g) {
                    break;
                }
                this.f = new inb(this);
                this.a.execute(this.f);
                this.f.get();
                z = true;
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                cause.getClass();
                if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i = oaf.a;
                    throw cause;
                }
            } catch (Throwable th) {
                inb inb = this.f;
                inb.getClass();
                inb.a();
                throw th;
            }
        }
        inb inb2 = this.f;
        inb2.getClass();
        inb2.a();
    }

    public final void cancel() {
        this.g = true;
        inb inb = this.f;
        if (inb != null) {
            inb.cancel(true);
        }
    }

    public final void remove() {
        ow0 ow0 = this.c;
        ((spd) ow0.a).l(ow0.X.e(this.b));
    }
}
