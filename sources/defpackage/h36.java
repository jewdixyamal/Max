package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: h36  reason: default package */
public final class h36 implements fj9 {
    public static final ffc s0;
    public static final ffc t0;
    public g36 X;
    public boolean Y;
    public boolean Z;
    public final MediaMuxer a;
    public final long b;
    public final HashMap c = new HashMap();
    public final HashMap o = new HashMap();

    /* JADX WARNING: type inference failed for: r0v0, types: [ww6, pw6] */
    static {
        ? pw6 = new pw6(4);
        pw6.b("video/avc", "video/3gpp", "video/mp4v-es");
        int i = oaf.a;
        if (i >= 24) {
            pw6.a("video/hevc");
        }
        if (i >= 34) {
            pw6.a("video/av01");
        }
        s0 = pw6.j();
        Object[] objArr = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"};
        c54.n(3, objArr);
        t0 = zw6.h(3, objArr);
    }

    public h36(MediaMuxer mediaMuxer, long j) {
        this.a = mediaMuxer;
        this.b = oaf.S(j);
    }

    public static void a(MediaMuxer mediaMuxer) {
        Class<MediaMuxer> cls = MediaMuxer.class;
        try {
            mediaMuxer.stop();
        } catch (RuntimeException e) {
            if (oaf.a < 30) {
                try {
                    Field declaredField = cls.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    Integer num = (Integer) declaredField.get(mediaMuxer);
                    num.getClass();
                    Field declaredField2 = cls.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(mediaMuxer, num);
                } catch (Exception unused) {
                }
            }
            throw e;
        }
    }

    public final void close() {
        if (!this.Z) {
            boolean z = this.Y;
            MediaMuxer mediaMuxer = this.a;
            if (!z) {
                try {
                    mediaMuxer.start();
                    this.Y = true;
                } catch (RuntimeException e) {
                    throw new Exception("Failed to start the muxer", e);
                }
            }
            if (!(this.b == -9223372036854775807L || this.X == null)) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(0, 0, this.b, 4);
                g36 g36 = this.X;
                g36.getClass();
                f(g36, ByteBuffer.allocateDirect(0), bufferInfo);
            }
            this.Y = false;
            try {
                a(mediaMuxer);
                mediaMuxer.release();
                this.Z = true;
            } catch (RuntimeException e2) {
                throw new Exception("Failed to stop the MediaMuxer", e2);
            } catch (Throwable th) {
                mediaMuxer.release();
                this.Z = true;
                throw th;
            }
        }
    }

    public final void e(d99 d99) {
        if (d99 instanceof ae9) {
            ae9 ae9 = (ae9) d99;
            this.a.setLocation(ae9.a, ae9.b);
        }
    }

    public final void f(g36 g36, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        g36 g362 = g36;
        MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
        long j = bufferInfo2.presentationTimeUs;
        long j2 = this.b;
        if (j2 == -9223372036854775807L || g362 != this.X || j <= j2) {
            boolean z = this.Y;
            HashMap hashMap = this.o;
            MediaMuxer mediaMuxer = this.a;
            if (!z) {
                if (oaf.a < 30 && j < 0) {
                    hashMap.put(g362, Long.valueOf(-j));
                }
                try {
                    mediaMuxer.start();
                    this.Y = true;
                } catch (RuntimeException e) {
                    throw new Exception("Failed to start the muxer", e);
                }
            }
            long longValue = hashMap.containsKey(g362) ? ((Long) hashMap.get(g362)).longValue() : 0;
            long j3 = j + longValue;
            HashMap hashMap2 = this.c;
            long longValue2 = hashMap2.containsKey(g362) ? ((Long) hashMap2.get(g362)).longValue() : 0;
            boolean z2 = oaf.a > 24 || j3 >= longValue2;
            StringBuilder k = au1.k(j3, "Samples not in presentation order (", " < ");
            k.append(longValue2);
            k.append(") unsupported on this API version");
            fm9.j(k.toString(), z2);
            hashMap2.put(g362, Long.valueOf(j3));
            boolean z3 = longValue == 0 || j3 >= longValue2;
            StringBuilder k2 = au1.k(j3, "Samples not in presentation order (", " < ");
            k2.append(longValue2);
            k2.append(") unsupported when using negative PTS workaround");
            fm9.j(k2.toString(), z3);
            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, j3, bufferInfo2.flags);
            try {
                fm9.k(g362 instanceof g36);
                mediaMuxer.writeSampleData(g362.a, byteBuffer, bufferInfo2);
            } catch (RuntimeException e2) {
                StringBuilder k3 = au1.k(j3, "Failed to write sample for presentationTimeUs=", ", size=");
                k3.append(bufferInfo2.size);
                throw new Exception(k3.toString(), e2);
            }
        }
    }

    public final g36 i(qy5 qy5) {
        MediaFormat mediaFormat;
        int i = qy5.w;
        String str = qy5.n;
        str.getClass();
        boolean k = ia9.k(str);
        MediaMuxer mediaMuxer = this.a;
        if (k) {
            mediaFormat = MediaFormat.createVideoFormat(str, qy5.t, qy5.u);
            j47.W(mediaFormat, qy5.A);
            try {
                mediaMuxer.setOrientationHint(i);
            } catch (RuntimeException e) {
                throw new Exception(zr6.h(i, "Failed to set orientation hint with rotationDegrees="), e);
            }
        } else {
            mediaFormat = MediaFormat.createAudioFormat(str, qy5.C, qy5.B);
            String str2 = qy5.d;
            if (str2 != null) {
                mediaFormat.setString("language", str2);
            }
        }
        j47.k0(mediaFormat, qy5.q);
        try {
            g36 g36 = new g36(mediaMuxer.addTrack(mediaFormat));
            if (k) {
                this.X = g36;
            }
            return g36;
        } catch (RuntimeException e2) {
            throw new Exception("Failed to add track with format=" + qy5, e2);
        }
    }
}
