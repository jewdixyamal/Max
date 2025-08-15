package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.List;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;

/* renamed from: ej3  reason: default package */
public abstract class ej3 implements gqa {
    public Object X;
    public final Object a;
    public final Object b;
    public final Object c;
    public Object o;

    public ej3(isa isa, a4c a4c, esa esa, o9g o9g) {
        this.a = isa;
        this.b = a4c;
        this.o = esa;
        this.c = new Handler(Looper.getMainLooper());
        this.X = o9g;
    }

    public abstract void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void d();

    public abstract void e(bg1 bg1, String str);

    public abstract void f();

    public abstract MediaSource g();

    public abstract MediaStreamTrack h(String str, MediaSource mediaSource);

    public abstract Object i();

    public String j() {
        return getClass().getSimpleName();
    }

    public abstract void k(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

    public void l() {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        a4c a4c = (a4c) this.c;
        if (mediaStreamTrack != null) {
            String j = j();
            a4c.log(j, this + ": An attempt to create track, while got one, ignore");
        } else if (((MediaSource) this.o) != null) {
            String j2 = j();
            a4c.log(j2, this + ": An attempt to create source, while got one, ignore");
        } else {
            MediaSource g = g();
            this.o = g;
            MediaStreamTrack h = h((String) this.a, g);
            this.X = h;
            b((MediaStream) this.b, h);
        }
    }

    public void m() {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        if (mediaStreamTrack != null) {
            c((MediaStream) this.b, mediaStreamTrack);
        }
        MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) this.X;
        a4c a4c = (a4c) this.c;
        if (mediaStreamTrack2 != null) {
            mediaStreamTrack2.dispose();
            String j = j();
            String c2 = jb9.c(mediaStreamTrack2);
            a4c.log(j, this + ": " + c2 + " was disposed");
        }
        this.X = null;
        MediaSource mediaSource = (MediaSource) this.o;
        if (mediaSource != null) {
            mediaSource.dispose();
            String j2 = j();
            String c3 = jb9.c(mediaSource);
            a4c.log(j2, this + ": " + c3 + " was disposed");
        }
        this.o = null;
    }

    public void n(qi3 qi3) {
        synchronized (this.c) {
            if (((LinkedHashSet) this.X).remove(qi3) && ((LinkedHashSet) this.X).isEmpty()) {
                s();
            }
        }
    }

    public void o(boolean z) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        if (mediaStreamTrack != null) {
            mediaStreamTrack.setEnabled(z);
        }
    }

    public abstract void p(String str, fp1 fp1, List list);

    public void q(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.o;
            if (obj2 == null || !obj2.equals(obj)) {
                this.o = obj;
                ((k40) ((bkb) ((wne) this.a)).c).execute(new wt1(x53.D0((LinkedHashSet) this.X), 12, this));
            }
        }
    }

    public abstract void r();

    public abstract void s();

    public void t(RtpSender rtpSender) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        if (rtpSender != null && mediaStreamTrack != null && rtpSender.track() != mediaStreamTrack) {
            String j = j();
            String c2 = jb9.c(mediaStreamTrack);
            String c3 = jb9.c(rtpSender);
            ((a4c) this.c).log(j, this + ": bind " + c2 + " with " + c3);
            rtpSender.setTrack(mediaStreamTrack, false);
        }
    }

    public ej3(String str, MediaStream mediaStream, a4c a4c) {
        this.a = str;
        this.b = mediaStream;
        this.c = a4c;
    }

    public ej3(Context context, bkb bkb) {
        this.a = bkb;
        this.b = context.getApplicationContext();
        this.c = new Object();
        this.X = new LinkedHashSet();
    }
}
