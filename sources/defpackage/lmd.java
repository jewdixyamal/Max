package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: lmd  reason: default package */
public final class lmd extends LayerDrawable implements Animatable, kre {
    public int X = -1;
    public final boolean Y;
    public final int a;
    public final kmd b;
    public final int c;
    public int o = tu0.G(((float) 80) * fk4.d().getDisplayMetrics().density);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lmd(Context context) {
        super(new Drawable[0]);
        boolean z = false;
        kmd kmd = new kmd(context);
        this.b = kmd;
        this.Y = lz7.q(context).compareTo(vi4.o) >= 0 ? true : z;
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setCallback(this);
        int addLayer = addLayer(colorDrawable);
        this.a = addLayer;
        setLayerGravity(addLayer, 119);
        int addLayer2 = addLayer(kmd);
        this.c = addLayer2;
        kmd.setCallback(this);
        setLayerGravity(addLayer2, 17);
        onThemeChanged(qp4.u0.b(context).i());
    }

    public final void a(int i) {
        this.X = i;
        if (!getBounds().isEmpty()) {
            setLayerInsetBottom(this.c, getBounds().centerY() - i);
        }
    }

    public final boolean b(Drawable drawable) {
        if (drawable == this) {
            return true;
        }
        int numberOfLayers = getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            if (getDrawable(i) == drawable) {
                return true;
            }
        }
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(drawable);
        }
    }

    public final boolean isRunning() {
        return this.Y && this.b.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        int min = Math.min(rect.width() - (this.o * 2), rect.height() - (this.o * 2));
        int i = this.c;
        setLayerSize(i, min, min);
        int i2 = this.X;
        if (i2 > 0) {
            setLayerInsetBottom(i, rect.centerY() - i2);
        }
        super.onBoundsChange(rect);
    }

    public final void onThemeChanged(fka fka) {
        this.b.a(fka);
        ((ColorDrawable) getDrawable(this.a)).setColor(fka.b().k);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        if (this.Y) {
            this.b.start();
        }
    }

    public final void stop() {
        if (this.Y) {
            this.b.stop();
        }
    }
}
