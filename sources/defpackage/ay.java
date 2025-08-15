package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: ay  reason: default package */
public final class ay implements s78, e15, cbe {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final Object o;

    public ay(String str, bj6 bj6) {
        int i;
        boolean z;
        this.a = 2;
        this.X = new HashMap();
        this.o = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            z = false;
            i = -1;
        }
        this.b = z;
        this.c = i;
        this.Y = bj6;
    }

    public static void p(ay ayVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        iy iyVar = (iy) ayVar.X;
        fm9.k(iyVar.c == null);
        HandlerThread handlerThread = iyVar.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) ayVar.o;
        mediaCodec.setCallback(iyVar, handler);
        iyVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((w78) ayVar.Y).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        ayVar.c = 1;
    }

    public static String q(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(long j, int i, int i2, int i3) {
        ((w78) this.Y).a(j, i, i2, i3);
    }

    public void b(long j) {
    }

    public jbe c() {
        np8.f(!this.b);
        if (this.c == 2) {
            ArrayDeque arrayDeque = (ArrayDeque) this.Y;
            if (!arrayDeque.isEmpty()) {
                jbe jbe = (jbe) arrayDeque.removeFirst();
                hbe hbe = (hbe) this.X;
                if (hbe.f(4)) {
                    jbe.a(4);
                } else {
                    long j = hbe.Y;
                    ByteBuffer byteBuffer = hbe.o;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    ((vu4) this.o).getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    g03 g03 = new g03(j, (Object) tu0.h(xz3.D0, parcelableArrayList), 5);
                    jbe.w(hbe.Y, g03, 0);
                }
                hbe.v();
                this.c = 0;
                return jbe;
            }
        }
        return null;
    }

    public void d(int i, long j) {
        ((MediaCodec) this.o).releaseOutputBuffer(i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A[Catch:{ all -> 0x0032 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[Catch:{ all -> 0x0032 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int e() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.Y
            w78 r0 = (defpackage.w78) r0
            r0.b()
            java.lang.Object r6 = r6.X
            iy r6 = (defpackage.iy) r6
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            java.lang.IllegalStateException r1 = r6.n     // Catch:{ all -> 0x0032 }
            r2 = 0
            if (r1 != 0) goto L_0x005a
            android.media.MediaCodec$CodecException r1 = r6.j     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0057
            android.media.MediaCodec$CryptoException r1 = r6.k     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0054
            long r1 = r6.l     // Catch:{ all -> 0x0032 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 > 0) goto L_0x002c
            boolean r1 = r6.m     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r1 = r2
            goto L_0x002d
        L_0x002c:
            r1 = r3
        L_0x002d:
            r4 = -1
            if (r1 == 0) goto L_0x0034
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x004d
        L_0x0032:
            r6 = move-exception
            goto L_0x005d
        L_0x0034:
            b23 r6 = r6.d     // Catch:{ all -> 0x0032 }
            int r1 = r6.a     // Catch:{ all -> 0x0032 }
            int r5 = r6.b     // Catch:{ all -> 0x0032 }
            if (r1 != r5) goto L_0x003d
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0040
            goto L_0x004c
        L_0x0040:
            if (r1 == r5) goto L_0x004e
            int[] r2 = r6.c     // Catch:{ all -> 0x0032 }
            r4 = r2[r1]     // Catch:{ all -> 0x0032 }
            int r1 = r1 + r3
            int r2 = r6.d     // Catch:{ all -> 0x0032 }
            r1 = r1 & r2
            r6.a = r1     // Catch:{ all -> 0x0032 }
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
        L_0x004d:
            return r4
        L_0x004e:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException     // Catch:{ all -> 0x0032 }
            r6.<init>()     // Catch:{ all -> 0x0032 }
            throw r6     // Catch:{ all -> 0x0032 }
        L_0x0054:
            r6.k = r2     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0057:
            r6.j = r2     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x005a:
            r6.n = r2     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay.e():int");
    }

    public Object f() {
        np8.f(!this.b);
        if (this.c != 0) {
            return null;
        }
        this.c = 1;
        return (hbe) this.X;
    }

    public void flush() {
        switch (this.a) {
            case 0:
                ((w78) this.Y).flush();
                ((MediaCodec) this.o).flush();
                iy iyVar = (iy) this.X;
                synchronized (iyVar.a) {
                    iyVar.l++;
                    Handler handler = iyVar.c;
                    int i = oaf.a;
                    handler.post(new b(10, (Object) iyVar));
                }
                ((MediaCodec) this.o).start();
                return;
            default:
                np8.f(!this.b);
                ((hbe) this.X).v();
                this.c = 0;
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A[Catch:{ all -> 0x0032 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[Catch:{ all -> 0x0032 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int g(android.media.MediaCodec.BufferInfo r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.Y
            w78 r0 = (defpackage.w78) r0
            r0.b()
            java.lang.Object r11 = r11.X
            iy r11 = (defpackage.iy) r11
            java.lang.Object r0 = r11.a
            monitor-enter(r0)
            java.lang.IllegalStateException r1 = r11.n     // Catch:{ all -> 0x0032 }
            r2 = 0
            if (r1 != 0) goto L_0x0084
            android.media.MediaCodec$CodecException r1 = r11.j     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0081
            android.media.MediaCodec$CryptoException r1 = r11.k     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x007e
            long r1 = r11.l     // Catch:{ all -> 0x0032 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 > 0) goto L_0x002c
            boolean r1 = r11.m     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r1 = r2
            goto L_0x002d
        L_0x002c:
            r1 = r3
        L_0x002d:
            r4 = -1
            if (r1 == 0) goto L_0x0034
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0077
        L_0x0032:
            r11 = move-exception
            goto L_0x0087
        L_0x0034:
            b23 r1 = r11.e     // Catch:{ all -> 0x0032 }
            int r5 = r1.a     // Catch:{ all -> 0x0032 }
            int r6 = r1.b     // Catch:{ all -> 0x0032 }
            if (r5 != r6) goto L_0x003d
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0041
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0077
        L_0x0041:
            if (r5 == r6) goto L_0x0078
            int[] r2 = r1.c     // Catch:{ all -> 0x0032 }
            r4 = r2[r5]     // Catch:{ all -> 0x0032 }
            int r5 = r5 + r3
            int r2 = r1.d     // Catch:{ all -> 0x0032 }
            r2 = r2 & r5
            r1.a = r2     // Catch:{ all -> 0x0032 }
            if (r4 < 0) goto L_0x0069
            android.media.MediaFormat r1 = r11.h     // Catch:{ all -> 0x0032 }
            defpackage.fm9.l(r1)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r11 = r11.f     // Catch:{ all -> 0x0032 }
            java.lang.Object r11 = r11.remove()     // Catch:{ all -> 0x0032 }
            android.media.MediaCodec$BufferInfo r11 = (android.media.MediaCodec.BufferInfo) r11     // Catch:{ all -> 0x0032 }
            int r6 = r11.offset     // Catch:{ all -> 0x0032 }
            int r7 = r11.size     // Catch:{ all -> 0x0032 }
            long r8 = r11.presentationTimeUs     // Catch:{ all -> 0x0032 }
            int r10 = r11.flags     // Catch:{ all -> 0x0032 }
            r5 = r12
            r5.set(r6, r7, r8, r10)     // Catch:{ all -> 0x0032 }
            goto L_0x0076
        L_0x0069:
            r12 = -2
            if (r4 != r12) goto L_0x0076
            java.util.ArrayDeque r12 = r11.g     // Catch:{ all -> 0x0032 }
            java.lang.Object r12 = r12.remove()     // Catch:{ all -> 0x0032 }
            android.media.MediaFormat r12 = (android.media.MediaFormat) r12     // Catch:{ all -> 0x0032 }
            r11.h = r12     // Catch:{ all -> 0x0032 }
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
        L_0x0077:
            return r4
        L_0x0078:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException     // Catch:{ all -> 0x0032 }
            r11.<init>()     // Catch:{ all -> 0x0032 }
            throw r11     // Catch:{ all -> 0x0032 }
        L_0x007e:
            r11.k = r2     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0081:
            r11.j = r2     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0084:
            r11.n = r2     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0087:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay.g(android.media.MediaCodec$BufferInfo):int");
    }

    public ByteBuffer getInputBuffer(int i) {
        return ((MediaCodec) this.o).getInputBuffer(i);
    }

    public ByteBuffer getOutputBuffer(int i) {
        return ((MediaCodec) this.o).getOutputBuffer(i);
    }

    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        iy iyVar = (iy) this.X;
        synchronized (iyVar.a) {
            try {
                mediaFormat = iyVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(int i) {
        ((MediaCodec) this.o).setVideoScalingMode(i);
    }

    public void i(int i, rz3 rz3, long j, int i2) {
        ((w78) this.Y).i(i, rz3, j, i2);
    }

    public void j(Surface surface) {
        ((MediaCodec) this.o).setOutputSurface(surface);
    }

    public boolean k(d88 d88) {
        iy iyVar = (iy) this.X;
        synchronized (iyVar.a) {
            iyVar.o = d88;
        }
        return true;
    }

    public void l(hbe hbe) {
        boolean z = true;
        np8.f(!this.b);
        np8.f(this.c == 1);
        if (((hbe) this.X) != hbe) {
            z = false;
        }
        np8.d(z);
        this.c = 2;
    }

    public boolean m(int i) {
        return this.b && n(i) != null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:10|(7:12|(2:15|(6:17|(2:19|20)(1:(1:22)(2:23|24))|(4:62|(2:65|(4:67|(3:69|(1:71)(1:72)|73)|74|(4:(4:77|(2:78|(1:93)(2:80|(1:92)))|90|91)(3:(2:84|(1:(1:95)(2:86|(1:94)(1:88))))|90|91)|82|90|91)))|64|(0))|89|90|91))|14|(0)|89|90|91)|25|26|(14:30|31|33|39|(10:41|(1:(1:44)(1:46))|48|49|51|60|(0)|89|90|91)(1:47)|45|48|49|51|60|(0)|89|90|91)|14|(0)|89|90|91) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0079 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.f15 n(int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.b
            r3 = 0
            if (r2 != 0) goto L_0x000a
            return r3
        L_0x000a:
            int r2 = r0.c
            boolean r2 = android.media.CamcorderProfile.hasProfile(r2, r1)
            if (r2 != 0) goto L_0x0013
            return r3
        L_0x0013:
            java.lang.Object r2 = r0.X
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            boolean r2 = r2.containsKey(r4)
            if (r2 == 0) goto L_0x0030
            java.lang.Object r0 = r0.X
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r0 = r0.get(r1)
            f15 r0 = (defpackage.f15) r0
            return r0
        L_0x0030:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r2 < r4) goto L_0x0079
            java.lang.Object r5 = r0.o
            java.lang.String r5 = (java.lang.String) r5
            android.media.EncoderProfiles r5 = defpackage.sk.b(r1, r5)
            if (r5 != 0) goto L_0x0043
        L_0x0040:
            r2 = r3
            goto L_0x0106
        L_0x0043:
            bj6 r6 = defpackage.zi4.a
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.class
            vrb r6 = r6.e(r7)
            if (r6 == 0) goto L_0x004e
            goto L_0x0079
        L_0x004e:
            r6 = 33
            if (r2 < r6) goto L_0x0058
            ga0 r2 = defpackage.gu4.a(r5)     // Catch:{ NullPointerException -> 0x0079 }
            goto L_0x0106
        L_0x0058:
            if (r2 < r4) goto L_0x0060
            ga0 r2 = defpackage.sk.a(r5)     // Catch:{ NullPointerException -> 0x0079 }
            goto L_0x0106
        L_0x0060:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ NullPointerException -> 0x0079 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x0079 }
            java.lang.String r6 = "Unable to call from(EncoderProfiles) on API "
            r5.<init>(r6)     // Catch:{ NullPointerException -> 0x0079 }
            r5.append(r2)     // Catch:{ NullPointerException -> 0x0079 }
            java.lang.String r2 = ". Version 31 or higher required."
            r5.append(r2)     // Catch:{ NullPointerException -> 0x0079 }
            java.lang.String r2 = r5.toString()     // Catch:{ NullPointerException -> 0x0079 }
            r4.<init>(r2)     // Catch:{ NullPointerException -> 0x0079 }
            throw r4     // Catch:{ NullPointerException -> 0x0079 }
        L_0x0079:
            int r2 = r0.c     // Catch:{ RuntimeException -> 0x0080 }
            android.media.CamcorderProfile r2 = android.media.CamcorderProfile.get(r2, r1)     // Catch:{ RuntimeException -> 0x0080 }
            goto L_0x0081
        L_0x0080:
            r2 = r3
        L_0x0081:
            if (r2 == 0) goto L_0x0040
            int r4 = r2.duration
            int r5 = r2.fileFormat
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r8 = r2.audioCodec
            switch(r8) {
                case 1: goto L_0x00a1;
                case 2: goto L_0x009e;
                case 3: goto L_0x009b;
                case 4: goto L_0x009b;
                case 5: goto L_0x009b;
                case 6: goto L_0x0098;
                case 7: goto L_0x0095;
                default: goto L_0x0091;
            }
        L_0x0091:
            java.lang.String r7 = "audio/none"
        L_0x0093:
            r13 = r7
            goto L_0x00a4
        L_0x0095:
            java.lang.String r7 = "audio/opus"
            goto L_0x0093
        L_0x0098:
            java.lang.String r7 = "audio/vorbis"
            goto L_0x0093
        L_0x009b:
            java.lang.String r7 = "audio/mp4a-latm"
            goto L_0x0093
        L_0x009e:
            java.lang.String r7 = "audio/amr-wb"
            goto L_0x0093
        L_0x00a1:
            java.lang.String r7 = "audio/3gpp"
            goto L_0x0093
        L_0x00a4:
            int r9 = r2.audioBitRate
            int r10 = r2.audioSampleRate
            int r11 = r2.audioChannels
            r7 = 3
            if (r8 == r7) goto L_0x00b9
            r7 = 4
            r12 = 5
            if (r8 == r7) goto L_0x00bb
            if (r8 == r12) goto L_0x00b6
            r7 = -1
        L_0x00b4:
            r12 = r7
            goto L_0x00bb
        L_0x00b6:
            r7 = 39
            goto L_0x00b4
        L_0x00b9:
            r7 = 2
            goto L_0x00b4
        L_0x00bb:
            fa0 r14 = new fa0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r6.add(r14)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r9 = r2.videoCodec
            switch(r9) {
                case 1: goto L_0x00e7;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00de;
                case 5: goto L_0x00db;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00d5;
                case 8: goto L_0x00d2;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            java.lang.String r8 = "video/none"
        L_0x00d0:
            r10 = r8
            goto L_0x00ea
        L_0x00d2:
            java.lang.String r8 = "video/av01"
            goto L_0x00d0
        L_0x00d5:
            java.lang.String r8 = "video/dolby-vision"
            goto L_0x00d0
        L_0x00d8:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            goto L_0x00d0
        L_0x00db:
            java.lang.String r8 = "video/hevc"
            goto L_0x00d0
        L_0x00de:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            goto L_0x00d0
        L_0x00e1:
            java.lang.String r8 = "video/mp4v-es"
            goto L_0x00d0
        L_0x00e4:
            java.lang.String r8 = "video/avc"
            goto L_0x00d0
        L_0x00e7:
            java.lang.String r8 = "video/3gpp"
            goto L_0x00d0
        L_0x00ea:
            int r11 = r2.videoBitRate
            int r12 = r2.videoFrameRate
            int r13 = r2.videoFrameWidth
            int r14 = r2.videoFrameHeight
            ha0 r2 = new ha0
            r15 = -1
            r16 = 8
            r17 = 0
            r18 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r7.add(r2)
            ga0 r2 = defpackage.ga0.e(r4, r5, r6, r7)
        L_0x0106:
            if (r2 == 0) goto L_0x0196
            java.lang.Object r4 = r0.Y
            bj6 r4 = (defpackage.bj6) r4
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk> r5 = androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk.class
            vrb r4 = r4.e(r5)
            androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk r4 = (androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk) r4
            r5 = 1
            if (r4 != 0) goto L_0x0119
        L_0x0117:
            r4 = r5
            goto L_0x015f
        L_0x0119:
            java.util.List r6 = r2.d
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0122
            goto L_0x0117
        L_0x0122:
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            ha0 r6 = (defpackage.ha0) r6
            java.util.List r7 = r4.b
            if (r7 != 0) goto L_0x014b
            c8d r7 = r4.a
            r8 = 34
            android.util.Size[] r7 = r7.s(r8)
            if (r7 == 0) goto L_0x0142
            java.lang.Object r7 = r7.clone()
            android.util.Size[] r7 = (android.util.Size[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
            goto L_0x0146
        L_0x0142:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0146:
            r4.b = r7
            java.util.Objects.toString(r7)
        L_0x014b:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.List r4 = r4.b
            r7.<init>(r4)
            android.util.Size r4 = new android.util.Size
            int r8 = r6.e
            int r6 = r6.f
            r4.<init>(r8, r6)
            boolean r4 = r7.contains(r4)
        L_0x015f:
            if (r4 != 0) goto L_0x0196
            if (r1 != r5) goto L_0x0181
            java.util.List r2 = defpackage.e15.s
            java.util.Iterator r2 = r2.iterator()
        L_0x0169:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0197
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            f15 r4 = r0.n(r4)
            if (r4 == 0) goto L_0x0169
        L_0x017f:
            r3 = r4
            goto L_0x0197
        L_0x0181:
            if (r1 != 0) goto L_0x0197
            java.util.List r2 = defpackage.e15.s
            int r2 = r2.size()
            int r2 = r2 - r5
        L_0x018a:
            if (r2 < 0) goto L_0x0197
            f15 r4 = r0.n(r2)
            if (r4 == 0) goto L_0x0193
            goto L_0x017f
        L_0x0193:
            int r2 = r2 + -1
            goto L_0x018a
        L_0x0196:
            r3 = r2
        L_0x0197:
            java.lang.Object r0 = r0.X
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0.put(r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay.n(int):f15");
    }

    public void o(r88 r88, Handler handler) {
        ((MediaCodec) this.o).setOnFrameRenderedListener(new xx(this, r88, 1), handler);
    }

    public void release() {
        switch (this.a) {
            case 0:
                try {
                    if (this.c == 1) {
                        ((w78) this.Y).shutdown();
                        iy iyVar = (iy) this.X;
                        synchronized (iyVar.a) {
                            iyVar.m = true;
                            iyVar.b.quit();
                            iyVar.a();
                        }
                    }
                    this.c = 2;
                    if (!this.b) {
                        try {
                            int i = oaf.a;
                            if (i >= 30 && i < 33) {
                                ((MediaCodec) this.o).stop();
                            }
                            return;
                        } finally {
                            ((MediaCodec) this.o).release();
                            this.b = true;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    if (!this.b) {
                        try {
                            int i2 = oaf.a;
                            if (i2 >= 30 && i2 < 33) {
                                ((MediaCodec) this.o).stop();
                            }
                        } finally {
                            ((MediaCodec) this.o).release();
                            this.b = true;
                        }
                    }
                    throw th;
                }
            default:
                this.b = true;
                return;
        }
    }

    public void releaseOutputBuffer(int i, boolean z) {
        ((MediaCodec) this.o).releaseOutputBuffer(i, z);
    }

    public void setParameters(Bundle bundle) {
        ((w78) this.Y).setParameters(bundle);
    }

    public ay() {
        this.a = 5;
        this.o = new Object();
        this.X = new o54(1);
        this.Y = new ArrayDeque();
        for (int i = 0; i < 2; i++) {
            ((ArrayDeque) this.Y).addFirst(new y02(this, 1));
        }
        this.c = 0;
    }

    public ay(Context context, int i) {
        String str;
        TelephonyManager telephonyManager;
        String str2;
        TelephonyManager telephonyManager2;
        Context context2 = context;
        int i2 = i;
        Context context3 = null;
        this.a = i2;
        switch (i2) {
            case 4:
                this.o = context2 != null ? context.getApplicationContext() : context3;
                int i3 = oaf.a;
                if (!(context2 == null || (telephonyManager = (TelephonyManager) context2.getSystemService("phone")) == null)) {
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (!TextUtils.isEmpty(networkCountryIso)) {
                        str = lz7.V(networkCountryIso);
                        int[] a2 = i84.a(str);
                        HashMap hashMap = new HashMap(8);
                        hashMap.put(0, 1000000L);
                        ffc ffc = i84.n;
                        hashMap.put(2, (Long) ffc.get(a2[0]));
                        hashMap.put(3, (Long) i84.o.get(a2[1]));
                        hashMap.put(4, (Long) i84.p.get(a2[2]));
                        hashMap.put(5, (Long) i84.q.get(a2[3]));
                        hashMap.put(10, (Long) i84.r.get(a2[4]));
                        hashMap.put(9, (Long) i84.s.get(a2[5]));
                        hashMap.put(7, (Long) ffc.get(a2[0]));
                        this.X = hashMap;
                        this.c = 2000;
                        this.Y = she.a;
                        this.b = true;
                        return;
                    }
                }
                str = lz7.V(Locale.getDefault().getCountry());
                int[] a22 = i84.a(str);
                HashMap hashMap2 = new HashMap(8);
                hashMap2.put(0, 1000000L);
                ffc ffc2 = i84.n;
                hashMap2.put(2, (Long) ffc2.get(a22[0]));
                hashMap2.put(3, (Long) i84.o.get(a22[1]));
                hashMap2.put(4, (Long) i84.p.get(a22[2]));
                hashMap2.put(5, (Long) i84.q.get(a22[3]));
                hashMap2.put(10, (Long) i84.r.get(a22[4]));
                hashMap2.put(9, (Long) i84.s.get(a22[5]));
                hashMap2.put(7, (Long) ffc2.get(a22[0]));
                this.X = hashMap2;
                this.c = 2000;
                this.Y = she.a;
                this.b = true;
                return;
            default:
                this.o = context2 != null ? context.getApplicationContext() : context3;
                int i4 = maf.a;
                if (!(context2 == null || (telephonyManager2 = (TelephonyManager) context2.getSystemService("phone")) == null)) {
                    String networkCountryIso2 = telephonyManager2.getNetworkCountryIso();
                    if (!TextUtils.isEmpty(networkCountryIso2)) {
                        str2 = lz7.V(networkCountryIso2);
                        int[] a3 = h84.a(str2);
                        HashMap hashMap3 = new HashMap(8);
                        hashMap3.put(0, 1000000L);
                        ffc ffc3 = h84.n;
                        hashMap3.put(2, (Long) ffc3.get(a3[0]));
                        hashMap3.put(3, (Long) h84.o.get(a3[1]));
                        hashMap3.put(4, (Long) h84.p.get(a3[2]));
                        hashMap3.put(5, (Long) h84.q.get(a3[3]));
                        hashMap3.put(10, (Long) h84.r.get(a3[4]));
                        hashMap3.put(9, (Long) h84.s.get(a3[5]));
                        hashMap3.put(7, (Long) ffc3.get(a3[0]));
                        this.X = hashMap3;
                        this.c = 2000;
                        this.Y = rhe.a;
                        this.b = true;
                        return;
                    }
                }
                str2 = lz7.V(Locale.getDefault().getCountry());
                int[] a32 = h84.a(str2);
                HashMap hashMap32 = new HashMap(8);
                hashMap32.put(0, 1000000L);
                ffc ffc32 = h84.n;
                hashMap32.put(2, (Long) ffc32.get(a32[0]));
                hashMap32.put(3, (Long) h84.o.get(a32[1]));
                hashMap32.put(4, (Long) h84.p.get(a32[2]));
                hashMap32.put(5, (Long) h84.q.get(a32[3]));
                hashMap32.put(10, (Long) h84.r.get(a32[4]));
                hashMap32.put(9, (Long) h84.s.get(a32[5]));
                hashMap32.put(7, (Long) ffc32.get(a32[0]));
                this.X = hashMap32;
                this.c = 2000;
                this.Y = rhe.a;
                this.b = true;
                return;
        }
    }

    public ay(MediaCodec mediaCodec, HandlerThread handlerThread, w78 w78) {
        this.a = 0;
        this.o = mediaCodec;
        this.X = new iy(handlerThread);
        this.Y = w78;
        this.c = 0;
    }

    public ay(CharSequence charSequence, String str, String str2) {
        this.a = 1;
        this.o = charSequence;
        this.X = str;
        this.Y = str2;
        this.b = true;
        this.c = 15;
    }
}
