package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: uoe  reason: default package */
public final class uoe extends ote {
    public final /* synthetic */ TextPaint X;
    public final /* synthetic */ ote Y;
    public final /* synthetic */ voe Z;
    public final /* synthetic */ Context o;

    public uoe(voe voe, Context context, TextPaint textPaint, ote ote) {
        super(18);
        this.Z = voe;
        this.o = context;
        this.X = textPaint;
        this.Y = ote;
    }

    public final void J(int i) {
        this.Y.J(i);
    }

    public final void K(Typeface typeface, boolean z) {
        this.Z.g(this.o, this.X, typeface);
        this.Y.K(typeface, z);
    }
}
