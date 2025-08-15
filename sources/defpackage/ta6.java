package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: ta6  reason: default package */
public final class ta6 {
    public sa6 a = null;
    public final float b;
    public boolean c = false;
    public boolean d = false;
    public long e;
    public float f;
    public float g;

    public ta6(Context context) {
        this.b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
