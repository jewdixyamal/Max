package androidx.media3.exoplayer.mediacodec;

public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String a;
    public final boolean b;
    public final y78 c;
    public final String o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer$DecoderInitializationException(qy5 qy5, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + qy5, mediaCodecUtil$DecoderQueryException, qy5.n, z, (y78) null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, y78 y78, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = y78;
        this.o = str3;
    }
}
