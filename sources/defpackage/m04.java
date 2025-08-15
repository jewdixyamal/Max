package defpackage;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: m04  reason: default package */
public final class m04 extends n15 {
    public final /* synthetic */ int e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m04(m15 m15, int i) {
        super(m15);
        this.e = i;
    }

    public void r() {
        switch (this.e) {
            case 0:
                m15 m15 = this.b;
                m15.C0 = null;
                CheckableImageButton checkableImageButton = m15.u0;
                checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
                a14.J(checkableImageButton, (View.OnLongClickListener) null);
                return;
            default:
                return;
        }
    }
}
