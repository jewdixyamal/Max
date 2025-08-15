package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import androidx.work.WorkRequest;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.EglBase;

/* renamed from: xef  reason: default package */
public final class xef {
    public ByteBuffer a;
    public MediaExtractor b;
    public ej9 c;
    public int d = -1;
    public int e = -1;
    public td f;
    public yna g;
    public bkb h;
    public m5d i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public final Context o;
    public final o45 p;
    public final String q;
    public final String r;
    public final float s;
    public final float t;
    public final nqb u;
    public final boolean v;
    public final rxd w;
    public long x;
    public long y;

    public xef(Context context, o45 o45, String str, String str2, float f2, float f3, nqb nqb, boolean z, rxd rxd) {
        this.o = context;
        this.p = o45;
        this.q = str;
        this.r = str2;
        this.s = f2;
        this.t = f3;
        this.u = nqb;
        this.v = z;
        this.w = rxd;
    }

    public static boolean a(Context context, o45 o45, String str, String str2, float f2, float f3, nqb nqb, boolean z, rxd rxd) {
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        yna yna;
        MediaCodec mediaCodec3;
        MediaCodec mediaCodec4;
        MediaCodec mediaCodec5;
        MediaCodec mediaCodec6;
        MediaCodec mediaCodec7;
        MediaCodec mediaCodec8;
        xef xef = new xef(context, o45, str, str2, f2, f3, nqb, z, rxd);
        hm9.m("xef", "Start convert with parameters: \nsrcUri: %s\ndstPath: %s\nstartPosition: %f\nendPosition: %f\nquality: %s\nmute: %s", str, str2, Float.valueOf(f2), Float.valueOf(f3), nqb, Boolean.valueOf(z));
        try {
            if (!xef.b()) {
                hm9.p("xef", "execute: failed to init recorder", (Throwable) null);
                bkb bkb = xef.h;
                if (!(bkb == null || (mediaCodec8 = (MediaCodec) bkb.a) == null)) {
                    mediaCodec8.release();
                }
                td tdVar = xef.f;
                if (!(tdVar == null || (mediaCodec7 = (MediaCodec) tdVar.c) == null)) {
                    mediaCodec7.release();
                }
                MediaExtractor mediaExtractor = xef.b;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                ej9 ej9 = xef.c;
                if (ej9 != null) {
                    ((MediaMuxer) ej9.f).release();
                }
                m5d m5d = xef.i;
                if (!(m5d == null || ((Surface) m5d.X) == null)) {
                    m5d.K();
                }
                yna = xef.g;
                if (yna == null || yna.b == null) {
                    return false;
                }
                yna.a();
                return false;
            }
            long j2 = xef.x;
            if (j2 > 0) {
                xef.b.seekTo(j2, 0);
            } else {
                xef.b.seekTo(0, 0);
            }
            while (!xef.l) {
                while (true) {
                    if (xef.j) {
                        break;
                    } else if (!Thread.currentThread().isInterrupted()) {
                        int sampleTrackIndex = xef.b.getSampleTrackIndex();
                        if (sampleTrackIndex != -1) {
                            if (!xef.n || !xef.m) {
                                if (sampleTrackIndex == xef.d) {
                                    td tdVar2 = xef.f;
                                    MediaExtractor mediaExtractor2 = xef.b;
                                    MediaCodec mediaCodec9 = (MediaCodec) tdVar2.c;
                                    int dequeueInputBuffer = mediaCodec9.dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
                                    if (dequeueInputBuffer >= 0) {
                                        ((MediaCodec) tdVar2.c).queueInputBuffer(dequeueInputBuffer, 0, mediaExtractor2.readSampleData(mediaCodec9.getInputBuffer(dequeueInputBuffer), 0), mediaExtractor2.getSampleTime(), 0);
                                        mediaExtractor2.advance();
                                    }
                                } else {
                                    int i2 = xef.e;
                                    if (sampleTrackIndex != i2 || i2 == -1) {
                                        xef.b.advance();
                                    } else {
                                        if (!z) {
                                            if (xef.b.getSampleTime() < xef.y) {
                                                if (xef.b.getSampleTime() > xef.x) {
                                                    xef.a.rewind();
                                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                                    bufferInfo.offset = 0;
                                                    bufferInfo.size = xef.b.readSampleData(xef.a, 0);
                                                    bufferInfo.presentationTimeUs = xef.b.getSampleTime();
                                                    bufferInfo.flags = xef.b.getSampleFlags();
                                                    bufferInfo.presentationTimeUs -= xef.x;
                                                    ej9 ej92 = xef.c;
                                                    ByteBuffer byteBuffer = xef.a;
                                                    if (ej92.b()) {
                                                        boolean z2 = ej92.c;
                                                        MediaMuxer mediaMuxer = (MediaMuxer) ej92.f;
                                                        if (!z2) {
                                                            mediaMuxer.start();
                                                            ej92.c = true;
                                                        }
                                                        ej92.a();
                                                        mediaMuxer.writeSampleData(ej92.b, byteBuffer, bufferInfo);
                                                    } else {
                                                        ((ArrayList) ej92.g).add(new dj9(ej92.b, byteBuffer, bufferInfo));
                                                    }
                                                }
                                                xef.b.advance();
                                            }
                                        }
                                        xef.n = true;
                                        xef.b.advance();
                                    }
                                }
                            }
                        }
                        xef.j = true;
                        xef.b.release();
                        td tdVar3 = xef.f;
                        int dequeueInputBuffer2 = ((MediaCodec) tdVar3.c).dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
                        if (dequeueInputBuffer2 >= 0) {
                            ((MediaCodec) tdVar3.c).queueInputBuffer(dequeueInputBuffer2, 0, 0, 0, 4);
                            tdVar3.b = false;
                        } else {
                            tdVar3.b = true;
                        }
                    } else {
                        throw new InterruptedException("conversion is interrupted");
                    }
                }
                if (!xef.k) {
                    xef.f.h();
                }
                if (!xef.l) {
                    xef.h.p();
                }
            }
            bkb bkb2 = xef.h;
            if (!(bkb2 == null || (mediaCodec6 = (MediaCodec) bkb2.a) == null)) {
                mediaCodec6.release();
            }
            td tdVar4 = xef.f;
            if (!(tdVar4 == null || (mediaCodec5 = (MediaCodec) tdVar4.c) == null)) {
                mediaCodec5.release();
            }
            MediaExtractor mediaExtractor3 = xef.b;
            if (mediaExtractor3 != null) {
                mediaExtractor3.release();
            }
            ej9 ej93 = xef.c;
            if (ej93 != null) {
                ((MediaMuxer) ej93.f).release();
            }
            m5d m5d2 = xef.i;
            if (!(m5d2 == null || ((Surface) m5d2.X) == null)) {
                m5d2.K();
            }
            yna yna2 = xef.g;
            if (!(yna2 == null || yna2.b == null)) {
                yna2.a();
            }
            hm9.m("xef", "Video convert successfully done", new Object[0]);
            return true;
        } catch (Throwable th) {
            bkb bkb3 = xef.h;
            if (!(bkb3 == null || (mediaCodec2 = (MediaCodec) bkb3.a) == null)) {
                mediaCodec2.release();
            }
            td tdVar5 = xef.f;
            if (!(tdVar5 == null || (mediaCodec = (MediaCodec) tdVar5.c) == null)) {
                mediaCodec.release();
            }
            MediaExtractor mediaExtractor4 = xef.b;
            if (mediaExtractor4 != null) {
                mediaExtractor4.release();
            }
            ej9 ej94 = xef.c;
            if (ej94 != null) {
                ((MediaMuxer) ej94.f).release();
            }
            m5d m5d3 = xef.i;
            if (!(m5d3 == null || ((Surface) m5d3.X) == null)) {
                m5d3.K();
            }
            yna yna3 = xef.g;
            if (!(yna3 == null || yna3.b == null)) {
                yna3.a();
            }
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [ej9, java.lang.Object] */
    public final boolean b() {
        int i2;
        int i3;
        File parentFile;
        this.a = ByteBuffer.allocate(262144);
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.b = mediaExtractor;
        mediaExtractor.setDataSource(this.o, Uri.parse(this.q), (Map) null);
        String str = this.r;
        File file = new File(str);
        if (!file.exists() && (parentFile = file.getParentFile()) != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        ? obj = new Object();
        obj.c = false;
        int i4 = -1;
        obj.a = -1;
        obj.b = -1;
        obj.d = false;
        obj.e = false;
        obj.g = new ArrayList();
        obj.f = new MediaMuxer(str, 0);
        this.c = obj;
        int trackCount = this.b.getTrackCount();
        int i5 = 0;
        while (true) {
            if (i5 >= trackCount) {
                i2 = i4;
                break;
            }
            MediaFormat trackFormat = this.b.getTrackFormat(i5);
            String string = trackFormat.getString("mime");
            hm9.m("xef", string, new Object[0]);
            hm9.m("xef", trackFormat.toString(), new Object[0]);
            this.b.selectTrack(i5);
            if (string.startsWith("video/")) {
                this.d = i5;
                float f2 = (float) trackFormat.getLong("durationUs");
                this.x = (long) (this.s * f2);
                this.y = (long) (f2 * this.t);
                nqb nqb = this.u;
                int i6 = nqb.b;
                int i7 = i6 - (i6 % 4);
                int i8 = nqb.c;
                int i9 = i8 - (i8 % 4);
                try {
                    i3 = trackFormat.getInteger("frame-rate");
                } catch (Throwable unused) {
                    i3 = 15;
                }
                bkb bkb = r0;
                bkb bkb2 = new bkb(i7, i9, i3, nqb.d, this);
                this.h = bkb;
                m5d m5d = new m5d(9);
                m5d.b = EGL14.EGL_NO_DISPLAY;
                m5d.c = EGL14.EGL_NO_CONTEXT;
                m5d.o = EGL14.EGL_NO_SURFACE;
                Surface surface = (Surface) bkb.c;
                surface.getClass();
                m5d.X = surface;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                m5d.b = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (EGL14.eglChooseConfig((EGLDisplay) m5d.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            m5d.c = EGL14.eglCreateContext((EGLDisplay) m5d.b, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                            m5d.u("eglCreateContext");
                            if (((EGLContext) m5d.c) != null) {
                                m5d.o = EGL14.eglCreateWindowSurface((EGLDisplay) m5d.b, eGLConfigArr[0], (Surface) m5d.X, new int[]{12344}, 0);
                                m5d.u("eglCreateWindowSurface");
                                EGLSurface eGLSurface = (EGLSurface) m5d.o;
                                if (eGLSurface != null) {
                                    this.i = m5d;
                                    if (EGL14.eglMakeCurrent((EGLDisplay) m5d.b, eGLSurface, eGLSurface, (EGLContext) m5d.c)) {
                                        this.g = new yna();
                                        this.f = new td(string, trackFormat, this.g, this);
                                        this.c.d = true;
                                    } else {
                                        throw new RuntimeException("eglMakeCurrent failed");
                                    }
                                } else {
                                    throw new RuntimeException("surface was null");
                                }
                            } else {
                                throw new RuntimeException("null context");
                            }
                        } else {
                            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
                        }
                    } else {
                        m5d.b = null;
                        throw new RuntimeException("unable to initialize EGL14");
                    }
                } else {
                    throw new RuntimeException("unable to get EGL14 display");
                }
            } else if (string.startsWith("audio/")) {
                this.e = i5;
                if (this.v) {
                    this.c.e = false;
                } else {
                    ej9 ej9 = this.c;
                    ej9.e = true;
                    ej9.b = ((MediaMuxer) ej9.f).addTrack(trackFormat);
                }
            }
            i2 = -1;
            if (this.e != -1 && this.d != -1) {
                break;
            }
            i5++;
            i4 = -1;
        }
        return this.d != i2;
    }
}
