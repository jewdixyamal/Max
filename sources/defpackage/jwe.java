package defpackage;

import android.view.ViewGroup;

/* renamed from: jwe  reason: default package */
public final class jwe extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public jwe(int i) {
        super(i, -2);
        this.b = 0;
        this.a = 8388627;
    }

    public jwe(jwe jwe) {
        super(jwe);
        this.a = 0;
        this.a = jwe.a;
    }

    public jwe(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
