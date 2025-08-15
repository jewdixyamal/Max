package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* renamed from: fd4  reason: default package */
public final class fd4 extends ej3 {
    public static final olf[] u0 = {olf.a, olf.b};
    public final ConcurrentHashMap Y = new ConcurrentHashMap();
    public final HashMap Z = new HashMap();
    public final ConcurrentHashMap s0 = new ConcurrentHashMap();
    public final ConcurrentHashMap t0 = new ConcurrentHashMap();

    public fd4(isa isa, a4c a4c, esa esa, o9g o9g) {
        super(isa, a4c, esa, o9g);
    }

    public final void a(bg1 bg1, VideoFrame videoFrame) {
        adb adb = new adb(3);
        adb.a = bg1;
        adb.b = olf.b;
        List<blf> list = (List) this.Y.get(adb.c());
        if (list != null) {
            for (blf a : list) {
                a.a(videoFrame);
            }
        }
    }

    public final void d() {
        ((isa) this.a).a("DefaultRemoteVideoTracks.clearRemoteVideoRenderers", new oj3(1, this));
    }

    public final void e(bg1 bg1, String str) {
        olf[] olfArr = u0;
        for (int i = 0; i < 2; i++) {
            olf olf = olfArr[i];
            adb adb = new adb(3);
            adb.b = olf;
            adb.a = bg1;
            p(str, adb.c(), (List) null);
        }
    }

    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages((Object) null);
        synchronized (this.Y) {
            try {
                for (List<blf> it : this.Y.values()) {
                    for (blf blf : it) {
                        blf.a = null;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ((isa) this.a).a.i("DefaultRemoteVideoTracks.closeOnExecutor", new dd4(0, this));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [org.webrtc.MediaStream[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(org.webrtc.RtpReceiver r3, org.webrtc.MediaStream[] r4) {
        /*
            r2 = this;
            ed4 r0 = new ed4
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            java.lang.String r3 = "DefaultRemoteVideoTracks.handleVideoTracksOnExecutor"
            java.lang.Object r2 = r2.a
            isa r2 = (defpackage.isa) r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd4.k(org.webrtc.RtpReceiver, org.webrtc.MediaStream[]):void");
    }

    public final void p(String str, fp1 fp1, List list) {
        ((isa) this.a).a("DefaultRemoteVideoTracks.setRemoteVideoRenderersOnExecutor", new cd4(this, str, fp1, list));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, blf, org.webrtc.VideoSink] */
    public final void u(String str, fp1 fp1, List list) {
        synchronized (this.Y) {
            try {
                VideoTrack videoTrack = (VideoTrack) this.Z.get(str);
                if (videoTrack == null) {
                    ((a4c) this.b).log("DefaultRemoteVideoTracks", "no " + fp1 + " track");
                    return;
                }
                List<blf> list2 = (List) this.Y.get(fp1);
                if (list2 == null) {
                    ((a4c) this.b).log("DefaultRemoteVideoTracks", "no renderers for " + fp1 + " track");
                } else {
                    for (blf blf : list2) {
                        blf.a = null;
                        try {
                            videoTrack.removeSink(blf);
                        } catch (Exception unused) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ? obj = new Object();
                        obj.a = (VideoSink) it.next();
                        arrayList.add(obj);
                        if (fp1.a == olf.a && !videoTrack.isDisposed()) {
                            videoTrack.addSink(obj);
                        }
                    }
                }
                fp1 fp12 = (fp1) this.s0.get(str);
                if (fp12 != null) {
                    this.s0.remove(str);
                    this.t0.remove(fp12);
                }
                this.s0.put(str, fp1);
                this.t0.put(fp1, str);
                this.Y.put(fp1, Collections.unmodifiableList(arrayList));
            } finally {
            }
        }
    }
}
