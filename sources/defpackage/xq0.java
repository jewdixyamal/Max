package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: xq0  reason: default package */
public final class xq0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public float b;

    public /* synthetic */ xq0(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(0, -tu0.G(this.b), view.getWidth(), view.getHeight(), this.b);
                view.setClipToOutline(true);
                return;
            case 1:
                int width = view.getWidth();
                int height = view.getHeight();
                float f = this.b;
                outline.setRoundRect(0, 0, width, height + ((int) f), f);
                view.setClipToOutline(true);
                return;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.b);
                return;
        }
    }

    public xq0(float f) {
        this.a = 2;
        this.b = f;
    }
}
