package defpackage;

import com.facebook.animated.gif.GifImage;
import java.util.ArrayList;

/* renamed from: j43  reason: default package */
public final class j43 extends u84 {
    public boolean X;
    public a8g o;

    public final void close() {
        synchronized (this) {
            try {
                a8g a8g = this.o;
                if (a8g != null) {
                    this.o = null;
                    synchronized (a8g) {
                        o43.S((o43) a8g.c);
                        a8g.c = null;
                        o43.U((ArrayList) a8g.o);
                        a8g.o = null;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final synchronized int getHeight() {
        a8g a8g;
        a8g = this.o;
        return a8g == null ? 0 : ((GifImage) a8g.a).h();
    }

    public final synchronized int getSizeInBytes() {
        a8g a8g;
        a8g = this.o;
        return a8g == null ? 0 : ((GifImage) a8g.a).j();
    }

    public final synchronized int getWidth() {
        a8g a8g;
        a8g = this.o;
        return a8g == null ? 0 : ((GifImage) a8g.a).k();
    }

    public final synchronized boolean isClosed() {
        return this.o == null;
    }

    public final boolean isStateful() {
        return this.X;
    }
}
