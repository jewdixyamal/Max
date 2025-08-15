package defpackage;

import java.util.Iterator;

/* renamed from: ig7  reason: default package */
public final class ig7 extends lw1 {
    public eh7 E;

    public final hg7 p() {
        adb adb;
        if (this.E == null || this.n == null) {
            return null;
        }
        if (!i() || this.p == null || this.o == null) {
            adb = null;
        } else {
            s9f s9f = new s9f();
            s9f.a(this.c);
            kq0.e();
            if ((this.b & 1) != 0) {
                s9f.a(this.d);
            } else {
                this.n.a(this.d);
            }
            kq0.e();
            if ((this.b & 2) != 0) {
                s9f.a(this.e);
            } else {
                this.n.a(this.e);
            }
            kq0.e();
            if ((this.b & 4) != 0) {
                s9f.a(this.f);
            } else {
                this.n.a(this.f);
            }
            s9f.a = this.o;
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                s9f.c.add((zgf) it.next());
            }
            adb = s9f.b();
        }
        if (adb == null) {
            return null;
        }
        try {
            return this.n.a.c(this.E, this.a, adb);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
        }
    }
}
