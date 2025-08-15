package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: psd  reason: default package */
public final class psd extends lz7 {
    public final /* synthetic */ int h = 1;

    public final float b(View view, ViewGroup viewGroup) {
        switch (this.h) {
            case 0:
                return view.getTranslationY() - ((float) viewGroup.getHeight());
            default:
                return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }
}
