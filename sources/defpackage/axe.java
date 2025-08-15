package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: axe  reason: default package */
public final class axe extends ViewOutlineProvider {
    public int a;
    public int b;

    public final void getOutline(View view, Outline outline) {
        outline.setRect(0, this.a, view.getWidth(), view.getHeight() - this.b);
        view.setClipToOutline(true);
    }
}
