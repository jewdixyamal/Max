package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: dp9  reason: default package */
public final class dp9 extends yh7 {
    public final /* synthetic */ int p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp9(Context context, int i) {
        super(context);
        this.p = i;
    }

    public float d(DisplayMetrics displayMetrics) {
        switch (this.p) {
            case 1:
                return 100.0f / ((float) displayMetrics.densityDpi);
            default:
                return super.d(displayMetrics);
        }
    }

    public int h() {
        switch (this.p) {
            case 0:
                return -1;
            default:
                return super.h();
        }
    }
}
