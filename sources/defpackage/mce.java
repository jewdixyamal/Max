package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.UpdateAppearance;
import android.view.View;

/* renamed from: mce  reason: default package */
public final class mce extends ClickableSpan implements UpdateAppearance, kre {
    public static final /* synthetic */ int X = 0;
    public final rce a;
    public final a66 b;
    public int c;
    public int o;

    public mce(k56 k56, rce rce, a66 a66) {
        this.a = rce;
        this.b = a66;
        this.c = ((fka) k56.invoke()).f().c;
        this.o = ((fka) k56.invoke()).f().c;
    }

    public final void onClick(View view) {
        this.b.invoke(view, this.a);
    }

    public final void onThemeChanged(fka fka) {
        this.c = fka.f().c;
        this.o = fka.f().c;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.c);
        textPaint.bgColor = s63.i(this.o, 80);
        textPaint.setUnderlineText(false);
    }
}
