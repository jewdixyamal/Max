package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: osd  reason: default package */
public final class osd extends dy7 {
    public final /* synthetic */ int o;

    public final float a(View view, ViewGroup viewGroup) {
        switch (this.o) {
            case 0:
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            case 1:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + ((float) viewGroup.getWidth()) : view.getTranslationX() - ((float) viewGroup.getWidth());
            case 2:
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            default:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - ((float) viewGroup.getWidth()) : view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }
}
