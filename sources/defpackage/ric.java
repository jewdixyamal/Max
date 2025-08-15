package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;

/* renamed from: ric  reason: default package */
public abstract class ric {
    public static int a(Resources resources, int i, Resources.Theme theme) {
        return resources.getColor(i, theme);
    }

    public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
        return resources.getColorStateList(i, theme);
    }
}
