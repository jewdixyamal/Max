package defpackage;

import android.media.MediaCodecInfo;
import android.util.Size;

/* renamed from: a74  reason: default package */
public final /* synthetic */ class a74 implements km7, oa4, mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a74(int i, int i2, Object obj) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    public int a(MediaCodecInfo mediaCodecInfo) {
        int i = this.a;
        int i2 = this.b;
        Size h = h15.h(mediaCodecInfo, (String) this.c, i, i2);
        if (h == null) {
            return Integer.MAX_VALUE;
        }
        return Math.abs((i * i2) - (h.getHeight() * h.getWidth()));
    }

    public void invoke(Object obj) {
        ((gd) obj).I((fd) this.c, this.a, this.b);
    }

    public String q(lq1 lq1) {
        ce4 ce4 = (ce4) this.c;
        ce4.getClass();
        ce4.e(new wt1(ce4, 23, new ca0(this.a, this.b, lq1)), new zd4(lq1, 0));
        return "DefaultSurfaceProcessor#snapshot";
    }
}
