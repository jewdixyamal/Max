package defpackage;

import android.os.Handler;
import android.view.View;

/* renamed from: enf  reason: default package */
public final /* synthetic */ class enf implements View.OnLayoutChangeListener {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ mec b;
    public final /* synthetic */ long c;

    public /* synthetic */ enf(Handler handler, mec mec, long j) {
        this.a = handler;
        this.b = mec;
        this.c = j;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Handler handler = this.a;
        handler.removeCallbacksAndMessages((Object) null);
        handler.postDelayed((Runnable) this.b.a, this.c);
    }
}
