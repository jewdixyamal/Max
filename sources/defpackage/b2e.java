package defpackage;

import android.util.Size;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.sdk.gl.effects.objects.FrameBuffer;

/* renamed from: b2e  reason: default package */
public final class b2e {
    public final Size a;
    public final int b;
    public final int c;
    public final String d;
    public final VideoMessageStencilHolder e;
    public final FrameBuffer f;

    public b2e(Size size) {
        this.a = size;
        this.b = size.getWidth();
        this.c = size.getHeight();
        String name = b2e.class.getName();
        this.d = name;
        VideoMessageStencilHolder videoMessageStencilHolder = new VideoMessageStencilHolder(size.getWidth(), size.getHeight());
        this.e = videoMessageStencilHolder;
        this.f = new FrameBuffer(size.getWidth(), size.getHeight());
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, name, "init, previewSize=" + size, (Throwable) null);
        }
        videoMessageStencilHolder.notifyRecording(true);
    }
}
