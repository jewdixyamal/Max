package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: tja  reason: default package */
public final class tja extends SwitchCompat implements kre {
    public final je7 h1 = tu0.r(3, new s4a(5));
    public final je7 i1 = tu0.r(3, new s4a(6));

    public tja(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setThumbDrawable(f(getThumbStateDrawable()));
        setTrackDrawable(f(getTrackThumbDrawable()));
        setSwitchMinWidth(tu0.G(((float) 51) * fk4.d().getDisplayMetrics().density));
        setEnforceSwitchWidth(false);
        setSplitTrack(false);
        setShowText(false);
        setBackground((Drawable) null);
        onThemeChanged(qp4.u0.j(this));
    }

    public static StateListDrawable f(yge yge) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910, 16842912}, yge.a);
        stateListDrawable.addState(new int[]{16842910, -16842912}, yge.b);
        stateListDrawable.addState(new int[]{-16842910, -16842912}, yge.d);
        stateListDrawable.addState(new int[]{-16842910, 16842912}, yge.c);
        return stateListDrawable;
    }

    private final yge getThumbStateDrawable() {
        return (yge) this.h1.getValue();
    }

    private final yge getTrackThumbDrawable() {
        return (yge) this.i1.getValue();
    }

    public final void onDraw(Canvas canvas) {
        float f = (float) 4;
        int G = tu0.G(((float) (((int) ((getThumbPosition() + 0.2f) * f)) + 20)) * fk4.d().getDisplayMetrics().density);
        int G2 = tu0.G(((float) ((int) ((((float) 1) - getThumbPosition()) * ((float) 6)))) * fk4.d().getDisplayMetrics().density);
        int q = rh4.q(f, fk4.d().getDisplayMetrics().density, getWidth() - G);
        int i = getThumbDrawable().getBounds().left + G2;
        int i2 = (i > q ? q : i) + G;
        int height = (getHeight() / 2) - (G / 2);
        int i3 = G + height;
        Drawable thumbDrawable = getThumbDrawable();
        if (i <= q) {
            q = i;
        }
        thumbDrawable.setBounds(q, height, i2, i3);
        super.onDraw(canvas);
    }

    public final void onThemeChanged(fka fka) {
        GradientDrawable gradientDrawable = getThumbStateDrawable().a;
        fka.getIcon();
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        getThumbStateDrawable().b.setColor(ColorStateList.valueOf(fka.getIcon().j));
        getTrackThumbDrawable().a.setColor(ColorStateList.valueOf(fka.b().a.m));
        float f = (float) 2;
        getTrackThumbDrawable().a.setStroke(tu0.G(fk4.d().getDisplayMetrics().density * f), ColorStateList.valueOf(fka.b().a.m));
        getTrackThumbDrawable().b.setColor(ColorStateList.valueOf(0));
        getTrackThumbDrawable().b.setStroke(tu0.G(f * fk4.d().getDisplayMetrics().density), ColorStateList.valueOf(fka.i().b.b));
        getTrackThumbDrawable().c.setColor(ColorStateList.valueOf(fka.d().a.b.l));
        getTrackThumbDrawable().d.setColor(ColorStateList.valueOf(fka.d().a.b.f));
    }
}
