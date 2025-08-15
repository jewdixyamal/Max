package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.YuvConverter;

/* renamed from: kq7  reason: default package */
public final class kq7 {
    public final DisplayMetrics A = new DisplayMetrics();
    public final Size B = new Size(0, 0);
    public final dnc C;
    public final m5d D;
    public final u5e E;
    public final EglBase.Context a;
    public final xx0 b;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final Context d;
    public final i50 e;
    public final aq7 f;
    public final Executor g;
    public final MediaStream h;
    public final n60 i;
    public final n60 j;
    public final String k;
    public final String l;
    public final String m;
    public final a4c n;
    public final boolean o;
    public blf p;
    public volatile VideoSink q;
    public volatile tv1 r;
    public volatile jx1 s;
    public volatile zuc t;
    public volatile fwc u;
    public volatile lq7 v;
    public final boolean w = false;
    public ece x;
    public final rkf y;
    public final yvc z;

    public kq7(jq7 jq7) {
        a4c a4c = jq7.h;
        this.n = a4c;
        this.d = jq7.d;
        PeerConnectionFactory peerConnectionFactory = jq7.a;
        this.e = jq7.b;
        this.f = jq7.q;
        this.g = jq7.c;
        String str = jq7.g;
        String str2 = jq7.f;
        this.m = jq7.e;
        this.o = jq7.p;
        this.a = jq7.i;
        boolean z2 = jq7.k;
        this.b = jq7.j;
        this.w = jq7.l;
        String l2 = zr6.l(new StringBuilder(), jq7.e, "sc0");
        this.k = l2;
        String l3 = zr6.l(new StringBuilder(), jq7.e, "as0");
        this.l = l3;
        MediaStream createLocalMediaStream = peerConnectionFactory.createLocalMediaStream(jq7.e);
        this.h = createLocalMediaStream;
        MediaStream createLocalMediaStream2 = peerConnectionFactory.createLocalMediaStream(l2);
        this.D = jq7.o ? new m5d(this) : null;
        this.E = jq7.r;
        createLocalMediaStream = !z2 ? null : createLocalMediaStream;
        n60 n60 = new n60(peerConnectionFactory, str, createLocalMediaStream, a4c);
        this.i = n60;
        n60.l();
        n60.o(false);
        n60 n602 = new n60(peerConnectionFactory, l3, createLocalMediaStream, a4c);
        this.j = n602;
        n602.l();
        n602.o(false);
        PeerConnectionFactory peerConnectionFactory2 = peerConnectionFactory;
        rkf rkf = new rkf(peerConnectionFactory2, str2, createLocalMediaStream, jq7.s, jq7.t, new w5e(this), a4c);
        this.y = rkf;
        rkf.l();
        yvc yvc = new yvc(peerConnectionFactory2, l2, createLocalMediaStream2, a4c, jq7.r, jq7.m);
        this.z = yvc;
        yvc.l();
        this.C = jq7.m;
    }

    public final void a() {
        blf blf = this.p;
        if (blf != null) {
            blf.a = null;
            this.n.log("OKRTCLmsAdapter", this + ": " + jb9.c(this.p) + " was cleared");
        }
    }

