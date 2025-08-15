package defpackage;

import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: pld  reason: default package */
public final /* synthetic */ class pld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qld b;

    public /* synthetic */ pld(qld qld, int i) {
        this.a = i;
        this.b = qld;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                JavaAudioDeviceModule javaAudioDeviceModule = this.b.g;
                if (javaAudioDeviceModule != null) {
                    javaAudioDeviceModule.restartAudioRecording();
                    return;
                }
                return;
            default:
                qld qld = this.b;
                qld.b.log("SharedPeerConnectionFac", "releaseInternal");
                PeerConnectionFactory peerConnectionFactory = qld.d;
                if (peerConnectionFactory != null) {
                    pn9 pn9 = qld.i;
                    if (pn9 != null) {
                        pn9.a(qld.j);
                    }
                    peerConnectionFactory.dispose();
                    a4c a4c = qld.b;
                    a4c.log("SharedPeerConnectionFac", jb9.c(peerConnectionFactory) + " was disposed.");
                    qld.d = null;
                }
                JavaAudioDeviceModule javaAudioDeviceModule2 = qld.g;
                if (javaAudioDeviceModule2 != null) {
                    javaAudioDeviceModule2.release();
                    qld.g = null;
                    return;
                }
                return;
        }
    }
}
