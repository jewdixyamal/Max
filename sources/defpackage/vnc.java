package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: vnc  reason: default package */
public final class vnc extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final Rect b;
    public final float c;

    public /* synthetic */ vnc(Rect rect, float f, int i) {
        this.a = i;
        this.b = rect;
        this.c = f;
    }

    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(this.b, this.c);
                return;
            case 1:
                outline.setRoundRect(this.b, this.c);
                return;
            default:
                outline.setRoundRect(this.b, this.c);
                return;
        }
    }

    public vnc(Rect rect, float f) {
        this.a = 2;
        this.b = rect;
        this.c = f;
    }
}
