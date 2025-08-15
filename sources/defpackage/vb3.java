package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.b;
import java.util.concurrent.Executor;

/* renamed from: vb3  reason: default package */
public final class vb3 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long a = (SystemClock.uptimeMillis() + ((long) 10000));
    public Runnable b;
    public boolean c;
    public final /* synthetic */ yb3 o;

    public vb3(b bVar) {
        this.o = bVar;
    }

    public final void a(View view) {
        if (!this.c) {
            this.c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public final void execute(Runnable runnable) {
        this.b = runnable;
        View decorView = this.o.getWindow().getDecorView();
        if (!this.c) {
            decorView.postOnAnimation(new cu1(15, this));
        } else if (tpa.f(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            this.b = null;
            j56 j56 = (j56) this.o.Z.getValue();
            synchronized (j56.b) {
                z = j56.c;
            }
            if (z) {
                this.c = false;
                this.o.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.a) {
            this.c = false;
            this.o.getWindow().getDecorView().post(this);
        }
    }

    public final void run() {
        this.o.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
