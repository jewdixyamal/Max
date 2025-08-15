package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* renamed from: djd  reason: default package */
public final class djd extends GLSurfaceView {
    public final cjd a;

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, cjd, android.opengl.GLSurfaceView$Renderer] */
    public djd(Context context) {
        super(context, (AttributeSet) null);
        setEGLContextClientVersion(2);
        ? obj = new Object();
        obj.Y = System.currentTimeMillis();
        this.a = obj;
        setRenderer(obj);
    }

    public final cjd getRenderer() {
        return this.a;
    }
}