    public final void b(nq7 nq7) {
        m5d m5d = this.D;
        if (m5d != null && nq7 != null) {
            m5d.b = nq7;
            Handler handler = (Handler) m5d.c;
            gwe gwe = (gwe) m5d.o;
            handler.removeCallbacks(gwe);
            ((kq7) m5d.X).n.log("OKRTCLmsAdapter", "Schedule check screen dimensions in 1500ms");
            handler.postDelayed(gwe, 1500);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, blf] */
    public final void c(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForCamera for " + jb9.c(videoCapturer));
        if (videoCapturer != null) {
            this.y.l();
            rkf rkf = this.y;
            Context context = this.d;
            EglBase.Context context2 = this.a;
            VideoSource videoSource = (VideoSource) ((MediaSource) rkf.o);
            CapturerObserver capturerObserver = videoSource != null ? videoSource.getCapturerObserver() : null;
            if (capturerObserver == null) {
                throw new IllegalStateException("Can't set capture in absence of video source");
            } else if (rkf.s0 == null) {
                SurfaceTextureHelper create = SurfaceTextureHelper.create("VideoCapturerThread", context2, false, new YuvConverter(), (SurfaceTextureHelper.FrameRefMonitor) null, rkf);
                rkf.s0 = create;
                rkf.t0 = new b9b(rkf, capturerObserver, false, 12);
                videoCapturer.initialize(create, context.getApplicationContext(), rkf.t0);
                if (!this.w) {
                    VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) this.y.X);
                    if (videoTrack != null) {
                        if (this.p == null) {
                            ? obj = new Object();
                            this.p = obj;
                            obj.a = this.q;
                        }
                        videoTrack.addSink(this.p);
                    }
                } else if (videoCapturer instanceof jra) {
                    ((jra) videoCapturer).Y = this.q;
                } else {
                    throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(jra.class.getName()));
                }
            } else {
                throw new IllegalStateException("An attempt to create surface texture screencast=false, while got one");
            }
        } else {
            throw new IllegalArgumentException("Video capturer is expected to be not null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.ji9 r12) {
        /*
            r11 = this;
            boolean r0 = r12.f
            java.lang.String r1 = "startCameraVideoCapture, start="
            java.lang.String r1 = defpackage.ey8.j(r1, r0)
            a4c r2 = r11.n
            java.lang.String r3 = "OKRTCLmsAdapter"
            r2.log(r3, r1)
            i50 r1 = r11.e
            r2 = 0
            r4 = 1
            if (r1 != 0) goto L_0x002d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r1 = ": has no video capturer factory"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a4c r1 = r11.n
            r1.log(r3, r0)
            goto L_0x012f
        L_0x002d:
            if (r0 == 0) goto L_0x0114
            tv1 r0 = r11.r
            if (r0 == 0) goto L_0x0043
            tv1 r0 = r11.r
            if (r0 != 0) goto L_0x0039
            goto L_0x012f
        L_0x0039:
            r0.a()
            rkf r0 = r11.y
            r0.o(r4)
            goto L_0x012f
        L_0x0043:
            r11.a()
            r11.g()
            i50 r0 = r11.e
            jx1 r1 = r11.s
            java.lang.Object r5 = r0.o
            a4c r5 = (defpackage.a4c) r5
            java.lang.String r6 = "OKRTCSvcFactory"
            java.lang.String r7 = "createCameraCapturer"
            r5.log(r6, r7)
            java.lang.Object r5 = r0.X
            aq7 r5 = (defpackage.aq7) r5
            r7 = 0
            if (r5 == 0) goto L_0x00a2
            boolean r5 = r5.d
            if (r5 != 0) goto L_0x0064
            goto L_0x00a2
        L_0x0064:
            tv1 r0 = r0.a(r1)     // Catch:{ all -> 0x0069 }
            goto L_0x00ac
        L_0x0069:
            r5 = move-exception
            java.lang.Object r8 = r0.o
            a4c r8 = (defpackage.a4c) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Camera capturer creation failed. Is Camera2: "
            r9.<init>(r10)
            boolean r10 = r0.b
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.reportException(r6, r9, r5)
            boolean r5 = r0.b
            if (r5 != 0) goto L_0x0087
        L_0x0085:
            r0 = r7
            goto L_0x00ac
        L_0x0087:
            java.lang.Object r5 = r0.o
            a4c r5 = (defpackage.a4c) r5
            java.lang.String r8 = "Failed to create camera capturer using camera2 API. Fallback to camera1"
            r5.log(r6, r8)
            r0.b = r2
            tv1 r0 = r0.a(r1)     // Catch:{ all -> 0x0097 }
            goto L_0x00ac
        L_0x0097:
            r1 = move-exception
            java.lang.Object r0 = r0.o
            a4c r0 = (defpackage.a4c) r0
            java.lang.String r5 = "Camera capturer creation failed after fallback to camera1"
            r0.reportException(r6, r5, r1)
            goto L_0x0085
        L_0x00a2:
            java.lang.String r1 = "No video permissions"
            java.lang.Object r0 = r0.o
            a4c r0 = (defpackage.a4c) r0
            r0.log(r6, r1)
            goto L_0x0085
        L_0x00ac:
            r11.r = r0
            tv1 r0 = r11.r
            if (r0 != 0) goto L_0x00c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r1 = ": can't get camera capturer from factory"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a4c r1 = r11.n
            r1.log(r3, r0)
            goto L_0x0112
        L_0x00c9:
            tv1 r0 = r11.r
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.f
            r0.add(r11)
            tv1 r0 = r11.r     // Catch:{ RuntimeException -> 0x00e9 }
            wd6 r0 = r0.c     // Catch:{ RuntimeException -> 0x00e9 }
            java.lang.Object r0 = r0.b     // Catch:{ RuntimeException -> 0x00e9 }
            org.webrtc.CameraVideoCapturer r0 = (org.webrtc.CameraVideoCapturer) r0     // Catch:{ RuntimeException -> 0x00e9 }
            r11.c(r0)     // Catch:{ RuntimeException -> 0x00e9 }
            tv1 r0 = r11.r
            if (r0 != 0) goto L_0x00e0
            goto L_0x0112
        L_0x00e0:
            r0.a()
            rkf r0 = r11.y
            r0.o(r4)
            goto L_0x0112
        L_0x00e9:
            r0 = move-exception
            a4c r1 = r11.n
            java.lang.String r5 = "camera.video.track.create"
            r1.reportException(r3, r5, r0)
            tv1 r0 = r11.r
            a4c r1 = r0.e
            java.lang.String r5 = "CameraCapturerAdapter"
            java.lang.String r6 = "release"
            r1.log(r5, r6)
            java.util.concurrent.CopyOnWriteArraySet r1 = r0.f
            r1.clear()
            r0.b()
            wd6 r0 = r0.c
            java.lang.Object r0 = r0.b
            org.webrtc.CameraVideoCapturer r0 = (org.webrtc.CameraVideoCapturer) r0
            r0.dispose()
            r11.r = r7
            r11.g()
        L_0x0112:
            r0 = r4
            goto L_0x0130
        L_0x0114:
            tv1 r0 = r11.r
            if (r0 == 0) goto L_0x012f
            boolean r0 = r11.o
            if (r0 == 0) goto L_0x0122
            tv1 r0 = r11.r
            r0.b()
            goto L_0x012f
        L_0x0122:
            tv1 r0 = r11.r
            if (r0 != 0) goto L_0x0127
            goto L_0x012f
        L_0x0127:
            r0.a()
            rkf r0 = r11.y
            r0.o(r2)
        L_0x012f:
            r0 = r2
        L_0x0130:
            boolean r12 = r12.e
            n60 r1 = r11.i
            java.lang.Object r5 = r1.X
            org.webrtc.MediaStreamTrack r5 = (org.webrtc.MediaStreamTrack) r5
            if (r5 == 0) goto L_0x013f
            boolean r5 = r5.enabled()
            goto L_0x0140
        L_0x013f:
            r5 = r2
        L_0x0140:
            if (r5 == r12) goto L_0x0151
            java.lang.String r2 = "setAudioTrackEnabled, enabled="
            java.lang.String r2 = defpackage.ey8.j(r2, r12)
            a4c r5 = r11.n
            r5.log(r3, r2)
            r1.o(r12)
            r2 = r4
        L_0x0151:
            r12 = r0 | r2
            if (r12 == 0) goto L_0x016b
            java.util.concurrent.CopyOnWriteArraySet r12 = r11.c
            java.util.Iterator r12 = r12.iterator()
        L_0x015b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r12.next()
            mq7 r0 = (defpackage.mq7) r0
            r0.b(r11)
            goto L_0x015b
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq7.d(ji9):void");
    }

    public final void e() {
        Display[] displays = ((DisplayManager) this.d.getSystemService("display")).getDisplays();
        if (displays.length > 0) {
            displays[0].getRealMetrics(this.A);
        }
    }

    public final void f(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForScreenCapture for " + jb9.c(videoCapturer));
        if (videoCapturer != null) {
            yvc yvc = this.z;
            yvc.l();
            Context applicationContext = this.d.getApplicationContext();
            VideoSource videoSource = (VideoSource) ((MediaSource) yvc.o);
            CapturerObserver capturerObserver = videoSource != null ? videoSource.getCapturerObserver() : null;
            if (capturerObserver != null) {
                jo7 jo7 = yvc.s0;
                jo7.c = capturerObserver;
                SurfaceTextureHelper surfaceTextureHelper = yvc.Z;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.dispose();
                }
                SurfaceTextureHelper create = SurfaceTextureHelper.create("ScreenCapturerThread", this.a);
                yvc.Z = create;
                videoCapturer.initialize(create, applicationContext.getApplicationContext(), jo7);
                return;
            }
            throw new IllegalStateException("Can't set capture in absence of video source");
        }
        throw new IllegalArgumentException("videoCapturer must not be null");
    }

    public final void g() {
        blf blf;
        a4c a4c = this.n;
        a4c.log("OKRTCLmsAdapter", "releaseCameraVideoTrack");
        a();
        rkf rkf = this.y;
        VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) rkf.X);
        if (!(videoTrack == null || (blf = this.p) == null)) {
            try {
                videoTrack.removeSink(blf);
            } catch (Exception unused) {
            }
            a4c.log("OKRTCLmsAdapter", this + ": " + jb9.c(this.p) + " was removed from " + jb9.c(videoTrack));
        }
        this.p = null;
        rkf.m();
    }

    public final Size h() {
        tv1 tv1 = this.r;
        if (tv1 == null) {
            return new Size(0, 0);
        }
        Size size = new Size(tv1.n, tv1.m);
        rkf rkf = this.y;
        rkf.getClass();
        Size b2 = rkf.u0.b(size.width, size.height);
        return b2 == null ? size : b2;
    }

    public final void i(tv1 tv1, boolean z2) {
        this.n.log("OKRTCLmsAdapter", ey8.j("onCameraCapturerSwitchDone, switched ? ", z2));
        if (z2) {
            ece ece = this.x;
            if (ece != null) {
                ((py0) ece.a).k(w51.Z, Boolean.TRUE);
            }
            this.g.execute(new vs5(this, 14, tv1));
        }
    }

    public final void j(boolean z2) {
        n60 n60 = this.j;
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) n60.X;
        if ((mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) != z2) {
            this.n.log("OKRTCLmsAdapter", ey8.j("setAudioShareTrackEnabled, enabled=", z2));
            n60.o(z2);
        }
    }

    public final void k(VideoSink videoSink) {
        this.n.log("OKRTCLmsAdapter", "setVideoRenderer, " + jb9.c(videoSink));
        this.q = videoSink;
        if (this.w) {
            tv1 tv1 = this.r;
            CameraVideoCapturer cameraVideoCapturer = tv1 != null ? (CameraVideoCapturer) tv1.c.b : null;
            if (cameraVideoCapturer instanceof jra) {
                ((jra) cameraVideoCapturer).Y = videoSink;
            } else if (cameraVideoCapturer != null) {
                throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(jra.class.getName()));
            }
        }
        blf blf = this.p;
        if (blf != null) {
            blf.a = videoSink;
        }
    }

    public final void l(jx1 jx1) {
        ww1 ww1;
        this.n.log("OKRTCLmsAdapter", "switchCamera, " + this);
        if (this.r != null) {
            tv1 tv1 = this.r;
            tv1.e.log("CameraCapturerAdapter", "switchCamera");
            if (!tv1.k) {
                tv1.e.log("CameraCapturerAdapter", "Camera is not started");
                return;
            }
            int i2 = 1;
            if (tv1.j) {
                synchronized (tv1.g) {
                    try {
                        if (tv1.j) {
                            tv1.e.log("CameraCapturerAdapter", "Camera switch is pending");
                            return;
                        }
                        tv1.j = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (jx1 == null) {
                if (tv1.i) {
                    i2 = 2;
                }
                ww1 = tv1.d.I(i2);
            } else {
                ww1 = tv1.d.I(jx1.a);
            }
            if (ww1 != null && !Objects.equals(tv1.h, ww1.a())) {
                String a2 = ww1.a();
                ((CameraVideoCapturer) tv1.c.b).switchCamera(new qz7(tv1, a2), a2);
            }
        } else if (jx1 != null) {
            this.n.log("OKRTCLmsAdapter", "Got cameraParams while no capturer created yet. Remember for future use");
            this.s = jx1;
        } else {
            this.n.log("OKRTCLmsAdapter", this + ": has no camera capturer");
        }
    }

    public final void m(Float f2, Float f3) {
        Integer num;
        float f4;
        rkf rkf = this.y;
        ogf ogf = rkf.u0;
        if (f2 != null) {
            ogf.getClass();
            int G = tu0.G(((float) ogf.c) * f2.floatValue());
            num = Integer.valueOf(ote.e(G - (G % 16), 320, 4096));
        } else {
            num = null;
        }
        ogf.e = num;
        m56 m56 = ogf.b;
        m56.invoke("Set scale restriction: " + f2 + " ");
        rkf.u();
        rkf rkf2 = this.y;
        if (f3 != null) {
            rkf2.getClass();
            if (f3.floatValue() > 0.0f && ((double) f3.floatValue()) < 1.0d) {
                f4 = f3.floatValue();
                rkf2.w0 = f4;
                rkf2.u();
            }
        }
        f4 = 1.0f;
        rkf2.w0 = f4;
        rkf2.u();
    }

    public final String toString() {
        return jb9.c(this);
    }
}
