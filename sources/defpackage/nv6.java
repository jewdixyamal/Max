package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* renamed from: nv6  reason: default package */
public final /* synthetic */ class nv6 implements h06 {
    public final /* synthetic */ ov6 a;
    public final /* synthetic */ ov6 b;

    public /* synthetic */ nv6(ov6 ov6, ov6 ov62) {
        this.a = ov6;
        this.b = ov62;
    }

    public final void a(ov6 ov6) {
        ov6 ov62;
        int i = ImageProcessingUtil.a;
        if (this.a != null && (ov62 = this.b) != null) {
            ov62.close();
        }
    }
}
