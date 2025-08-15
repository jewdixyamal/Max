package defpackage;

import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;

/* renamed from: jre  reason: default package */
public final /* synthetic */ class jre implements VideoRendererInterface.FrameSizeListener {
    public final /* synthetic */ a66 a;

    public /* synthetic */ jre(a66 a66) {
        this.a = a66;
    }

    public final void onFrame(int i, int i2) {
        TextureViewRenderer.setFrameSizeListener$lambda$2(this.a, i, i2);
    }
}
