package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;
import java.io.IOException;
import java.util.Objects;

/* renamed from: eff  reason: default package */
public final class eff extends u2 implements dff {
    public static final mu1 o = new mu1(16);
    public final MediaCodecInfo.VideoCapabilities c;

    public eff(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.b).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.c = videoCapabilities;
    }

    public static eff Z1(ic0 ic0) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodec;
        LruCache lruCache = w43.a;
        String str = ic0.a;
        LruCache lruCache2 = w43.a;
        synchronized (lruCache2) {
            mediaCodecInfo = (MediaCodecInfo) lruCache2.get(str);
        }
        if (mediaCodecInfo == null) {
            try {
                mediaCodec = MediaCodec.createEncoderByType(str);
                try {
                    MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                    synchronized (lruCache2) {
                        lruCache2.put(str, codecInfo);
                    }
                    mediaCodec.release();
                    mediaCodecInfo = codecInfo;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException | IllegalArgumentException e) {
                throw new Exception(e);
            } catch (Throwable th2) {
                th = th2;
                mediaCodec = null;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw th;
            }
        }
        return new eff(mediaCodecInfo, ic0.a);
    }

    public final boolean A1(int i, int i2) {
        return this.c.isSizeSupported(i, i2);
    }

    public final Range E1() {
        return this.c.getSupportedHeights();
    }

    public final int a1() {
        return this.c.getWidthAlignment();
    }

    public final Range b1() {
        return this.c.getBitrateRange();
    }

    public final boolean h1() {
        return true;
    }

    public final Range r1(int i) {
        try {
            return this.c.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            throw (th instanceof IllegalArgumentException ? th : new IllegalArgumentException(th));
        }
    }

    public final Range v1(int i) {
        try {
            return this.c.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            throw (th instanceof IllegalArgumentException ? th : new IllegalArgumentException(th));
        }
    }

    public final int w1() {
        return this.c.getHeightAlignment();
    }

    public final Range x1() {
        return this.c.getSupportedWidths();
    }
}
