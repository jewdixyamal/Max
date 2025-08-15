package defpackage;

import android.content.Context;
import android.graphics.drawable.DrawableWrapper;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: oh5  reason: default package */
public final class oh5 extends DrawableWrapper {
    public final je7 a = tu0.r(3, new nh5(this, 0));
    public final je7 b = tu0.r(3, new nh5(this, 1));
    public final je7 c = tu0.r(3, new nh5(this, 2));

    public oh5(Context context) {
        super(new EnhancedVectorDrawable(context, pub.ic_file_extension));
    }
}
