package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

/* renamed from: fp0  reason: default package */
public abstract class fp0 {
    public static ColorFilter a(int i, Object obj) {
        return new BlendModeColorFilter(i, (BlendMode) obj);
    }
}
