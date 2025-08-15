package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* renamed from: ba8  reason: default package */
public final class ba8 implements IBinder.DeathRecipient {
    public final b98 a = new b98(this);
    public t94 b;
    public d98 c;
    public final Handler d;
    public final /* synthetic */ da8 e;

    public ba8(da8 da8, Looper looper) {
        this.e = da8;
        this.d = new Handler(looper, new hl4(5, this));
    }

    public final void a(f98 f98) {
        da8 da8 = this.e;
        ca8 ca8 = da8.l;
        int i = ca8.g;
        f98 f982 = f98;
        da8.l = new ca8(f982, ca8.b, ca8.c, ca8.d, ca8.e, ca8.f, i, ca8.h);
        k();
    }

    public final void b(boolean z) {
        a98 a98 = this.e.b;
        a98.getClass();
        fm9.k(Looper.myLooper() == a98.X.getLooper());
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        new y9d("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY);
        a98.o.getClass();
        y88.b();
    }

    public final void binderDied() {
        i(8, (Object) null, (Bundle) null);
    }

    public final void c(Bundle bundle) {
        da8 da8 = this.e;
        ai3 ai3 = da8.m;
        da8.m = new ai3((m4b) ai3.a, (z9d) ai3.b, (k3b) ai3.c, (zw6) ai3.o, bundle, (iad) null);
        a98 a98 = da8.b;
        a98.getClass();
        fm9.k(Looper.myLooper() == a98.X.getLooper());
        a98 a982 = da8.b;
        a98.o.getClass();
    }

    public final void d(hd8 hd8) {
        da8 da8 = this.e;
        ca8 ca8 = da8.l;
        int i = ca8.g;
        hd8 hd82 = hd8;
        da8.l = new ca8(ca8.a, ca8.b, hd82, ca8.d, ca8.e, ca8.f, i, ca8.h);
        k();
    }

    public final void e(i3b i3b) {
        da8 da8 = this.e;
        ca8 ca8 = da8.l;
        i3b j = da8.j(i3b);
        int i = ca8.g;
        da8.l = new ca8(ca8.a, j, ca8.c, ca8.d, ca8.e, ca8.f, i, ca8.h);
        k();
    }

    public final void f(List list) {
        da8 da8 = this.e;
        ca8 ca8 = da8.l;
        List i = da8.i(list);
        int i2 = ca8.g;
        da8.l = new ca8(ca8.a, ca8.b, ca8.c, i, ca8.e, ca8.f, i2, ca8.h);
        k();
    }

    public final void g(CharSequence charSequence) {
        da8 da8 = this.e;
        ca8 ca8 = da8.l;
        int i = ca8.g;
        CharSequence charSequence2 = charSequence;
        da8.l = new ca8(ca8.a, ca8.b, ca8.c, ca8.d, charSequence2, ca8.f, i, ca8.h);
        k();
    }

    public final void h(String str, Bundle bundle) {
        if (str != null) {
            a98 a98 = this.e.b;
            a98.getClass();
            fm9.k(Looper.myLooper() == a98.X.getLooper());
            new y9d(str, Bundle.EMPTY);
            a98.o.getClass();
            y88.b();
        }
    }

    public final void i(int i, Object obj, Bundle bundle) {
        t94 t94 = this.b;
        if (t94 != null) {
            Message obtainMessage = t94.obtainMessage(i, obj);
            if (bundle != null) {
                obtainMessage.setData(bundle);
            }
            obtainMessage.sendToTarget();
        }
    }

    public final void j(Handler handler) {
        if (handler == null) {
            t94 t94 = this.b;
            if (t94 != null) {
                t94.b = false;
                t94.removeCallbacksAndMessages((Object) null);
                this.b = null;
                return;
            }
            return;
        }
        t94 t942 = new t94(this, handler.getLooper());
        this.b = t942;
        t942.b = true;
    }

    public final void k() {
        Handler handler = this.d;
        if (!handler.hasMessages(1)) {
            handler.sendEmptyMessageDelayed(1, 500);
        }
    }
}
