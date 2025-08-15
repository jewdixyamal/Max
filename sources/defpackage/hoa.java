package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: hoa  reason: default package */
public final class hoa extends EdgeEffect {
    public kwd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ioa c;
    public final /* synthetic */ RecyclerView d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hoa(int i, ioa ioa, RecyclerView recyclerView, Context context) {
        super(context);
        this.b = i;
        this.c = ioa;
        this.d = recyclerView;
    }

    public final kwd a() {
        kwd kwd = new kwd(this.d, kwd.q);
        lwd lwd = new lwd();
        lwd.i = (double) 0.0f;
        lwd.a(1.0f);
        lwd.b(200.0f);
        kwd.m = lwd;
        return kwd;
    }

    public final void b(float f) {
        int i = this.b == 3 ? -1 : 1;
        ioa ioa = this.c;
        float f2 = ((float) (i * ioa.a)) * f * ioa.b;
        RecyclerView recyclerView = this.d;
        recyclerView.setTranslationY(recyclerView.getTranslationY() + f2);
        kwd kwd = this.a;
        if (kwd != null) {
            kwd.b();
        }
    }

    public final boolean draw(Canvas canvas) {
        return false;
    }

    public final boolean isFinished() {
        kwd kwd = this.a;
        return kwd == null || !kwd.f;
    }

    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        float f = ((float) ((this.b == 3 ? -1 : 1) * i)) * this.c.c;
        kwd kwd = this.a;
        if (kwd != null) {
            kwd.b();
        }
        kwd a2 = a();
        a2.a = f;
        a2.g();
        this.a = a2;
    }

    public final void onPull(float f) {
        super.onPull(f);
        b(f);
    }

    public final void onRelease() {
        super.onRelease();
        if (this.d.getTranslationY() != 0.0f) {
            kwd a2 = a();
            a2.g();
            this.a = a2;
        }
    }

    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        b(f);
    }
}
