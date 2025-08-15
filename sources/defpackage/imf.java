package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: imf  reason: default package */
public final class imf implements View.OnClickListener, zl4 {
    public final AtomicBoolean a = new AtomicBoolean();
    public final View b;
    public final f2a c;

    public imf(View view, f2a f2a) {
        this.b = view;
        this.c = f2a;
    }

    public final void g() {
        if (!this.a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.b.setOnClickListener((View.OnClickListener) null);
        } else {
            ce.a().b(new nn6(8, this));
        }
    }

    public final boolean h() {
        return this.a.get();
    }

    public final void onClick(View view) {
        if (!this.a.get()) {
            this.c.e(e5f.a);
        }
    }
}
