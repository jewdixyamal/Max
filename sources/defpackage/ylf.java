package defpackage;

import android.content.Context;
import android.view.TextureView;

/* renamed from: ylf  reason: default package */
public final class ylf extends TextureView {
    public final /* synthetic */ amf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ylf(amf amf, Context context) {
        super(context);
        this.a = amf;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tlf tlf = this.a.s0;
        if (tlf != null) {
            tlf.onSurfaceTextureDestroyed(getSurfaceTexture());
        }
    }
}
