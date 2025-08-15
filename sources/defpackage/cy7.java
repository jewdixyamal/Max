package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: cy7  reason: default package */
public final class cy7 extends av0 {
    public final Handler i = new Handler(Looper.getMainLooper());

    public final void c(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            super.c(obj);
        } else {
            this.i.post(new by7(this, obj, 0));
        }
    }

    public final void d(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                super.d(obj);
            } catch (Exception unused) {
            }
        } else {
            this.i.post(new by7(this, obj, 1));
        }
    }

    public final void f(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                super.f(obj);
            } catch (Exception unused) {
            }
        } else {
            this.i.post(new by7(this, obj, 2));
        }
    }
}
