package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: kqa  reason: default package */
public final class kqa extends ej3 {
    public final ArrayList Y = new ArrayList();
    public final ArrayList Z = new ArrayList();
    public final ArrayList s0 = new ArrayList();
    public final HashMap t0 = new HashMap();
    public final ConcurrentHashMap u0 = new ConcurrentHashMap();
    public final ConcurrentHashMap v0 = new ConcurrentHashMap();
    public final ConcurrentHashMap w0 = new ConcurrentHashMap();

    public kqa(isa isa, a4c a4c, esa esa, o9g o9g) {
        super(isa, a4c, esa, o9g);
    }

    public final void a(bg1 bg1, VideoFrame videoFrame) {
        adb adb = new adb(3);
        adb.a = bg1;
        adb.b = olf.b;
        List<VideoSink> list = (List) this.u0.get(adb.c());
        if (list != null) {
            for (VideoSink onFrame : list) {
                onFrame.onFrame(videoFrame);
            }
        }
    }

    public final void d() {
        jb9.e();
        this.u0.clear();
        this.t0.clear();
    }

    public final void e(bg1 bg1, String str) {
        jb9.e();
        HashMap hashMap = this.t0;
        Set<fp1> set = (Set) hashMap.get(bg1);
        if (set != null) {
            for (fp1 remove : set) {
                this.u0.remove(remove);
            }
            hashMap.remove(bg1);
        }
    }

    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages((Object) null);
        ((isa) this.a).a.i("ParticipantsAgnosticRemoteVideoTracks.closeInternal", new nn6(24, this));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [org.webrtc.MediaStream[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(org.webrtc.RtpReceiver r3, org.webrtc.MediaStream[] r4) {
        /*
            r2 = this;
            ed4 r0 = new ed4
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            java.lang.String r3 = "DefaultRemoteVideoTracks.handleVideoTracksOnExecutor"
            java.lang.Object r2 = r2.a
            isa r2 = (defpackage.isa) r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqa.k(org.webrtc.RtpReceiver, org.webrtc.MediaStream[]):void");
    }

    public final void p(String str, fp1 fp1, List list) {
        jb9.e();
        ConcurrentHashMap concurrentHashMap = this.u0;
        HashMap hashMap = this.t0;
        if (list == null) {
            concurrentHashMap.remove(fp1);
            Set set = (Set) hashMap.get(fp1.b);
            if (set != null) {
                set.remove(fp1);
                return;
            }
            return;
        }
        concurrentHashMap.put(fp1, list);
        Set set2 = (Set) hashMap.get(fp1.b);
        if (set2 == null) {
            set2 = new HashSet();
            hashMap.put(fp1.b, set2);
        }
        set2.add(fp1);
    }
}
