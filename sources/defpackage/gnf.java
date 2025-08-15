package defpackage;

import android.view.ViewGroup;

/* renamed from: gnf  reason: default package */
public abstract class gnf {
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
